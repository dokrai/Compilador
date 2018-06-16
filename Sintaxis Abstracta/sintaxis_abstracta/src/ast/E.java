package ast;

public abstract class E {
   public abstract TipoE tipo(); 
   public E opnd1() {throw new UnsupportedOperationException("opnd1");} 
   public E opnd2() {throw new UnsupportedOperationException("opnd2");} 
   public E exp() {throw new UnsupportedOperationException("exp");} 
   public LDs def() {throw new UnsupportedOperationException("declaracion");}
   public LIs instr() {throw new UnsupportedOperationException("instruccion");} 
   public String id() {throw new UnsupportedOperationException("id");}
   public String val() {throw new UnsupportedOperationException("real");}
   public String trueCnt() {throw new UnsupportedOperationException("true");}
   public String falseCnt() {throw new UnsupportedOperationException("false");} 
}
