/*
 * #559 ���� ����������� ����� n. ����� ��� ������� n �����
�������. (������� ����� ���������� ������ �������, ���� ��� �����
���� ������������ � ���� 2^p � 1, ��� � � ���� ������� �����.)
 */

public class ThirdTask 
{
	private int n;
	
	public ThirdTask()
	{
		InitializeItems();
	}
	
	private void InitializeItems()
	{
		System.out.print("\tEnter n value: ");
		this.n = Main.GetValue();
		
		System.out.print("\n");
	}
}
