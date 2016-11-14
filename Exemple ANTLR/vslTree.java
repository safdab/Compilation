// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 vslTree.g 2009-12-08 21:53:03

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class vslTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IMAGINERY_TOKEN", "PROG", "CORPS", "FCALL_S", "BLOCK", "FCALL", "ARDEC", "PARAM", "ARRAY", "ARELEM", "INST", "DEC", "FUNC_KW", "IDENT", "PG", "PD", "PROTO_KW", "INT_KW", "VOID_KW", "VIRG", "CG", "CD", "ASSIGN_KW", "RETURN_KW", "PRINT_KW", "READ_KW", "IF_KW", "THEN_KW", "ELSE_KW", "FI_KW", "WHILE_KW", "DO_KW", "OD_KW", "AG", "AD", "PLUS", "MOINS", "MUL", "DIV", "INTEGER", "TEXT", "WS", "COMMENT", "LETTER", "DIGIT", "ASCII"
    };
    public static final int DEC=15;
    public static final int LETTER=47;
    public static final int OD_KW=36;
    public static final int PARAM=11;
    public static final int EOF=-1;
    public static final int INT_KW=21;
    public static final int INST=14;
    public static final int MOINS=40;
    public static final int PROG=5;
    public static final int RETURN_KW=27;
    public static final int IMAGINERY_TOKEN=4;
    public static final int ARELEM=13;
    public static final int IF_KW=30;
    public static final int ARDEC=10;
    public static final int VIRG=23;
    public static final int AD=38;
    public static final int IDENT=17;
    public static final int PLUS=39;
    public static final int FI_KW=33;
    public static final int AG=37;
    public static final int DIGIT=48;
    public static final int ASSIGN_KW=26;
    public static final int COMMENT=46;
    public static final int ARRAY=12;
    public static final int READ_KW=29;
    public static final int INTEGER=43;
    public static final int FCALL=9;
    public static final int DO_KW=35;
    public static final int FUNC_KW=16;
    public static final int ELSE_KW=32;
    public static final int TEXT=44;
    public static final int MUL=41;
    public static final int THEN_KW=31;
    public static final int WS=45;
    public static final int PROTO_KW=20;
    public static final int WHILE_KW=34;
    public static final int CORPS=6;
    public static final int BLOCK=8;
    public static final int ASCII=49;
    public static final int FCALL_S=7;
    public static final int CG=24;
    public static final int DIV=42;
    public static final int CD=25;
    public static final int PRINT_KW=28;
    public static final int PD=19;
    public static final int PG=18;
    public static final int VOID_KW=22;

    // delegates
    // delegators


        public vslTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public vslTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return vslTree.tokenNames; }
    public String getGrammarFileName() { return "vslTree.g"; }

    TableSymboles tab = new TableSymboles();


    // $ANTLR start "program"
    // vslTree.g:15:1: program returns [Code c] : ^( PROG u1= unite (u2= unite )* ) ;
    public final Code program() throws RecognitionException {
        Code c = null;

        Code u1 = null;

        Code u2 = null;


        try {
            // vslTree.g:15:26: ( ^( PROG u1= unite (u2= unite )* ) )
            // vslTree.g:15:28: ^( PROG u1= unite (u2= unite )* )
            {
            match(input,PROG,FOLLOW_PROG_in_program59); if (state.failed) return c;

            if ( state.backtracking==0 ) {
              tab.Enter_Scope();
            }

            match(input, Token.DOWN, null); if (state.failed) return c;
            pushFollow(FOLLOW_unite_in_program65);
            u1=unite();

            state._fsp--;
            if (state.failed) return c;
            if ( state.backtracking==0 ) {
              c=u1;
            }
            // vslTree.g:16:9: (u2= unite )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC_KW||LA1_0==PROTO_KW) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // vslTree.g:16:11: u2= unite
            	    {
            	    if ( state.backtracking==0 ) {
            	      tab.Enter_Scope();
            	    }
            	    pushFollow(FOLLOW_unite_in_program84);
            	    u2=unite();

            	    state._fsp--;
            	    if (state.failed) return c;
            	    if ( state.backtracking==0 ) {
            	      c.append(u2);
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return c;
            if ( state.backtracking==0 ) {
              for(int i=tab.getScope(); i>0 ;i--){tab.Leave_Scope();}
              				
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "program"


    // $ANTLR start "unite"
    // vslTree.g:21:1: unite returns [Code c] : (f= function | proto );
    public final Code unite() throws RecognitionException {
        Code c = null;

        Code f = null;


        try {
            // vslTree.g:21:24: (f= function | proto )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FUNC_KW) ) {
                alt2=1;
            }
            else if ( (LA2_0==PROTO_KW) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return c;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // vslTree.g:21:26: f= function
                    {
                    pushFollow(FOLLOW_function_in_unite118);
                    f=function();

                    state._fsp--;
                    if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      c=f;
                    }

                    }
                    break;
                case 2 :
                    // vslTree.g:22:5: proto
                    {
                    pushFollow(FOLLOW_proto_in_unite126);
                    proto();

                    state._fsp--;
                    if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      c=new Code();
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "unite"


    // $ANTLR start "function"
    // vslTree.g:25:1: function returns [Code c] : ^( FUNC_KW t= type id= IDENT p= param_list ^( CORPS stat= statement ) ) ;
    public final Code function() throws RecognitionException {
        Code c = null;

        CommonTree id=null;
        Type t = null;

        Param p = null;

        Code stat = null;


        try {
            // vslTree.g:25:27: ( ^( FUNC_KW t= type id= IDENT p= param_list ^( CORPS stat= statement ) ) )
            // vslTree.g:25:28: ^( FUNC_KW t= type id= IDENT p= param_list ^( CORPS stat= statement ) )
            {
            match(input,FUNC_KW,FOLLOW_FUNC_KW_in_function143); if (state.failed) return c;

            match(input, Token.DOWN, null); if (state.failed) return c;
            pushFollow(FOLLOW_type_in_function147);
            t=type();

            state._fsp--;
            if (state.failed) return c;
            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_function151); if (state.failed) return c;
            pushFollow(FOLLOW_param_list_in_function155);
            p=param_list();

            state._fsp--;
            if (state.failed) return c;
            match(input,CORPS,FOLLOW_CORPS_in_function158); if (state.failed) return c;

            match(input, Token.DOWN, null); if (state.failed) return c;
            pushFollow(FOLLOW_statement_in_function162);
            stat=statement();

            state._fsp--;
            if (state.failed) return c;

            match(input, Token.UP, null); if (state.failed) return c;

            match(input, Token.UP, null); if (state.failed) return c;
            if ( state.backtracking==0 ) {
              String nom = id.getText(); 
              				 Type fun = new TypeFunction(t);
              				 while(!p.type.isEmpty()){
              				 fun.addSubType(p.type.remove(0));
              				 }
              				 Tokatt verif=tab.Lookup(nom);
              				 if(verif==null){
              				 Tokatt to=new Tokatt(fun,nom,tab.getScope());
              				 tab.Insert(nom,to);}
              				 else{	TypeFunction tf = (TypeFunction) verif.type;
              					if(tf.IsProto()){System.out.println("La fonction "+nom+" est déjà définie");System.exit(0);}
              					else{
              						if(!verif.type.isCompatible(fun)){System.out.println("La définition de la fonction "+nom+" ne correspond pas à son prototype"); System.exit(0);}
              					}
              				tf._defined=false;
              				}
              				c=Code.genFunc(p.code,stat,nom,t);
              				
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "function"


    // $ANTLR start "proto"
    // vslTree.g:48:1: proto : ^( PROTO_KW t= type i= IDENT p= param_list ) ;
    public final void proto() throws RecognitionException {
        CommonTree i=null;
        Type t = null;

        Param p = null;


        try {
            // vslTree.g:48:8: ( ^( PROTO_KW t= type i= IDENT p= param_list ) )
            // vslTree.g:48:11: ^( PROTO_KW t= type i= IDENT p= param_list )
            {
            match(input,PROTO_KW,FOLLOW_PROTO_KW_in_proto190); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_proto194);
            t=type();

            state._fsp--;
            if (state.failed) return ;
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_proto198); if (state.failed) return ;
            pushFollow(FOLLOW_param_list_in_proto202);
            p=param_list();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {

              								Tokatt verif=tab.Lookup(i.getText());
              								TypeFunction fun = new TypeFunction(t);
              									 while(!p.type.isEmpty()){
              									 fun.addSubType(p.type.remove(0));
              									 }
              								fun.Proto2Fonc();
              								if (verif==null){
              							        Tokatt to=new Tokatt(fun,i.getText(),tab.getScope());
              								tab.Insert(i.getText(),to);	
              								}
              								else{System.out.println("la fonction "+i.getText()+" a déjà été prototypée ou définie");System.exit(0);}
              								
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "proto"


    // $ANTLR start "type"
    // vslTree.g:63:1: type returns [Type t] : ( INT_KW | VOID_KW );
    public final Type type() throws RecognitionException {
        Type t = null;

        try {
            // vslTree.g:63:23: ( INT_KW | VOID_KW )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==INT_KW) ) {
                alt3=1;
            }
            else if ( (LA3_0==VOID_KW) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // vslTree.g:63:25: INT_KW
                    {
                    match(input,INT_KW,FOLLOW_INT_KW_in_type219); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                      t=TypeSystem.T_integer;
                    }

                    }
                    break;
                case 2 :
                    // vslTree.g:64:5: VOID_KW
                    {
                    match(input,VOID_KW,FOLLOW_VOID_KW_in_type227); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                      t=TypeSystem.T_void;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "type"


    // $ANTLR start "param_list"
    // vslTree.g:67:1: param_list returns [Param p] : ( ^( PARAM p1= param (p2= param )* ) | PARAM );
    public final Param param_list() throws RecognitionException {
        Param p = null;

        Expratt p1 = null;

        Expratt p2 = null;


        try {
            // vslTree.g:67:30: ( ^( PARAM p1= param (p2= param )* ) | PARAM )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==PARAM) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==DOWN) ) {
                    alt5=1;
                }
                else if ( (LA5_1==UP||LA5_1==CORPS) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return p;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return p;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // vslTree.g:67:31: ^( PARAM p1= param (p2= param )* )
                    {
                    match(input,PARAM,FOLLOW_PARAM_in_param_list244); if (state.failed) return p;

                    match(input, Token.DOWN, null); if (state.failed) return p;
                    pushFollow(FOLLOW_param_in_param_list248);
                    p1=param();

                    state._fsp--;
                    if (state.failed) return p;
                    if ( state.backtracking==0 ) {
                      Code c=p1.code; Type t=p1.type; ArrayList<Type> a = new ArrayList<Type>();
                      				a.add(t);
                      				 p=new Param(a,c);
                    }
                    // vslTree.g:72:5: (p2= param )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==ARRAY||LA4_0==IDENT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // vslTree.g:72:6: p2= param
                    	    {
                    	    pushFollow(FOLLOW_param_in_param_list266);
                    	    p2=param();

                    	    state._fsp--;
                    	    if (state.failed) return p;
                    	    if ( state.backtracking==0 ) {
                    	      p.code.append(p2.code); p.type.add(p2.type);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return p;

                    }
                    break;
                case 2 :
                    // vslTree.g:73:5: PARAM
                    {
                    match(input,PARAM,FOLLOW_PARAM_in_param_list278); if (state.failed) return p;
                    if ( state.backtracking==0 ) {
                      p=new Param(new ArrayList<Type>(),new Code());
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return p;
    }
    // $ANTLR end "param_list"


    // $ANTLR start "param"
    // vslTree.g:76:1: param returns [Expratt exp] : (i= IDENT | ^( ARRAY i= IDENT ) );
    public final Expratt param() throws RecognitionException {
        Expratt exp = null;

        CommonTree i=null;

        try {
            // vslTree.g:76:30: (i= IDENT | ^( ARRAY i= IDENT ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                alt6=1;
            }
            else if ( (LA6_0==ARRAY) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return exp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // vslTree.g:76:32: i= IDENT
                    {
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_param298); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                      String s= i.getText();
                      						Tokatt t=tab.Lookup(s); 
                      						if(t!=null && t.scope==tab.getScope())
                      							{System.out.println("impossible de déclarer deux fois la même variable");System.exit(0);}
                      							Tokatt var = new Tokatt(TypeSystem.T_integer,s,tab.getScope());
                      							Code c=Code.genParamId(s,tab,var);
                      							exp=new Expratt(var.type,c,var);						

                      						
                    }

                    }
                    break;
                case 2 :
                    // vslTree.g:85:12: ^( ARRAY i= IDENT )
                    {
                    match(input,ARRAY,FOLLOW_ARRAY_in_param314); if (state.failed) return exp;

                    match(input, Token.DOWN, null); if (state.failed) return exp;
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_param318); if (state.failed) return exp;

                    match(input, Token.UP, null); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                      String s= i.getText(); 
                      					Tokatt t=tab.Lookup(s); 
                      					if(t!=null && t.scope==tab.getScope())
                      							{System.out.println("impossible de déclarer deux fois la même variable");System.exit(0);}
                      					Tokatt to = new Tokatt(TypeSystem.T_pointer,s,tab.getScope());
                      					Code c=Code.genParamTab(s,tab,to);
                      				        Type ar=new TypeArray(TypeSystem.T_integer,0);
                      					exp=new Expratt(ar,c,to);
                      					
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return exp;
    }
    // $ANTLR end "param"


    // $ANTLR start "statement"
    // vslTree.g:96:1: statement returns [Code c] : ( ^( ASSIGN_KW i= IDENT exp= expression ) | ^( ASSIGN_KW etab= tab_elem exp1= expression ) | ^( RETURN_KW exp1= expression ) | ^( PRINT_KW p= print_list ) | ^( READ_KW r= read_list ) | ^( IF_KW exp1= expression exp2= statement (exp3= statement )? ) | ^( WHILE_KW exp1= expression exp2= statement ) | ^( FCALL_S i= IDENT (a= argument_list )? ) | b= block );
    public final Code statement() throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Expratt exp = null;

        Tabelem etab = null;

        Expratt exp1 = null;

        Code p = null;

        Code r = null;

        Code exp2 = null;

        Code exp3 = null;

        Param a = null;

        Code b = null;


        c=new Code();
        try {
            // vslTree.g:96:48: ( ^( ASSIGN_KW i= IDENT exp= expression ) | ^( ASSIGN_KW etab= tab_elem exp1= expression ) | ^( RETURN_KW exp1= expression ) | ^( PRINT_KW p= print_list ) | ^( READ_KW r= read_list ) | ^( IF_KW exp1= expression exp2= statement (exp3= statement )? ) | ^( WHILE_KW exp1= expression exp2= statement ) | ^( FCALL_S i= IDENT (a= argument_list )? ) | b= block )
            int alt9=9;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // vslTree.g:96:49: ^( ASSIGN_KW i= IDENT exp= expression )
                    {
                    match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_statement339); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement343); if (state.failed) return c;
                    pushFollow(FOLLOW_expression_in_statement347);
                    exp=expression();

                    state._fsp--;
                    if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      String var=i.getText(); 
                      			Tokatt t=tab.Lookup(var);
                      			if(t==null){System.out.println("variable "+var+" non déclarée");System.exit(0);}
                      			if(exp.type!=TypeSystem.T_integer){System.out.println("impossible d'assigner une expression qui n'est pas de type entier");System.exit(0);}
                      			if(t.type!=TypeSystem.T_integer){System.out.println("erreur de type : impossible de faire une assignation sur l'identificateur "+var+",cet ident est déclaré mais ce n'est pas une variable");System.exit(0);}
                      			c=Code.genAssignId(t,exp);
                      			
                    }

                    }
                    break;
                case 2 :
                    // vslTree.g:104:5: ^( ASSIGN_KW etab= tab_elem exp1= expression )
                    {
                    match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_statement360); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    pushFollow(FOLLOW_tab_elem_in_statement364);
                    etab=tab_elem();

                    state._fsp--;
                    if (state.failed) return c;
                    pushFollow(FOLLOW_expression_in_statement368);
                    exp1=expression();

                    state._fsp--;
                    if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      Tokatt tok=tab.Lookup(etab.nom);
                      			 if(tok==null){System.out.println("tableau non déclaré");System.exit(0);}
                      			 if(exp1.type!=TypeSystem.T_integer){System.out.println("impossible d'assigner une expression qui n'est pas de type entier");System.exit(0);}
                      			 c=Code.genAssignTab(tok,etab.exp,exp1);
                      			
                    }

                    }
                    break;
                case 3 :
                    // vslTree.g:110:5: ^( RETURN_KW exp1= expression )
                    {
                    match(input,RETURN_KW,FOLLOW_RETURN_KW_in_statement382); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    pushFollow(FOLLOW_expression_in_statement386);
                    exp1=expression();

                    state._fsp--;
                    if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      Code cod = Code.genReturn(exp1); c.append(cod);
                      			
                    }

                    }
                    break;
                case 4 :
                    // vslTree.g:113:5: ^( PRINT_KW p= print_list )
                    {
                    match(input,PRINT_KW,FOLLOW_PRINT_KW_in_statement399); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    pushFollow(FOLLOW_print_list_in_statement403);
                    p=print_list();

                    state._fsp--;
                    if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      c.append(p);
                    }

                    }
                    break;
                case 5 :
                    // vslTree.g:116:5: ^( READ_KW r= read_list )
                    {
                    match(input,READ_KW,FOLLOW_READ_KW_in_statement420); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    pushFollow(FOLLOW_read_list_in_statement424);
                    r=read_list();

                    state._fsp--;
                    if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      c.append(r);
                      			
                    }

                    }
                    break;
                case 6 :
                    // vslTree.g:119:5: ^( IF_KW exp1= expression exp2= statement (exp3= statement )? )
                    {
                    match(input,IF_KW,FOLLOW_IF_KW_in_statement437); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    pushFollow(FOLLOW_expression_in_statement441);
                    exp1=expression();

                    state._fsp--;
                    if (state.failed) return c;
                    pushFollow(FOLLOW_statement_in_statement445);
                    exp2=statement();

                    state._fsp--;
                    if (state.failed) return c;
                    // vslTree.g:119:48: (exp3= statement )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=FCALL_S && LA7_0<=BLOCK)||(LA7_0>=ASSIGN_KW && LA7_0<=IF_KW)||LA7_0==WHILE_KW) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // vslTree.g:0:0: exp3= statement
                            {
                            pushFollow(FOLLOW_statement_in_statement449);
                            exp3=statement();

                            state._fsp--;
                            if (state.failed) return c;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      Code cod = Code.genIf(exp1, exp2, exp3); c.append(cod);
                      			
                    }

                    }
                    break;
                case 7 :
                    // vslTree.g:123:5: ^( WHILE_KW exp1= expression exp2= statement )
                    {
                    match(input,WHILE_KW,FOLLOW_WHILE_KW_in_statement464); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    pushFollow(FOLLOW_expression_in_statement468);
                    exp1=expression();

                    state._fsp--;
                    if (state.failed) return c;
                    pushFollow(FOLLOW_statement_in_statement472);
                    exp2=statement();

                    state._fsp--;
                    if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;
                    if ( state.backtracking==0 ) {

                      				Code cod = Code.genWhile(exp1,exp2);c.append(cod);
                      			
                    }

                    }
                    break;
                case 8 :
                    // vslTree.g:127:5: ^( FCALL_S i= IDENT (a= argument_list )? )
                    {
                    match(input,FCALL_S,FOLLOW_FCALL_S_in_statement485); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement489); if (state.failed) return c;
                    // vslTree.g:127:24: (a= argument_list )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==FCALL||LA8_0==ARELEM||LA8_0==IDENT||(LA8_0>=PLUS && LA8_0<=INTEGER)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // vslTree.g:0:0: a= argument_list
                            {
                            pushFollow(FOLLOW_argument_list_in_statement493);
                            a=argument_list();

                            state._fsp--;
                            if (state.failed) return c;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      String s=i.getText();
                      			 Tokatt fun=tab.Lookup(s);
                      			 if (fun==null){System.out.println("la fonction "+s+" n'a pas été défini avant son utilisation"); System.exit(0);}
                      			 Type f = new TypeFunction(fun.type);
                      			while(!a.type.isEmpty()){f.addSubType(a.type.remove(0));}
                      			 if (!fun.type.isCompatible(f)){System.out.println("les arguments de la fonction "+s+" sont incohérents par rapport à sa définition"); System.exit(0);}
                      			 c=Code.genFcalls(s,a.code);
                      			
                    }

                    }
                    break;
                case 9 :
                    // vslTree.g:136:5: b= block
                    {
                    pushFollow(FOLLOW_block_in_statement508);
                    b=block();

                    state._fsp--;
                    if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      c=b;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "statement"


    // $ANTLR start "block"
    // vslTree.g:140:1: block returns [Code c] : ( ^( BLOCK d= declaration s= suit_inst ) | ^( BLOCK s= suit_inst ) );
    public final Code block() throws RecognitionException {
        Code c = null;

        Code d = null;

        Code s = null;


        try {
            // vslTree.g:140:24: ( ^( BLOCK d= declaration s= suit_inst ) | ^( BLOCK s= suit_inst ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==BLOCK) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==DOWN) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==INST) ) {
                        alt10=2;
                    }
                    else if ( (LA10_2==DEC) ) {
                        alt10=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return c;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return c;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return c;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // vslTree.g:140:26: ^( BLOCK d= declaration s= suit_inst )
                    {
                    match(input,BLOCK,FOLLOW_BLOCK_in_block529); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    pushFollow(FOLLOW_declaration_in_block533);
                    d=declaration();

                    state._fsp--;
                    if (state.failed) return c;
                    pushFollow(FOLLOW_suit_inst_in_block537);
                    s=suit_inst();

                    state._fsp--;
                    if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      c=d;c.append(s);
                    }

                    }
                    break;
                case 2 :
                    // vslTree.g:141:6: ^( BLOCK s= suit_inst )
                    {
                    match(input,BLOCK,FOLLOW_BLOCK_in_block548); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    pushFollow(FOLLOW_suit_inst_in_block552);
                    s=suit_inst();

                    state._fsp--;
                    if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      c=s;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "block"


    // $ANTLR start "tab_elem"
    // vslTree.g:145:1: tab_elem returns [Tabelem t] : ^( ARELEM id= IDENT exp1= expression ) ;
    public final Tabelem tab_elem() throws RecognitionException {
        Tabelem t = null;

        CommonTree id=null;
        Expratt exp1 = null;


        try {
            // vslTree.g:145:30: ( ^( ARELEM id= IDENT exp1= expression ) )
            // vslTree.g:145:32: ^( ARELEM id= IDENT exp1= expression )
            {
            match(input,ARELEM,FOLLOW_ARELEM_in_tab_elem572); if (state.failed) return t;

            match(input, Token.DOWN, null); if (state.failed) return t;
            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_tab_elem576); if (state.failed) return t;
            pushFollow(FOLLOW_expression_in_tab_elem580);
            exp1=expression();

            state._fsp--;
            if (state.failed) return t;

            match(input, Token.UP, null); if (state.failed) return t;
            if ( state.backtracking==0 ) {
                
              		String s=id.getText();
              		t=new Tabelem(s,exp1);
              		if(exp1.type!=TypeSystem.T_integer){System.out.println("un élément de tableau ne peut être désigné que par une expression de type entier");System.exit(0);}
              		
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "tab_elem"


    // $ANTLR start "suit_inst"
    // vslTree.g:153:1: suit_inst returns [Code c] : ^( INST s1= statement (s2= statement )* ) ;
    public final Code suit_inst() throws RecognitionException {
        Code c = null;

        Code s1 = null;

        Code s2 = null;


        try {
            // vslTree.g:153:28: ( ^( INST s1= statement (s2= statement )* ) )
            // vslTree.g:153:30: ^( INST s1= statement (s2= statement )* )
            {
            match(input,INST,FOLLOW_INST_in_suit_inst602); if (state.failed) return c;

            match(input, Token.DOWN, null); if (state.failed) return c;
            pushFollow(FOLLOW_statement_in_suit_inst606);
            s1=statement();

            state._fsp--;
            if (state.failed) return c;
            if ( state.backtracking==0 ) {
              c=s1;
            }
            // vslTree.g:153:58: (s2= statement )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=FCALL_S && LA11_0<=BLOCK)||(LA11_0>=ASSIGN_KW && LA11_0<=IF_KW)||LA11_0==WHILE_KW) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // vslTree.g:153:59: s2= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_suit_inst613);
            	    s2=statement();

            	    state._fsp--;
            	    if (state.failed) return c;
            	    if ( state.backtracking==0 ) {
            	      c.append(s2);
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return c;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "suit_inst"


    // $ANTLR start "expression"
    // vslTree.g:157:1: expression returns [Expratt exp] : ( ^( PLUS exp1= expression exp2= expression ) | ^( MOINS exp1= expression exp2= expression ) | ^( MUL exp1= expression exp2= expression ) | ^( DIV exp1= expression exp2= expression ) | i= INTEGER | i= IDENT | ta= tab_elem | ^( FCALL i= IDENT (a= argument_list )? ) );
    public final Expratt expression() throws RecognitionException {
        Expratt exp = null;

        CommonTree i=null;
        Expratt exp1 = null;

        Expratt exp2 = null;

        Tabelem ta = null;

        Param a = null;


        try {
            // vslTree.g:157:34: ( ^( PLUS exp1= expression exp2= expression ) | ^( MOINS exp1= expression exp2= expression ) | ^( MUL exp1= expression exp2= expression ) | ^( DIV exp1= expression exp2= expression ) | i= INTEGER | i= IDENT | ta= tab_elem | ^( FCALL i= IDENT (a= argument_list )? ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt13=1;
                }
                break;
            case MOINS:
                {
                alt13=2;
                }
                break;
            case MUL:
                {
                alt13=3;
                }
                break;
            case DIV:
                {
                alt13=4;
                }
                break;
            case INTEGER:
                {
                alt13=5;
                }
                break;
            case IDENT:
                {
                alt13=6;
                }
                break;
            case ARELEM:
                {
                alt13=7;
                }
                break;
            case FCALL:
                {
                alt13=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return exp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // vslTree.g:158:4: ^( PLUS exp1= expression exp2= expression )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expression640); if (state.failed) return exp;

                    match(input, Token.DOWN, null); if (state.failed) return exp;
                    pushFollow(FOLLOW_expression_in_expression644);
                    exp1=expression();

                    state._fsp--;
                    if (state.failed) return exp;
                    pushFollow(FOLLOW_expression_in_expression649);
                    exp2=expression();

                    state._fsp--;
                    if (state.failed) return exp;

                    match(input, Token.UP, null); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                      Type ty = TypeSystem.CheckBinOp(exp1.type, exp2.type);
                      				  Tokatt temp = SymbDistrib.newTemp();
                      				  Code cod = Code.genBinOp(Inst3a.TAC_ADD, exp1, exp2, temp);
                      				  exp = new Expratt(ty, cod, temp);
                    }

                    }
                    break;
                case 2 :
                    // vslTree.g:163:5: ^( MOINS exp1= expression exp2= expression )
                    {
                    match(input,MOINS,FOLLOW_MOINS_in_expression662); if (state.failed) return exp;

                    match(input, Token.DOWN, null); if (state.failed) return exp;
                    pushFollow(FOLLOW_expression_in_expression666);
                    exp1=expression();

                    state._fsp--;
                    if (state.failed) return exp;
                    pushFollow(FOLLOW_expression_in_expression670);
                    exp2=expression();

                    state._fsp--;
                    if (state.failed) return exp;

                    match(input, Token.UP, null); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                      Type ty = TypeSystem.CheckBinOp(exp1.type, exp2.type);
                      				  Tokatt temp = SymbDistrib.newTemp();
                      				  Code cod = Code.genBinOp(Inst3a.TAC_SUB, exp1, exp2, temp);
                      				  exp = new Expratt(ty, cod, temp);
                    }

                    }
                    break;
                case 3 :
                    // vslTree.g:168:5: ^( MUL exp1= expression exp2= expression )
                    {
                    match(input,MUL,FOLLOW_MUL_in_expression683); if (state.failed) return exp;

                    match(input, Token.DOWN, null); if (state.failed) return exp;
                    pushFollow(FOLLOW_expression_in_expression687);
                    exp1=expression();

                    state._fsp--;
                    if (state.failed) return exp;
                    pushFollow(FOLLOW_expression_in_expression692);
                    exp2=expression();

                    state._fsp--;
                    if (state.failed) return exp;

                    match(input, Token.UP, null); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                      Type ty = TypeSystem.CheckBinOp(exp1.type, exp2.type);
                      				  Tokatt temp = SymbDistrib.newTemp();
                      				  Code cod = Code.genBinOp(Inst3a.TAC_MUL, exp1, exp2, temp);
                      				  exp = new Expratt(ty, cod, temp);
                    }

                    }
                    break;
                case 4 :
                    // vslTree.g:173:5: ^( DIV exp1= expression exp2= expression )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expression705); if (state.failed) return exp;

                    match(input, Token.DOWN, null); if (state.failed) return exp;
                    pushFollow(FOLLOW_expression_in_expression709);
                    exp1=expression();

                    state._fsp--;
                    if (state.failed) return exp;
                    pushFollow(FOLLOW_expression_in_expression714);
                    exp2=expression();

                    state._fsp--;
                    if (state.failed) return exp;

                    match(input, Token.UP, null); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                      Type ty = TypeSystem.CheckBinOp(exp1.type, exp2.type);
                      				  Tokatt temp = SymbDistrib.newTemp();
                      				  Code cod = Code.genBinOp(Inst3a.TAC_DIV, exp1, exp2, temp);
                      				  exp = new Expratt(ty, cod, temp);
                    }

                    }
                    break;
                case 5 :
                    // vslTree.g:178:5: i= INTEGER
                    {
                    i=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expression728); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                      int ival =Integer.parseInt(i.getText());
                      				 exp = new Expratt(TypeSystem.T_integer, new Code(), new Tokatt(ival));
                    }

                    }
                    break;
                case 6 :
                    // vslTree.g:181:5: i= IDENT
                    {
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expression741); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                      String ival = i.getText(); 
                      			Tokatt t = tab.Lookup(ival); 
                      			if(t!=null){exp=new Expratt(t.type,new Code(),t);}
                      			else {System.out.println("ident inexistant");System.exit(0);}
                      			
                    }

                    }
                    break;
                case 7 :
                    // vslTree.g:187:11: ta= tab_elem
                    {
                    pushFollow(FOLLOW_tab_elem_in_expression760);
                    ta=tab_elem();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                      Tokatt tok=tab.Lookup(ta.nom);
                      				if (tok==null)
                               	  		 {  System.out.println("tableau mal declaré");}
                            				else
                               	   		{Tokatt temp=SymbDistrib.newTemp(); 
                      		    		Code cod=Code.genTabElem(temp,ta.exp,tok); 
                      		    		exp = new Expratt(TypeSystem.T_integer,cod,temp); 
                      				}
                      			
                    }

                    }
                    break;
                case 8 :
                    // vslTree.g:198:5: ^( FCALL i= IDENT (a= argument_list )? )
                    {
                    match(input,FCALL,FOLLOW_FCALL_in_expression778); if (state.failed) return exp;

                    match(input, Token.DOWN, null); if (state.failed) return exp;
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expression782); if (state.failed) return exp;
                    // vslTree.g:198:22: (a= argument_list )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==FCALL||LA12_0==ARELEM||LA12_0==IDENT||(LA12_0>=PLUS && LA12_0<=INTEGER)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // vslTree.g:0:0: a= argument_list
                            {
                            pushFollow(FOLLOW_argument_list_in_expression786);
                            a=argument_list();

                            state._fsp--;
                            if (state.failed) return exp;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {

                      			 String s=i.getText();
                      			 Tokatt temp = SymbDistrib.newTemp();
                      			 Type type = TypeSystem.T_integer;
                      			 Tokatt fun=tab.Lookup(s);
                      			 if (fun==null){System.out.println("la fonction "+s+" n'a pas été défini avant son utilisation"); System.exit(0);}
                      			 Type f = new TypeFunction(type);
                      			while(!a.type.isEmpty()){f.addSubType(a.type.remove(0));}
                      			 if (!fun.type.isCompatible(f)){System.out.println("la fonction "+s+" n'est pas de type INT ou a des arguments incohérents par rapport à sa définition"); System.exit(0);}
                      			 Code code = Code.genFcall(s,a.code,temp);
                      			 exp = new Expratt(type,code,temp);
                      			
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return exp;
    }
    // $ANTLR end "expression"


    // $ANTLR start "argument_list"
    // vslTree.g:213:1: argument_list returns [Param p] : exp1= expression (exp2= expression )* ;
    public final Param argument_list() throws RecognitionException {
        Param p = null;

        Expratt exp1 = null;

        Expratt exp2 = null;


        try {
            // vslTree.g:213:33: (exp1= expression (exp2= expression )* )
            // vslTree.g:213:35: exp1= expression (exp2= expression )*
            {
            pushFollow(FOLLOW_expression_in_argument_list807);
            exp1=expression();

            state._fsp--;
            if (state.failed) return p;
            if ( state.backtracking==0 ) {
              Code c=Code.genArg(exp1);ArrayList<Type> a=new ArrayList<Type>();a.add(exp1.type); p=new Param(a,c); 
            }
            // vslTree.g:215:6: (exp2= expression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==FCALL||LA14_0==ARELEM||LA14_0==IDENT||(LA14_0>=PLUS && LA14_0<=INTEGER)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // vslTree.g:215:7: exp2= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_argument_list824);
            	    exp2=expression();

            	    state._fsp--;
            	    if (state.failed) return p;
            	    if ( state.backtracking==0 ) {
            	      p.code.append(Code.genArg(exp2));p.type.add(exp2.type);
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return p;
    }
    // $ANTLR end "argument_list"


    // $ANTLR start "print_list"
    // vslTree.g:219:1: print_list returns [Code c] : c1= print_item (c2= print_item )* ;
    public final Code print_list() throws RecognitionException {
        Code c = null;

        Code c1 = null;

        Code c2 = null;


        try {
            // vslTree.g:219:29: (c1= print_item (c2= print_item )* )
            // vslTree.g:219:30: c1= print_item (c2= print_item )*
            {
            pushFollow(FOLLOW_print_item_in_print_list845);
            c1=print_item();

            state._fsp--;
            if (state.failed) return c;
            if ( state.backtracking==0 ) {
              c=c1;
            }
            // vslTree.g:219:52: (c2= print_item )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==FCALL||LA15_0==ARELEM||LA15_0==IDENT||(LA15_0>=PLUS && LA15_0<=TEXT)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // vslTree.g:219:53: c2= print_item
            	    {
            	    pushFollow(FOLLOW_print_item_in_print_list852);
            	    c2=print_item();

            	    state._fsp--;
            	    if (state.failed) return c;
            	    if ( state.backtracking==0 ) {
            	      c.append(c2);
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "print_list"


    // $ANTLR start "print_item"
    // vslTree.g:225:1: print_item returns [Code c] : (t= TEXT | exp= expression );
    public final Code print_item() throws RecognitionException {
        Code c = null;

        CommonTree t=null;
        Expratt exp = null;


        try {
            // vslTree.g:225:29: (t= TEXT | exp= expression )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==TEXT) ) {
                alt16=1;
            }
            else if ( (LA16_0==FCALL||LA16_0==ARELEM||LA16_0==IDENT||(LA16_0>=PLUS && LA16_0<=INTEGER)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return c;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // vslTree.g:225:31: t= TEXT
                    {
                    t=(CommonTree)match(input,TEXT,FOLLOW_TEXT_in_print_item885); if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      String s=t.getText(); Tokatt l= new Tokatt(s);c=Code.genPrintS(l);
                    }

                    }
                    break;
                case 2 :
                    // vslTree.g:226:5: exp= expression
                    {
                    pushFollow(FOLLOW_expression_in_print_item894);
                    exp=expression();

                    state._fsp--;
                    if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                       
                      					if(exp.type!=TypeSystem.T_integer)
                      					   {System.out.println("Impossible d'afficher "+exp.place.getChain()+" ce n'est pas un type entier ou texte");System.exit(0);}
                      					c=Code.genPrintI(exp);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "print_item"


    // $ANTLR start "read_list"
    // vslTree.g:233:1: read_list returns [Code c] : c1= read_item (c2= read_item )* ;
    public final Code read_list() throws RecognitionException {
        Code c = null;

        Code c1 = null;

        Code c2 = null;


        try {
            // vslTree.g:233:28: (c1= read_item (c2= read_item )* )
            // vslTree.g:233:30: c1= read_item (c2= read_item )*
            {
            pushFollow(FOLLOW_read_item_in_read_list917);
            c1=read_item();

            state._fsp--;
            if (state.failed) return c;
            if ( state.backtracking==0 ) {
              c=c1;
            }
            // vslTree.g:233:50: (c2= read_item )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ARELEM||LA17_0==IDENT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // vslTree.g:233:52: c2= read_item
            	    {
            	    pushFollow(FOLLOW_read_item_in_read_list924);
            	    c2=read_item();

            	    state._fsp--;
            	    if (state.failed) return c;
            	    if ( state.backtracking==0 ) {
            	      c.append(c2);
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "read_list"


    // $ANTLR start "read_item"
    // vslTree.g:236:1: read_item returns [Code c] : (i= IDENT | t= tab_elem );
    public final Code read_item() throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Tabelem t = null;


        try {
            // vslTree.g:236:28: (i= IDENT | t= tab_elem )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                alt18=1;
            }
            else if ( (LA18_0==ARELEM) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return c;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // vslTree.g:236:30: i= IDENT
                    {
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_read_item946); if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      String var=i.getText();  Tokatt toc=tab.Lookup(var); 
                      						if(toc==null){System.out.println("ident "+var+" non déclaré, impossible de le lire");System.exit(0);}
                      						if(toc.type!=TypeSystem.T_integer){System.out.println("l'ident "+var+" n'est pas de type entier, impossible de le lire"); System.exit(0);}
                      						c=Code.genReadIdent(toc); 
                    }

                    }
                    break;
                case 2 :
                    // vslTree.g:240:5: t= tab_elem
                    {
                    pushFollow(FOLLOW_tab_elem_in_read_item955);
                    t=tab_elem();

                    state._fsp--;
                    if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      Tokatt toc=tab.Lookup(t.nom); 
                      				    if(toc==null){System.out.println("tableau "+t.nom+" non déclaré, impossible de le lire");System.exit(0);}
                      				    c=Code.genReadTab(toc,t.exp);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "read_item"


    // $ANTLR start "declaration"
    // vslTree.g:245:1: declaration returns [Code c] : ^( DEC l1= list_dec (l2= list_dec )* ) ;
    public final Code declaration() throws RecognitionException {
        Code c = null;

        Code l1 = null;

        Code l2 = null;


        try {
            // vslTree.g:245:30: ( ^( DEC l1= list_dec (l2= list_dec )* ) )
            // vslTree.g:245:32: ^( DEC l1= list_dec (l2= list_dec )* )
            {
            match(input,DEC,FOLLOW_DEC_in_declaration973); if (state.failed) return c;

            match(input, Token.DOWN, null); if (state.failed) return c;
            pushFollow(FOLLOW_list_dec_in_declaration977);
            l1=list_dec();

            state._fsp--;
            if (state.failed) return c;
            if ( state.backtracking==0 ) {
              c=l1;
            }
            // vslTree.g:245:58: (l2= list_dec )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==ARDEC||LA19_0==IDENT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // vslTree.g:245:59: l2= list_dec
            	    {
            	    pushFollow(FOLLOW_list_dec_in_declaration984);
            	    l2=list_dec();

            	    state._fsp--;
            	    if (state.failed) return c;
            	    if ( state.backtracking==0 ) {
            	      c.append(l2);
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return c;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "declaration"


    // $ANTLR start "list_dec"
    // vslTree.g:248:1: list_dec returns [Code c] : d1= dec_item (d2= dec_item )* ;
    public final Code list_dec() throws RecognitionException {
        Code c = null;

        Code d1 = null;

        Code d2 = null;


        try {
            // vslTree.g:248:27: (d1= dec_item (d2= dec_item )* )
            // vslTree.g:248:29: d1= dec_item (d2= dec_item )*
            {
            pushFollow(FOLLOW_dec_item_in_list_dec1006);
            d1=dec_item();

            state._fsp--;
            if (state.failed) return c;
            if ( state.backtracking==0 ) {
              c=d1;
            }
            // vslTree.g:248:49: (d2= dec_item )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==IDENT) ) {
                    int LA20_1 = input.LA(2);

                    if ( (synpred33_vslTree()) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==ARDEC) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==DOWN) ) {
                        int LA20_5 = input.LA(3);

                        if ( (LA20_5==IDENT) ) {
                            int LA20_6 = input.LA(4);

                            if ( (LA20_6==INTEGER) ) {
                                int LA20_7 = input.LA(5);

                                if ( (LA20_7==UP) ) {
                                    int LA20_8 = input.LA(6);

                                    if ( (synpred33_vslTree()) ) {
                                        alt20=1;
                                    }


                                }


                            }


                        }


                    }


                }


                switch (alt20) {
            	case 1 :
            	    // vslTree.g:248:50: d2= dec_item
            	    {
            	    pushFollow(FOLLOW_dec_item_in_list_dec1013);
            	    d2=dec_item();

            	    state._fsp--;
            	    if (state.failed) return c;
            	    if ( state.backtracking==0 ) {
            	      c.append(d2);
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "list_dec"


    // $ANTLR start "dec_item"
    // vslTree.g:251:1: dec_item returns [Code c] : (i= IDENT | ^( ARDEC i= IDENT e= INTEGER ) );
    public final Code dec_item() throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        CommonTree e=null;

        try {
            // vslTree.g:251:26: (i= IDENT | ^( ARDEC i= IDENT e= INTEGER ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==IDENT) ) {
                alt21=1;
            }
            else if ( (LA21_0==ARDEC) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return c;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // vslTree.g:251:29: i= IDENT
                    {
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_dec_item1034); if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      String v = i.getText();
                      					Tokatt t=tab.Lookup(v);
                      					if(t!=null && t.scope==tab.getScope())
                      						{System.out.println("impossible de déclarer deux fois la même variable");System.exit(0);}
                      					 Code code=Code.genDecIdent(v,tab); c=code;
                    }

                    }
                    break;
                case 2 :
                    // vslTree.g:256:14: ^( ARDEC i= IDENT e= INTEGER )
                    {
                    match(input,ARDEC,FOLLOW_ARDEC_in_dec_item1052); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_dec_item1056); if (state.failed) return c;
                    e=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_dec_item1060); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;
                    if ( state.backtracking==0 ) {
                      String v=i.getText(); 
                      						   Tokatt t=tab.Lookup(v);
                      						   if(t!=null && t.scope==tab.getScope())
                      							{System.out.println("impossible de déclarer deux fois la même variable");System.exit(0);}
                      						   int dim=Integer.parseInt(e.getText()); Code code=Code.genDecArray(v,dim,tab);c=code;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "dec_item"

    // $ANTLR start synpred33_vslTree
    public final void synpred33_vslTree_fragment() throws RecognitionException {   
        Code d2 = null;


        // vslTree.g:248:50: (d2= dec_item )
        // vslTree.g:248:50: d2= dec_item
        {
        pushFollow(FOLLOW_dec_item_in_synpred33_vslTree1013);
        d2=dec_item();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_vslTree

    // Delegated rules

    public final boolean synpred33_vslTree() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_vslTree_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\14\uffff";
    static final String DFA9_eofS =
        "\14\uffff";
    static final String DFA9_minS =
        "\1\7\1\2\7\uffff\1\15\2\uffff";
    static final String DFA9_maxS =
        "\1\42\1\2\7\uffff\1\21\2\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\14\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\7\1\10\21\uffff\1\1\1\2\1\3\1\4\1\5\3\uffff\1\6",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\3\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "96:1: statement returns [Code c] : ( ^( ASSIGN_KW i= IDENT exp= expression ) | ^( ASSIGN_KW etab= tab_elem exp1= expression ) | ^( RETURN_KW exp1= expression ) | ^( PRINT_KW p= print_list ) | ^( READ_KW r= read_list ) | ^( IF_KW exp1= expression exp2= statement (exp3= statement )? ) | ^( WHILE_KW exp1= expression exp2= statement ) | ^( FCALL_S i= IDENT (a= argument_list )? ) | b= block );";
        }
    }
 

    public static final BitSet FOLLOW_PROG_in_program59 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_unite_in_program65 = new BitSet(new long[]{0x0000000000110008L});
    public static final BitSet FOLLOW_unite_in_program84 = new BitSet(new long[]{0x0000000000110008L});
    public static final BitSet FOLLOW_function_in_unite118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proto_in_unite126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_KW_in_function143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_function147 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_function151 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_param_list_in_function155 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CORPS_in_function158 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_function162 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROTO_KW_in_proto190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_proto194 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_proto198 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_param_list_in_proto202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_KW_in_type219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_KW_in_type227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_in_param_list244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_param_in_param_list248 = new BitSet(new long[]{0x0000000000021008L});
    public static final BitSet FOLLOW_param_in_param_list266 = new BitSet(new long[]{0x0000000000021008L});
    public static final BitSet FOLLOW_PARAM_in_param_list278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_param298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_param314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_param318 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_statement339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement343 = new BitSet(new long[]{0x00000F8000022200L});
    public static final BitSet FOLLOW_expression_in_statement347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_statement360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tab_elem_in_statement364 = new BitSet(new long[]{0x00000F8000022200L});
    public static final BitSet FOLLOW_expression_in_statement368 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_KW_in_statement382 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement386 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_KW_in_statement399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_print_list_in_statement403 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_READ_KW_in_statement420 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_read_list_in_statement424 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_KW_in_statement437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement441 = new BitSet(new long[]{0x000000047C000180L});
    public static final BitSet FOLLOW_statement_in_statement445 = new BitSet(new long[]{0x000000047C000188L});
    public static final BitSet FOLLOW_statement_in_statement449 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_KW_in_statement464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement468 = new BitSet(new long[]{0x000000047C000180L});
    public static final BitSet FOLLOW_statement_in_statement472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCALL_S_in_statement485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement489 = new BitSet(new long[]{0x00000F8000022208L});
    public static final BitSet FOLLOW_argument_list_in_statement493 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_statement508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block529 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_block533 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_suit_inst_in_block537 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_block548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_suit_inst_in_block552 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARELEM_in_tab_elem572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_tab_elem576 = new BitSet(new long[]{0x00000F8000022200L});
    public static final BitSet FOLLOW_expression_in_tab_elem580 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INST_in_suit_inst602 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_suit_inst606 = new BitSet(new long[]{0x000000047C000188L});
    public static final BitSet FOLLOW_statement_in_suit_inst613 = new BitSet(new long[]{0x000000047C000188L});
    public static final BitSet FOLLOW_PLUS_in_expression640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression644 = new BitSet(new long[]{0x00000F8000022200L});
    public static final BitSet FOLLOW_expression_in_expression649 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOINS_in_expression662 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression666 = new BitSet(new long[]{0x00000F8000022200L});
    public static final BitSet FOLLOW_expression_in_expression670 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expression683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression687 = new BitSet(new long[]{0x00000F8000022200L});
    public static final BitSet FOLLOW_expression_in_expression692 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expression705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression709 = new BitSet(new long[]{0x00000F8000022200L});
    public static final BitSet FOLLOW_expression_in_expression714 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTEGER_in_expression728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_expression741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tab_elem_in_expression760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FCALL_in_expression778 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expression782 = new BitSet(new long[]{0x00000F8000022208L});
    public static final BitSet FOLLOW_argument_list_in_expression786 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_argument_list807 = new BitSet(new long[]{0x00000F8000022202L});
    public static final BitSet FOLLOW_expression_in_argument_list824 = new BitSet(new long[]{0x00000F8000022202L});
    public static final BitSet FOLLOW_print_item_in_print_list845 = new BitSet(new long[]{0x00001F8000022202L});
    public static final BitSet FOLLOW_print_item_in_print_list852 = new BitSet(new long[]{0x00001F8000022202L});
    public static final BitSet FOLLOW_TEXT_in_print_item885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_print_item894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_item_in_read_list917 = new BitSet(new long[]{0x0000000000022002L});
    public static final BitSet FOLLOW_read_item_in_read_list924 = new BitSet(new long[]{0x0000000000022002L});
    public static final BitSet FOLLOW_IDENT_in_read_item946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tab_elem_in_read_item955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_declaration973 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_dec_in_declaration977 = new BitSet(new long[]{0x0000000000020408L});
    public static final BitSet FOLLOW_list_dec_in_declaration984 = new BitSet(new long[]{0x0000000000020408L});
    public static final BitSet FOLLOW_dec_item_in_list_dec1006 = new BitSet(new long[]{0x0000000000020402L});
    public static final BitSet FOLLOW_dec_item_in_list_dec1013 = new BitSet(new long[]{0x0000000000020402L});
    public static final BitSet FOLLOW_IDENT_in_dec_item1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARDEC_in_dec_item1052 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_dec_item1056 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_INTEGER_in_dec_item1060 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_dec_item_in_synpred33_vslTree1013 = new BitSet(new long[]{0x0000000000000002L});

}