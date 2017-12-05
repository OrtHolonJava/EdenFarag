package project;

public class Square 
{
protected int _Row;
protected int _Col;
protected Img _ImageBackground;
protected enum Soldier {Empty,Black,White};
protected Soldier _soldier;
protected boolean _IsEmpty;
protected Img _ImgSoldier;

public Square(int _Row, int _Col, Img _ImageBackground,Soldier soldier, boolean _IsEmpty, Img _ImgSoldier) 
{
	_Row = _Row;
	_Col = _Col;
	_ImageBackground = _ImageBackground;
	_soldier = soldier;
	_IsEmpty = _IsEmpty;
	_ImgSoldier = _ImgSoldier;
}

public int get_Row() {
	return _Row;
}

public void set_Row(int _Row) {
	this._Row = _Row;
}

public int get_Col() {
	return _Col;
}

public void set_Col(int _Col) {
	this._Col = _Col;
}

public Img get_ImageBackground() {
	return _ImageBackground;
}

public void set_ImageBackground(Img _ImageBackground) {
	this._ImageBackground = _ImageBackground;
}

public boolean is_IsEmpty() {
	return _IsEmpty;
}

public void set_IsEmpty(boolean _IsEmpty) {
	this._IsEmpty = _IsEmpty;
}

public Img get_ImgSoldier() {
	return _ImgSoldier;
}

public void set_ImgSoldier(Img _ImgSoldier) {
	this._ImgSoldier = _ImgSoldier;
}

}
