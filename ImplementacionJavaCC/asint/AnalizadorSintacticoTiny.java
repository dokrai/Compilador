/* AnalizadorSintacticoTiny.java */
/* Generated By:JavaCC: Do not edit this line. AnalizadorSintacticoTiny.java */
package asint;

public class AnalizadorSintacticoTiny implements AnalizadorSintacticoTinyConstants {

  final public void S() throws ParseException {
    Programa();
    jj_consume_token(0);
  }

  final public void Programa() throws ParseException {
    LDs();
    jj_consume_token(20);
    LIs();
  }

  final public void LDs() throws ParseException {
    Declaracion();
    RLDs();
  }

  final public void RLDs() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 21:{
      jj_consume_token(21);
      Declaracion();
      RLDs();
      break;
      }
    default:
      jj_la1[0] = jj_gen;

    }
  }

  final public void Declaracion() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NUM:{
      jj_consume_token(NUM);
      break;
      }
    case BOOL:{
      jj_consume_token(BOOL);

      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void LIs() throws ParseException {
    Instruccion();
    RLIs();
  }

  final public void RLIs() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 21:{
      jj_consume_token(21);
      Instruccion();
      RLIs();
      break;
      }
    default:
      jj_la1[2] = jj_gen;

    }
  }

  final public void Instruccion() throws ParseException {
    jj_consume_token(VAR);
    jj_consume_token(22);
    Exp0();
  }

  final public void Exp0() throws ParseException {
    Exp1();
    R0();
  }

  final public void R0() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MAS:
    case MENOS:{
      Op0();
      Exp1();
      R0();
      break;
      }
    default:
      jj_la1[3] = jj_gen;

    }
  }

  final public void Exp1() throws ParseException {
    Exp2();
    R1();
  }

  final public void R1() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AND:{
      jj_consume_token(AND);
      Exp1();
      break;
      }
    case OR:{
      jj_consume_token(OR);
      Exp2();
      break;
      }
    default:
      jj_la1[4] = jj_gen;

    }
  }

  final public void Exp2() throws ParseException {
    Exp3();
    R2();
  }

  final public void R2() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 25:
    case 26:
    case 27:
    case 28:
    case 29:
    case 30:{
      Op2();
      Exp3();
      break;
      }
    default:
      jj_la1[5] = jj_gen;

    }
  }

  final public void Exp3() throws ParseException {
    Exp4();
    R3();
  }

  final public void R3() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 31:
    case 32:{
      Op3();
      Exp4();
      R3();
      break;
      }
    case NOT:
    case MENOS:{
      Exp4();
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Exp4() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MENOS:{
      jj_consume_token(MENOS);
      Exp4();
      break;
      }
    case NOT:{
      jj_consume_token(NOT);
      Exp5();
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Exp5() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NUMR:{
      jj_consume_token(NUMR);
      break;
      }
    case VAR:{
      jj_consume_token(VAR);
      break;
      }
    case 23:{
      jj_consume_token(23);
      Exp0();
      jj_consume_token(24);
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Op0() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MAS:{
      jj_consume_token(MAS);
      break;
      }
    case MENOS:{
      jj_consume_token(MENOS);
      break;
      }
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Op2() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 25:{
      jj_consume_token(25);
      break;
      }
    case 26:{
      jj_consume_token(26);
      break;
      }
    case 27:{
      jj_consume_token(27);
      break;
      }
    case 28:{
      jj_consume_token(28);
      break;
      }
    case 29:{
      jj_consume_token(29);
      break;
      }
    case 30:{
      jj_consume_token(30);
      break;
      }
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Op3() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 31:{
      jj_consume_token(31);
      break;
      }
    case 32:{
      jj_consume_token(32);
      break;
      }
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  /** Generated Token Manager. */
  public AnalizadorSintacticoTinyTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[12];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x200000,0x30,0x200000,0x18000,0x3000,0x7e000000,0x80014000,0x14000,0x800102,0x18000,0x7e000000,0x80000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x1,0x0,0x0,0x0,0x0,0x1,};
   }

  /** Constructor with InputStream. */
  public AnalizadorSintacticoTiny(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public AnalizadorSintacticoTiny(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new AnalizadorSintacticoTinyTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public AnalizadorSintacticoTiny(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new AnalizadorSintacticoTinyTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public AnalizadorSintacticoTiny(AnalizadorSintacticoTinyTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(AnalizadorSintacticoTinyTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[33];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 12; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 33; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

                                       }