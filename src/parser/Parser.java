/* Generated By:JJTree&JavaCC: Do not edit this line. Parser.java */
package parser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Parser/*@bgen(jjtree)*/implements ParserTreeConstants, ParserConstants {/*@bgen(jjtree)*/
  protected static JJTParserState jjtree = new JJTParserState();public static void main(String args [])
  {
    FileInputStream fileStream=null;
    try {
    File file= new File("src/parser/test.txt");
    fileStream= new FileInputStream(file);
    } catch (FileNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
        }
         try
    {
    new Parser(fileStream);
    SimpleNode n=Parser.Start();
    n.dump("");
    System.out.println("Thank you");
    }
    catch (Exception e)
    {
      System.out.println("Oops.");
      System.out.println(e.getMessage());
    }
  }

  static final public SimpleNode Start() throws ParseException {
 /*@bgen(jjtree) Start */
  SimpleNode jjtn000 = new SimpleNode(JJTSTART);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Program();
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
    {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }

/* program main*/
  static final public void Program() throws ParseException {
 /*@bgen(jjtree) Program */
  SimpleNode jjtn000 = new SimpleNode(JJTPROGRAM);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(VOID);
      jj_consume_token(MAIN);
      jj_consume_token(LSMALL);
      jj_consume_token(RSMALL);
      jj_consume_token(LBRACES);
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IF:
        case WHILE:
        case INT:
        case SEMICOLON:
        case LBRACES:
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        StatementBlock();
      }
      jj_consume_token(RBRACES);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void StatementBlock() throws ParseException {
 /*@bgen(jjtree) StatementBlock */
  SimpleNode jjtn000 = new SimpleNode(JJTSTATEMENTBLOCK);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case INT:
      case SEMICOLON:
      case IDENTIFIER:
        Statement();
        break;
      case LBRACES:
        jj_consume_token(LBRACES);
        label_2:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case IF:
          case WHILE:
          case INT:
          case SEMICOLON:
          case LBRACES:
          case IDENTIFIER:
            ;
            break;
          default:
            jj_la1[1] = jj_gen;
            break label_2;
          }
          StatementBlock();
        }
        jj_consume_token(RBRACES);
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void Statement() throws ParseException {
 /*@bgen(jjtree) Statement */
  SimpleNode jjtn000 = new SimpleNode(JJTSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case SEMICOLON:
      case IDENTIFIER:
        SequentialStatement();
        break;
      case IF:
        ConditionalSatement();
        break;
      case WHILE:
        LoopStatement();
        break;
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void SequentialStatement() throws ParseException {
 /*@bgen(jjtree) SequentialStatement */
  SimpleNode jjtn000 = new SimpleNode(JJTSEQUENTIALSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case IDENTIFIER:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INT:
          DeclarationStatement();
          break;
        case IDENTIFIER:
          AssignmentStatement();
          break;
        default:
          jj_la1[4] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      default:
        jj_la1[5] = jj_gen;
        ;
      }
      jj_consume_token(SEMICOLON);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void DeclarationStatement() throws ParseException {
 /*@bgen(jjtree) DeclarationStatement */
  SimpleNode jjtn000 = new SimpleNode(JJTDECLARATIONSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(INT);
      jj_consume_token(IDENTIFIER);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EQUAL:
        jj_consume_token(EQUAL);
        Integer();
        break;
      default:
        jj_la1[6] = jj_gen;
        ;
      }
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMA:
          ;
          break;
        default:
          jj_la1[7] = jj_gen;
          break label_3;
        }
        jj_consume_token(COMMA);
        jj_consume_token(IDENTIFIER);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case EQUAL:
          jj_consume_token(EQUAL);
          Integer();
          break;
        default:
          jj_la1[8] = jj_gen;
          ;
        }
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  static final public void AssignmentStatement() throws ParseException {
 /*@bgen(jjtree) AssignmentStatement */
  SimpleNode jjtn000 = new SimpleNode(JJTASSIGNMENTSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IDENTIFIER);
      jj_consume_token(EQUAL);
      Expression();
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void ConditionalSatement() throws ParseException {
 /*@bgen(jjtree) ConditionalSatement */
  SimpleNode jjtn000 = new SimpleNode(JJTCONDITIONALSATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IF);
      Conditional();
      StatementBlock();
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void LoopStatement() throws ParseException {
 /*@bgen(jjtree) LoopStatement */
  SimpleNode jjtn000 = new SimpleNode(JJTLOOPSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(WHILE);
      Conditional();
      StatementBlock();
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void Conditional() throws ParseException {
 /*@bgen(jjtree) Conditional */
  SimpleNode jjtn000 = new SimpleNode(JJTCONDITIONAL);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(LSMALL);
      Expression();
      Relation();
      Expression();
      jj_consume_token(RSMALL);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void Relation() throws ParseException {
 /*@bgen(jjtree) Relation */
  SimpleNode jjtn000 = new SimpleNode(JJTRELATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BIG:
        jj_consume_token(BIG);
        break;
      case SMALL:
        jj_consume_token(SMALL);
        break;
      case EQUAL:
        jj_consume_token(EQUAL);
        break;
      case PANDENG:
        jj_consume_token(PANDENG);
        break;
      case BUDENG:
        jj_consume_token(BUDENG);
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void Expression() throws ParseException {
 /*@bgen(jjtree) Expression */
  SimpleNode jjtn000 = new SimpleNode(JJTEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      AdditiveExpression();
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void AdditiveExpression() throws ParseException {
 /*@bgen(jjtree) AdditiveExpression */
  SimpleNode jjtn000 = new SimpleNode(JJTADDITIVEEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      MultiplicativeExpression();
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUS:
        case MINUS:
          ;
          break;
        default:
          jj_la1[10] = jj_gen;
          break label_4;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUS:
          jj_consume_token(PLUS);
          break;
        case MINUS:
          jj_consume_token(MINUS);
          break;
        default:
          jj_la1[11] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        MultiplicativeExpression();
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void MultiplicativeExpression() throws ParseException {
 /*@bgen(jjtree) MultiplicativeExpression */
  SimpleNode jjtn000 = new SimpleNode(JJTMULTIPLICATIVEEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      UnaryExpression();
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case MULTIPLY:
        case DIVIDE:
        case MOD:
          ;
          break;
        default:
          jj_la1[12] = jj_gen;
          break label_5;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case MULTIPLY:
          jj_consume_token(MULTIPLY);
          break;
        case DIVIDE:
          jj_consume_token(DIVIDE);
          break;
        case MOD:
          jj_consume_token(MOD);
          break;
        default:
          jj_la1[13] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        UnaryExpression();
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void UnaryExpression() throws ParseException {
 /*@bgen(jjtree) UnaryExpression */
  SimpleNode jjtn000 = new SimpleNode(JJTUNARYEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LSMALL:
        jj_consume_token(LSMALL);
        Expression();
        jj_consume_token(RSMALL);
        break;
      case IDENTIFIER:
        Identifier();
        break;
      case INTEGER_LITERAL:
        Integer();
        break;
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void Identifier() throws ParseException {
 /*@bgen(jjtree) Identifier */
  SimpleNode jjtn000 = new SimpleNode(JJTIDENTIFIER);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IDENTIFIER);
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void Integer() throws ParseException {
 /*@bgen(jjtree) Integer */
  SimpleNode jjtn000 = new SimpleNode(JJTINTEGER);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(INTEGER_LITERAL);
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public ParserTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[15];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x8800080,0x8800080,0x8800080,0x8800080,0x8000000,0x8000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x200a000,0x200a000,0x200a000,0x2002000,0x2000000,0x2000000,0x400,0x4000,0x400,0x1f00,0x18,0x18,0xe0,0xe0,0x2280000,};
   }

  /** Constructor with InputStream. */
  public Parser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Parser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Parser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Parser(ParserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
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
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[60];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 15; i++) {
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
    for (int i = 0; i < 60; i++) {
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
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}