package exemplo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rodrigo
 */
public class Livro {

  String titulo, autor, editora;
  Integer ano;

  public Livro() {
  }

  public Livro(String titulo, String autor, String editora, Integer ano) {
    setTitulo(titulo);
    setAutor(autor);
    setEditora(editora);
    setAno(ano);
  }

  public Integer getAno() {
    return ano;
  }

  public void setAno(Integer ano) {
    this.ano = ano;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getEditora() {
    return editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  
  ArrayList<Livro> BestSellers = null;

  public ArrayList<Livro> getBestSellers() {
    return BestSellers;
  }

  public void setBestSellers(ArrayList<Livro> BestSellers) {
    this.BestSellers = BestSellers;
  }

  public ArrayList<Livro> MontaBestSellers(Livro livro1, Livro livro2, Livro livro3) {
    ArrayList<Livro> bestSellers = new ArrayList<Livro>();
    bestSellers.add(livro1);
    bestSellers.add(livro2);
    bestSellers.add(livro3);

   return bestSellers;
  }

  public void ExibeBestSellers(ArrayList<Livro> listaDeBestSellers) {
    for (Iterator<Livro> it = listaDeBestSellers.iterator(); it.hasNext();) {
      Livro bSeller = it.next();
      System.out.println(bSeller.getTitulo() + "\n" + bSeller.getAutor());
      System.out.println(bSeller.getEditora() + ", " + bSeller.getAno());
      System.out.println("--------------------------------");
    }
  }

  public static void main(String[] args) {

    Livro bestSeller1 = new Livro("Steve Jobs", "Walter Isaacson", "Companhia das Letras", 2012);
    Livro bestSeller2 = new Livro("Before I Go to Sleep: A Novel", "S.J.Watson", "Harper Paperbacks", 2012);
    Livro bestSeller3 = new Livro("What It Is Like to Go to War", "Karl Marlantes", "Kindle Edition", 2011);

    Livro l3 = new Livro();
    l3.MontaBestSellers(bestSeller1, bestSeller2, bestSeller3);
    System.out.println(l3.getClass());

  }
} // class