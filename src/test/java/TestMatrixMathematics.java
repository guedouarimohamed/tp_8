
import static org.junit.Assert.*;

import org.junit.Test;

import com.example.exception.NoSquareException;
import com.example.model.Matrix;
import com.example.service.MatrixMathematics;
import com.example.exception.NoSquareException;

public class TestMatrixMathematics {
	

	@Test
	public final void testTranspose() {
	/*	double[][] mat ={{1,2,2},{4,5,6}, {7, 8,9}};
		Matrix matrix=new Matrix(mat);
		double[][] mat2 ={{1,4,7},{2,5,8}, {2, 6,9}};
		Matrix matrixattendu=new Matrix(mat2);

		MatrixMathematics matTest= new MatrixMathematics();
		Matrix matrixtranspose=matTest.transpose(matrix);
		assertArrayEquals(matrixattendu.getValues(),matrixtranspose.getValues());*/
	}
	
	@Test
	public final void testDeterminant() throws NoSquareException {
		double[][] mat ={{1,2,2},{4,5,6}, {7, 8,9}};
		Matrix matrix=new Matrix(mat);
		double determinantAttendu=3;
		MatrixMathematics matTest= new MatrixMathematics();
		double determinant=matTest.determinant(matrix);
		
		assertEquals((int)determinantAttendu,(int)determinant);
	}
	
	//tester l'exception
	@Test(expected = NoSquareException.class)
	public final void testDeterminant2() throws NoSquareException {
		double[][] mat ={{1,2,2},{4,5,6}};
		Matrix matrix=new Matrix(mat);
		double determinantAttendu=0;
		MatrixMathematics matTest= new MatrixMathematics();
		double determinant=matTest.determinant(matrix);
	//	assertEquals((int)determinantAttendu,(int)determinant);
	}
	
	//matrice de dimenssion == 1
	@Test
	public final void testDeterminant3() throws NoSquareException {
		double[][] mat = {{2}} ;
		double determinantAttendu=2;
		Matrix matrix=new Matrix(mat);
		MatrixMathematics matTest= new MatrixMathematics();
		double determinant=matTest.determinant(matrix);
		assertEquals((int)determinantAttendu,(int)determinant);
	}
	
	@Test
	public final void testCofactor() throws NoSquareException {
		double[][] mat ={{1,2,2},{4,5,6}, {7, 8,9}};
		Matrix matrix=new Matrix(mat);
		double[][] mat2 ={{-3,6,-3},{-2,-5,6}, {2, 2,-3}};
		Matrix matrixattendu=new Matrix(mat2);
		
		MatrixMathematics matTest= new MatrixMathematics();
		Matrix matrixCofactor=matTest.cofactor(matrix);
		assertArrayEquals(matrixattendu.getValues(),matrixCofactor.getValues());
	}
	
	@Test
	public final void testInverse() throws NoSquareException {
	/*	double[][] mat ={{1,2,3},{0,1,4}, {5, 6,2}};
		Matrix matrix=new Matrix(mat);
		double[][] mat2 ={{-24,18,5},{20,-15,-4}, {-5,4,1}};
		Matrix matrixattendu=new Matrix(mat2);
		
		MatrixMathematics matTest= new MatrixMathematics();
		Matrix matrixInverse=matTest.inverse(matrix);
		assertArrayEquals(matrixattendu.getValues(),matrixattendu.getValues());*/
	}

}
