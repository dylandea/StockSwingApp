package fr.fms.hmi;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class ColorsView extends JTable {

	public ColorsView( String[][] data, String[] column )
	{
		super( data, column );
		setFillsViewportHeight( true );
	}

	@Override
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		paintEmptyRows( g );
	}

	public void paintEmptyRows( Graphics g )
	{
		Graphics newGraphics = g.create();
		newGraphics.setColor( UIManager.getColor( "Table.gridColor" ) );
		Rectangle rectOfLastRow = getCellRect( getRowCount() - 1, 0, true );
		int firstNonExistentRowY = rectOfLastRow.y;
		if ( getVisibleRect().height > firstNonExistentRowY )
		{
			int rowYToDraw = (firstNonExistentRowY - 1) + getRowHeight();
			int actualRow = getRowCount() - 1;

			while ( rowYToDraw < getHeight() )
			{
				if ( actualRow % 2 == 0 )
				{
					newGraphics.setColor( Color.ORANGE );
					newGraphics.fillRect( 0, rowYToDraw, getWidth(), getRowHeight() );
					newGraphics.setColor( UIManager.getColor( "Table.gridColor" ) );
				}
				newGraphics.drawLine( 0, rowYToDraw, getWidth(), rowYToDraw );
				rowYToDraw += getRowHeight();
				actualRow++;
			}
			int x = 0;
			for ( int i = 0; i < getColumnCount(); i++ )
			{
				TableColumn column = getColumnModel().getColumn( i );
				x += column.getWidth();
				newGraphics.drawLine( x - 1, firstNonExistentRowY, x - 1, getHeight() );
			}
			newGraphics.dispose();
		}
	}

	public Component prepareRenderer( TableCellRenderer renderer, int row, int column )
	{
		Component c = super.prepareRenderer( renderer, row, column );
		if ( !isRowSelected( row ) )
		{
			c.setBackground( row % 2 == 0 ? getBackground() : Color.ORANGE );
		}
		return c;
	}

	public static void main( String[] argv )
	{
		String data[][] = { { "A0", "B0", "C0" }, { "A1", "B1", "C1" }, { "A2", "B2", "C2" }, { "A3", "B3", "C3" }, { "A4", "B4", "C4" } };
		String fields[] = { "A", "B", "C" };

		JFrame frame = new JFrame( "a JTable with striped empty space" );
		ColorsView table = new ColorsView( data, fields );
		JScrollPane pane = new JScrollPane( table );

		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.add( pane );
		frame.setSize( 400, 300 );
		frame.setLocationRelativeTo( null );
		frame.setVisible( true );
	}
}