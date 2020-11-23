package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.MyCsvGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyCsvParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'table'", "'NbField'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'Count'", "'Sum'", "'Product'", "'Mean'", "'+'", "'-'", "'*'", "'/'", "'('", "','", "')'", "'['", "']'", "';'", "'Load'", "'='", "'header'", "'Store'", "'ExportJson'", "'Projection'", "'Select'", "'Delete'", "'line'", "'field'", "'Insert'", "':'", "'Modify'", "'with'", "'cell'", "'Print'", "'expr'", "'or'", "'and'", "'.'", "'sep'", "'no'", "'not'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyCsvParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyCsvParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyCsvParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyCsv.g"; }


    	private MyCsvGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyCsvGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalMyCsv.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMyCsv.g:54:1: ( ruleProgram EOF )
            // InternalMyCsv.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyCsv.g:62:1: ruleProgram : ( ( ( rule__Program__StmtsAssignment ) ) ( ( rule__Program__StmtsAssignment )* ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:66:2: ( ( ( ( rule__Program__StmtsAssignment ) ) ( ( rule__Program__StmtsAssignment )* ) ) )
            // InternalMyCsv.g:67:2: ( ( ( rule__Program__StmtsAssignment ) ) ( ( rule__Program__StmtsAssignment )* ) )
            {
            // InternalMyCsv.g:67:2: ( ( ( rule__Program__StmtsAssignment ) ) ( ( rule__Program__StmtsAssignment )* ) )
            // InternalMyCsv.g:68:3: ( ( rule__Program__StmtsAssignment ) ) ( ( rule__Program__StmtsAssignment )* )
            {
            // InternalMyCsv.g:68:3: ( ( rule__Program__StmtsAssignment ) )
            // InternalMyCsv.g:69:4: ( rule__Program__StmtsAssignment )
            {
             before(grammarAccess.getProgramAccess().getStmtsAssignment()); 
            // InternalMyCsv.g:70:4: ( rule__Program__StmtsAssignment )
            // InternalMyCsv.g:70:5: rule__Program__StmtsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Program__StmtsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getStmtsAssignment()); 

            }

            // InternalMyCsv.g:73:3: ( ( rule__Program__StmtsAssignment )* )
            // InternalMyCsv.g:74:4: ( rule__Program__StmtsAssignment )*
            {
             before(grammarAccess.getProgramAccess().getStmtsAssignment()); 
            // InternalMyCsv.g:75:4: ( rule__Program__StmtsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==33||(LA1_0>=36 && LA1_0<=40)||LA1_0==43||LA1_0==45||LA1_0==48) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyCsv.g:75:5: rule__Program__StmtsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__StmtsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getStmtsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleLineIndex"
    // InternalMyCsv.g:85:1: entryRuleLineIndex : ruleLineIndex EOF ;
    public final void entryRuleLineIndex() throws RecognitionException {
        try {
            // InternalMyCsv.g:86:1: ( ruleLineIndex EOF )
            // InternalMyCsv.g:87:1: ruleLineIndex EOF
            {
             before(grammarAccess.getLineIndexRule()); 
            pushFollow(FOLLOW_1);
            ruleLineIndex();

            state._fsp--;

             after(grammarAccess.getLineIndexRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineIndex"


    // $ANTLR start "ruleLineIndex"
    // InternalMyCsv.g:94:1: ruleLineIndex : ( ( rule__LineIndex__Alternatives ) ) ;
    public final void ruleLineIndex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:98:2: ( ( ( rule__LineIndex__Alternatives ) ) )
            // InternalMyCsv.g:99:2: ( ( rule__LineIndex__Alternatives ) )
            {
            // InternalMyCsv.g:99:2: ( ( rule__LineIndex__Alternatives ) )
            // InternalMyCsv.g:100:3: ( rule__LineIndex__Alternatives )
            {
             before(grammarAccess.getLineIndexAccess().getAlternatives()); 
            // InternalMyCsv.g:101:3: ( rule__LineIndex__Alternatives )
            // InternalMyCsv.g:101:4: rule__LineIndex__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LineIndex__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLineIndexAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineIndex"


    // $ANTLR start "entryRuleLineIndexCond"
    // InternalMyCsv.g:110:1: entryRuleLineIndexCond : ruleLineIndexCond EOF ;
    public final void entryRuleLineIndexCond() throws RecognitionException {
        try {
            // InternalMyCsv.g:111:1: ( ruleLineIndexCond EOF )
            // InternalMyCsv.g:112:1: ruleLineIndexCond EOF
            {
             before(grammarAccess.getLineIndexCondRule()); 
            pushFollow(FOLLOW_1);
            ruleLineIndexCond();

            state._fsp--;

             after(grammarAccess.getLineIndexCondRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineIndexCond"


    // $ANTLR start "ruleLineIndexCond"
    // InternalMyCsv.g:119:1: ruleLineIndexCond : ( ( rule__LineIndexCond__CondAssignment ) ) ;
    public final void ruleLineIndexCond() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:123:2: ( ( ( rule__LineIndexCond__CondAssignment ) ) )
            // InternalMyCsv.g:124:2: ( ( rule__LineIndexCond__CondAssignment ) )
            {
            // InternalMyCsv.g:124:2: ( ( rule__LineIndexCond__CondAssignment ) )
            // InternalMyCsv.g:125:3: ( rule__LineIndexCond__CondAssignment )
            {
             before(grammarAccess.getLineIndexCondAccess().getCondAssignment()); 
            // InternalMyCsv.g:126:3: ( rule__LineIndexCond__CondAssignment )
            // InternalMyCsv.g:126:4: rule__LineIndexCond__CondAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LineIndexCond__CondAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLineIndexCondAccess().getCondAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineIndexCond"


    // $ANTLR start "entryRuleLineIndexNum"
    // InternalMyCsv.g:135:1: entryRuleLineIndexNum : ruleLineIndexNum EOF ;
    public final void entryRuleLineIndexNum() throws RecognitionException {
        try {
            // InternalMyCsv.g:136:1: ( ruleLineIndexNum EOF )
            // InternalMyCsv.g:137:1: ruleLineIndexNum EOF
            {
             before(grammarAccess.getLineIndexNumRule()); 
            pushFollow(FOLLOW_1);
            ruleLineIndexNum();

            state._fsp--;

             after(grammarAccess.getLineIndexNumRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineIndexNum"


    // $ANTLR start "ruleLineIndexNum"
    // InternalMyCsv.g:144:1: ruleLineIndexNum : ( ( ( rule__LineIndexNum__LinesAssignment ) ) ( ( rule__LineIndexNum__LinesAssignment )* ) ) ;
    public final void ruleLineIndexNum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:148:2: ( ( ( ( rule__LineIndexNum__LinesAssignment ) ) ( ( rule__LineIndexNum__LinesAssignment )* ) ) )
            // InternalMyCsv.g:149:2: ( ( ( rule__LineIndexNum__LinesAssignment ) ) ( ( rule__LineIndexNum__LinesAssignment )* ) )
            {
            // InternalMyCsv.g:149:2: ( ( ( rule__LineIndexNum__LinesAssignment ) ) ( ( rule__LineIndexNum__LinesAssignment )* ) )
            // InternalMyCsv.g:150:3: ( ( rule__LineIndexNum__LinesAssignment ) ) ( ( rule__LineIndexNum__LinesAssignment )* )
            {
            // InternalMyCsv.g:150:3: ( ( rule__LineIndexNum__LinesAssignment ) )
            // InternalMyCsv.g:151:4: ( rule__LineIndexNum__LinesAssignment )
            {
             before(grammarAccess.getLineIndexNumAccess().getLinesAssignment()); 
            // InternalMyCsv.g:152:4: ( rule__LineIndexNum__LinesAssignment )
            // InternalMyCsv.g:152:5: rule__LineIndexNum__LinesAssignment
            {
            pushFollow(FOLLOW_4);
            rule__LineIndexNum__LinesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLineIndexNumAccess().getLinesAssignment()); 

            }

            // InternalMyCsv.g:155:3: ( ( rule__LineIndexNum__LinesAssignment )* )
            // InternalMyCsv.g:156:4: ( rule__LineIndexNum__LinesAssignment )*
            {
             before(grammarAccess.getLineIndexNumAccess().getLinesAssignment()); 
            // InternalMyCsv.g:157:4: ( rule__LineIndexNum__LinesAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_INT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyCsv.g:157:5: rule__LineIndexNum__LinesAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__LineIndexNum__LinesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getLineIndexNumAccess().getLinesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineIndexNum"


    // $ANTLR start "entryRuleFieldIndex"
    // InternalMyCsv.g:167:1: entryRuleFieldIndex : ruleFieldIndex EOF ;
    public final void entryRuleFieldIndex() throws RecognitionException {
        try {
            // InternalMyCsv.g:168:1: ( ruleFieldIndex EOF )
            // InternalMyCsv.g:169:1: ruleFieldIndex EOF
            {
             before(grammarAccess.getFieldIndexRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldIndex();

            state._fsp--;

             after(grammarAccess.getFieldIndexRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFieldIndex"


    // $ANTLR start "ruleFieldIndex"
    // InternalMyCsv.g:176:1: ruleFieldIndex : ( ( rule__FieldIndex__Alternatives ) ) ;
    public final void ruleFieldIndex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:180:2: ( ( ( rule__FieldIndex__Alternatives ) ) )
            // InternalMyCsv.g:181:2: ( ( rule__FieldIndex__Alternatives ) )
            {
            // InternalMyCsv.g:181:2: ( ( rule__FieldIndex__Alternatives ) )
            // InternalMyCsv.g:182:3: ( rule__FieldIndex__Alternatives )
            {
             before(grammarAccess.getFieldIndexAccess().getAlternatives()); 
            // InternalMyCsv.g:183:3: ( rule__FieldIndex__Alternatives )
            // InternalMyCsv.g:183:4: rule__FieldIndex__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FieldIndex__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldIndexAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldIndex"


    // $ANTLR start "entryRuleFieldIndexName"
    // InternalMyCsv.g:192:1: entryRuleFieldIndexName : ruleFieldIndexName EOF ;
    public final void entryRuleFieldIndexName() throws RecognitionException {
        try {
            // InternalMyCsv.g:193:1: ( ruleFieldIndexName EOF )
            // InternalMyCsv.g:194:1: ruleFieldIndexName EOF
            {
             before(grammarAccess.getFieldIndexNameRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldIndexName();

            state._fsp--;

             after(grammarAccess.getFieldIndexNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFieldIndexName"


    // $ANTLR start "ruleFieldIndexName"
    // InternalMyCsv.g:201:1: ruleFieldIndexName : ( ( ( rule__FieldIndexName__FieldsAssignment ) ) ( ( rule__FieldIndexName__FieldsAssignment )* ) ) ;
    public final void ruleFieldIndexName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:205:2: ( ( ( ( rule__FieldIndexName__FieldsAssignment ) ) ( ( rule__FieldIndexName__FieldsAssignment )* ) ) )
            // InternalMyCsv.g:206:2: ( ( ( rule__FieldIndexName__FieldsAssignment ) ) ( ( rule__FieldIndexName__FieldsAssignment )* ) )
            {
            // InternalMyCsv.g:206:2: ( ( ( rule__FieldIndexName__FieldsAssignment ) ) ( ( rule__FieldIndexName__FieldsAssignment )* ) )
            // InternalMyCsv.g:207:3: ( ( rule__FieldIndexName__FieldsAssignment ) ) ( ( rule__FieldIndexName__FieldsAssignment )* )
            {
            // InternalMyCsv.g:207:3: ( ( rule__FieldIndexName__FieldsAssignment ) )
            // InternalMyCsv.g:208:4: ( rule__FieldIndexName__FieldsAssignment )
            {
             before(grammarAccess.getFieldIndexNameAccess().getFieldsAssignment()); 
            // InternalMyCsv.g:209:4: ( rule__FieldIndexName__FieldsAssignment )
            // InternalMyCsv.g:209:5: rule__FieldIndexName__FieldsAssignment
            {
            pushFollow(FOLLOW_5);
            rule__FieldIndexName__FieldsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFieldIndexNameAccess().getFieldsAssignment()); 

            }

            // InternalMyCsv.g:212:3: ( ( rule__FieldIndexName__FieldsAssignment )* )
            // InternalMyCsv.g:213:4: ( rule__FieldIndexName__FieldsAssignment )*
            {
             before(grammarAccess.getFieldIndexNameAccess().getFieldsAssignment()); 
            // InternalMyCsv.g:214:4: ( rule__FieldIndexName__FieldsAssignment )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyCsv.g:214:5: rule__FieldIndexName__FieldsAssignment
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__FieldIndexName__FieldsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFieldIndexNameAccess().getFieldsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldIndexName"


    // $ANTLR start "entryRuleFieldIndexNum"
    // InternalMyCsv.g:224:1: entryRuleFieldIndexNum : ruleFieldIndexNum EOF ;
    public final void entryRuleFieldIndexNum() throws RecognitionException {
        try {
            // InternalMyCsv.g:225:1: ( ruleFieldIndexNum EOF )
            // InternalMyCsv.g:226:1: ruleFieldIndexNum EOF
            {
             before(grammarAccess.getFieldIndexNumRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldIndexNum();

            state._fsp--;

             after(grammarAccess.getFieldIndexNumRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFieldIndexNum"


    // $ANTLR start "ruleFieldIndexNum"
    // InternalMyCsv.g:233:1: ruleFieldIndexNum : ( ( ( rule__FieldIndexNum__ColumnsAssignment ) ) ( ( rule__FieldIndexNum__ColumnsAssignment )* ) ) ;
    public final void ruleFieldIndexNum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:237:2: ( ( ( ( rule__FieldIndexNum__ColumnsAssignment ) ) ( ( rule__FieldIndexNum__ColumnsAssignment )* ) ) )
            // InternalMyCsv.g:238:2: ( ( ( rule__FieldIndexNum__ColumnsAssignment ) ) ( ( rule__FieldIndexNum__ColumnsAssignment )* ) )
            {
            // InternalMyCsv.g:238:2: ( ( ( rule__FieldIndexNum__ColumnsAssignment ) ) ( ( rule__FieldIndexNum__ColumnsAssignment )* ) )
            // InternalMyCsv.g:239:3: ( ( rule__FieldIndexNum__ColumnsAssignment ) ) ( ( rule__FieldIndexNum__ColumnsAssignment )* )
            {
            // InternalMyCsv.g:239:3: ( ( rule__FieldIndexNum__ColumnsAssignment ) )
            // InternalMyCsv.g:240:4: ( rule__FieldIndexNum__ColumnsAssignment )
            {
             before(grammarAccess.getFieldIndexNumAccess().getColumnsAssignment()); 
            // InternalMyCsv.g:241:4: ( rule__FieldIndexNum__ColumnsAssignment )
            // InternalMyCsv.g:241:5: rule__FieldIndexNum__ColumnsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__FieldIndexNum__ColumnsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFieldIndexNumAccess().getColumnsAssignment()); 

            }

            // InternalMyCsv.g:244:3: ( ( rule__FieldIndexNum__ColumnsAssignment )* )
            // InternalMyCsv.g:245:4: ( rule__FieldIndexNum__ColumnsAssignment )*
            {
             before(grammarAccess.getFieldIndexNumAccess().getColumnsAssignment()); 
            // InternalMyCsv.g:246:4: ( rule__FieldIndexNum__ColumnsAssignment )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyCsv.g:246:5: rule__FieldIndexNum__ColumnsAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__FieldIndexNum__ColumnsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFieldIndexNumAccess().getColumnsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldIndexNum"


    // $ANTLR start "entryRuleCellIndex"
    // InternalMyCsv.g:256:1: entryRuleCellIndex : ruleCellIndex EOF ;
    public final void entryRuleCellIndex() throws RecognitionException {
        try {
            // InternalMyCsv.g:257:1: ( ruleCellIndex EOF )
            // InternalMyCsv.g:258:1: ruleCellIndex EOF
            {
             before(grammarAccess.getCellIndexRule()); 
            pushFollow(FOLLOW_1);
            ruleCellIndex();

            state._fsp--;

             after(grammarAccess.getCellIndexRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCellIndex"


    // $ANTLR start "ruleCellIndex"
    // InternalMyCsv.g:265:1: ruleCellIndex : ( ( rule__CellIndex__Group__0 ) ) ;
    public final void ruleCellIndex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:269:2: ( ( ( rule__CellIndex__Group__0 ) ) )
            // InternalMyCsv.g:270:2: ( ( rule__CellIndex__Group__0 ) )
            {
            // InternalMyCsv.g:270:2: ( ( rule__CellIndex__Group__0 ) )
            // InternalMyCsv.g:271:3: ( rule__CellIndex__Group__0 )
            {
             before(grammarAccess.getCellIndexAccess().getGroup()); 
            // InternalMyCsv.g:272:3: ( rule__CellIndex__Group__0 )
            // InternalMyCsv.g:272:4: rule__CellIndex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CellIndex__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellIndexAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellIndex"


    // $ANTLR start "entryRuleValue"
    // InternalMyCsv.g:281:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMyCsv.g:282:1: ( ruleValue EOF )
            // InternalMyCsv.g:283:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyCsv.g:290:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:294:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMyCsv.g:295:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMyCsv.g:295:2: ( ( rule__Value__Alternatives ) )
            // InternalMyCsv.g:296:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMyCsv.g:297:3: ( rule__Value__Alternatives )
            // InternalMyCsv.g:297:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleValues"
    // InternalMyCsv.g:306:1: entryRuleValues : ruleValues EOF ;
    public final void entryRuleValues() throws RecognitionException {
        try {
            // InternalMyCsv.g:307:1: ( ruleValues EOF )
            // InternalMyCsv.g:308:1: ruleValues EOF
            {
             before(grammarAccess.getValuesRule()); 
            pushFollow(FOLLOW_1);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getValuesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // InternalMyCsv.g:315:1: ruleValues : ( ( rule__Values__Group__0 ) ) ;
    public final void ruleValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:319:2: ( ( ( rule__Values__Group__0 ) ) )
            // InternalMyCsv.g:320:2: ( ( rule__Values__Group__0 ) )
            {
            // InternalMyCsv.g:320:2: ( ( rule__Values__Group__0 ) )
            // InternalMyCsv.g:321:3: ( rule__Values__Group__0 )
            {
             before(grammarAccess.getValuesAccess().getGroup()); 
            // InternalMyCsv.g:322:3: ( rule__Values__Group__0 )
            // InternalMyCsv.g:322:4: rule__Values__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRulePath"
    // InternalMyCsv.g:331:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // InternalMyCsv.g:332:1: ( rulePath EOF )
            // InternalMyCsv.g:333:1: rulePath EOF
            {
             before(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_1);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalMyCsv.g:340:1: rulePath : ( ( rule__Path__ValueAssignment ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:344:2: ( ( ( rule__Path__ValueAssignment ) ) )
            // InternalMyCsv.g:345:2: ( ( rule__Path__ValueAssignment ) )
            {
            // InternalMyCsv.g:345:2: ( ( rule__Path__ValueAssignment ) )
            // InternalMyCsv.g:346:3: ( rule__Path__ValueAssignment )
            {
             before(grammarAccess.getPathAccess().getValueAssignment()); 
            // InternalMyCsv.g:347:3: ( rule__Path__ValueAssignment )
            // InternalMyCsv.g:347:4: rule__Path__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Path__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleField"
    // InternalMyCsv.g:356:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalMyCsv.g:357:1: ( ruleField EOF )
            // InternalMyCsv.g:358:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalMyCsv.g:365:1: ruleField : ( ( rule__Field__ValueAssignment ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:369:2: ( ( ( rule__Field__ValueAssignment ) ) )
            // InternalMyCsv.g:370:2: ( ( rule__Field__ValueAssignment ) )
            {
            // InternalMyCsv.g:370:2: ( ( rule__Field__ValueAssignment ) )
            // InternalMyCsv.g:371:3: ( rule__Field__ValueAssignment )
            {
             before(grammarAccess.getFieldAccess().getValueAssignment()); 
            // InternalMyCsv.g:372:3: ( rule__Field__ValueAssignment )
            // InternalMyCsv.g:372:4: rule__Field__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Field__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleStatement"
    // InternalMyCsv.g:381:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMyCsv.g:382:1: ( ruleStatement EOF )
            // InternalMyCsv.g:383:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyCsv.g:390:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:394:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMyCsv.g:395:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMyCsv.g:395:2: ( ( rule__Statement__Alternatives ) )
            // InternalMyCsv.g:396:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMyCsv.g:397:3: ( rule__Statement__Alternatives )
            // InternalMyCsv.g:397:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleLoad"
    // InternalMyCsv.g:406:1: entryRuleLoad : ruleLoad EOF ;
    public final void entryRuleLoad() throws RecognitionException {
        try {
            // InternalMyCsv.g:407:1: ( ruleLoad EOF )
            // InternalMyCsv.g:408:1: ruleLoad EOF
            {
             before(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_1);
            ruleLoad();

            state._fsp--;

             after(grammarAccess.getLoadRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // InternalMyCsv.g:415:1: ruleLoad : ( ( rule__Load__Group__0 ) ) ;
    public final void ruleLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:419:2: ( ( ( rule__Load__Group__0 ) ) )
            // InternalMyCsv.g:420:2: ( ( rule__Load__Group__0 ) )
            {
            // InternalMyCsv.g:420:2: ( ( rule__Load__Group__0 ) )
            // InternalMyCsv.g:421:3: ( rule__Load__Group__0 )
            {
             before(grammarAccess.getLoadAccess().getGroup()); 
            // InternalMyCsv.g:422:3: ( rule__Load__Group__0 )
            // InternalMyCsv.g:422:4: rule__Load__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Load__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleStore"
    // InternalMyCsv.g:431:1: entryRuleStore : ruleStore EOF ;
    public final void entryRuleStore() throws RecognitionException {
        try {
            // InternalMyCsv.g:432:1: ( ruleStore EOF )
            // InternalMyCsv.g:433:1: ruleStore EOF
            {
             before(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            ruleStore();

            state._fsp--;

             after(grammarAccess.getStoreRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalMyCsv.g:440:1: ruleStore : ( ( rule__Store__Group__0 ) ) ;
    public final void ruleStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:444:2: ( ( ( rule__Store__Group__0 ) ) )
            // InternalMyCsv.g:445:2: ( ( rule__Store__Group__0 ) )
            {
            // InternalMyCsv.g:445:2: ( ( rule__Store__Group__0 ) )
            // InternalMyCsv.g:446:3: ( rule__Store__Group__0 )
            {
             before(grammarAccess.getStoreAccess().getGroup()); 
            // InternalMyCsv.g:447:3: ( rule__Store__Group__0 )
            // InternalMyCsv.g:447:4: rule__Store__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleExportJson"
    // InternalMyCsv.g:456:1: entryRuleExportJson : ruleExportJson EOF ;
    public final void entryRuleExportJson() throws RecognitionException {
        try {
            // InternalMyCsv.g:457:1: ( ruleExportJson EOF )
            // InternalMyCsv.g:458:1: ruleExportJson EOF
            {
             before(grammarAccess.getExportJsonRule()); 
            pushFollow(FOLLOW_1);
            ruleExportJson();

            state._fsp--;

             after(grammarAccess.getExportJsonRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExportJson"


    // $ANTLR start "ruleExportJson"
    // InternalMyCsv.g:465:1: ruleExportJson : ( ( rule__ExportJson__Group__0 ) ) ;
    public final void ruleExportJson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:469:2: ( ( ( rule__ExportJson__Group__0 ) ) )
            // InternalMyCsv.g:470:2: ( ( rule__ExportJson__Group__0 ) )
            {
            // InternalMyCsv.g:470:2: ( ( rule__ExportJson__Group__0 ) )
            // InternalMyCsv.g:471:3: ( rule__ExportJson__Group__0 )
            {
             before(grammarAccess.getExportJsonAccess().getGroup()); 
            // InternalMyCsv.g:472:3: ( rule__ExportJson__Group__0 )
            // InternalMyCsv.g:472:4: rule__ExportJson__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExportJson__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExportJsonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExportJson"


    // $ANTLR start "entryRuleProjection"
    // InternalMyCsv.g:481:1: entryRuleProjection : ruleProjection EOF ;
    public final void entryRuleProjection() throws RecognitionException {
        try {
            // InternalMyCsv.g:482:1: ( ruleProjection EOF )
            // InternalMyCsv.g:483:1: ruleProjection EOF
            {
             before(grammarAccess.getProjectionRule()); 
            pushFollow(FOLLOW_1);
            ruleProjection();

            state._fsp--;

             after(grammarAccess.getProjectionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjection"


    // $ANTLR start "ruleProjection"
    // InternalMyCsv.g:490:1: ruleProjection : ( ( rule__Projection__Group__0 ) ) ;
    public final void ruleProjection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:494:2: ( ( ( rule__Projection__Group__0 ) ) )
            // InternalMyCsv.g:495:2: ( ( rule__Projection__Group__0 ) )
            {
            // InternalMyCsv.g:495:2: ( ( rule__Projection__Group__0 ) )
            // InternalMyCsv.g:496:3: ( rule__Projection__Group__0 )
            {
             before(grammarAccess.getProjectionAccess().getGroup()); 
            // InternalMyCsv.g:497:3: ( rule__Projection__Group__0 )
            // InternalMyCsv.g:497:4: rule__Projection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Projection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjection"


    // $ANTLR start "entryRuleSelect"
    // InternalMyCsv.g:506:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalMyCsv.g:507:1: ( ruleSelect EOF )
            // InternalMyCsv.g:508:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalMyCsv.g:515:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:519:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalMyCsv.g:520:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalMyCsv.g:520:2: ( ( rule__Select__Group__0 ) )
            // InternalMyCsv.g:521:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalMyCsv.g:522:3: ( rule__Select__Group__0 )
            // InternalMyCsv.g:522:4: rule__Select__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleDelete"
    // InternalMyCsv.g:531:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // InternalMyCsv.g:532:1: ( ruleDelete EOF )
            // InternalMyCsv.g:533:1: ruleDelete EOF
            {
             before(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            ruleDelete();

            state._fsp--;

             after(grammarAccess.getDeleteRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalMyCsv.g:540:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:544:2: ( ( ( rule__Delete__Group__0 ) ) )
            // InternalMyCsv.g:545:2: ( ( rule__Delete__Group__0 ) )
            {
            // InternalMyCsv.g:545:2: ( ( rule__Delete__Group__0 ) )
            // InternalMyCsv.g:546:3: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // InternalMyCsv.g:547:3: ( rule__Delete__Group__0 )
            // InternalMyCsv.g:547:4: rule__Delete__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleDeleteLine"
    // InternalMyCsv.g:556:1: entryRuleDeleteLine : ruleDeleteLine EOF ;
    public final void entryRuleDeleteLine() throws RecognitionException {
        try {
            // InternalMyCsv.g:557:1: ( ruleDeleteLine EOF )
            // InternalMyCsv.g:558:1: ruleDeleteLine EOF
            {
             before(grammarAccess.getDeleteLineRule()); 
            pushFollow(FOLLOW_1);
            ruleDeleteLine();

            state._fsp--;

             after(grammarAccess.getDeleteLineRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeleteLine"


    // $ANTLR start "ruleDeleteLine"
    // InternalMyCsv.g:565:1: ruleDeleteLine : ( ( rule__DeleteLine__Group__0 ) ) ;
    public final void ruleDeleteLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:569:2: ( ( ( rule__DeleteLine__Group__0 ) ) )
            // InternalMyCsv.g:570:2: ( ( rule__DeleteLine__Group__0 ) )
            {
            // InternalMyCsv.g:570:2: ( ( rule__DeleteLine__Group__0 ) )
            // InternalMyCsv.g:571:3: ( rule__DeleteLine__Group__0 )
            {
             before(grammarAccess.getDeleteLineAccess().getGroup()); 
            // InternalMyCsv.g:572:3: ( rule__DeleteLine__Group__0 )
            // InternalMyCsv.g:572:4: rule__DeleteLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeleteLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeleteLine"


    // $ANTLR start "entryRuleDeleteField"
    // InternalMyCsv.g:581:1: entryRuleDeleteField : ruleDeleteField EOF ;
    public final void entryRuleDeleteField() throws RecognitionException {
        try {
            // InternalMyCsv.g:582:1: ( ruleDeleteField EOF )
            // InternalMyCsv.g:583:1: ruleDeleteField EOF
            {
             before(grammarAccess.getDeleteFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleDeleteField();

            state._fsp--;

             after(grammarAccess.getDeleteFieldRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeleteField"


    // $ANTLR start "ruleDeleteField"
    // InternalMyCsv.g:590:1: ruleDeleteField : ( ( rule__DeleteField__Group__0 ) ) ;
    public final void ruleDeleteField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:594:2: ( ( ( rule__DeleteField__Group__0 ) ) )
            // InternalMyCsv.g:595:2: ( ( rule__DeleteField__Group__0 ) )
            {
            // InternalMyCsv.g:595:2: ( ( rule__DeleteField__Group__0 ) )
            // InternalMyCsv.g:596:3: ( rule__DeleteField__Group__0 )
            {
             before(grammarAccess.getDeleteFieldAccess().getGroup()); 
            // InternalMyCsv.g:597:3: ( rule__DeleteField__Group__0 )
            // InternalMyCsv.g:597:4: rule__DeleteField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeleteField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeleteField"


    // $ANTLR start "entryRuleInsert"
    // InternalMyCsv.g:606:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalMyCsv.g:607:1: ( ruleInsert EOF )
            // InternalMyCsv.g:608:1: ruleInsert EOF
            {
             before(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            ruleInsert();

            state._fsp--;

             after(grammarAccess.getInsertRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalMyCsv.g:615:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:619:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalMyCsv.g:620:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalMyCsv.g:620:2: ( ( rule__Insert__Group__0 ) )
            // InternalMyCsv.g:621:3: ( rule__Insert__Group__0 )
            {
             before(grammarAccess.getInsertAccess().getGroup()); 
            // InternalMyCsv.g:622:3: ( rule__Insert__Group__0 )
            // InternalMyCsv.g:622:4: rule__Insert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleInsertLine"
    // InternalMyCsv.g:631:1: entryRuleInsertLine : ruleInsertLine EOF ;
    public final void entryRuleInsertLine() throws RecognitionException {
        try {
            // InternalMyCsv.g:632:1: ( ruleInsertLine EOF )
            // InternalMyCsv.g:633:1: ruleInsertLine EOF
            {
             before(grammarAccess.getInsertLineRule()); 
            pushFollow(FOLLOW_1);
            ruleInsertLine();

            state._fsp--;

             after(grammarAccess.getInsertLineRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInsertLine"


    // $ANTLR start "ruleInsertLine"
    // InternalMyCsv.g:640:1: ruleInsertLine : ( ( rule__InsertLine__Group__0 ) ) ;
    public final void ruleInsertLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:644:2: ( ( ( rule__InsertLine__Group__0 ) ) )
            // InternalMyCsv.g:645:2: ( ( rule__InsertLine__Group__0 ) )
            {
            // InternalMyCsv.g:645:2: ( ( rule__InsertLine__Group__0 ) )
            // InternalMyCsv.g:646:3: ( rule__InsertLine__Group__0 )
            {
             before(grammarAccess.getInsertLineAccess().getGroup()); 
            // InternalMyCsv.g:647:3: ( rule__InsertLine__Group__0 )
            // InternalMyCsv.g:647:4: rule__InsertLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InsertLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsertLine"


    // $ANTLR start "entryRuleInsertField"
    // InternalMyCsv.g:656:1: entryRuleInsertField : ruleInsertField EOF ;
    public final void entryRuleInsertField() throws RecognitionException {
        try {
            // InternalMyCsv.g:657:1: ( ruleInsertField EOF )
            // InternalMyCsv.g:658:1: ruleInsertField EOF
            {
             before(grammarAccess.getInsertFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleInsertField();

            state._fsp--;

             after(grammarAccess.getInsertFieldRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInsertField"


    // $ANTLR start "ruleInsertField"
    // InternalMyCsv.g:665:1: ruleInsertField : ( ( rule__InsertField__Group__0 ) ) ;
    public final void ruleInsertField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:669:2: ( ( ( rule__InsertField__Group__0 ) ) )
            // InternalMyCsv.g:670:2: ( ( rule__InsertField__Group__0 ) )
            {
            // InternalMyCsv.g:670:2: ( ( rule__InsertField__Group__0 ) )
            // InternalMyCsv.g:671:3: ( rule__InsertField__Group__0 )
            {
             before(grammarAccess.getInsertFieldAccess().getGroup()); 
            // InternalMyCsv.g:672:3: ( rule__InsertField__Group__0 )
            // InternalMyCsv.g:672:4: rule__InsertField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InsertField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsertField"


    // $ANTLR start "entryRuleModify"
    // InternalMyCsv.g:681:1: entryRuleModify : ruleModify EOF ;
    public final void entryRuleModify() throws RecognitionException {
        try {
            // InternalMyCsv.g:682:1: ( ruleModify EOF )
            // InternalMyCsv.g:683:1: ruleModify EOF
            {
             before(grammarAccess.getModifyRule()); 
            pushFollow(FOLLOW_1);
            ruleModify();

            state._fsp--;

             after(grammarAccess.getModifyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModify"


    // $ANTLR start "ruleModify"
    // InternalMyCsv.g:690:1: ruleModify : ( ( rule__Modify__Group__0 ) ) ;
    public final void ruleModify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:694:2: ( ( ( rule__Modify__Group__0 ) ) )
            // InternalMyCsv.g:695:2: ( ( rule__Modify__Group__0 ) )
            {
            // InternalMyCsv.g:695:2: ( ( rule__Modify__Group__0 ) )
            // InternalMyCsv.g:696:3: ( rule__Modify__Group__0 )
            {
             before(grammarAccess.getModifyAccess().getGroup()); 
            // InternalMyCsv.g:697:3: ( rule__Modify__Group__0 )
            // InternalMyCsv.g:697:4: rule__Modify__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Modify__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModify"


    // $ANTLR start "entryRuleModifyLine"
    // InternalMyCsv.g:706:1: entryRuleModifyLine : ruleModifyLine EOF ;
    public final void entryRuleModifyLine() throws RecognitionException {
        try {
            // InternalMyCsv.g:707:1: ( ruleModifyLine EOF )
            // InternalMyCsv.g:708:1: ruleModifyLine EOF
            {
             before(grammarAccess.getModifyLineRule()); 
            pushFollow(FOLLOW_1);
            ruleModifyLine();

            state._fsp--;

             after(grammarAccess.getModifyLineRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModifyLine"


    // $ANTLR start "ruleModifyLine"
    // InternalMyCsv.g:715:1: ruleModifyLine : ( ( rule__ModifyLine__Group__0 ) ) ;
    public final void ruleModifyLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:719:2: ( ( ( rule__ModifyLine__Group__0 ) ) )
            // InternalMyCsv.g:720:2: ( ( rule__ModifyLine__Group__0 ) )
            {
            // InternalMyCsv.g:720:2: ( ( rule__ModifyLine__Group__0 ) )
            // InternalMyCsv.g:721:3: ( rule__ModifyLine__Group__0 )
            {
             before(grammarAccess.getModifyLineAccess().getGroup()); 
            // InternalMyCsv.g:722:3: ( rule__ModifyLine__Group__0 )
            // InternalMyCsv.g:722:4: rule__ModifyLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModifyLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifyLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifyLine"


    // $ANTLR start "entryRuleModifyField"
    // InternalMyCsv.g:731:1: entryRuleModifyField : ruleModifyField EOF ;
    public final void entryRuleModifyField() throws RecognitionException {
        try {
            // InternalMyCsv.g:732:1: ( ruleModifyField EOF )
            // InternalMyCsv.g:733:1: ruleModifyField EOF
            {
             before(grammarAccess.getModifyFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleModifyField();

            state._fsp--;

             after(grammarAccess.getModifyFieldRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModifyField"


    // $ANTLR start "ruleModifyField"
    // InternalMyCsv.g:740:1: ruleModifyField : ( ( rule__ModifyField__Group__0 ) ) ;
    public final void ruleModifyField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:744:2: ( ( ( rule__ModifyField__Group__0 ) ) )
            // InternalMyCsv.g:745:2: ( ( rule__ModifyField__Group__0 ) )
            {
            // InternalMyCsv.g:745:2: ( ( rule__ModifyField__Group__0 ) )
            // InternalMyCsv.g:746:3: ( rule__ModifyField__Group__0 )
            {
             before(grammarAccess.getModifyFieldAccess().getGroup()); 
            // InternalMyCsv.g:747:3: ( rule__ModifyField__Group__0 )
            // InternalMyCsv.g:747:4: rule__ModifyField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModifyField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifyFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifyField"


    // $ANTLR start "entryRuleModifyCell"
    // InternalMyCsv.g:756:1: entryRuleModifyCell : ruleModifyCell EOF ;
    public final void entryRuleModifyCell() throws RecognitionException {
        try {
            // InternalMyCsv.g:757:1: ( ruleModifyCell EOF )
            // InternalMyCsv.g:758:1: ruleModifyCell EOF
            {
             before(grammarAccess.getModifyCellRule()); 
            pushFollow(FOLLOW_1);
            ruleModifyCell();

            state._fsp--;

             after(grammarAccess.getModifyCellRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModifyCell"


    // $ANTLR start "ruleModifyCell"
    // InternalMyCsv.g:765:1: ruleModifyCell : ( ( rule__ModifyCell__Group__0 ) ) ;
    public final void ruleModifyCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:769:2: ( ( ( rule__ModifyCell__Group__0 ) ) )
            // InternalMyCsv.g:770:2: ( ( rule__ModifyCell__Group__0 ) )
            {
            // InternalMyCsv.g:770:2: ( ( rule__ModifyCell__Group__0 ) )
            // InternalMyCsv.g:771:3: ( rule__ModifyCell__Group__0 )
            {
             before(grammarAccess.getModifyCellAccess().getGroup()); 
            // InternalMyCsv.g:772:3: ( rule__ModifyCell__Group__0 )
            // InternalMyCsv.g:772:4: rule__ModifyCell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModifyCell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifyCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifyCell"


    // $ANTLR start "entryRulePrint"
    // InternalMyCsv.g:781:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalMyCsv.g:782:1: ( rulePrint EOF )
            // InternalMyCsv.g:783:1: rulePrint EOF
            {
             before(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            rulePrint();

            state._fsp--;

             after(grammarAccess.getPrintRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalMyCsv.g:790:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:794:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalMyCsv.g:795:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalMyCsv.g:795:2: ( ( rule__Print__Group__0 ) )
            // InternalMyCsv.g:796:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalMyCsv.g:797:3: ( rule__Print__Group__0 )
            // InternalMyCsv.g:797:4: rule__Print__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRulePrintLine"
    // InternalMyCsv.g:806:1: entryRulePrintLine : rulePrintLine EOF ;
    public final void entryRulePrintLine() throws RecognitionException {
        try {
            // InternalMyCsv.g:807:1: ( rulePrintLine EOF )
            // InternalMyCsv.g:808:1: rulePrintLine EOF
            {
             before(grammarAccess.getPrintLineRule()); 
            pushFollow(FOLLOW_1);
            rulePrintLine();

            state._fsp--;

             after(grammarAccess.getPrintLineRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrintLine"


    // $ANTLR start "rulePrintLine"
    // InternalMyCsv.g:815:1: rulePrintLine : ( ( rule__PrintLine__Group__0 ) ) ;
    public final void rulePrintLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:819:2: ( ( ( rule__PrintLine__Group__0 ) ) )
            // InternalMyCsv.g:820:2: ( ( rule__PrintLine__Group__0 ) )
            {
            // InternalMyCsv.g:820:2: ( ( rule__PrintLine__Group__0 ) )
            // InternalMyCsv.g:821:3: ( rule__PrintLine__Group__0 )
            {
             before(grammarAccess.getPrintLineAccess().getGroup()); 
            // InternalMyCsv.g:822:3: ( rule__PrintLine__Group__0 )
            // InternalMyCsv.g:822:4: rule__PrintLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrintLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrintLine"


    // $ANTLR start "entryRulePrintField"
    // InternalMyCsv.g:831:1: entryRulePrintField : rulePrintField EOF ;
    public final void entryRulePrintField() throws RecognitionException {
        try {
            // InternalMyCsv.g:832:1: ( rulePrintField EOF )
            // InternalMyCsv.g:833:1: rulePrintField EOF
            {
             before(grammarAccess.getPrintFieldRule()); 
            pushFollow(FOLLOW_1);
            rulePrintField();

            state._fsp--;

             after(grammarAccess.getPrintFieldRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrintField"


    // $ANTLR start "rulePrintField"
    // InternalMyCsv.g:840:1: rulePrintField : ( ( rule__PrintField__Group__0 ) ) ;
    public final void rulePrintField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:844:2: ( ( ( rule__PrintField__Group__0 ) ) )
            // InternalMyCsv.g:845:2: ( ( rule__PrintField__Group__0 ) )
            {
            // InternalMyCsv.g:845:2: ( ( rule__PrintField__Group__0 ) )
            // InternalMyCsv.g:846:3: ( rule__PrintField__Group__0 )
            {
             before(grammarAccess.getPrintFieldAccess().getGroup()); 
            // InternalMyCsv.g:847:3: ( rule__PrintField__Group__0 )
            // InternalMyCsv.g:847:4: rule__PrintField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrintField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrintField"


    // $ANTLR start "entryRulePrintCell"
    // InternalMyCsv.g:856:1: entryRulePrintCell : rulePrintCell EOF ;
    public final void entryRulePrintCell() throws RecognitionException {
        try {
            // InternalMyCsv.g:857:1: ( rulePrintCell EOF )
            // InternalMyCsv.g:858:1: rulePrintCell EOF
            {
             before(grammarAccess.getPrintCellRule()); 
            pushFollow(FOLLOW_1);
            rulePrintCell();

            state._fsp--;

             after(grammarAccess.getPrintCellRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrintCell"


    // $ANTLR start "rulePrintCell"
    // InternalMyCsv.g:865:1: rulePrintCell : ( ( rule__PrintCell__Group__0 ) ) ;
    public final void rulePrintCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:869:2: ( ( ( rule__PrintCell__Group__0 ) ) )
            // InternalMyCsv.g:870:2: ( ( rule__PrintCell__Group__0 ) )
            {
            // InternalMyCsv.g:870:2: ( ( rule__PrintCell__Group__0 ) )
            // InternalMyCsv.g:871:3: ( rule__PrintCell__Group__0 )
            {
             before(grammarAccess.getPrintCellAccess().getGroup()); 
            // InternalMyCsv.g:872:3: ( rule__PrintCell__Group__0 )
            // InternalMyCsv.g:872:4: rule__PrintCell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrintCell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrintCell"


    // $ANTLR start "entryRulePrintTable"
    // InternalMyCsv.g:881:1: entryRulePrintTable : rulePrintTable EOF ;
    public final void entryRulePrintTable() throws RecognitionException {
        try {
            // InternalMyCsv.g:882:1: ( rulePrintTable EOF )
            // InternalMyCsv.g:883:1: rulePrintTable EOF
            {
             before(grammarAccess.getPrintTableRule()); 
            pushFollow(FOLLOW_1);
            rulePrintTable();

            state._fsp--;

             after(grammarAccess.getPrintTableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrintTable"


    // $ANTLR start "rulePrintTable"
    // InternalMyCsv.g:890:1: rulePrintTable : ( 'table' ) ;
    public final void rulePrintTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:894:2: ( ( 'table' ) )
            // InternalMyCsv.g:895:2: ( 'table' )
            {
            // InternalMyCsv.g:895:2: ( 'table' )
            // InternalMyCsv.g:896:3: 'table'
            {
             before(grammarAccess.getPrintTableAccess().getTableKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPrintTableAccess().getTableKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrintTable"


    // $ANTLR start "entryRulePrintExpr"
    // InternalMyCsv.g:906:1: entryRulePrintExpr : rulePrintExpr EOF ;
    public final void entryRulePrintExpr() throws RecognitionException {
        try {
            // InternalMyCsv.g:907:1: ( rulePrintExpr EOF )
            // InternalMyCsv.g:908:1: rulePrintExpr EOF
            {
             before(grammarAccess.getPrintExprRule()); 
            pushFollow(FOLLOW_1);
            rulePrintExpr();

            state._fsp--;

             after(grammarAccess.getPrintExprRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrintExpr"


    // $ANTLR start "rulePrintExpr"
    // InternalMyCsv.g:915:1: rulePrintExpr : ( ( rule__PrintExpr__Group__0 ) ) ;
    public final void rulePrintExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:919:2: ( ( ( rule__PrintExpr__Group__0 ) ) )
            // InternalMyCsv.g:920:2: ( ( rule__PrintExpr__Group__0 ) )
            {
            // InternalMyCsv.g:920:2: ( ( rule__PrintExpr__Group__0 ) )
            // InternalMyCsv.g:921:3: ( rule__PrintExpr__Group__0 )
            {
             before(grammarAccess.getPrintExprAccess().getGroup()); 
            // InternalMyCsv.g:922:3: ( rule__PrintExpr__Group__0 )
            // InternalMyCsv.g:922:4: rule__PrintExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrintExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrintExpr"


    // $ANTLR start "entryRuleExpressionLog"
    // InternalMyCsv.g:931:1: entryRuleExpressionLog : ruleExpressionLog EOF ;
    public final void entryRuleExpressionLog() throws RecognitionException {
        try {
            // InternalMyCsv.g:932:1: ( ruleExpressionLog EOF )
            // InternalMyCsv.g:933:1: ruleExpressionLog EOF
            {
             before(grammarAccess.getExpressionLogRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionLog();

            state._fsp--;

             after(grammarAccess.getExpressionLogRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpressionLog"


    // $ANTLR start "ruleExpressionLog"
    // InternalMyCsv.g:940:1: ruleExpressionLog : ( ( rule__ExpressionLog__ExprAssignment ) ) ;
    public final void ruleExpressionLog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:944:2: ( ( ( rule__ExpressionLog__ExprAssignment ) ) )
            // InternalMyCsv.g:945:2: ( ( rule__ExpressionLog__ExprAssignment ) )
            {
            // InternalMyCsv.g:945:2: ( ( rule__ExpressionLog__ExprAssignment ) )
            // InternalMyCsv.g:946:3: ( rule__ExpressionLog__ExprAssignment )
            {
             before(grammarAccess.getExpressionLogAccess().getExprAssignment()); 
            // InternalMyCsv.g:947:3: ( rule__ExpressionLog__ExprAssignment )
            // InternalMyCsv.g:947:4: rule__ExpressionLog__ExprAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLog__ExprAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLogAccess().getExprAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLog"


    // $ANTLR start "entryRuleOrExpression"
    // InternalMyCsv.g:956:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalMyCsv.g:957:1: ( ruleOrExpression EOF )
            // InternalMyCsv.g:958:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalMyCsv.g:965:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:969:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalMyCsv.g:970:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalMyCsv.g:970:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalMyCsv.g:971:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalMyCsv.g:972:3: ( rule__OrExpression__Group__0 )
            // InternalMyCsv.g:972:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalMyCsv.g:981:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalMyCsv.g:982:1: ( ruleAndExpression EOF )
            // InternalMyCsv.g:983:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalMyCsv.g:990:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:994:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalMyCsv.g:995:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalMyCsv.g:995:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalMyCsv.g:996:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalMyCsv.g:997:3: ( rule__AndExpression__Group__0 )
            // InternalMyCsv.g:997:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleUnaryLogExpression"
    // InternalMyCsv.g:1006:1: entryRuleUnaryLogExpression : ruleUnaryLogExpression EOF ;
    public final void entryRuleUnaryLogExpression() throws RecognitionException {
        try {
            // InternalMyCsv.g:1007:1: ( ruleUnaryLogExpression EOF )
            // InternalMyCsv.g:1008:1: ruleUnaryLogExpression EOF
            {
             before(grammarAccess.getUnaryLogExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryLogExpression();

            state._fsp--;

             after(grammarAccess.getUnaryLogExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnaryLogExpression"


    // $ANTLR start "ruleUnaryLogExpression"
    // InternalMyCsv.g:1015:1: ruleUnaryLogExpression : ( ( rule__UnaryLogExpression__Group__0 ) ) ;
    public final void ruleUnaryLogExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1019:2: ( ( ( rule__UnaryLogExpression__Group__0 ) ) )
            // InternalMyCsv.g:1020:2: ( ( rule__UnaryLogExpression__Group__0 ) )
            {
            // InternalMyCsv.g:1020:2: ( ( rule__UnaryLogExpression__Group__0 ) )
            // InternalMyCsv.g:1021:3: ( rule__UnaryLogExpression__Group__0 )
            {
             before(grammarAccess.getUnaryLogExpressionAccess().getGroup()); 
            // InternalMyCsv.g:1022:3: ( rule__UnaryLogExpression__Group__0 )
            // InternalMyCsv.g:1022:4: rule__UnaryLogExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryLogExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryLogExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryLogExpression"


    // $ANTLR start "entryRuleExpressionLogPrimary"
    // InternalMyCsv.g:1031:1: entryRuleExpressionLogPrimary : ruleExpressionLogPrimary EOF ;
    public final void entryRuleExpressionLogPrimary() throws RecognitionException {
        try {
            // InternalMyCsv.g:1032:1: ( ruleExpressionLogPrimary EOF )
            // InternalMyCsv.g:1033:1: ruleExpressionLogPrimary EOF
            {
             before(grammarAccess.getExpressionLogPrimaryRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionLogPrimary();

            state._fsp--;

             after(grammarAccess.getExpressionLogPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpressionLogPrimary"


    // $ANTLR start "ruleExpressionLogPrimary"
    // InternalMyCsv.g:1040:1: ruleExpressionLogPrimary : ( ( rule__ExpressionLogPrimary__Alternatives ) ) ;
    public final void ruleExpressionLogPrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1044:2: ( ( ( rule__ExpressionLogPrimary__Alternatives ) ) )
            // InternalMyCsv.g:1045:2: ( ( rule__ExpressionLogPrimary__Alternatives ) )
            {
            // InternalMyCsv.g:1045:2: ( ( rule__ExpressionLogPrimary__Alternatives ) )
            // InternalMyCsv.g:1046:3: ( rule__ExpressionLogPrimary__Alternatives )
            {
             before(grammarAccess.getExpressionLogPrimaryAccess().getAlternatives()); 
            // InternalMyCsv.g:1047:3: ( rule__ExpressionLogPrimary__Alternatives )
            // InternalMyCsv.g:1047:4: rule__ExpressionLogPrimary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLogPrimary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLogPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLogPrimary"


    // $ANTLR start "entryRuleNestedLogExpression"
    // InternalMyCsv.g:1056:1: entryRuleNestedLogExpression : ruleNestedLogExpression EOF ;
    public final void entryRuleNestedLogExpression() throws RecognitionException {
        try {
            // InternalMyCsv.g:1057:1: ( ruleNestedLogExpression EOF )
            // InternalMyCsv.g:1058:1: ruleNestedLogExpression EOF
            {
             before(grammarAccess.getNestedLogExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNestedLogExpression();

            state._fsp--;

             after(grammarAccess.getNestedLogExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNestedLogExpression"


    // $ANTLR start "ruleNestedLogExpression"
    // InternalMyCsv.g:1065:1: ruleNestedLogExpression : ( ( rule__NestedLogExpression__Group__0 ) ) ;
    public final void ruleNestedLogExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1069:2: ( ( ( rule__NestedLogExpression__Group__0 ) ) )
            // InternalMyCsv.g:1070:2: ( ( rule__NestedLogExpression__Group__0 ) )
            {
            // InternalMyCsv.g:1070:2: ( ( rule__NestedLogExpression__Group__0 ) )
            // InternalMyCsv.g:1071:3: ( rule__NestedLogExpression__Group__0 )
            {
             before(grammarAccess.getNestedLogExpressionAccess().getGroup()); 
            // InternalMyCsv.g:1072:3: ( rule__NestedLogExpression__Group__0 )
            // InternalMyCsv.g:1072:4: rule__NestedLogExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NestedLogExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNestedLogExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNestedLogExpression"


    // $ANTLR start "entryRuleExpressionRel"
    // InternalMyCsv.g:1081:1: entryRuleExpressionRel : ruleExpressionRel EOF ;
    public final void entryRuleExpressionRel() throws RecognitionException {
        try {
            // InternalMyCsv.g:1082:1: ( ruleExpressionRel EOF )
            // InternalMyCsv.g:1083:1: ruleExpressionRel EOF
            {
             before(grammarAccess.getExpressionRelRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionRel();

            state._fsp--;

             after(grammarAccess.getExpressionRelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpressionRel"


    // $ANTLR start "ruleExpressionRel"
    // InternalMyCsv.g:1090:1: ruleExpressionRel : ( ( rule__ExpressionRel__Group__0 ) ) ;
    public final void ruleExpressionRel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1094:2: ( ( ( rule__ExpressionRel__Group__0 ) ) )
            // InternalMyCsv.g:1095:2: ( ( rule__ExpressionRel__Group__0 ) )
            {
            // InternalMyCsv.g:1095:2: ( ( rule__ExpressionRel__Group__0 ) )
            // InternalMyCsv.g:1096:3: ( rule__ExpressionRel__Group__0 )
            {
             before(grammarAccess.getExpressionRelAccess().getGroup()); 
            // InternalMyCsv.g:1097:3: ( rule__ExpressionRel__Group__0 )
            // InternalMyCsv.g:1097:4: rule__ExpressionRel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionRel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionRelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionRel"


    // $ANTLR start "entryRuleExpressionCalcul"
    // InternalMyCsv.g:1106:1: entryRuleExpressionCalcul : ruleExpressionCalcul EOF ;
    public final void entryRuleExpressionCalcul() throws RecognitionException {
        try {
            // InternalMyCsv.g:1107:1: ( ruleExpressionCalcul EOF )
            // InternalMyCsv.g:1108:1: ruleExpressionCalcul EOF
            {
             before(grammarAccess.getExpressionCalculRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionCalcul();

            state._fsp--;

             after(grammarAccess.getExpressionCalculRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpressionCalcul"


    // $ANTLR start "ruleExpressionCalcul"
    // InternalMyCsv.g:1115:1: ruleExpressionCalcul : ( ( rule__ExpressionCalcul__ExprAssignment ) ) ;
    public final void ruleExpressionCalcul() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1119:2: ( ( ( rule__ExpressionCalcul__ExprAssignment ) ) )
            // InternalMyCsv.g:1120:2: ( ( rule__ExpressionCalcul__ExprAssignment ) )
            {
            // InternalMyCsv.g:1120:2: ( ( rule__ExpressionCalcul__ExprAssignment ) )
            // InternalMyCsv.g:1121:3: ( rule__ExpressionCalcul__ExprAssignment )
            {
             before(grammarAccess.getExpressionCalculAccess().getExprAssignment()); 
            // InternalMyCsv.g:1122:3: ( rule__ExpressionCalcul__ExprAssignment )
            // InternalMyCsv.g:1122:4: rule__ExpressionCalcul__ExprAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionCalcul__ExprAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressionCalculAccess().getExprAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionCalcul"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalMyCsv.g:1131:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalMyCsv.g:1132:1: ( ruleAdditiveExpression EOF )
            // InternalMyCsv.g:1133:1: ruleAdditiveExpression EOF
            {
             before(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalMyCsv.g:1140:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1144:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalMyCsv.g:1145:2: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalMyCsv.g:1145:2: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalMyCsv.g:1146:3: ( rule__AdditiveExpression__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            // InternalMyCsv.g:1147:3: ( rule__AdditiveExpression__Group__0 )
            // InternalMyCsv.g:1147:4: rule__AdditiveExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleAdditiveExpressionRhs"
    // InternalMyCsv.g:1156:1: entryRuleAdditiveExpressionRhs : ruleAdditiveExpressionRhs EOF ;
    public final void entryRuleAdditiveExpressionRhs() throws RecognitionException {
        try {
            // InternalMyCsv.g:1157:1: ( ruleAdditiveExpressionRhs EOF )
            // InternalMyCsv.g:1158:1: ruleAdditiveExpressionRhs EOF
            {
             before(grammarAccess.getAdditiveExpressionRhsRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditiveExpressionRhs();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionRhsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdditiveExpressionRhs"


    // $ANTLR start "ruleAdditiveExpressionRhs"
    // InternalMyCsv.g:1165:1: ruleAdditiveExpressionRhs : ( ( rule__AdditiveExpressionRhs__Group__0 ) ) ;
    public final void ruleAdditiveExpressionRhs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1169:2: ( ( ( rule__AdditiveExpressionRhs__Group__0 ) ) )
            // InternalMyCsv.g:1170:2: ( ( rule__AdditiveExpressionRhs__Group__0 ) )
            {
            // InternalMyCsv.g:1170:2: ( ( rule__AdditiveExpressionRhs__Group__0 ) )
            // InternalMyCsv.g:1171:3: ( rule__AdditiveExpressionRhs__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionRhsAccess().getGroup()); 
            // InternalMyCsv.g:1172:3: ( rule__AdditiveExpressionRhs__Group__0 )
            // InternalMyCsv.g:1172:4: rule__AdditiveExpressionRhs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpressionRhs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionRhsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveExpressionRhs"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalMyCsv.g:1181:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalMyCsv.g:1182:1: ( ruleMultiplicativeExpression EOF )
            // InternalMyCsv.g:1183:1: ruleMultiplicativeExpression EOF
            {
             before(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalMyCsv.g:1190:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1194:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalMyCsv.g:1195:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalMyCsv.g:1195:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalMyCsv.g:1196:3: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // InternalMyCsv.g:1197:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalMyCsv.g:1197:4: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMultiplicativeExpressionRhs"
    // InternalMyCsv.g:1206:1: entryRuleMultiplicativeExpressionRhs : ruleMultiplicativeExpressionRhs EOF ;
    public final void entryRuleMultiplicativeExpressionRhs() throws RecognitionException {
        try {
            // InternalMyCsv.g:1207:1: ( ruleMultiplicativeExpressionRhs EOF )
            // InternalMyCsv.g:1208:1: ruleMultiplicativeExpressionRhs EOF
            {
             before(grammarAccess.getMultiplicativeExpressionRhsRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicativeExpressionRhs();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionRhsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplicativeExpressionRhs"


    // $ANTLR start "ruleMultiplicativeExpressionRhs"
    // InternalMyCsv.g:1215:1: ruleMultiplicativeExpressionRhs : ( ( rule__MultiplicativeExpressionRhs__Group__0 ) ) ;
    public final void ruleMultiplicativeExpressionRhs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1219:2: ( ( ( rule__MultiplicativeExpressionRhs__Group__0 ) ) )
            // InternalMyCsv.g:1220:2: ( ( rule__MultiplicativeExpressionRhs__Group__0 ) )
            {
            // InternalMyCsv.g:1220:2: ( ( rule__MultiplicativeExpressionRhs__Group__0 ) )
            // InternalMyCsv.g:1221:3: ( rule__MultiplicativeExpressionRhs__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionRhsAccess().getGroup()); 
            // InternalMyCsv.g:1222:3: ( rule__MultiplicativeExpressionRhs__Group__0 )
            // InternalMyCsv.g:1222:4: rule__MultiplicativeExpressionRhs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpressionRhs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionRhsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeExpressionRhs"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalMyCsv.g:1231:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalMyCsv.g:1232:1: ( ruleUnaryExpression EOF )
            // InternalMyCsv.g:1233:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalMyCsv.g:1240:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Group__0 ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1244:2: ( ( ( rule__UnaryExpression__Group__0 ) ) )
            // InternalMyCsv.g:1245:2: ( ( rule__UnaryExpression__Group__0 ) )
            {
            // InternalMyCsv.g:1245:2: ( ( rule__UnaryExpression__Group__0 ) )
            // InternalMyCsv.g:1246:3: ( rule__UnaryExpression__Group__0 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getGroup()); 
            // InternalMyCsv.g:1247:3: ( rule__UnaryExpression__Group__0 )
            // InternalMyCsv.g:1247:4: rule__UnaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleExpressionCalculPrimary"
    // InternalMyCsv.g:1256:1: entryRuleExpressionCalculPrimary : ruleExpressionCalculPrimary EOF ;
    public final void entryRuleExpressionCalculPrimary() throws RecognitionException {
        try {
            // InternalMyCsv.g:1257:1: ( ruleExpressionCalculPrimary EOF )
            // InternalMyCsv.g:1258:1: ruleExpressionCalculPrimary EOF
            {
             before(grammarAccess.getExpressionCalculPrimaryRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionCalculPrimary();

            state._fsp--;

             after(grammarAccess.getExpressionCalculPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpressionCalculPrimary"


    // $ANTLR start "ruleExpressionCalculPrimary"
    // InternalMyCsv.g:1265:1: ruleExpressionCalculPrimary : ( ( rule__ExpressionCalculPrimary__Alternatives ) ) ;
    public final void ruleExpressionCalculPrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1269:2: ( ( ( rule__ExpressionCalculPrimary__Alternatives ) ) )
            // InternalMyCsv.g:1270:2: ( ( rule__ExpressionCalculPrimary__Alternatives ) )
            {
            // InternalMyCsv.g:1270:2: ( ( rule__ExpressionCalculPrimary__Alternatives ) )
            // InternalMyCsv.g:1271:3: ( rule__ExpressionCalculPrimary__Alternatives )
            {
             before(grammarAccess.getExpressionCalculPrimaryAccess().getAlternatives()); 
            // InternalMyCsv.g:1272:3: ( rule__ExpressionCalculPrimary__Alternatives )
            // InternalMyCsv.g:1272:4: rule__ExpressionCalculPrimary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionCalculPrimary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionCalculPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionCalculPrimary"


    // $ANTLR start "entryRuleAggregatExpression"
    // InternalMyCsv.g:1281:1: entryRuleAggregatExpression : ruleAggregatExpression EOF ;
    public final void entryRuleAggregatExpression() throws RecognitionException {
        try {
            // InternalMyCsv.g:1282:1: ( ruleAggregatExpression EOF )
            // InternalMyCsv.g:1283:1: ruleAggregatExpression EOF
            {
             before(grammarAccess.getAggregatExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAggregatExpression();

            state._fsp--;

             after(grammarAccess.getAggregatExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAggregatExpression"


    // $ANTLR start "ruleAggregatExpression"
    // InternalMyCsv.g:1290:1: ruleAggregatExpression : ( ( rule__AggregatExpression__Group__0 ) ) ;
    public final void ruleAggregatExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1294:2: ( ( ( rule__AggregatExpression__Group__0 ) ) )
            // InternalMyCsv.g:1295:2: ( ( rule__AggregatExpression__Group__0 ) )
            {
            // InternalMyCsv.g:1295:2: ( ( rule__AggregatExpression__Group__0 ) )
            // InternalMyCsv.g:1296:3: ( rule__AggregatExpression__Group__0 )
            {
             before(grammarAccess.getAggregatExpressionAccess().getGroup()); 
            // InternalMyCsv.g:1297:3: ( rule__AggregatExpression__Group__0 )
            // InternalMyCsv.g:1297:4: rule__AggregatExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AggregatExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAggregatExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAggregatExpression"


    // $ANTLR start "entryRuleLitteralInt"
    // InternalMyCsv.g:1306:1: entryRuleLitteralInt : ruleLitteralInt EOF ;
    public final void entryRuleLitteralInt() throws RecognitionException {
        try {
            // InternalMyCsv.g:1307:1: ( ruleLitteralInt EOF )
            // InternalMyCsv.g:1308:1: ruleLitteralInt EOF
            {
             before(grammarAccess.getLitteralIntRule()); 
            pushFollow(FOLLOW_1);
            ruleLitteralInt();

            state._fsp--;

             after(grammarAccess.getLitteralIntRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLitteralInt"


    // $ANTLR start "ruleLitteralInt"
    // InternalMyCsv.g:1315:1: ruleLitteralInt : ( ( rule__LitteralInt__ValAssignment ) ) ;
    public final void ruleLitteralInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1319:2: ( ( ( rule__LitteralInt__ValAssignment ) ) )
            // InternalMyCsv.g:1320:2: ( ( rule__LitteralInt__ValAssignment ) )
            {
            // InternalMyCsv.g:1320:2: ( ( rule__LitteralInt__ValAssignment ) )
            // InternalMyCsv.g:1321:3: ( rule__LitteralInt__ValAssignment )
            {
             before(grammarAccess.getLitteralIntAccess().getValAssignment()); 
            // InternalMyCsv.g:1322:3: ( rule__LitteralInt__ValAssignment )
            // InternalMyCsv.g:1322:4: rule__LitteralInt__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LitteralInt__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLitteralIntAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLitteralInt"


    // $ANTLR start "entryRuleLitteralFloat"
    // InternalMyCsv.g:1331:1: entryRuleLitteralFloat : ruleLitteralFloat EOF ;
    public final void entryRuleLitteralFloat() throws RecognitionException {
        try {
            // InternalMyCsv.g:1332:1: ( ruleLitteralFloat EOF )
            // InternalMyCsv.g:1333:1: ruleLitteralFloat EOF
            {
             before(grammarAccess.getLitteralFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleLitteralFloat();

            state._fsp--;

             after(grammarAccess.getLitteralFloatRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLitteralFloat"


    // $ANTLR start "ruleLitteralFloat"
    // InternalMyCsv.g:1340:1: ruleLitteralFloat : ( ( rule__LitteralFloat__ValAssignment ) ) ;
    public final void ruleLitteralFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1344:2: ( ( ( rule__LitteralFloat__ValAssignment ) ) )
            // InternalMyCsv.g:1345:2: ( ( rule__LitteralFloat__ValAssignment ) )
            {
            // InternalMyCsv.g:1345:2: ( ( rule__LitteralFloat__ValAssignment ) )
            // InternalMyCsv.g:1346:3: ( rule__LitteralFloat__ValAssignment )
            {
             before(grammarAccess.getLitteralFloatAccess().getValAssignment()); 
            // InternalMyCsv.g:1347:3: ( rule__LitteralFloat__ValAssignment )
            // InternalMyCsv.g:1347:4: rule__LitteralFloat__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LitteralFloat__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLitteralFloatAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLitteralFloat"


    // $ANTLR start "entryRuleLitteralString"
    // InternalMyCsv.g:1356:1: entryRuleLitteralString : ruleLitteralString EOF ;
    public final void entryRuleLitteralString() throws RecognitionException {
        try {
            // InternalMyCsv.g:1357:1: ( ruleLitteralString EOF )
            // InternalMyCsv.g:1358:1: ruleLitteralString EOF
            {
             before(grammarAccess.getLitteralStringRule()); 
            pushFollow(FOLLOW_1);
            ruleLitteralString();

            state._fsp--;

             after(grammarAccess.getLitteralStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLitteralString"


    // $ANTLR start "ruleLitteralString"
    // InternalMyCsv.g:1365:1: ruleLitteralString : ( ( rule__LitteralString__ValAssignment ) ) ;
    public final void ruleLitteralString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1369:2: ( ( ( rule__LitteralString__ValAssignment ) ) )
            // InternalMyCsv.g:1370:2: ( ( rule__LitteralString__ValAssignment ) )
            {
            // InternalMyCsv.g:1370:2: ( ( rule__LitteralString__ValAssignment ) )
            // InternalMyCsv.g:1371:3: ( rule__LitteralString__ValAssignment )
            {
             before(grammarAccess.getLitteralStringAccess().getValAssignment()); 
            // InternalMyCsv.g:1372:3: ( rule__LitteralString__ValAssignment )
            // InternalMyCsv.g:1372:4: rule__LitteralString__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LitteralString__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLitteralStringAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLitteralString"


    // $ANTLR start "entryRuleNestedExpressionCalcul"
    // InternalMyCsv.g:1381:1: entryRuleNestedExpressionCalcul : ruleNestedExpressionCalcul EOF ;
    public final void entryRuleNestedExpressionCalcul() throws RecognitionException {
        try {
            // InternalMyCsv.g:1382:1: ( ruleNestedExpressionCalcul EOF )
            // InternalMyCsv.g:1383:1: ruleNestedExpressionCalcul EOF
            {
             before(grammarAccess.getNestedExpressionCalculRule()); 
            pushFollow(FOLLOW_1);
            ruleNestedExpressionCalcul();

            state._fsp--;

             after(grammarAccess.getNestedExpressionCalculRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNestedExpressionCalcul"


    // $ANTLR start "ruleNestedExpressionCalcul"
    // InternalMyCsv.g:1390:1: ruleNestedExpressionCalcul : ( ( rule__NestedExpressionCalcul__Group__0 ) ) ;
    public final void ruleNestedExpressionCalcul() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1394:2: ( ( ( rule__NestedExpressionCalcul__Group__0 ) ) )
            // InternalMyCsv.g:1395:2: ( ( rule__NestedExpressionCalcul__Group__0 ) )
            {
            // InternalMyCsv.g:1395:2: ( ( rule__NestedExpressionCalcul__Group__0 ) )
            // InternalMyCsv.g:1396:3: ( rule__NestedExpressionCalcul__Group__0 )
            {
             before(grammarAccess.getNestedExpressionCalculAccess().getGroup()); 
            // InternalMyCsv.g:1397:3: ( rule__NestedExpressionCalcul__Group__0 )
            // InternalMyCsv.g:1397:4: rule__NestedExpressionCalcul__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NestedExpressionCalcul__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNestedExpressionCalculAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNestedExpressionCalcul"


    // $ANTLR start "entryRuleNbField"
    // InternalMyCsv.g:1406:1: entryRuleNbField : ruleNbField EOF ;
    public final void entryRuleNbField() throws RecognitionException {
        try {
            // InternalMyCsv.g:1407:1: ( ruleNbField EOF )
            // InternalMyCsv.g:1408:1: ruleNbField EOF
            {
             before(grammarAccess.getNbFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleNbField();

            state._fsp--;

             after(grammarAccess.getNbFieldRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNbField"


    // $ANTLR start "ruleNbField"
    // InternalMyCsv.g:1415:1: ruleNbField : ( 'NbField' ) ;
    public final void ruleNbField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1419:2: ( ( 'NbField' ) )
            // InternalMyCsv.g:1420:2: ( 'NbField' )
            {
            // InternalMyCsv.g:1420:2: ( 'NbField' )
            // InternalMyCsv.g:1421:3: 'NbField'
            {
             before(grammarAccess.getNbFieldAccess().getNbFieldKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNbFieldAccess().getNbFieldKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNbField"


    // $ANTLR start "entryRuleFLOAT"
    // InternalMyCsv.g:1431:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalMyCsv.g:1432:1: ( ruleFLOAT EOF )
            // InternalMyCsv.g:1433:1: ruleFLOAT EOF
            {
             before(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getFLOATRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalMyCsv.g:1440:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1444:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalMyCsv.g:1445:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalMyCsv.g:1445:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalMyCsv.g:1446:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalMyCsv.g:1447:3: ( rule__FLOAT__Group__0 )
            // InternalMyCsv.g:1447:4: rule__FLOAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "ruleBinOpRel"
    // InternalMyCsv.g:1456:1: ruleBinOpRel : ( ( rule__BinOpRel__Alternatives ) ) ;
    public final void ruleBinOpRel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1460:1: ( ( ( rule__BinOpRel__Alternatives ) ) )
            // InternalMyCsv.g:1461:2: ( ( rule__BinOpRel__Alternatives ) )
            {
            // InternalMyCsv.g:1461:2: ( ( rule__BinOpRel__Alternatives ) )
            // InternalMyCsv.g:1462:3: ( rule__BinOpRel__Alternatives )
            {
             before(grammarAccess.getBinOpRelAccess().getAlternatives()); 
            // InternalMyCsv.g:1463:3: ( rule__BinOpRel__Alternatives )
            // InternalMyCsv.g:1463:4: rule__BinOpRel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinOpRel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinOpRelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinOpRel"


    // $ANTLR start "ruleAggregat"
    // InternalMyCsv.g:1472:1: ruleAggregat : ( ( rule__Aggregat__Alternatives ) ) ;
    public final void ruleAggregat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1476:1: ( ( ( rule__Aggregat__Alternatives ) ) )
            // InternalMyCsv.g:1477:2: ( ( rule__Aggregat__Alternatives ) )
            {
            // InternalMyCsv.g:1477:2: ( ( rule__Aggregat__Alternatives ) )
            // InternalMyCsv.g:1478:3: ( rule__Aggregat__Alternatives )
            {
             before(grammarAccess.getAggregatAccess().getAlternatives()); 
            // InternalMyCsv.g:1479:3: ( rule__Aggregat__Alternatives )
            // InternalMyCsv.g:1479:4: rule__Aggregat__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Aggregat__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAggregatAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAggregat"


    // $ANTLR start "ruleBinOpAdd"
    // InternalMyCsv.g:1488:1: ruleBinOpAdd : ( ( rule__BinOpAdd__Alternatives ) ) ;
    public final void ruleBinOpAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1492:1: ( ( ( rule__BinOpAdd__Alternatives ) ) )
            // InternalMyCsv.g:1493:2: ( ( rule__BinOpAdd__Alternatives ) )
            {
            // InternalMyCsv.g:1493:2: ( ( rule__BinOpAdd__Alternatives ) )
            // InternalMyCsv.g:1494:3: ( rule__BinOpAdd__Alternatives )
            {
             before(grammarAccess.getBinOpAddAccess().getAlternatives()); 
            // InternalMyCsv.g:1495:3: ( rule__BinOpAdd__Alternatives )
            // InternalMyCsv.g:1495:4: rule__BinOpAdd__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinOpAdd__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinOpAddAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinOpAdd"


    // $ANTLR start "ruleBinOpMult"
    // InternalMyCsv.g:1504:1: ruleBinOpMult : ( ( rule__BinOpMult__Alternatives ) ) ;
    public final void ruleBinOpMult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1508:1: ( ( ( rule__BinOpMult__Alternatives ) ) )
            // InternalMyCsv.g:1509:2: ( ( rule__BinOpMult__Alternatives ) )
            {
            // InternalMyCsv.g:1509:2: ( ( rule__BinOpMult__Alternatives ) )
            // InternalMyCsv.g:1510:3: ( rule__BinOpMult__Alternatives )
            {
             before(grammarAccess.getBinOpMultAccess().getAlternatives()); 
            // InternalMyCsv.g:1511:3: ( rule__BinOpMult__Alternatives )
            // InternalMyCsv.g:1511:4: rule__BinOpMult__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinOpMult__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinOpMultAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinOpMult"


    // $ANTLR start "rule__LineIndex__Alternatives"
    // InternalMyCsv.g:1519:1: rule__LineIndex__Alternatives : ( ( ruleLineIndexCond ) | ( ruleLineIndexNum ) );
    public final void rule__LineIndex__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1523:1: ( ( ruleLineIndexCond ) | ( ruleLineIndexNum ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==27||LA5_0==55) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyCsv.g:1524:2: ( ruleLineIndexCond )
                    {
                    // InternalMyCsv.g:1524:2: ( ruleLineIndexCond )
                    // InternalMyCsv.g:1525:3: ruleLineIndexCond
                    {
                     before(grammarAccess.getLineIndexAccess().getLineIndexCondParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLineIndexCond();

                    state._fsp--;

                     after(grammarAccess.getLineIndexAccess().getLineIndexCondParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsv.g:1530:2: ( ruleLineIndexNum )
                    {
                    // InternalMyCsv.g:1530:2: ( ruleLineIndexNum )
                    // InternalMyCsv.g:1531:3: ruleLineIndexNum
                    {
                     before(grammarAccess.getLineIndexAccess().getLineIndexNumParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLineIndexNum();

                    state._fsp--;

                     after(grammarAccess.getLineIndexAccess().getLineIndexNumParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineIndex__Alternatives"


    // $ANTLR start "rule__FieldIndex__Alternatives"
    // InternalMyCsv.g:1540:1: rule__FieldIndex__Alternatives : ( ( ruleFieldIndexName ) | ( ruleFieldIndexNum ) );
    public final void rule__FieldIndex__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1544:1: ( ( ruleFieldIndexName ) | ( ruleFieldIndexNum ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyCsv.g:1545:2: ( ruleFieldIndexName )
                    {
                    // InternalMyCsv.g:1545:2: ( ruleFieldIndexName )
                    // InternalMyCsv.g:1546:3: ruleFieldIndexName
                    {
                     before(grammarAccess.getFieldIndexAccess().getFieldIndexNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFieldIndexName();

                    state._fsp--;

                     after(grammarAccess.getFieldIndexAccess().getFieldIndexNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsv.g:1551:2: ( ruleFieldIndexNum )
                    {
                    // InternalMyCsv.g:1551:2: ( ruleFieldIndexNum )
                    // InternalMyCsv.g:1552:3: ruleFieldIndexNum
                    {
                     before(grammarAccess.getFieldIndexAccess().getFieldIndexNumParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFieldIndexNum();

                    state._fsp--;

                     after(grammarAccess.getFieldIndexAccess().getFieldIndexNumParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldIndex__Alternatives"


    // $ANTLR start "rule__CellIndex__Alternatives_3"
    // InternalMyCsv.g:1561:1: rule__CellIndex__Alternatives_3 : ( ( ( rule__CellIndex__ColnumAssignment_3_0 ) ) | ( ( rule__CellIndex__ColnameAssignment_3_1 ) ) );
    public final void rule__CellIndex__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1565:1: ( ( ( rule__CellIndex__ColnumAssignment_3_0 ) ) | ( ( rule__CellIndex__ColnameAssignment_3_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyCsv.g:1566:2: ( ( rule__CellIndex__ColnumAssignment_3_0 ) )
                    {
                    // InternalMyCsv.g:1566:2: ( ( rule__CellIndex__ColnumAssignment_3_0 ) )
                    // InternalMyCsv.g:1567:3: ( rule__CellIndex__ColnumAssignment_3_0 )
                    {
                     before(grammarAccess.getCellIndexAccess().getColnumAssignment_3_0()); 
                    // InternalMyCsv.g:1568:3: ( rule__CellIndex__ColnumAssignment_3_0 )
                    // InternalMyCsv.g:1568:4: rule__CellIndex__ColnumAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CellIndex__ColnumAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellIndexAccess().getColnumAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsv.g:1572:2: ( ( rule__CellIndex__ColnameAssignment_3_1 ) )
                    {
                    // InternalMyCsv.g:1572:2: ( ( rule__CellIndex__ColnameAssignment_3_1 ) )
                    // InternalMyCsv.g:1573:3: ( rule__CellIndex__ColnameAssignment_3_1 )
                    {
                     before(grammarAccess.getCellIndexAccess().getColnameAssignment_3_1()); 
                    // InternalMyCsv.g:1574:3: ( rule__CellIndex__ColnameAssignment_3_1 )
                    // InternalMyCsv.g:1574:4: rule__CellIndex__ColnameAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CellIndex__ColnameAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellIndexAccess().getColnameAssignment_3_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellIndex__Alternatives_3"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalMyCsv.g:1582:1: rule__Value__Alternatives : ( ( ruleExpressionCalcul ) | ( ruleLitteralString ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1586:1: ( ( ruleExpressionCalcul ) | ( ruleLitteralString ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||LA8_0==12||(LA8_0>=19 && LA8_0<=22)||LA8_0==24||LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyCsv.g:1587:2: ( ruleExpressionCalcul )
                    {
                    // InternalMyCsv.g:1587:2: ( ruleExpressionCalcul )
                    // InternalMyCsv.g:1588:3: ruleExpressionCalcul
                    {
                     before(grammarAccess.getValueAccess().getExpressionCalculParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionCalcul();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getExpressionCalculParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsv.g:1593:2: ( ruleLitteralString )
                    {
                    // InternalMyCsv.g:1593:2: ( ruleLitteralString )
                    // InternalMyCsv.g:1594:3: ruleLitteralString
                    {
                     before(grammarAccess.getValueAccess().getLitteralStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLitteralString();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getLitteralStringParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMyCsv.g:1603:1: rule__Statement__Alternatives : ( ( ruleLoad ) | ( ruleStore ) | ( ruleExportJson ) | ( ruleProjection ) | ( ruleSelect ) | ( ruleDelete ) | ( ruleInsert ) | ( ruleModify ) | ( rulePrint ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1607:1: ( ( ruleLoad ) | ( ruleStore ) | ( ruleExportJson ) | ( ruleProjection ) | ( ruleSelect ) | ( ruleDelete ) | ( ruleInsert ) | ( ruleModify ) | ( rulePrint ) )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt9=1;
                }
                break;
            case 36:
                {
                alt9=2;
                }
                break;
            case 37:
                {
                alt9=3;
                }
                break;
            case 38:
                {
                alt9=4;
                }
                break;
            case 39:
                {
                alt9=5;
                }
                break;
            case 40:
                {
                alt9=6;
                }
                break;
            case 43:
                {
                alt9=7;
                }
                break;
            case 45:
                {
                alt9=8;
                }
                break;
            case 48:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyCsv.g:1608:2: ( ruleLoad )
                    {
                    // InternalMyCsv.g:1608:2: ( ruleLoad )
                    // InternalMyCsv.g:1609:3: ruleLoad
                    {
                     before(grammarAccess.getStatementAccess().getLoadParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLoad();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getLoadParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsv.g:1614:2: ( ruleStore )
                    {
                    // InternalMyCsv.g:1614:2: ( ruleStore )
                    // InternalMyCsv.g:1615:3: ruleStore
                    {
                     before(grammarAccess.getStatementAccess().getStoreParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStore();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStoreParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyCsv.g:1620:2: ( ruleExportJson )
                    {
                    // InternalMyCsv.g:1620:2: ( ruleExportJson )
                    // InternalMyCsv.g:1621:3: ruleExportJson
                    {
                     before(grammarAccess.getStatementAccess().getExportJsonParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExportJson();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getExportJsonParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyCsv.g:1626:2: ( ruleProjection )
                    {
                    // InternalMyCsv.g:1626:2: ( ruleProjection )
                    // InternalMyCsv.g:1627:3: ruleProjection
                    {
                     before(grammarAccess.getStatementAccess().getProjectionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleProjection();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getProjectionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyCsv.g:1632:2: ( ruleSelect )
                    {
                    // InternalMyCsv.g:1632:2: ( ruleSelect )
                    // InternalMyCsv.g:1633:3: ruleSelect
                    {
                     before(grammarAccess.getStatementAccess().getSelectParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSelectParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyCsv.g:1638:2: ( ruleDelete )
                    {
                    // InternalMyCsv.g:1638:2: ( ruleDelete )
                    // InternalMyCsv.g:1639:3: ruleDelete
                    {
                     before(grammarAccess.getStatementAccess().getDeleteParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDelete();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDeleteParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyCsv.g:1644:2: ( ruleInsert )
                    {
                    // InternalMyCsv.g:1644:2: ( ruleInsert )
                    // InternalMyCsv.g:1645:3: ruleInsert
                    {
                     before(grammarAccess.getStatementAccess().getInsertParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleInsert();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getInsertParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyCsv.g:1650:2: ( ruleModify )
                    {
                    // InternalMyCsv.g:1650:2: ( ruleModify )
                    // InternalMyCsv.g:1651:3: ruleModify
                    {
                     before(grammarAccess.getStatementAccess().getModifyParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleModify();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getModifyParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyCsv.g:1656:2: ( rulePrint )
                    {
                    // InternalMyCsv.g:1656:2: ( rulePrint )
                    // InternalMyCsv.g:1657:3: rulePrint
                    {
                     before(grammarAccess.getStatementAccess().getPrintParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    rulePrint();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPrintParserRuleCall_8()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Delete__Alternatives_1"
    // InternalMyCsv.g:1666:1: rule__Delete__Alternatives_1 : ( ( ruleDeleteLine ) | ( ruleDeleteField ) );
    public final void rule__Delete__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1670:1: ( ( ruleDeleteLine ) | ( ruleDeleteField ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            else if ( (LA10_0==42) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyCsv.g:1671:2: ( ruleDeleteLine )
                    {
                    // InternalMyCsv.g:1671:2: ( ruleDeleteLine )
                    // InternalMyCsv.g:1672:3: ruleDeleteLine
                    {
                     before(grammarAccess.getDeleteAccess().getDeleteLineParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDeleteLine();

                    state._fsp--;

                     after(grammarAccess.getDeleteAccess().getDeleteLineParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsv.g:1677:2: ( ruleDeleteField )
                    {
                    // InternalMyCsv.g:1677:2: ( ruleDeleteField )
                    // InternalMyCsv.g:1678:3: ruleDeleteField
                    {
                     before(grammarAccess.getDeleteAccess().getDeleteFieldParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDeleteField();

                    state._fsp--;

                     after(grammarAccess.getDeleteAccess().getDeleteFieldParserRuleCall_1_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Alternatives_1"


    // $ANTLR start "rule__Insert__Alternatives_1"
    // InternalMyCsv.g:1687:1: rule__Insert__Alternatives_1 : ( ( ruleInsertLine ) | ( ruleInsertField ) );
    public final void rule__Insert__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1691:1: ( ( ruleInsertLine ) | ( ruleInsertField ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            else if ( (LA11_0==42) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyCsv.g:1692:2: ( ruleInsertLine )
                    {
                    // InternalMyCsv.g:1692:2: ( ruleInsertLine )
                    // InternalMyCsv.g:1693:3: ruleInsertLine
                    {
                     before(grammarAccess.getInsertAccess().getInsertLineParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInsertLine();

                    state._fsp--;

                     after(grammarAccess.getInsertAccess().getInsertLineParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsv.g:1698:2: ( ruleInsertField )
                    {
                    // InternalMyCsv.g:1698:2: ( ruleInsertField )
                    // InternalMyCsv.g:1699:3: ruleInsertField
                    {
                     before(grammarAccess.getInsertAccess().getInsertFieldParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInsertField();

                    state._fsp--;

                     after(grammarAccess.getInsertAccess().getInsertFieldParserRuleCall_1_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Alternatives_1"


    // $ANTLR start "rule__Modify__Alternatives_1"
    // InternalMyCsv.g:1708:1: rule__Modify__Alternatives_1 : ( ( ruleModifyLine ) | ( ruleModifyField ) | ( ruleModifyCell ) );
    public final void rule__Modify__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1712:1: ( ( ruleModifyLine ) | ( ruleModifyField ) | ( ruleModifyCell ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt12=1;
                }
                break;
            case 42:
                {
                alt12=2;
                }
                break;
            case 47:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyCsv.g:1713:2: ( ruleModifyLine )
                    {
                    // InternalMyCsv.g:1713:2: ( ruleModifyLine )
                    // InternalMyCsv.g:1714:3: ruleModifyLine
                    {
                     before(grammarAccess.getModifyAccess().getModifyLineParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleModifyLine();

                    state._fsp--;

                     after(grammarAccess.getModifyAccess().getModifyLineParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsv.g:1719:2: ( ruleModifyField )
                    {
                    // InternalMyCsv.g:1719:2: ( ruleModifyField )
                    // InternalMyCsv.g:1720:3: ruleModifyField
                    {
                     before(grammarAccess.getModifyAccess().getModifyFieldParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleModifyField();

                    state._fsp--;

                     after(grammarAccess.getModifyAccess().getModifyFieldParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyCsv.g:1725:2: ( ruleModifyCell )
                    {
                    // InternalMyCsv.g:1725:2: ( ruleModifyCell )
                    // InternalMyCsv.g:1726:3: ruleModifyCell
                    {
                     before(grammarAccess.getModifyAccess().getModifyCellParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleModifyCell();

                    state._fsp--;

                     after(grammarAccess.getModifyAccess().getModifyCellParserRuleCall_1_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modify__Alternatives_1"


    // $ANTLR start "rule__Print__Alternatives_1"
    // InternalMyCsv.g:1735:1: rule__Print__Alternatives_1 : ( ( rulePrintLine ) | ( rulePrintField ) | ( rulePrintCell ) | ( ( rule__Print__Group_1_3__0 ) ) | ( rulePrintExpr ) );
    public final void rule__Print__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1739:1: ( ( rulePrintLine ) | ( rulePrintField ) | ( rulePrintCell ) | ( ( rule__Print__Group_1_3__0 ) ) | ( rulePrintExpr ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt13=1;
                }
                break;
            case 42:
                {
                alt13=2;
                }
                break;
            case 47:
                {
                alt13=3;
                }
                break;
            case 11:
                {
                alt13=4;
                }
                break;
            case 49:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyCsv.g:1740:2: ( rulePrintLine )
                    {
                    // InternalMyCsv.g:1740:2: ( rulePrintLine )
                    // InternalMyCsv.g:1741:3: rulePrintLine
                    {
                     before(grammarAccess.getPrintAccess().getPrintLineParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrintLine();

                    state._fsp--;

                     after(grammarAccess.getPrintAccess().getPrintLineParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsv.g:1746:2: ( rulePrintField )
                    {
                    // InternalMyCsv.g:1746:2: ( rulePrintField )
                    // InternalMyCsv.g:1747:3: rulePrintField
                    {
                     before(grammarAccess.getPrintAccess().getPrintFieldParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrintField();

                    state._fsp--;

                     after(grammarAccess.getPrintAccess().getPrintFieldParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyCsv.g:1752:2: ( rulePrintCell )
                    {
                    // InternalMyCsv.g:1752:2: ( rulePrintCell )
                    // InternalMyCsv.g:1753:3: rulePrintCell
                    {
                     before(grammarAccess.getPrintAccess().getPrintCellParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrintCell();

                    state._fsp--;

                     after(grammarAccess.getPrintAccess().getPrintCellParserRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyCsv.g:1758:2: ( ( rule__Print__Group_1_3__0 ) )
                    {
                    // InternalMyCsv.g:1758:2: ( ( rule__Print__Group_1_3__0 ) )
                    // InternalMyCsv.g:1759:3: ( rule__Print__Group_1_3__0 )
                    {
                     before(grammarAccess.getPrintAccess().getGroup_1_3()); 
                    // InternalMyCsv.g:1760:3: ( rule__Print__Group_1_3__0 )
                    // InternalMyCsv.g:1760:4: rule__Print__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Print__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrintAccess().getGroup_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyCsv.g:1764:2: ( rulePrintExpr )
                    {
                    // InternalMyCsv.g:1764:2: ( rulePrintExpr )
                    // InternalMyCsv.g:1765:3: rulePrintExpr
                    {
                     before(grammarAccess.getPrintAccess().getPrintExprParserRuleCall_1_4()); 
                    pushFollow(FOLLOW_2);
                    rulePrintExpr();

                    state._fsp--;

                     after(grammarAccess.getPrintAccess().getPrintExprParserRuleCall_1_4()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Alternatives_1"


    // $ANTLR start "rule__ExpressionLogPrimary__Alternatives"
    // InternalMyCsv.g:1774:1: rule__ExpressionLogPrimary__Alternatives : ( ( ruleExpressionRel ) | ( ruleNestedLogExpression ) );
    public final void rule__ExpressionLogPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1778:1: ( ( ruleExpressionRel ) | ( ruleNestedLogExpression ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyCsv.g:1779:2: ( ruleExpressionRel )
                    {
                    // InternalMyCsv.g:1779:2: ( ruleExpressionRel )
                    // InternalMyCsv.g:1780:3: ruleExpressionRel
                    {
                     before(grammarAccess.getExpressionLogPrimaryAccess().getExpressionRelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionRel();

                    state._fsp--;

                     after(grammarAccess.getExpressionLogPrimaryAccess().getExpressionRelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsv.g:1785:2: ( ruleNestedLogExpression )
                    {
                    // InternalMyCsv.g:1785:2: ( ruleNestedLogExpression )
                    // InternalMyCsv.g:1786:3: ruleNestedLogExpression
                    {
                     before(grammarAccess.getExpressionLogPrimaryAccess().getNestedLogExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNestedLogExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionLogPrimaryAccess().getNestedLogExpressionParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLogPrimary__Alternatives"


    // $ANTLR start "rule__ExpressionCalculPrimary__Alternatives"
    // InternalMyCsv.g:1795:1: rule__ExpressionCalculPrimary__Alternatives : ( ( ( rule__ExpressionCalculPrimary__Group_0__0 ) ) | ( ruleAggregatExpression ) | ( ruleLitteralInt ) | ( ruleLitteralFloat ) | ( ruleNestedExpressionCalcul ) );
    public final void rule__ExpressionCalculPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1799:1: ( ( ( rule__ExpressionCalculPrimary__Group_0__0 ) ) | ( ruleAggregatExpression ) | ( ruleLitteralInt ) | ( ruleLitteralFloat ) | ( ruleNestedExpressionCalcul ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt15=1;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt15=2;
                }
                break;
            case RULE_INT:
                {
                int LA15_3 = input.LA(2);

                if ( (LA15_3==EOF||(LA15_3>=23 && LA15_3<=26)||LA15_3==29||(LA15_3>=31 && LA15_3<=33)||(LA15_3>=36 && LA15_3<=40)||LA15_3==43||(LA15_3>=45 && LA15_3<=46)||LA15_3==48||(LA15_3>=50 && LA15_3<=51)) ) {
                    alt15=3;
                }
                else if ( (LA15_3==52) ) {
                    alt15=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyCsv.g:1800:2: ( ( rule__ExpressionCalculPrimary__Group_0__0 ) )
                    {
                    // InternalMyCsv.g:1800:2: ( ( rule__ExpressionCalculPrimary__Group_0__0 ) )
                    // InternalMyCsv.g:1801:3: ( rule__ExpressionCalculPrimary__Group_0__0 )
                    {
                     before(grammarAccess.getExpressionCalculPrimaryAccess().getGroup_0()); 
                    // InternalMyCsv.g:1802:3: ( rule__ExpressionCalculPrimary__Group_0__0 )
                    // InternalMyCsv.g:1802:4: rule__ExpressionCalculPrimary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionCalculPrimary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionCalculPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsv.g:1806:2: ( ruleAggregatExpression )
                    {
                    // InternalMyCsv.g:1806:2: ( ruleAggregatExpression )
                    // InternalMyCsv.g:1807:3: ruleAggregatExpression
                    {
                     before(grammarAccess.getExpressionCalculPrimaryAccess().getAggregatExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAggregatExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionCalculPrimaryAccess().getAggregatExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyCsv.g:1812:2: ( ruleLitteralInt )
                    {
                    // InternalMyCsv.g:1812:2: ( ruleLitteralInt )
                    // InternalMyCsv.g:1813:3: ruleLitteralInt
                    {
                     before(grammarAccess.getExpressionCalculPrimaryAccess().getLitteralIntParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLitteralInt();

                    state._fsp--;

                     after(grammarAccess.getExpressionCalculPrimaryAccess().getLitteralIntParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyCsv.g:1818:2: ( ruleLitteralFloat )
                    {
                    // InternalMyCsv.g:1818:2: ( ruleLitteralFloat )
                    // InternalMyCsv.g:1819:3: ruleLitteralFloat
                    {
                     before(grammarAccess.getExpressionCalculPrimaryAccess().getLitteralFloatParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLitteralFloat();

                    state._fsp--;

                     after(grammarAccess.getExpressionCalculPrimaryAccess().getLitteralFloatParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyCsv.g:1824:2: ( ruleNestedExpressionCalcul )
                    {
                    // InternalMyCsv.g:1824:2: ( ruleNestedExpressionCalcul )
                    // InternalMyCsv.g:1825:3: ruleNestedExpressionCalcul
                    {
                     before(grammarAccess.getExpressionCalculPrimaryAccess().getNestedExpressionCalculParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNestedExpressionCalcul();

                    state._fsp--;

                     after(grammarAccess.getExpressionCalculPrimaryAccess().getNestedExpressionCalculParserRuleCall_4()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionCalculPrimary__Alternatives"


    // $ANTLR start "rule__BinOpRel__Alternatives"
    // InternalMyCsv.g:1834:1: rule__BinOpRel__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) );
    public final void rule__BinOpRel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1838:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt16=1;
                }
                break;
            case 14:
                {
                alt16=2;
                }
                break;
            case 15:
                {
                alt16=3;
                }
                break;
            case 16:
                {
                alt16=4;
                }
                break;
            case 17:
                {
                alt16=5;
                }
                break;
            case 18:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyCsv.g:1839:2: ( ( '>' ) )
                    {
                    // InternalMyCsv.g:1839:2: ( ( '>' ) )
                    // InternalMyCsv.g:1840:3: ( '>' )
                    {
                     before(grammarAccess.getBinOpRelAccess().getGtEnumLiteralDeclaration_0()); 
                    // InternalMyCsv.g:1841:3: ( '>' )
                    // InternalMyCsv.g:1841:4: '>'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinOpRelAccess().getGtEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsv.g:1845:2: ( ( '<' ) )
                    {
                    // InternalMyCsv.g:1845:2: ( ( '<' ) )
                    // InternalMyCsv.g:1846:3: ( '<' )
                    {
                     before(grammarAccess.getBinOpRelAccess().getLtEnumLiteralDeclaration_1()); 
                    // InternalMyCsv.g:1847:3: ( '<' )
                    // InternalMyCsv.g:1847:4: '<'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinOpRelAccess().getLtEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyCsv.g:1851:2: ( ( '>=' ) )
                    {
                    // InternalMyCsv.g:1851:2: ( ( '>=' ) )
                    // InternalMyCsv.g:1852:3: ( '>=' )
                    {
                     before(grammarAccess.getBinOpRelAccess().getGeEnumLiteralDeclaration_2()); 
                    // InternalMyCsv.g:1853:3: ( '>=' )
                    // InternalMyCsv.g:1853:4: '>='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinOpRelAccess().getGeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyCsv.g:1857:2: ( ( '<=' ) )
                    {
                    // InternalMyCsv.g:1857:2: ( ( '<=' ) )
                    // InternalMyCsv.g:1858:3: ( '<=' )
                    {
                     before(grammarAccess.getBinOpRelAccess().getLeEnumLiteralDeclaration_3()); 
                    // InternalMyCsv.g:1859:3: ( '<=' )
                    // InternalMyCsv.g:1859:4: '<='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinOpRelAccess().getLeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyCsv.g:1863:2: ( ( '==' ) )
                    {
                    // InternalMyCsv.g:1863:2: ( ( '==' ) )
                    // InternalMyCsv.g:1864:3: ( '==' )
                    {
                     before(grammarAccess.getBinOpRelAccess().getEqEnumLiteralDeclaration_4()); 
                    // InternalMyCsv.g:1865:3: ( '==' )
                    // InternalMyCsv.g:1865:4: '=='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinOpRelAccess().getEqEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyCsv.g:1869:2: ( ( '!=' ) )
                    {
                    // InternalMyCsv.g:1869:2: ( ( '!=' ) )
                    // InternalMyCsv.g:1870:3: ( '!=' )
                    {
                     before(grammarAccess.getBinOpRelAccess().getNeqEnumLiteralDeclaration_5()); 
                    // InternalMyCsv.g:1871:3: ( '!=' )
                    // InternalMyCsv.g:1871:4: '!='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinOpRelAccess().getNeqEnumLiteralDeclaration_5()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinOpRel__Alternatives"


    // $ANTLR start "rule__Aggregat__Alternatives"
    // InternalMyCsv.g:1879:1: rule__Aggregat__Alternatives : ( ( ( 'Count' ) ) | ( ( 'Sum' ) ) | ( ( 'Product' ) ) | ( ( 'Mean' ) ) );
    public final void rule__Aggregat__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1883:1: ( ( ( 'Count' ) ) | ( ( 'Sum' ) ) | ( ( 'Product' ) ) | ( ( 'Mean' ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt17=1;
                }
                break;
            case 20:
                {
                alt17=2;
                }
                break;
            case 21:
                {
                alt17=3;
                }
                break;
            case 22:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyCsv.g:1884:2: ( ( 'Count' ) )
                    {
                    // InternalMyCsv.g:1884:2: ( ( 'Count' ) )
                    // InternalMyCsv.g:1885:3: ( 'Count' )
                    {
                     before(grammarAccess.getAggregatAccess().getCountEnumLiteralDeclaration_0()); 
                    // InternalMyCsv.g:1886:3: ( 'Count' )
                    // InternalMyCsv.g:1886:4: 'Count'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregatAccess().getCountEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsv.g:1890:2: ( ( 'Sum' ) )
                    {
                    // InternalMyCsv.g:1890:2: ( ( 'Sum' ) )
                    // InternalMyCsv.g:1891:3: ( 'Sum' )
                    {
                     before(grammarAccess.getAggregatAccess().getSumEnumLiteralDeclaration_1()); 
                    // InternalMyCsv.g:1892:3: ( 'Sum' )
                    // InternalMyCsv.g:1892:4: 'Sum'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregatAccess().getSumEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyCsv.g:1896:2: ( ( 'Product' ) )
                    {
                    // InternalMyCsv.g:1896:2: ( ( 'Product' ) )
                    // InternalMyCsv.g:1897:3: ( 'Product' )
                    {
                     before(grammarAccess.getAggregatAccess().getProductEnumLiteralDeclaration_2()); 
                    // InternalMyCsv.g:1898:3: ( 'Product' )
                    // InternalMyCsv.g:1898:4: 'Product'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregatAccess().getProductEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyCsv.g:1902:2: ( ( 'Mean' ) )
                    {
                    // InternalMyCsv.g:1902:2: ( ( 'Mean' ) )
                    // InternalMyCsv.g:1903:3: ( 'Mean' )
                    {
                     before(grammarAccess.getAggregatAccess().getMeanEnumLiteralDeclaration_3()); 
                    // InternalMyCsv.g:1904:3: ( 'Mean' )
                    // InternalMyCsv.g:1904:4: 'Mean'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregatAccess().getMeanEnumLiteralDeclaration_3()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregat__Alternatives"


    // $ANTLR start "rule__BinOpAdd__Alternatives"
    // InternalMyCsv.g:1912:1: rule__BinOpAdd__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__BinOpAdd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1916:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            else if ( (LA18_0==24) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyCsv.g:1917:2: ( ( '+' ) )
                    {
                    // InternalMyCsv.g:1917:2: ( ( '+' ) )
                    // InternalMyCsv.g:1918:3: ( '+' )
                    {
                     before(grammarAccess.getBinOpAddAccess().getPlusEnumLiteralDeclaration_0()); 
                    // InternalMyCsv.g:1919:3: ( '+' )
                    // InternalMyCsv.g:1919:4: '+'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinOpAddAccess().getPlusEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsv.g:1923:2: ( ( '-' ) )
                    {
                    // InternalMyCsv.g:1923:2: ( ( '-' ) )
                    // InternalMyCsv.g:1924:3: ( '-' )
                    {
                     before(grammarAccess.getBinOpAddAccess().getMinusEnumLiteralDeclaration_1()); 
                    // InternalMyCsv.g:1925:3: ( '-' )
                    // InternalMyCsv.g:1925:4: '-'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinOpAddAccess().getMinusEnumLiteralDeclaration_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinOpAdd__Alternatives"


    // $ANTLR start "rule__BinOpMult__Alternatives"
    // InternalMyCsv.g:1933:1: rule__BinOpMult__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__BinOpMult__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1937:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            else if ( (LA19_0==26) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyCsv.g:1938:2: ( ( '*' ) )
                    {
                    // InternalMyCsv.g:1938:2: ( ( '*' ) )
                    // InternalMyCsv.g:1939:3: ( '*' )
                    {
                     before(grammarAccess.getBinOpMultAccess().getTimesEnumLiteralDeclaration_0()); 
                    // InternalMyCsv.g:1940:3: ( '*' )
                    // InternalMyCsv.g:1940:4: '*'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinOpMultAccess().getTimesEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsv.g:1944:2: ( ( '/' ) )
                    {
                    // InternalMyCsv.g:1944:2: ( ( '/' ) )
                    // InternalMyCsv.g:1945:3: ( '/' )
                    {
                     before(grammarAccess.getBinOpMultAccess().getDivEnumLiteralDeclaration_1()); 
                    // InternalMyCsv.g:1946:3: ( '/' )
                    // InternalMyCsv.g:1946:4: '/'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinOpMultAccess().getDivEnumLiteralDeclaration_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinOpMult__Alternatives"


    // $ANTLR start "rule__CellIndex__Group__0"
    // InternalMyCsv.g:1954:1: rule__CellIndex__Group__0 : rule__CellIndex__Group__0__Impl rule__CellIndex__Group__1 ;
    public final void rule__CellIndex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1958:1: ( rule__CellIndex__Group__0__Impl rule__CellIndex__Group__1 )
            // InternalMyCsv.g:1959:2: rule__CellIndex__Group__0__Impl rule__CellIndex__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CellIndex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellIndex__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellIndex__Group__0"


    // $ANTLR start "rule__CellIndex__Group__0__Impl"
    // InternalMyCsv.g:1966:1: rule__CellIndex__Group__0__Impl : ( '(' ) ;
    public final void rule__CellIndex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1970:1: ( ( '(' ) )
            // InternalMyCsv.g:1971:1: ( '(' )
            {
            // InternalMyCsv.g:1971:1: ( '(' )
            // InternalMyCsv.g:1972:2: '('
            {
             before(grammarAccess.getCellIndexAccess().getLeftParenthesisKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCellIndexAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellIndex__Group__0__Impl"


    // $ANTLR start "rule__CellIndex__Group__1"
    // InternalMyCsv.g:1981:1: rule__CellIndex__Group__1 : rule__CellIndex__Group__1__Impl rule__CellIndex__Group__2 ;
    public final void rule__CellIndex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1985:1: ( rule__CellIndex__Group__1__Impl rule__CellIndex__Group__2 )
            // InternalMyCsv.g:1986:2: rule__CellIndex__Group__1__Impl rule__CellIndex__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__CellIndex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellIndex__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellIndex__Group__1"


    // $ANTLR start "rule__CellIndex__Group__1__Impl"
    // InternalMyCsv.g:1993:1: rule__CellIndex__Group__1__Impl : ( ( rule__CellIndex__LineAssignment_1 ) ) ;
    public final void rule__CellIndex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:1997:1: ( ( ( rule__CellIndex__LineAssignment_1 ) ) )
            // InternalMyCsv.g:1998:1: ( ( rule__CellIndex__LineAssignment_1 ) )
            {
            // InternalMyCsv.g:1998:1: ( ( rule__CellIndex__LineAssignment_1 ) )
            // InternalMyCsv.g:1999:2: ( rule__CellIndex__LineAssignment_1 )
            {
             before(grammarAccess.getCellIndexAccess().getLineAssignment_1()); 
            // InternalMyCsv.g:2000:2: ( rule__CellIndex__LineAssignment_1 )
            // InternalMyCsv.g:2000:3: rule__CellIndex__LineAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CellIndex__LineAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCellIndexAccess().getLineAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellIndex__Group__1__Impl"


    // $ANTLR start "rule__CellIndex__Group__2"
    // InternalMyCsv.g:2008:1: rule__CellIndex__Group__2 : rule__CellIndex__Group__2__Impl rule__CellIndex__Group__3 ;
    public final void rule__CellIndex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2012:1: ( rule__CellIndex__Group__2__Impl rule__CellIndex__Group__3 )
            // InternalMyCsv.g:2013:2: rule__CellIndex__Group__2__Impl rule__CellIndex__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__CellIndex__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellIndex__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellIndex__Group__2"


    // $ANTLR start "rule__CellIndex__Group__2__Impl"
    // InternalMyCsv.g:2020:1: rule__CellIndex__Group__2__Impl : ( ',' ) ;
    public final void rule__CellIndex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2024:1: ( ( ',' ) )
            // InternalMyCsv.g:2025:1: ( ',' )
            {
            // InternalMyCsv.g:2025:1: ( ',' )
            // InternalMyCsv.g:2026:2: ','
            {
             before(grammarAccess.getCellIndexAccess().getCommaKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCellIndexAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellIndex__Group__2__Impl"


    // $ANTLR start "rule__CellIndex__Group__3"
    // InternalMyCsv.g:2035:1: rule__CellIndex__Group__3 : rule__CellIndex__Group__3__Impl rule__CellIndex__Group__4 ;
    public final void rule__CellIndex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2039:1: ( rule__CellIndex__Group__3__Impl rule__CellIndex__Group__4 )
            // InternalMyCsv.g:2040:2: rule__CellIndex__Group__3__Impl rule__CellIndex__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__CellIndex__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellIndex__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellIndex__Group__3"


    // $ANTLR start "rule__CellIndex__Group__3__Impl"
    // InternalMyCsv.g:2047:1: rule__CellIndex__Group__3__Impl : ( ( rule__CellIndex__Alternatives_3 ) ) ;
    public final void rule__CellIndex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2051:1: ( ( ( rule__CellIndex__Alternatives_3 ) ) )
            // InternalMyCsv.g:2052:1: ( ( rule__CellIndex__Alternatives_3 ) )
            {
            // InternalMyCsv.g:2052:1: ( ( rule__CellIndex__Alternatives_3 ) )
            // InternalMyCsv.g:2053:2: ( rule__CellIndex__Alternatives_3 )
            {
             before(grammarAccess.getCellIndexAccess().getAlternatives_3()); 
            // InternalMyCsv.g:2054:2: ( rule__CellIndex__Alternatives_3 )
            // InternalMyCsv.g:2054:3: rule__CellIndex__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__CellIndex__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getCellIndexAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellIndex__Group__3__Impl"


    // $ANTLR start "rule__CellIndex__Group__4"
    // InternalMyCsv.g:2062:1: rule__CellIndex__Group__4 : rule__CellIndex__Group__4__Impl ;
    public final void rule__CellIndex__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2066:1: ( rule__CellIndex__Group__4__Impl )
            // InternalMyCsv.g:2067:2: rule__CellIndex__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellIndex__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellIndex__Group__4"


    // $ANTLR start "rule__CellIndex__Group__4__Impl"
    // InternalMyCsv.g:2073:1: rule__CellIndex__Group__4__Impl : ( ')' ) ;
    public final void rule__CellIndex__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2077:1: ( ( ')' ) )
            // InternalMyCsv.g:2078:1: ( ')' )
            {
            // InternalMyCsv.g:2078:1: ( ')' )
            // InternalMyCsv.g:2079:2: ')'
            {
             before(grammarAccess.getCellIndexAccess().getRightParenthesisKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCellIndexAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellIndex__Group__4__Impl"


    // $ANTLR start "rule__Values__Group__0"
    // InternalMyCsv.g:2089:1: rule__Values__Group__0 : rule__Values__Group__0__Impl rule__Values__Group__1 ;
    public final void rule__Values__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2093:1: ( rule__Values__Group__0__Impl rule__Values__Group__1 )
            // InternalMyCsv.g:2094:2: rule__Values__Group__0__Impl rule__Values__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Values__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__0"


    // $ANTLR start "rule__Values__Group__0__Impl"
    // InternalMyCsv.g:2101:1: rule__Values__Group__0__Impl : ( ( '[' )? ) ;
    public final void rule__Values__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2105:1: ( ( ( '[' )? ) )
            // InternalMyCsv.g:2106:1: ( ( '[' )? )
            {
            // InternalMyCsv.g:2106:1: ( ( '[' )? )
            // InternalMyCsv.g:2107:2: ( '[' )?
            {
             before(grammarAccess.getValuesAccess().getLeftSquareBracketKeyword_0()); 
            // InternalMyCsv.g:2108:2: ( '[' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyCsv.g:2108:3: '['
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getValuesAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__0__Impl"


    // $ANTLR start "rule__Values__Group__1"
    // InternalMyCsv.g:2116:1: rule__Values__Group__1 : rule__Values__Group__1__Impl rule__Values__Group__2 ;
    public final void rule__Values__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2120:1: ( rule__Values__Group__1__Impl rule__Values__Group__2 )
            // InternalMyCsv.g:2121:2: rule__Values__Group__1__Impl rule__Values__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Values__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__1"


    // $ANTLR start "rule__Values__Group__1__Impl"
    // InternalMyCsv.g:2128:1: rule__Values__Group__1__Impl : ( ( rule__Values__ValuesAssignment_1 ) ) ;
    public final void rule__Values__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2132:1: ( ( ( rule__Values__ValuesAssignment_1 ) ) )
            // InternalMyCsv.g:2133:1: ( ( rule__Values__ValuesAssignment_1 ) )
            {
            // InternalMyCsv.g:2133:1: ( ( rule__Values__ValuesAssignment_1 ) )
            // InternalMyCsv.g:2134:2: ( rule__Values__ValuesAssignment_1 )
            {
             before(grammarAccess.getValuesAccess().getValuesAssignment_1()); 
            // InternalMyCsv.g:2135:2: ( rule__Values__ValuesAssignment_1 )
            // InternalMyCsv.g:2135:3: rule__Values__ValuesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Values__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getValuesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__1__Impl"


    // $ANTLR start "rule__Values__Group__2"
    // InternalMyCsv.g:2143:1: rule__Values__Group__2 : rule__Values__Group__2__Impl rule__Values__Group__3 ;
    public final void rule__Values__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2147:1: ( rule__Values__Group__2__Impl rule__Values__Group__3 )
            // InternalMyCsv.g:2148:2: rule__Values__Group__2__Impl rule__Values__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Values__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__2"


    // $ANTLR start "rule__Values__Group__2__Impl"
    // InternalMyCsv.g:2155:1: rule__Values__Group__2__Impl : ( ( rule__Values__Group_2__0 )* ) ;
    public final void rule__Values__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2159:1: ( ( ( rule__Values__Group_2__0 )* ) )
            // InternalMyCsv.g:2160:1: ( ( rule__Values__Group_2__0 )* )
            {
            // InternalMyCsv.g:2160:1: ( ( rule__Values__Group_2__0 )* )
            // InternalMyCsv.g:2161:2: ( rule__Values__Group_2__0 )*
            {
             before(grammarAccess.getValuesAccess().getGroup_2()); 
            // InternalMyCsv.g:2162:2: ( rule__Values__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyCsv.g:2162:3: rule__Values__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Values__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getValuesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__2__Impl"


    // $ANTLR start "rule__Values__Group__3"
    // InternalMyCsv.g:2170:1: rule__Values__Group__3 : rule__Values__Group__3__Impl ;
    public final void rule__Values__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2174:1: ( rule__Values__Group__3__Impl )
            // InternalMyCsv.g:2175:2: rule__Values__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__3"


    // $ANTLR start "rule__Values__Group__3__Impl"
    // InternalMyCsv.g:2181:1: rule__Values__Group__3__Impl : ( ( ']' )? ) ;
    public final void rule__Values__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2185:1: ( ( ( ']' )? ) )
            // InternalMyCsv.g:2186:1: ( ( ']' )? )
            {
            // InternalMyCsv.g:2186:1: ( ( ']' )? )
            // InternalMyCsv.g:2187:2: ( ']' )?
            {
             before(grammarAccess.getValuesAccess().getRightSquareBracketKeyword_3()); 
            // InternalMyCsv.g:2188:2: ( ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyCsv.g:2188:3: ']'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getValuesAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__3__Impl"


    // $ANTLR start "rule__Values__Group_2__0"
    // InternalMyCsv.g:2197:1: rule__Values__Group_2__0 : rule__Values__Group_2__0__Impl rule__Values__Group_2__1 ;
    public final void rule__Values__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2201:1: ( rule__Values__Group_2__0__Impl rule__Values__Group_2__1 )
            // InternalMyCsv.g:2202:2: rule__Values__Group_2__0__Impl rule__Values__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Values__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_2__0"


    // $ANTLR start "rule__Values__Group_2__0__Impl"
    // InternalMyCsv.g:2209:1: rule__Values__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Values__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2213:1: ( ( ';' ) )
            // InternalMyCsv.g:2214:1: ( ';' )
            {
            // InternalMyCsv.g:2214:1: ( ';' )
            // InternalMyCsv.g:2215:2: ';'
            {
             before(grammarAccess.getValuesAccess().getSemicolonKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getSemicolonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_2__0__Impl"


    // $ANTLR start "rule__Values__Group_2__1"
    // InternalMyCsv.g:2224:1: rule__Values__Group_2__1 : rule__Values__Group_2__1__Impl ;
    public final void rule__Values__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2228:1: ( rule__Values__Group_2__1__Impl )
            // InternalMyCsv.g:2229:2: rule__Values__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_2__1"


    // $ANTLR start "rule__Values__Group_2__1__Impl"
    // InternalMyCsv.g:2235:1: rule__Values__Group_2__1__Impl : ( ( rule__Values__ValuesAssignment_2_1 ) ) ;
    public final void rule__Values__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2239:1: ( ( ( rule__Values__ValuesAssignment_2_1 ) ) )
            // InternalMyCsv.g:2240:1: ( ( rule__Values__ValuesAssignment_2_1 ) )
            {
            // InternalMyCsv.g:2240:1: ( ( rule__Values__ValuesAssignment_2_1 ) )
            // InternalMyCsv.g:2241:2: ( rule__Values__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getValuesAccess().getValuesAssignment_2_1()); 
            // InternalMyCsv.g:2242:2: ( rule__Values__ValuesAssignment_2_1 )
            // InternalMyCsv.g:2242:3: rule__Values__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Values__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getValuesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_2__1__Impl"


    // $ANTLR start "rule__Load__Group__0"
    // InternalMyCsv.g:2251:1: rule__Load__Group__0 : rule__Load__Group__0__Impl rule__Load__Group__1 ;
    public final void rule__Load__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2255:1: ( rule__Load__Group__0__Impl rule__Load__Group__1 )
            // InternalMyCsv.g:2256:2: rule__Load__Group__0__Impl rule__Load__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Load__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__0"


    // $ANTLR start "rule__Load__Group__0__Impl"
    // InternalMyCsv.g:2263:1: rule__Load__Group__0__Impl : ( 'Load' ) ;
    public final void rule__Load__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2267:1: ( ( 'Load' ) )
            // InternalMyCsv.g:2268:1: ( 'Load' )
            {
            // InternalMyCsv.g:2268:1: ( 'Load' )
            // InternalMyCsv.g:2269:2: 'Load'
            {
             before(grammarAccess.getLoadAccess().getLoadKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getLoadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__0__Impl"


    // $ANTLR start "rule__Load__Group__1"
    // InternalMyCsv.g:2278:1: rule__Load__Group__1 : rule__Load__Group__1__Impl rule__Load__Group__2 ;
    public final void rule__Load__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2282:1: ( rule__Load__Group__1__Impl rule__Load__Group__2 )
            // InternalMyCsv.g:2283:2: rule__Load__Group__1__Impl rule__Load__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Load__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__1"


    // $ANTLR start "rule__Load__Group__1__Impl"
    // InternalMyCsv.g:2290:1: rule__Load__Group__1__Impl : ( ( rule__Load__PathAssignment_1 ) ) ;
    public final void rule__Load__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2294:1: ( ( ( rule__Load__PathAssignment_1 ) ) )
            // InternalMyCsv.g:2295:1: ( ( rule__Load__PathAssignment_1 ) )
            {
            // InternalMyCsv.g:2295:1: ( ( rule__Load__PathAssignment_1 ) )
            // InternalMyCsv.g:2296:2: ( rule__Load__PathAssignment_1 )
            {
             before(grammarAccess.getLoadAccess().getPathAssignment_1()); 
            // InternalMyCsv.g:2297:2: ( rule__Load__PathAssignment_1 )
            // InternalMyCsv.g:2297:3: rule__Load__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Load__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__1__Impl"


    // $ANTLR start "rule__Load__Group__2"
    // InternalMyCsv.g:2305:1: rule__Load__Group__2 : rule__Load__Group__2__Impl rule__Load__Group__3 ;
    public final void rule__Load__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2309:1: ( rule__Load__Group__2__Impl rule__Load__Group__3 )
            // InternalMyCsv.g:2310:2: rule__Load__Group__2__Impl rule__Load__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Load__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__2"


    // $ANTLR start "rule__Load__Group__2__Impl"
    // InternalMyCsv.g:2317:1: rule__Load__Group__2__Impl : ( ( rule__Load__Group_2__0 )? ) ;
    public final void rule__Load__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2321:1: ( ( ( rule__Load__Group_2__0 )? ) )
            // InternalMyCsv.g:2322:1: ( ( rule__Load__Group_2__0 )? )
            {
            // InternalMyCsv.g:2322:1: ( ( rule__Load__Group_2__0 )? )
            // InternalMyCsv.g:2323:2: ( rule__Load__Group_2__0 )?
            {
             before(grammarAccess.getLoadAccess().getGroup_2()); 
            // InternalMyCsv.g:2324:2: ( rule__Load__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==53) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyCsv.g:2324:3: rule__Load__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Load__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoadAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__2__Impl"


    // $ANTLR start "rule__Load__Group__3"
    // InternalMyCsv.g:2332:1: rule__Load__Group__3 : rule__Load__Group__3__Impl ;
    public final void rule__Load__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2336:1: ( rule__Load__Group__3__Impl )
            // InternalMyCsv.g:2337:2: rule__Load__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Load__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__3"


    // $ANTLR start "rule__Load__Group__3__Impl"
    // InternalMyCsv.g:2343:1: rule__Load__Group__3__Impl : ( ( rule__Load__Group_3__0 )? ) ;
    public final void rule__Load__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2347:1: ( ( ( rule__Load__Group_3__0 )? ) )
            // InternalMyCsv.g:2348:1: ( ( rule__Load__Group_3__0 )? )
            {
            // InternalMyCsv.g:2348:1: ( ( rule__Load__Group_3__0 )? )
            // InternalMyCsv.g:2349:2: ( rule__Load__Group_3__0 )?
            {
             before(grammarAccess.getLoadAccess().getGroup_3()); 
            // InternalMyCsv.g:2350:2: ( rule__Load__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==54) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyCsv.g:2350:3: rule__Load__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Load__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoadAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__3__Impl"


    // $ANTLR start "rule__Load__Group_2__0"
    // InternalMyCsv.g:2359:1: rule__Load__Group_2__0 : rule__Load__Group_2__0__Impl rule__Load__Group_2__1 ;
    public final void rule__Load__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2363:1: ( rule__Load__Group_2__0__Impl rule__Load__Group_2__1 )
            // InternalMyCsv.g:2364:2: rule__Load__Group_2__0__Impl rule__Load__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Load__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group_2__0"


    // $ANTLR start "rule__Load__Group_2__0__Impl"
    // InternalMyCsv.g:2371:1: rule__Load__Group_2__0__Impl : ( ( rule__Load__SepDefinedAssignment_2_0 ) ) ;
    public final void rule__Load__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2375:1: ( ( ( rule__Load__SepDefinedAssignment_2_0 ) ) )
            // InternalMyCsv.g:2376:1: ( ( rule__Load__SepDefinedAssignment_2_0 ) )
            {
            // InternalMyCsv.g:2376:1: ( ( rule__Load__SepDefinedAssignment_2_0 ) )
            // InternalMyCsv.g:2377:2: ( rule__Load__SepDefinedAssignment_2_0 )
            {
             before(grammarAccess.getLoadAccess().getSepDefinedAssignment_2_0()); 
            // InternalMyCsv.g:2378:2: ( rule__Load__SepDefinedAssignment_2_0 )
            // InternalMyCsv.g:2378:3: rule__Load__SepDefinedAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Load__SepDefinedAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getSepDefinedAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group_2__0__Impl"


    // $ANTLR start "rule__Load__Group_2__1"
    // InternalMyCsv.g:2386:1: rule__Load__Group_2__1 : rule__Load__Group_2__1__Impl rule__Load__Group_2__2 ;
    public final void rule__Load__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2390:1: ( rule__Load__Group_2__1__Impl rule__Load__Group_2__2 )
            // InternalMyCsv.g:2391:2: rule__Load__Group_2__1__Impl rule__Load__Group_2__2
            {
            pushFollow(FOLLOW_13);
            rule__Load__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group_2__1"


    // $ANTLR start "rule__Load__Group_2__1__Impl"
    // InternalMyCsv.g:2398:1: rule__Load__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Load__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2402:1: ( ( '=' ) )
            // InternalMyCsv.g:2403:1: ( '=' )
            {
            // InternalMyCsv.g:2403:1: ( '=' )
            // InternalMyCsv.g:2404:2: '='
            {
             before(grammarAccess.getLoadAccess().getEqualsSignKeyword_2_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group_2__1__Impl"


    // $ANTLR start "rule__Load__Group_2__2"
    // InternalMyCsv.g:2413:1: rule__Load__Group_2__2 : rule__Load__Group_2__2__Impl ;
    public final void rule__Load__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2417:1: ( rule__Load__Group_2__2__Impl )
            // InternalMyCsv.g:2418:2: rule__Load__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Load__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group_2__2"


    // $ANTLR start "rule__Load__Group_2__2__Impl"
    // InternalMyCsv.g:2424:1: rule__Load__Group_2__2__Impl : ( ( rule__Load__SepAssignment_2_2 ) ) ;
    public final void rule__Load__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2428:1: ( ( ( rule__Load__SepAssignment_2_2 ) ) )
            // InternalMyCsv.g:2429:1: ( ( rule__Load__SepAssignment_2_2 ) )
            {
            // InternalMyCsv.g:2429:1: ( ( rule__Load__SepAssignment_2_2 ) )
            // InternalMyCsv.g:2430:2: ( rule__Load__SepAssignment_2_2 )
            {
             before(grammarAccess.getLoadAccess().getSepAssignment_2_2()); 
            // InternalMyCsv.g:2431:2: ( rule__Load__SepAssignment_2_2 )
            // InternalMyCsv.g:2431:3: rule__Load__SepAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Load__SepAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getSepAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group_2__2__Impl"


    // $ANTLR start "rule__Load__Group_3__0"
    // InternalMyCsv.g:2440:1: rule__Load__Group_3__0 : rule__Load__Group_3__0__Impl rule__Load__Group_3__1 ;
    public final void rule__Load__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2444:1: ( rule__Load__Group_3__0__Impl rule__Load__Group_3__1 )
            // InternalMyCsv.g:2445:2: rule__Load__Group_3__0__Impl rule__Load__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Load__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group_3__0"


    // $ANTLR start "rule__Load__Group_3__0__Impl"
    // InternalMyCsv.g:2452:1: rule__Load__Group_3__0__Impl : ( ( rule__Load__NoHeaderAssignment_3_0 ) ) ;
    public final void rule__Load__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2456:1: ( ( ( rule__Load__NoHeaderAssignment_3_0 ) ) )
            // InternalMyCsv.g:2457:1: ( ( rule__Load__NoHeaderAssignment_3_0 ) )
            {
            // InternalMyCsv.g:2457:1: ( ( rule__Load__NoHeaderAssignment_3_0 ) )
            // InternalMyCsv.g:2458:2: ( rule__Load__NoHeaderAssignment_3_0 )
            {
             before(grammarAccess.getLoadAccess().getNoHeaderAssignment_3_0()); 
            // InternalMyCsv.g:2459:2: ( rule__Load__NoHeaderAssignment_3_0 )
            // InternalMyCsv.g:2459:3: rule__Load__NoHeaderAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Load__NoHeaderAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getNoHeaderAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group_3__0__Impl"


    // $ANTLR start "rule__Load__Group_3__1"
    // InternalMyCsv.g:2467:1: rule__Load__Group_3__1 : rule__Load__Group_3__1__Impl ;
    public final void rule__Load__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2471:1: ( rule__Load__Group_3__1__Impl )
            // InternalMyCsv.g:2472:2: rule__Load__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Load__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group_3__1"


    // $ANTLR start "rule__Load__Group_3__1__Impl"
    // InternalMyCsv.g:2478:1: rule__Load__Group_3__1__Impl : ( 'header' ) ;
    public final void rule__Load__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2482:1: ( ( 'header' ) )
            // InternalMyCsv.g:2483:1: ( 'header' )
            {
            // InternalMyCsv.g:2483:1: ( 'header' )
            // InternalMyCsv.g:2484:2: 'header'
            {
             before(grammarAccess.getLoadAccess().getHeaderKeyword_3_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getHeaderKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group_3__1__Impl"


    // $ANTLR start "rule__Store__Group__0"
    // InternalMyCsv.g:2494:1: rule__Store__Group__0 : rule__Store__Group__0__Impl rule__Store__Group__1 ;
    public final void rule__Store__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2498:1: ( rule__Store__Group__0__Impl rule__Store__Group__1 )
            // InternalMyCsv.g:2499:2: rule__Store__Group__0__Impl rule__Store__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Store__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0"


    // $ANTLR start "rule__Store__Group__0__Impl"
    // InternalMyCsv.g:2506:1: rule__Store__Group__0__Impl : ( 'Store' ) ;
    public final void rule__Store__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2510:1: ( ( 'Store' ) )
            // InternalMyCsv.g:2511:1: ( 'Store' )
            {
            // InternalMyCsv.g:2511:1: ( 'Store' )
            // InternalMyCsv.g:2512:2: 'Store'
            {
             before(grammarAccess.getStoreAccess().getStoreKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getStoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0__Impl"


    // $ANTLR start "rule__Store__Group__1"
    // InternalMyCsv.g:2521:1: rule__Store__Group__1 : rule__Store__Group__1__Impl rule__Store__Group__2 ;
    public final void rule__Store__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2525:1: ( rule__Store__Group__1__Impl rule__Store__Group__2 )
            // InternalMyCsv.g:2526:2: rule__Store__Group__1__Impl rule__Store__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Store__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1"


    // $ANTLR start "rule__Store__Group__1__Impl"
    // InternalMyCsv.g:2533:1: rule__Store__Group__1__Impl : ( ( rule__Store__PathAssignment_1 ) ) ;
    public final void rule__Store__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2537:1: ( ( ( rule__Store__PathAssignment_1 ) ) )
            // InternalMyCsv.g:2538:1: ( ( rule__Store__PathAssignment_1 ) )
            {
            // InternalMyCsv.g:2538:1: ( ( rule__Store__PathAssignment_1 ) )
            // InternalMyCsv.g:2539:2: ( rule__Store__PathAssignment_1 )
            {
             before(grammarAccess.getStoreAccess().getPathAssignment_1()); 
            // InternalMyCsv.g:2540:2: ( rule__Store__PathAssignment_1 )
            // InternalMyCsv.g:2540:3: rule__Store__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Store__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1__Impl"


    // $ANTLR start "rule__Store__Group__2"
    // InternalMyCsv.g:2548:1: rule__Store__Group__2 : rule__Store__Group__2__Impl rule__Store__Group__3 ;
    public final void rule__Store__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2552:1: ( rule__Store__Group__2__Impl rule__Store__Group__3 )
            // InternalMyCsv.g:2553:2: rule__Store__Group__2__Impl rule__Store__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Store__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__2"


    // $ANTLR start "rule__Store__Group__2__Impl"
    // InternalMyCsv.g:2560:1: rule__Store__Group__2__Impl : ( ( rule__Store__Group_2__0 )? ) ;
    public final void rule__Store__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2564:1: ( ( ( rule__Store__Group_2__0 )? ) )
            // InternalMyCsv.g:2565:1: ( ( rule__Store__Group_2__0 )? )
            {
            // InternalMyCsv.g:2565:1: ( ( rule__Store__Group_2__0 )? )
            // InternalMyCsv.g:2566:2: ( rule__Store__Group_2__0 )?
            {
             before(grammarAccess.getStoreAccess().getGroup_2()); 
            // InternalMyCsv.g:2567:2: ( rule__Store__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==53) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyCsv.g:2567:3: rule__Store__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Store__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStoreAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__2__Impl"


    // $ANTLR start "rule__Store__Group__3"
    // InternalMyCsv.g:2575:1: rule__Store__Group__3 : rule__Store__Group__3__Impl ;
    public final void rule__Store__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2579:1: ( rule__Store__Group__3__Impl )
            // InternalMyCsv.g:2580:2: rule__Store__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__3"


    // $ANTLR start "rule__Store__Group__3__Impl"
    // InternalMyCsv.g:2586:1: rule__Store__Group__3__Impl : ( ( rule__Store__Group_3__0 )? ) ;
    public final void rule__Store__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2590:1: ( ( ( rule__Store__Group_3__0 )? ) )
            // InternalMyCsv.g:2591:1: ( ( rule__Store__Group_3__0 )? )
            {
            // InternalMyCsv.g:2591:1: ( ( rule__Store__Group_3__0 )? )
            // InternalMyCsv.g:2592:2: ( rule__Store__Group_3__0 )?
            {
             before(grammarAccess.getStoreAccess().getGroup_3()); 
            // InternalMyCsv.g:2593:2: ( rule__Store__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==54) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyCsv.g:2593:3: rule__Store__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Store__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStoreAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__3__Impl"


    // $ANTLR start "rule__Store__Group_2__0"
    // InternalMyCsv.g:2602:1: rule__Store__Group_2__0 : rule__Store__Group_2__0__Impl rule__Store__Group_2__1 ;
    public final void rule__Store__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2606:1: ( rule__Store__Group_2__0__Impl rule__Store__Group_2__1 )
            // InternalMyCsv.g:2607:2: rule__Store__Group_2__0__Impl rule__Store__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Store__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_2__0"


    // $ANTLR start "rule__Store__Group_2__0__Impl"
    // InternalMyCsv.g:2614:1: rule__Store__Group_2__0__Impl : ( ( rule__Store__SepDefinedAssignment_2_0 ) ) ;
    public final void rule__Store__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2618:1: ( ( ( rule__Store__SepDefinedAssignment_2_0 ) ) )
            // InternalMyCsv.g:2619:1: ( ( rule__Store__SepDefinedAssignment_2_0 ) )
            {
            // InternalMyCsv.g:2619:1: ( ( rule__Store__SepDefinedAssignment_2_0 ) )
            // InternalMyCsv.g:2620:2: ( rule__Store__SepDefinedAssignment_2_0 )
            {
             before(grammarAccess.getStoreAccess().getSepDefinedAssignment_2_0()); 
            // InternalMyCsv.g:2621:2: ( rule__Store__SepDefinedAssignment_2_0 )
            // InternalMyCsv.g:2621:3: rule__Store__SepDefinedAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Store__SepDefinedAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getSepDefinedAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_2__0__Impl"


    // $ANTLR start "rule__Store__Group_2__1"
    // InternalMyCsv.g:2629:1: rule__Store__Group_2__1 : rule__Store__Group_2__1__Impl rule__Store__Group_2__2 ;
    public final void rule__Store__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2633:1: ( rule__Store__Group_2__1__Impl rule__Store__Group_2__2 )
            // InternalMyCsv.g:2634:2: rule__Store__Group_2__1__Impl rule__Store__Group_2__2
            {
            pushFollow(FOLLOW_13);
            rule__Store__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_2__1"


    // $ANTLR start "rule__Store__Group_2__1__Impl"
    // InternalMyCsv.g:2641:1: rule__Store__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Store__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2645:1: ( ( '=' ) )
            // InternalMyCsv.g:2646:1: ( '=' )
            {
            // InternalMyCsv.g:2646:1: ( '=' )
            // InternalMyCsv.g:2647:2: '='
            {
             before(grammarAccess.getStoreAccess().getEqualsSignKeyword_2_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_2__1__Impl"


    // $ANTLR start "rule__Store__Group_2__2"
    // InternalMyCsv.g:2656:1: rule__Store__Group_2__2 : rule__Store__Group_2__2__Impl ;
    public final void rule__Store__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2660:1: ( rule__Store__Group_2__2__Impl )
            // InternalMyCsv.g:2661:2: rule__Store__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_2__2"


    // $ANTLR start "rule__Store__Group_2__2__Impl"
    // InternalMyCsv.g:2667:1: rule__Store__Group_2__2__Impl : ( ( rule__Store__SepAssignment_2_2 ) ) ;
    public final void rule__Store__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2671:1: ( ( ( rule__Store__SepAssignment_2_2 ) ) )
            // InternalMyCsv.g:2672:1: ( ( rule__Store__SepAssignment_2_2 ) )
            {
            // InternalMyCsv.g:2672:1: ( ( rule__Store__SepAssignment_2_2 ) )
            // InternalMyCsv.g:2673:2: ( rule__Store__SepAssignment_2_2 )
            {
             before(grammarAccess.getStoreAccess().getSepAssignment_2_2()); 
            // InternalMyCsv.g:2674:2: ( rule__Store__SepAssignment_2_2 )
            // InternalMyCsv.g:2674:3: rule__Store__SepAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Store__SepAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getSepAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_2__2__Impl"


    // $ANTLR start "rule__Store__Group_3__0"
    // InternalMyCsv.g:2683:1: rule__Store__Group_3__0 : rule__Store__Group_3__0__Impl rule__Store__Group_3__1 ;
    public final void rule__Store__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2687:1: ( rule__Store__Group_3__0__Impl rule__Store__Group_3__1 )
            // InternalMyCsv.g:2688:2: rule__Store__Group_3__0__Impl rule__Store__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Store__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_3__0"


    // $ANTLR start "rule__Store__Group_3__0__Impl"
    // InternalMyCsv.g:2695:1: rule__Store__Group_3__0__Impl : ( ( rule__Store__NoHeaderAssignment_3_0 ) ) ;
    public final void rule__Store__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2699:1: ( ( ( rule__Store__NoHeaderAssignment_3_0 ) ) )
            // InternalMyCsv.g:2700:1: ( ( rule__Store__NoHeaderAssignment_3_0 ) )
            {
            // InternalMyCsv.g:2700:1: ( ( rule__Store__NoHeaderAssignment_3_0 ) )
            // InternalMyCsv.g:2701:2: ( rule__Store__NoHeaderAssignment_3_0 )
            {
             before(grammarAccess.getStoreAccess().getNoHeaderAssignment_3_0()); 
            // InternalMyCsv.g:2702:2: ( rule__Store__NoHeaderAssignment_3_0 )
            // InternalMyCsv.g:2702:3: rule__Store__NoHeaderAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Store__NoHeaderAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getNoHeaderAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_3__0__Impl"


    // $ANTLR start "rule__Store__Group_3__1"
    // InternalMyCsv.g:2710:1: rule__Store__Group_3__1 : rule__Store__Group_3__1__Impl ;
    public final void rule__Store__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2714:1: ( rule__Store__Group_3__1__Impl )
            // InternalMyCsv.g:2715:2: rule__Store__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_3__1"


    // $ANTLR start "rule__Store__Group_3__1__Impl"
    // InternalMyCsv.g:2721:1: rule__Store__Group_3__1__Impl : ( 'header' ) ;
    public final void rule__Store__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2725:1: ( ( 'header' ) )
            // InternalMyCsv.g:2726:1: ( 'header' )
            {
            // InternalMyCsv.g:2726:1: ( 'header' )
            // InternalMyCsv.g:2727:2: 'header'
            {
             before(grammarAccess.getStoreAccess().getHeaderKeyword_3_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getHeaderKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_3__1__Impl"


    // $ANTLR start "rule__ExportJson__Group__0"
    // InternalMyCsv.g:2737:1: rule__ExportJson__Group__0 : rule__ExportJson__Group__0__Impl rule__ExportJson__Group__1 ;
    public final void rule__ExportJson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2741:1: ( rule__ExportJson__Group__0__Impl rule__ExportJson__Group__1 )
            // InternalMyCsv.g:2742:2: rule__ExportJson__Group__0__Impl rule__ExportJson__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ExportJson__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExportJson__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportJson__Group__0"


    // $ANTLR start "rule__ExportJson__Group__0__Impl"
    // InternalMyCsv.g:2749:1: rule__ExportJson__Group__0__Impl : ( 'ExportJson' ) ;
    public final void rule__ExportJson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2753:1: ( ( 'ExportJson' ) )
            // InternalMyCsv.g:2754:1: ( 'ExportJson' )
            {
            // InternalMyCsv.g:2754:1: ( 'ExportJson' )
            // InternalMyCsv.g:2755:2: 'ExportJson'
            {
             before(grammarAccess.getExportJsonAccess().getExportJsonKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getExportJsonAccess().getExportJsonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportJson__Group__0__Impl"


    // $ANTLR start "rule__ExportJson__Group__1"
    // InternalMyCsv.g:2764:1: rule__ExportJson__Group__1 : rule__ExportJson__Group__1__Impl ;
    public final void rule__ExportJson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2768:1: ( rule__ExportJson__Group__1__Impl )
            // InternalMyCsv.g:2769:2: rule__ExportJson__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExportJson__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportJson__Group__1"


    // $ANTLR start "rule__ExportJson__Group__1__Impl"
    // InternalMyCsv.g:2775:1: rule__ExportJson__Group__1__Impl : ( ( rule__ExportJson__PathAssignment_1 ) ) ;
    public final void rule__ExportJson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2779:1: ( ( ( rule__ExportJson__PathAssignment_1 ) ) )
            // InternalMyCsv.g:2780:1: ( ( rule__ExportJson__PathAssignment_1 ) )
            {
            // InternalMyCsv.g:2780:1: ( ( rule__ExportJson__PathAssignment_1 ) )
            // InternalMyCsv.g:2781:2: ( rule__ExportJson__PathAssignment_1 )
            {
             before(grammarAccess.getExportJsonAccess().getPathAssignment_1()); 
            // InternalMyCsv.g:2782:2: ( rule__ExportJson__PathAssignment_1 )
            // InternalMyCsv.g:2782:3: rule__ExportJson__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExportJson__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExportJsonAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportJson__Group__1__Impl"


    // $ANTLR start "rule__Projection__Group__0"
    // InternalMyCsv.g:2791:1: rule__Projection__Group__0 : rule__Projection__Group__0__Impl rule__Projection__Group__1 ;
    public final void rule__Projection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2795:1: ( rule__Projection__Group__0__Impl rule__Projection__Group__1 )
            // InternalMyCsv.g:2796:2: rule__Projection__Group__0__Impl rule__Projection__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Projection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__0"


    // $ANTLR start "rule__Projection__Group__0__Impl"
    // InternalMyCsv.g:2803:1: rule__Projection__Group__0__Impl : ( 'Projection' ) ;
    public final void rule__Projection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2807:1: ( ( 'Projection' ) )
            // InternalMyCsv.g:2808:1: ( 'Projection' )
            {
            // InternalMyCsv.g:2808:1: ( 'Projection' )
            // InternalMyCsv.g:2809:2: 'Projection'
            {
             before(grammarAccess.getProjectionAccess().getProjectionKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getProjectionAccess().getProjectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__0__Impl"


    // $ANTLR start "rule__Projection__Group__1"
    // InternalMyCsv.g:2818:1: rule__Projection__Group__1 : rule__Projection__Group__1__Impl ;
    public final void rule__Projection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2822:1: ( rule__Projection__Group__1__Impl )
            // InternalMyCsv.g:2823:2: rule__Projection__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Projection__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__1"


    // $ANTLR start "rule__Projection__Group__1__Impl"
    // InternalMyCsv.g:2829:1: rule__Projection__Group__1__Impl : ( ( rule__Projection__FieldAssignment_1 ) ) ;
    public final void rule__Projection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2833:1: ( ( ( rule__Projection__FieldAssignment_1 ) ) )
            // InternalMyCsv.g:2834:1: ( ( rule__Projection__FieldAssignment_1 ) )
            {
            // InternalMyCsv.g:2834:1: ( ( rule__Projection__FieldAssignment_1 ) )
            // InternalMyCsv.g:2835:2: ( rule__Projection__FieldAssignment_1 )
            {
             before(grammarAccess.getProjectionAccess().getFieldAssignment_1()); 
            // InternalMyCsv.g:2836:2: ( rule__Projection__FieldAssignment_1 )
            // InternalMyCsv.g:2836:3: rule__Projection__FieldAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Projection__FieldAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectionAccess().getFieldAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // InternalMyCsv.g:2845:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2849:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalMyCsv.g:2850:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // InternalMyCsv.g:2857:1: rule__Select__Group__0__Impl : ( 'Select' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2861:1: ( ( 'Select' ) )
            // InternalMyCsv.g:2862:1: ( 'Select' )
            {
            // InternalMyCsv.g:2862:1: ( 'Select' )
            // InternalMyCsv.g:2863:2: 'Select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalMyCsv.g:2872:1: rule__Select__Group__1 : rule__Select__Group__1__Impl ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2876:1: ( rule__Select__Group__1__Impl )
            // InternalMyCsv.g:2877:2: rule__Select__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // InternalMyCsv.g:2883:1: rule__Select__Group__1__Impl : ( ( rule__Select__LineAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2887:1: ( ( ( rule__Select__LineAssignment_1 ) ) )
            // InternalMyCsv.g:2888:1: ( ( rule__Select__LineAssignment_1 ) )
            {
            // InternalMyCsv.g:2888:1: ( ( rule__Select__LineAssignment_1 ) )
            // InternalMyCsv.g:2889:2: ( rule__Select__LineAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getLineAssignment_1()); 
            // InternalMyCsv.g:2890:2: ( rule__Select__LineAssignment_1 )
            // InternalMyCsv.g:2890:3: rule__Select__LineAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__LineAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getLineAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Delete__Group__0"
    // InternalMyCsv.g:2899:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2903:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalMyCsv.g:2904:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Delete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__0"


    // $ANTLR start "rule__Delete__Group__0__Impl"
    // InternalMyCsv.g:2911:1: rule__Delete__Group__0__Impl : ( 'Delete' ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2915:1: ( ( 'Delete' ) )
            // InternalMyCsv.g:2916:1: ( 'Delete' )
            {
            // InternalMyCsv.g:2916:1: ( 'Delete' )
            // InternalMyCsv.g:2917:2: 'Delete'
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__0__Impl"


    // $ANTLR start "rule__Delete__Group__1"
    // InternalMyCsv.g:2926:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2930:1: ( rule__Delete__Group__1__Impl )
            // InternalMyCsv.g:2931:2: rule__Delete__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__1"


    // $ANTLR start "rule__Delete__Group__1__Impl"
    // InternalMyCsv.g:2937:1: rule__Delete__Group__1__Impl : ( ( rule__Delete__Alternatives_1 ) ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2941:1: ( ( ( rule__Delete__Alternatives_1 ) ) )
            // InternalMyCsv.g:2942:1: ( ( rule__Delete__Alternatives_1 ) )
            {
            // InternalMyCsv.g:2942:1: ( ( rule__Delete__Alternatives_1 ) )
            // InternalMyCsv.g:2943:2: ( rule__Delete__Alternatives_1 )
            {
             before(grammarAccess.getDeleteAccess().getAlternatives_1()); 
            // InternalMyCsv.g:2944:2: ( rule__Delete__Alternatives_1 )
            // InternalMyCsv.g:2944:3: rule__Delete__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__1__Impl"


    // $ANTLR start "rule__DeleteLine__Group__0"
    // InternalMyCsv.g:2953:1: rule__DeleteLine__Group__0 : rule__DeleteLine__Group__0__Impl rule__DeleteLine__Group__1 ;
    public final void rule__DeleteLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2957:1: ( rule__DeleteLine__Group__0__Impl rule__DeleteLine__Group__1 )
            // InternalMyCsv.g:2958:2: rule__DeleteLine__Group__0__Impl rule__DeleteLine__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DeleteLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteLine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteLine__Group__0"


    // $ANTLR start "rule__DeleteLine__Group__0__Impl"
    // InternalMyCsv.g:2965:1: rule__DeleteLine__Group__0__Impl : ( 'line' ) ;
    public final void rule__DeleteLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2969:1: ( ( 'line' ) )
            // InternalMyCsv.g:2970:1: ( 'line' )
            {
            // InternalMyCsv.g:2970:1: ( 'line' )
            // InternalMyCsv.g:2971:2: 'line'
            {
             before(grammarAccess.getDeleteLineAccess().getLineKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDeleteLineAccess().getLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteLine__Group__0__Impl"


    // $ANTLR start "rule__DeleteLine__Group__1"
    // InternalMyCsv.g:2980:1: rule__DeleteLine__Group__1 : rule__DeleteLine__Group__1__Impl ;
    public final void rule__DeleteLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2984:1: ( rule__DeleteLine__Group__1__Impl )
            // InternalMyCsv.g:2985:2: rule__DeleteLine__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteLine__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteLine__Group__1"


    // $ANTLR start "rule__DeleteLine__Group__1__Impl"
    // InternalMyCsv.g:2991:1: rule__DeleteLine__Group__1__Impl : ( ( rule__DeleteLine__LinesAssignment_1 ) ) ;
    public final void rule__DeleteLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:2995:1: ( ( ( rule__DeleteLine__LinesAssignment_1 ) ) )
            // InternalMyCsv.g:2996:1: ( ( rule__DeleteLine__LinesAssignment_1 ) )
            {
            // InternalMyCsv.g:2996:1: ( ( rule__DeleteLine__LinesAssignment_1 ) )
            // InternalMyCsv.g:2997:2: ( rule__DeleteLine__LinesAssignment_1 )
            {
             before(grammarAccess.getDeleteLineAccess().getLinesAssignment_1()); 
            // InternalMyCsv.g:2998:2: ( rule__DeleteLine__LinesAssignment_1 )
            // InternalMyCsv.g:2998:3: rule__DeleteLine__LinesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeleteLine__LinesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeleteLineAccess().getLinesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteLine__Group__1__Impl"


    // $ANTLR start "rule__DeleteField__Group__0"
    // InternalMyCsv.g:3007:1: rule__DeleteField__Group__0 : rule__DeleteField__Group__0__Impl rule__DeleteField__Group__1 ;
    public final void rule__DeleteField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3011:1: ( rule__DeleteField__Group__0__Impl rule__DeleteField__Group__1 )
            // InternalMyCsv.g:3012:2: rule__DeleteField__Group__0__Impl rule__DeleteField__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__DeleteField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteField__Group__0"


    // $ANTLR start "rule__DeleteField__Group__0__Impl"
    // InternalMyCsv.g:3019:1: rule__DeleteField__Group__0__Impl : ( 'field' ) ;
    public final void rule__DeleteField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3023:1: ( ( 'field' ) )
            // InternalMyCsv.g:3024:1: ( 'field' )
            {
            // InternalMyCsv.g:3024:1: ( 'field' )
            // InternalMyCsv.g:3025:2: 'field'
            {
             before(grammarAccess.getDeleteFieldAccess().getFieldKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDeleteFieldAccess().getFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteField__Group__0__Impl"


    // $ANTLR start "rule__DeleteField__Group__1"
    // InternalMyCsv.g:3034:1: rule__DeleteField__Group__1 : rule__DeleteField__Group__1__Impl ;
    public final void rule__DeleteField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3038:1: ( rule__DeleteField__Group__1__Impl )
            // InternalMyCsv.g:3039:2: rule__DeleteField__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteField__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteField__Group__1"


    // $ANTLR start "rule__DeleteField__Group__1__Impl"
    // InternalMyCsv.g:3045:1: rule__DeleteField__Group__1__Impl : ( ( rule__DeleteField__FieldsAssignment_1 ) ) ;
    public final void rule__DeleteField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3049:1: ( ( ( rule__DeleteField__FieldsAssignment_1 ) ) )
            // InternalMyCsv.g:3050:1: ( ( rule__DeleteField__FieldsAssignment_1 ) )
            {
            // InternalMyCsv.g:3050:1: ( ( rule__DeleteField__FieldsAssignment_1 ) )
            // InternalMyCsv.g:3051:2: ( rule__DeleteField__FieldsAssignment_1 )
            {
             before(grammarAccess.getDeleteFieldAccess().getFieldsAssignment_1()); 
            // InternalMyCsv.g:3052:2: ( rule__DeleteField__FieldsAssignment_1 )
            // InternalMyCsv.g:3052:3: rule__DeleteField__FieldsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeleteField__FieldsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeleteFieldAccess().getFieldsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteField__Group__1__Impl"


    // $ANTLR start "rule__Insert__Group__0"
    // InternalMyCsv.g:3061:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3065:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalMyCsv.g:3066:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Insert__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__0"


    // $ANTLR start "rule__Insert__Group__0__Impl"
    // InternalMyCsv.g:3073:1: rule__Insert__Group__0__Impl : ( 'Insert' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3077:1: ( ( 'Insert' ) )
            // InternalMyCsv.g:3078:1: ( 'Insert' )
            {
            // InternalMyCsv.g:3078:1: ( 'Insert' )
            // InternalMyCsv.g:3079:2: 'Insert'
            {
             before(grammarAccess.getInsertAccess().getInsertKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getInsertKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__0__Impl"


    // $ANTLR start "rule__Insert__Group__1"
    // InternalMyCsv.g:3088:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3092:1: ( rule__Insert__Group__1__Impl )
            // InternalMyCsv.g:3093:2: rule__Insert__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__1"


    // $ANTLR start "rule__Insert__Group__1__Impl"
    // InternalMyCsv.g:3099:1: rule__Insert__Group__1__Impl : ( ( rule__Insert__Alternatives_1 ) ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3103:1: ( ( ( rule__Insert__Alternatives_1 ) ) )
            // InternalMyCsv.g:3104:1: ( ( rule__Insert__Alternatives_1 ) )
            {
            // InternalMyCsv.g:3104:1: ( ( rule__Insert__Alternatives_1 ) )
            // InternalMyCsv.g:3105:2: ( rule__Insert__Alternatives_1 )
            {
             before(grammarAccess.getInsertAccess().getAlternatives_1()); 
            // InternalMyCsv.g:3106:2: ( rule__Insert__Alternatives_1 )
            // InternalMyCsv.g:3106:3: rule__Insert__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__1__Impl"


    // $ANTLR start "rule__InsertLine__Group__0"
    // InternalMyCsv.g:3115:1: rule__InsertLine__Group__0 : rule__InsertLine__Group__0__Impl rule__InsertLine__Group__1 ;
    public final void rule__InsertLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3119:1: ( rule__InsertLine__Group__0__Impl rule__InsertLine__Group__1 )
            // InternalMyCsv.g:3120:2: rule__InsertLine__Group__0__Impl rule__InsertLine__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__InsertLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertLine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertLine__Group__0"


    // $ANTLR start "rule__InsertLine__Group__0__Impl"
    // InternalMyCsv.g:3127:1: rule__InsertLine__Group__0__Impl : ( 'line' ) ;
    public final void rule__InsertLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3131:1: ( ( 'line' ) )
            // InternalMyCsv.g:3132:1: ( 'line' )
            {
            // InternalMyCsv.g:3132:1: ( 'line' )
            // InternalMyCsv.g:3133:2: 'line'
            {
             before(grammarAccess.getInsertLineAccess().getLineKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInsertLineAccess().getLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertLine__Group__0__Impl"


    // $ANTLR start "rule__InsertLine__Group__1"
    // InternalMyCsv.g:3142:1: rule__InsertLine__Group__1 : rule__InsertLine__Group__1__Impl ;
    public final void rule__InsertLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3146:1: ( rule__InsertLine__Group__1__Impl )
            // InternalMyCsv.g:3147:2: rule__InsertLine__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertLine__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertLine__Group__1"


    // $ANTLR start "rule__InsertLine__Group__1__Impl"
    // InternalMyCsv.g:3153:1: rule__InsertLine__Group__1__Impl : ( ( rule__InsertLine__ValuesAssignment_1 ) ) ;
    public final void rule__InsertLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3157:1: ( ( ( rule__InsertLine__ValuesAssignment_1 ) ) )
            // InternalMyCsv.g:3158:1: ( ( rule__InsertLine__ValuesAssignment_1 ) )
            {
            // InternalMyCsv.g:3158:1: ( ( rule__InsertLine__ValuesAssignment_1 ) )
            // InternalMyCsv.g:3159:2: ( rule__InsertLine__ValuesAssignment_1 )
            {
             before(grammarAccess.getInsertLineAccess().getValuesAssignment_1()); 
            // InternalMyCsv.g:3160:2: ( rule__InsertLine__ValuesAssignment_1 )
            // InternalMyCsv.g:3160:3: rule__InsertLine__ValuesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InsertLine__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertLineAccess().getValuesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertLine__Group__1__Impl"


    // $ANTLR start "rule__InsertField__Group__0"
    // InternalMyCsv.g:3169:1: rule__InsertField__Group__0 : rule__InsertField__Group__0__Impl rule__InsertField__Group__1 ;
    public final void rule__InsertField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3173:1: ( rule__InsertField__Group__0__Impl rule__InsertField__Group__1 )
            // InternalMyCsv.g:3174:2: rule__InsertField__Group__0__Impl rule__InsertField__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__InsertField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertField__Group__0"


    // $ANTLR start "rule__InsertField__Group__0__Impl"
    // InternalMyCsv.g:3181:1: rule__InsertField__Group__0__Impl : ( 'field' ) ;
    public final void rule__InsertField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3185:1: ( ( 'field' ) )
            // InternalMyCsv.g:3186:1: ( 'field' )
            {
            // InternalMyCsv.g:3186:1: ( 'field' )
            // InternalMyCsv.g:3187:2: 'field'
            {
             before(grammarAccess.getInsertFieldAccess().getFieldKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInsertFieldAccess().getFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertField__Group__0__Impl"


    // $ANTLR start "rule__InsertField__Group__1"
    // InternalMyCsv.g:3196:1: rule__InsertField__Group__1 : rule__InsertField__Group__1__Impl rule__InsertField__Group__2 ;
    public final void rule__InsertField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3200:1: ( rule__InsertField__Group__1__Impl rule__InsertField__Group__2 )
            // InternalMyCsv.g:3201:2: rule__InsertField__Group__1__Impl rule__InsertField__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__InsertField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertField__Group__1"


    // $ANTLR start "rule__InsertField__Group__1__Impl"
    // InternalMyCsv.g:3208:1: rule__InsertField__Group__1__Impl : ( ( rule__InsertField__FieldnameAssignment_1 ) ) ;
    public final void rule__InsertField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3212:1: ( ( ( rule__InsertField__FieldnameAssignment_1 ) ) )
            // InternalMyCsv.g:3213:1: ( ( rule__InsertField__FieldnameAssignment_1 ) )
            {
            // InternalMyCsv.g:3213:1: ( ( rule__InsertField__FieldnameAssignment_1 ) )
            // InternalMyCsv.g:3214:2: ( rule__InsertField__FieldnameAssignment_1 )
            {
             before(grammarAccess.getInsertFieldAccess().getFieldnameAssignment_1()); 
            // InternalMyCsv.g:3215:2: ( rule__InsertField__FieldnameAssignment_1 )
            // InternalMyCsv.g:3215:3: rule__InsertField__FieldnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InsertField__FieldnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertFieldAccess().getFieldnameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertField__Group__1__Impl"


    // $ANTLR start "rule__InsertField__Group__2"
    // InternalMyCsv.g:3223:1: rule__InsertField__Group__2 : rule__InsertField__Group__2__Impl rule__InsertField__Group__3 ;
    public final void rule__InsertField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3227:1: ( rule__InsertField__Group__2__Impl rule__InsertField__Group__3 )
            // InternalMyCsv.g:3228:2: rule__InsertField__Group__2__Impl rule__InsertField__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__InsertField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertField__Group__2"


    // $ANTLR start "rule__InsertField__Group__2__Impl"
    // InternalMyCsv.g:3235:1: rule__InsertField__Group__2__Impl : ( ':' ) ;
    public final void rule__InsertField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3239:1: ( ( ':' ) )
            // InternalMyCsv.g:3240:1: ( ':' )
            {
            // InternalMyCsv.g:3240:1: ( ':' )
            // InternalMyCsv.g:3241:2: ':'
            {
             before(grammarAccess.getInsertFieldAccess().getColonKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInsertFieldAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertField__Group__2__Impl"


    // $ANTLR start "rule__InsertField__Group__3"
    // InternalMyCsv.g:3250:1: rule__InsertField__Group__3 : rule__InsertField__Group__3__Impl ;
    public final void rule__InsertField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3254:1: ( rule__InsertField__Group__3__Impl )
            // InternalMyCsv.g:3255:2: rule__InsertField__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertField__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertField__Group__3"


    // $ANTLR start "rule__InsertField__Group__3__Impl"
    // InternalMyCsv.g:3261:1: rule__InsertField__Group__3__Impl : ( ( rule__InsertField__ValuesAssignment_3 ) ) ;
    public final void rule__InsertField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3265:1: ( ( ( rule__InsertField__ValuesAssignment_3 ) ) )
            // InternalMyCsv.g:3266:1: ( ( rule__InsertField__ValuesAssignment_3 ) )
            {
            // InternalMyCsv.g:3266:1: ( ( rule__InsertField__ValuesAssignment_3 ) )
            // InternalMyCsv.g:3267:2: ( rule__InsertField__ValuesAssignment_3 )
            {
             before(grammarAccess.getInsertFieldAccess().getValuesAssignment_3()); 
            // InternalMyCsv.g:3268:2: ( rule__InsertField__ValuesAssignment_3 )
            // InternalMyCsv.g:3268:3: rule__InsertField__ValuesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InsertField__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertFieldAccess().getValuesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertField__Group__3__Impl"


    // $ANTLR start "rule__Modify__Group__0"
    // InternalMyCsv.g:3277:1: rule__Modify__Group__0 : rule__Modify__Group__0__Impl rule__Modify__Group__1 ;
    public final void rule__Modify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3281:1: ( rule__Modify__Group__0__Impl rule__Modify__Group__1 )
            // InternalMyCsv.g:3282:2: rule__Modify__Group__0__Impl rule__Modify__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Modify__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modify__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modify__Group__0"


    // $ANTLR start "rule__Modify__Group__0__Impl"
    // InternalMyCsv.g:3289:1: rule__Modify__Group__0__Impl : ( 'Modify' ) ;
    public final void rule__Modify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3293:1: ( ( 'Modify' ) )
            // InternalMyCsv.g:3294:1: ( 'Modify' )
            {
            // InternalMyCsv.g:3294:1: ( 'Modify' )
            // InternalMyCsv.g:3295:2: 'Modify'
            {
             before(grammarAccess.getModifyAccess().getModifyKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getModifyAccess().getModifyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modify__Group__0__Impl"


    // $ANTLR start "rule__Modify__Group__1"
    // InternalMyCsv.g:3304:1: rule__Modify__Group__1 : rule__Modify__Group__1__Impl ;
    public final void rule__Modify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3308:1: ( rule__Modify__Group__1__Impl )
            // InternalMyCsv.g:3309:2: rule__Modify__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modify__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modify__Group__1"


    // $ANTLR start "rule__Modify__Group__1__Impl"
    // InternalMyCsv.g:3315:1: rule__Modify__Group__1__Impl : ( ( rule__Modify__Alternatives_1 ) ) ;
    public final void rule__Modify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3319:1: ( ( ( rule__Modify__Alternatives_1 ) ) )
            // InternalMyCsv.g:3320:1: ( ( rule__Modify__Alternatives_1 ) )
            {
            // InternalMyCsv.g:3320:1: ( ( rule__Modify__Alternatives_1 ) )
            // InternalMyCsv.g:3321:2: ( rule__Modify__Alternatives_1 )
            {
             before(grammarAccess.getModifyAccess().getAlternatives_1()); 
            // InternalMyCsv.g:3322:2: ( rule__Modify__Alternatives_1 )
            // InternalMyCsv.g:3322:3: rule__Modify__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Modify__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getModifyAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modify__Group__1__Impl"


    // $ANTLR start "rule__ModifyLine__Group__0"
    // InternalMyCsv.g:3331:1: rule__ModifyLine__Group__0 : rule__ModifyLine__Group__0__Impl rule__ModifyLine__Group__1 ;
    public final void rule__ModifyLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3335:1: ( rule__ModifyLine__Group__0__Impl rule__ModifyLine__Group__1 )
            // InternalMyCsv.g:3336:2: rule__ModifyLine__Group__0__Impl rule__ModifyLine__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ModifyLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifyLine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyLine__Group__0"


    // $ANTLR start "rule__ModifyLine__Group__0__Impl"
    // InternalMyCsv.g:3343:1: rule__ModifyLine__Group__0__Impl : ( 'line' ) ;
    public final void rule__ModifyLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3347:1: ( ( 'line' ) )
            // InternalMyCsv.g:3348:1: ( 'line' )
            {
            // InternalMyCsv.g:3348:1: ( 'line' )
            // InternalMyCsv.g:3349:2: 'line'
            {
             before(grammarAccess.getModifyLineAccess().getLineKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getModifyLineAccess().getLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyLine__Group__0__Impl"


    // $ANTLR start "rule__ModifyLine__Group__1"
    // InternalMyCsv.g:3358:1: rule__ModifyLine__Group__1 : rule__ModifyLine__Group__1__Impl rule__ModifyLine__Group__2 ;
    public final void rule__ModifyLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3362:1: ( rule__ModifyLine__Group__1__Impl rule__ModifyLine__Group__2 )
            // InternalMyCsv.g:3363:2: rule__ModifyLine__Group__1__Impl rule__ModifyLine__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ModifyLine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifyLine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyLine__Group__1"


    // $ANTLR start "rule__ModifyLine__Group__1__Impl"
    // InternalMyCsv.g:3370:1: rule__ModifyLine__Group__1__Impl : ( ( rule__ModifyLine__LinesAssignment_1 ) ) ;
    public final void rule__ModifyLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3374:1: ( ( ( rule__ModifyLine__LinesAssignment_1 ) ) )
            // InternalMyCsv.g:3375:1: ( ( rule__ModifyLine__LinesAssignment_1 ) )
            {
            // InternalMyCsv.g:3375:1: ( ( rule__ModifyLine__LinesAssignment_1 ) )
            // InternalMyCsv.g:3376:2: ( rule__ModifyLine__LinesAssignment_1 )
            {
             before(grammarAccess.getModifyLineAccess().getLinesAssignment_1()); 
            // InternalMyCsv.g:3377:2: ( rule__ModifyLine__LinesAssignment_1 )
            // InternalMyCsv.g:3377:3: rule__ModifyLine__LinesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModifyLine__LinesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModifyLineAccess().getLinesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyLine__Group__1__Impl"


    // $ANTLR start "rule__ModifyLine__Group__2"
    // InternalMyCsv.g:3385:1: rule__ModifyLine__Group__2 : rule__ModifyLine__Group__2__Impl rule__ModifyLine__Group__3 ;
    public final void rule__ModifyLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3389:1: ( rule__ModifyLine__Group__2__Impl rule__ModifyLine__Group__3 )
            // InternalMyCsv.g:3390:2: rule__ModifyLine__Group__2__Impl rule__ModifyLine__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ModifyLine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifyLine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyLine__Group__2"


    // $ANTLR start "rule__ModifyLine__Group__2__Impl"
    // InternalMyCsv.g:3397:1: rule__ModifyLine__Group__2__Impl : ( 'with' ) ;
    public final void rule__ModifyLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3401:1: ( ( 'with' ) )
            // InternalMyCsv.g:3402:1: ( 'with' )
            {
            // InternalMyCsv.g:3402:1: ( 'with' )
            // InternalMyCsv.g:3403:2: 'with'
            {
             before(grammarAccess.getModifyLineAccess().getWithKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getModifyLineAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyLine__Group__2__Impl"


    // $ANTLR start "rule__ModifyLine__Group__3"
    // InternalMyCsv.g:3412:1: rule__ModifyLine__Group__3 : rule__ModifyLine__Group__3__Impl ;
    public final void rule__ModifyLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3416:1: ( rule__ModifyLine__Group__3__Impl )
            // InternalMyCsv.g:3417:2: rule__ModifyLine__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModifyLine__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyLine__Group__3"


    // $ANTLR start "rule__ModifyLine__Group__3__Impl"
    // InternalMyCsv.g:3423:1: rule__ModifyLine__Group__3__Impl : ( ( rule__ModifyLine__ValuesAssignment_3 ) ) ;
    public final void rule__ModifyLine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3427:1: ( ( ( rule__ModifyLine__ValuesAssignment_3 ) ) )
            // InternalMyCsv.g:3428:1: ( ( rule__ModifyLine__ValuesAssignment_3 ) )
            {
            // InternalMyCsv.g:3428:1: ( ( rule__ModifyLine__ValuesAssignment_3 ) )
            // InternalMyCsv.g:3429:2: ( rule__ModifyLine__ValuesAssignment_3 )
            {
             before(grammarAccess.getModifyLineAccess().getValuesAssignment_3()); 
            // InternalMyCsv.g:3430:2: ( rule__ModifyLine__ValuesAssignment_3 )
            // InternalMyCsv.g:3430:3: rule__ModifyLine__ValuesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ModifyLine__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModifyLineAccess().getValuesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyLine__Group__3__Impl"


    // $ANTLR start "rule__ModifyField__Group__0"
    // InternalMyCsv.g:3439:1: rule__ModifyField__Group__0 : rule__ModifyField__Group__0__Impl rule__ModifyField__Group__1 ;
    public final void rule__ModifyField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3443:1: ( rule__ModifyField__Group__0__Impl rule__ModifyField__Group__1 )
            // InternalMyCsv.g:3444:2: rule__ModifyField__Group__0__Impl rule__ModifyField__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ModifyField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifyField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyField__Group__0"


    // $ANTLR start "rule__ModifyField__Group__0__Impl"
    // InternalMyCsv.g:3451:1: rule__ModifyField__Group__0__Impl : ( 'field' ) ;
    public final void rule__ModifyField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3455:1: ( ( 'field' ) )
            // InternalMyCsv.g:3456:1: ( 'field' )
            {
            // InternalMyCsv.g:3456:1: ( 'field' )
            // InternalMyCsv.g:3457:2: 'field'
            {
             before(grammarAccess.getModifyFieldAccess().getFieldKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getModifyFieldAccess().getFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyField__Group__0__Impl"


    // $ANTLR start "rule__ModifyField__Group__1"
    // InternalMyCsv.g:3466:1: rule__ModifyField__Group__1 : rule__ModifyField__Group__1__Impl rule__ModifyField__Group__2 ;
    public final void rule__ModifyField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3470:1: ( rule__ModifyField__Group__1__Impl rule__ModifyField__Group__2 )
            // InternalMyCsv.g:3471:2: rule__ModifyField__Group__1__Impl rule__ModifyField__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ModifyField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifyField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyField__Group__1"


    // $ANTLR start "rule__ModifyField__Group__1__Impl"
    // InternalMyCsv.g:3478:1: rule__ModifyField__Group__1__Impl : ( ( rule__ModifyField__FieldsAssignment_1 ) ) ;
    public final void rule__ModifyField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3482:1: ( ( ( rule__ModifyField__FieldsAssignment_1 ) ) )
            // InternalMyCsv.g:3483:1: ( ( rule__ModifyField__FieldsAssignment_1 ) )
            {
            // InternalMyCsv.g:3483:1: ( ( rule__ModifyField__FieldsAssignment_1 ) )
            // InternalMyCsv.g:3484:2: ( rule__ModifyField__FieldsAssignment_1 )
            {
             before(grammarAccess.getModifyFieldAccess().getFieldsAssignment_1()); 
            // InternalMyCsv.g:3485:2: ( rule__ModifyField__FieldsAssignment_1 )
            // InternalMyCsv.g:3485:3: rule__ModifyField__FieldsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModifyField__FieldsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModifyFieldAccess().getFieldsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyField__Group__1__Impl"


    // $ANTLR start "rule__ModifyField__Group__2"
    // InternalMyCsv.g:3493:1: rule__ModifyField__Group__2 : rule__ModifyField__Group__2__Impl rule__ModifyField__Group__3 ;
    public final void rule__ModifyField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3497:1: ( rule__ModifyField__Group__2__Impl rule__ModifyField__Group__3 )
            // InternalMyCsv.g:3498:2: rule__ModifyField__Group__2__Impl rule__ModifyField__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ModifyField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifyField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyField__Group__2"


    // $ANTLR start "rule__ModifyField__Group__2__Impl"
    // InternalMyCsv.g:3505:1: rule__ModifyField__Group__2__Impl : ( 'with' ) ;
    public final void rule__ModifyField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3509:1: ( ( 'with' ) )
            // InternalMyCsv.g:3510:1: ( 'with' )
            {
            // InternalMyCsv.g:3510:1: ( 'with' )
            // InternalMyCsv.g:3511:2: 'with'
            {
             before(grammarAccess.getModifyFieldAccess().getWithKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getModifyFieldAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyField__Group__2__Impl"


    // $ANTLR start "rule__ModifyField__Group__3"
    // InternalMyCsv.g:3520:1: rule__ModifyField__Group__3 : rule__ModifyField__Group__3__Impl ;
    public final void rule__ModifyField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3524:1: ( rule__ModifyField__Group__3__Impl )
            // InternalMyCsv.g:3525:2: rule__ModifyField__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModifyField__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyField__Group__3"


    // $ANTLR start "rule__ModifyField__Group__3__Impl"
    // InternalMyCsv.g:3531:1: rule__ModifyField__Group__3__Impl : ( ( rule__ModifyField__ValuesAssignment_3 ) ) ;
    public final void rule__ModifyField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3535:1: ( ( ( rule__ModifyField__ValuesAssignment_3 ) ) )
            // InternalMyCsv.g:3536:1: ( ( rule__ModifyField__ValuesAssignment_3 ) )
            {
            // InternalMyCsv.g:3536:1: ( ( rule__ModifyField__ValuesAssignment_3 ) )
            // InternalMyCsv.g:3537:2: ( rule__ModifyField__ValuesAssignment_3 )
            {
             before(grammarAccess.getModifyFieldAccess().getValuesAssignment_3()); 
            // InternalMyCsv.g:3538:2: ( rule__ModifyField__ValuesAssignment_3 )
            // InternalMyCsv.g:3538:3: rule__ModifyField__ValuesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ModifyField__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModifyFieldAccess().getValuesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyField__Group__3__Impl"


    // $ANTLR start "rule__ModifyCell__Group__0"
    // InternalMyCsv.g:3547:1: rule__ModifyCell__Group__0 : rule__ModifyCell__Group__0__Impl rule__ModifyCell__Group__1 ;
    public final void rule__ModifyCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3551:1: ( rule__ModifyCell__Group__0__Impl rule__ModifyCell__Group__1 )
            // InternalMyCsv.g:3552:2: rule__ModifyCell__Group__0__Impl rule__ModifyCell__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ModifyCell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifyCell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyCell__Group__0"


    // $ANTLR start "rule__ModifyCell__Group__0__Impl"
    // InternalMyCsv.g:3559:1: rule__ModifyCell__Group__0__Impl : ( 'cell' ) ;
    public final void rule__ModifyCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3563:1: ( ( 'cell' ) )
            // InternalMyCsv.g:3564:1: ( 'cell' )
            {
            // InternalMyCsv.g:3564:1: ( 'cell' )
            // InternalMyCsv.g:3565:2: 'cell'
            {
             before(grammarAccess.getModifyCellAccess().getCellKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getModifyCellAccess().getCellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyCell__Group__0__Impl"


    // $ANTLR start "rule__ModifyCell__Group__1"
    // InternalMyCsv.g:3574:1: rule__ModifyCell__Group__1 : rule__ModifyCell__Group__1__Impl rule__ModifyCell__Group__2 ;
    public final void rule__ModifyCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3578:1: ( rule__ModifyCell__Group__1__Impl rule__ModifyCell__Group__2 )
            // InternalMyCsv.g:3579:2: rule__ModifyCell__Group__1__Impl rule__ModifyCell__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ModifyCell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifyCell__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyCell__Group__1"


    // $ANTLR start "rule__ModifyCell__Group__1__Impl"
    // InternalMyCsv.g:3586:1: rule__ModifyCell__Group__1__Impl : ( ( rule__ModifyCell__CellAssignment_1 ) ) ;
    public final void rule__ModifyCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3590:1: ( ( ( rule__ModifyCell__CellAssignment_1 ) ) )
            // InternalMyCsv.g:3591:1: ( ( rule__ModifyCell__CellAssignment_1 ) )
            {
            // InternalMyCsv.g:3591:1: ( ( rule__ModifyCell__CellAssignment_1 ) )
            // InternalMyCsv.g:3592:2: ( rule__ModifyCell__CellAssignment_1 )
            {
             before(grammarAccess.getModifyCellAccess().getCellAssignment_1()); 
            // InternalMyCsv.g:3593:2: ( rule__ModifyCell__CellAssignment_1 )
            // InternalMyCsv.g:3593:3: rule__ModifyCell__CellAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModifyCell__CellAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModifyCellAccess().getCellAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyCell__Group__1__Impl"


    // $ANTLR start "rule__ModifyCell__Group__2"
    // InternalMyCsv.g:3601:1: rule__ModifyCell__Group__2 : rule__ModifyCell__Group__2__Impl rule__ModifyCell__Group__3 ;
    public final void rule__ModifyCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3605:1: ( rule__ModifyCell__Group__2__Impl rule__ModifyCell__Group__3 )
            // InternalMyCsv.g:3606:2: rule__ModifyCell__Group__2__Impl rule__ModifyCell__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ModifyCell__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifyCell__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyCell__Group__2"


    // $ANTLR start "rule__ModifyCell__Group__2__Impl"
    // InternalMyCsv.g:3613:1: rule__ModifyCell__Group__2__Impl : ( 'with' ) ;
    public final void rule__ModifyCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3617:1: ( ( 'with' ) )
            // InternalMyCsv.g:3618:1: ( 'with' )
            {
            // InternalMyCsv.g:3618:1: ( 'with' )
            // InternalMyCsv.g:3619:2: 'with'
            {
             before(grammarAccess.getModifyCellAccess().getWithKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getModifyCellAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyCell__Group__2__Impl"


    // $ANTLR start "rule__ModifyCell__Group__3"
    // InternalMyCsv.g:3628:1: rule__ModifyCell__Group__3 : rule__ModifyCell__Group__3__Impl ;
    public final void rule__ModifyCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3632:1: ( rule__ModifyCell__Group__3__Impl )
            // InternalMyCsv.g:3633:2: rule__ModifyCell__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModifyCell__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyCell__Group__3"


    // $ANTLR start "rule__ModifyCell__Group__3__Impl"
    // InternalMyCsv.g:3639:1: rule__ModifyCell__Group__3__Impl : ( ( rule__ModifyCell__ValueAssignment_3 ) ) ;
    public final void rule__ModifyCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3643:1: ( ( ( rule__ModifyCell__ValueAssignment_3 ) ) )
            // InternalMyCsv.g:3644:1: ( ( rule__ModifyCell__ValueAssignment_3 ) )
            {
            // InternalMyCsv.g:3644:1: ( ( rule__ModifyCell__ValueAssignment_3 ) )
            // InternalMyCsv.g:3645:2: ( rule__ModifyCell__ValueAssignment_3 )
            {
             before(grammarAccess.getModifyCellAccess().getValueAssignment_3()); 
            // InternalMyCsv.g:3646:2: ( rule__ModifyCell__ValueAssignment_3 )
            // InternalMyCsv.g:3646:3: rule__ModifyCell__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ModifyCell__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModifyCellAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyCell__Group__3__Impl"


    // $ANTLR start "rule__Print__Group__0"
    // InternalMyCsv.g:3655:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3659:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalMyCsv.g:3660:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Print__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0"


    // $ANTLR start "rule__Print__Group__0__Impl"
    // InternalMyCsv.g:3667:1: rule__Print__Group__0__Impl : ( 'Print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3671:1: ( ( 'Print' ) )
            // InternalMyCsv.g:3672:1: ( 'Print' )
            {
            // InternalMyCsv.g:3672:1: ( 'Print' )
            // InternalMyCsv.g:3673:2: 'Print'
            {
             before(grammarAccess.getPrintAccess().getPrintKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getPrintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0__Impl"


    // $ANTLR start "rule__Print__Group__1"
    // InternalMyCsv.g:3682:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3686:1: ( rule__Print__Group__1__Impl )
            // InternalMyCsv.g:3687:2: rule__Print__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1"


    // $ANTLR start "rule__Print__Group__1__Impl"
    // InternalMyCsv.g:3693:1: rule__Print__Group__1__Impl : ( ( rule__Print__Alternatives_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3697:1: ( ( ( rule__Print__Alternatives_1 ) ) )
            // InternalMyCsv.g:3698:1: ( ( rule__Print__Alternatives_1 ) )
            {
            // InternalMyCsv.g:3698:1: ( ( rule__Print__Alternatives_1 ) )
            // InternalMyCsv.g:3699:2: ( rule__Print__Alternatives_1 )
            {
             before(grammarAccess.getPrintAccess().getAlternatives_1()); 
            // InternalMyCsv.g:3700:2: ( rule__Print__Alternatives_1 )
            // InternalMyCsv.g:3700:3: rule__Print__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Print__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1__Impl"


    // $ANTLR start "rule__Print__Group_1_3__0"
    // InternalMyCsv.g:3709:1: rule__Print__Group_1_3__0 : rule__Print__Group_1_3__0__Impl rule__Print__Group_1_3__1 ;
    public final void rule__Print__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3713:1: ( rule__Print__Group_1_3__0__Impl rule__Print__Group_1_3__1 )
            // InternalMyCsv.g:3714:2: rule__Print__Group_1_3__0__Impl rule__Print__Group_1_3__1
            {
            pushFollow(FOLLOW_26);
            rule__Print__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group_1_3__0"


    // $ANTLR start "rule__Print__Group_1_3__0__Impl"
    // InternalMyCsv.g:3721:1: rule__Print__Group_1_3__0__Impl : ( () ) ;
    public final void rule__Print__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3725:1: ( ( () ) )
            // InternalMyCsv.g:3726:1: ( () )
            {
            // InternalMyCsv.g:3726:1: ( () )
            // InternalMyCsv.g:3727:2: ()
            {
             before(grammarAccess.getPrintAccess().getPrintTableAction_1_3_0()); 
            // InternalMyCsv.g:3728:2: ()
            // InternalMyCsv.g:3728:3: 
            {
            }

             after(grammarAccess.getPrintAccess().getPrintTableAction_1_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group_1_3__0__Impl"


    // $ANTLR start "rule__Print__Group_1_3__1"
    // InternalMyCsv.g:3736:1: rule__Print__Group_1_3__1 : rule__Print__Group_1_3__1__Impl ;
    public final void rule__Print__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3740:1: ( rule__Print__Group_1_3__1__Impl )
            // InternalMyCsv.g:3741:2: rule__Print__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group_1_3__1"


    // $ANTLR start "rule__Print__Group_1_3__1__Impl"
    // InternalMyCsv.g:3747:1: rule__Print__Group_1_3__1__Impl : ( rulePrintTable ) ;
    public final void rule__Print__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3751:1: ( ( rulePrintTable ) )
            // InternalMyCsv.g:3752:1: ( rulePrintTable )
            {
            // InternalMyCsv.g:3752:1: ( rulePrintTable )
            // InternalMyCsv.g:3753:2: rulePrintTable
            {
             before(grammarAccess.getPrintAccess().getPrintTableParserRuleCall_1_3_1()); 
            pushFollow(FOLLOW_2);
            rulePrintTable();

            state._fsp--;

             after(grammarAccess.getPrintAccess().getPrintTableParserRuleCall_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group_1_3__1__Impl"


    // $ANTLR start "rule__PrintLine__Group__0"
    // InternalMyCsv.g:3763:1: rule__PrintLine__Group__0 : rule__PrintLine__Group__0__Impl rule__PrintLine__Group__1 ;
    public final void rule__PrintLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3767:1: ( rule__PrintLine__Group__0__Impl rule__PrintLine__Group__1 )
            // InternalMyCsv.g:3768:2: rule__PrintLine__Group__0__Impl rule__PrintLine__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__PrintLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrintLine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLine__Group__0"


    // $ANTLR start "rule__PrintLine__Group__0__Impl"
    // InternalMyCsv.g:3775:1: rule__PrintLine__Group__0__Impl : ( 'line' ) ;
    public final void rule__PrintLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3779:1: ( ( 'line' ) )
            // InternalMyCsv.g:3780:1: ( 'line' )
            {
            // InternalMyCsv.g:3780:1: ( 'line' )
            // InternalMyCsv.g:3781:2: 'line'
            {
             before(grammarAccess.getPrintLineAccess().getLineKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPrintLineAccess().getLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLine__Group__0__Impl"


    // $ANTLR start "rule__PrintLine__Group__1"
    // InternalMyCsv.g:3790:1: rule__PrintLine__Group__1 : rule__PrintLine__Group__1__Impl ;
    public final void rule__PrintLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3794:1: ( rule__PrintLine__Group__1__Impl )
            // InternalMyCsv.g:3795:2: rule__PrintLine__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintLine__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLine__Group__1"


    // $ANTLR start "rule__PrintLine__Group__1__Impl"
    // InternalMyCsv.g:3801:1: rule__PrintLine__Group__1__Impl : ( ( rule__PrintLine__LinesAssignment_1 ) ) ;
    public final void rule__PrintLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3805:1: ( ( ( rule__PrintLine__LinesAssignment_1 ) ) )
            // InternalMyCsv.g:3806:1: ( ( rule__PrintLine__LinesAssignment_1 ) )
            {
            // InternalMyCsv.g:3806:1: ( ( rule__PrintLine__LinesAssignment_1 ) )
            // InternalMyCsv.g:3807:2: ( rule__PrintLine__LinesAssignment_1 )
            {
             before(grammarAccess.getPrintLineAccess().getLinesAssignment_1()); 
            // InternalMyCsv.g:3808:2: ( rule__PrintLine__LinesAssignment_1 )
            // InternalMyCsv.g:3808:3: rule__PrintLine__LinesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrintLine__LinesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintLineAccess().getLinesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLine__Group__1__Impl"


    // $ANTLR start "rule__PrintField__Group__0"
    // InternalMyCsv.g:3817:1: rule__PrintField__Group__0 : rule__PrintField__Group__0__Impl rule__PrintField__Group__1 ;
    public final void rule__PrintField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3821:1: ( rule__PrintField__Group__0__Impl rule__PrintField__Group__1 )
            // InternalMyCsv.g:3822:2: rule__PrintField__Group__0__Impl rule__PrintField__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__PrintField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrintField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintField__Group__0"


    // $ANTLR start "rule__PrintField__Group__0__Impl"
    // InternalMyCsv.g:3829:1: rule__PrintField__Group__0__Impl : ( 'field' ) ;
    public final void rule__PrintField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3833:1: ( ( 'field' ) )
            // InternalMyCsv.g:3834:1: ( 'field' )
            {
            // InternalMyCsv.g:3834:1: ( 'field' )
            // InternalMyCsv.g:3835:2: 'field'
            {
             before(grammarAccess.getPrintFieldAccess().getFieldKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPrintFieldAccess().getFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintField__Group__0__Impl"


    // $ANTLR start "rule__PrintField__Group__1"
    // InternalMyCsv.g:3844:1: rule__PrintField__Group__1 : rule__PrintField__Group__1__Impl ;
    public final void rule__PrintField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3848:1: ( rule__PrintField__Group__1__Impl )
            // InternalMyCsv.g:3849:2: rule__PrintField__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintField__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintField__Group__1"


    // $ANTLR start "rule__PrintField__Group__1__Impl"
    // InternalMyCsv.g:3855:1: rule__PrintField__Group__1__Impl : ( ( rule__PrintField__FieldsAssignment_1 ) ) ;
    public final void rule__PrintField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3859:1: ( ( ( rule__PrintField__FieldsAssignment_1 ) ) )
            // InternalMyCsv.g:3860:1: ( ( rule__PrintField__FieldsAssignment_1 ) )
            {
            // InternalMyCsv.g:3860:1: ( ( rule__PrintField__FieldsAssignment_1 ) )
            // InternalMyCsv.g:3861:2: ( rule__PrintField__FieldsAssignment_1 )
            {
             before(grammarAccess.getPrintFieldAccess().getFieldsAssignment_1()); 
            // InternalMyCsv.g:3862:2: ( rule__PrintField__FieldsAssignment_1 )
            // InternalMyCsv.g:3862:3: rule__PrintField__FieldsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrintField__FieldsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintFieldAccess().getFieldsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintField__Group__1__Impl"


    // $ANTLR start "rule__PrintCell__Group__0"
    // InternalMyCsv.g:3871:1: rule__PrintCell__Group__0 : rule__PrintCell__Group__0__Impl rule__PrintCell__Group__1 ;
    public final void rule__PrintCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3875:1: ( rule__PrintCell__Group__0__Impl rule__PrintCell__Group__1 )
            // InternalMyCsv.g:3876:2: rule__PrintCell__Group__0__Impl rule__PrintCell__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__PrintCell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrintCell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCell__Group__0"


    // $ANTLR start "rule__PrintCell__Group__0__Impl"
    // InternalMyCsv.g:3883:1: rule__PrintCell__Group__0__Impl : ( 'cell' ) ;
    public final void rule__PrintCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3887:1: ( ( 'cell' ) )
            // InternalMyCsv.g:3888:1: ( 'cell' )
            {
            // InternalMyCsv.g:3888:1: ( 'cell' )
            // InternalMyCsv.g:3889:2: 'cell'
            {
             before(grammarAccess.getPrintCellAccess().getCellKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPrintCellAccess().getCellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCell__Group__0__Impl"


    // $ANTLR start "rule__PrintCell__Group__1"
    // InternalMyCsv.g:3898:1: rule__PrintCell__Group__1 : rule__PrintCell__Group__1__Impl ;
    public final void rule__PrintCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3902:1: ( rule__PrintCell__Group__1__Impl )
            // InternalMyCsv.g:3903:2: rule__PrintCell__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintCell__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCell__Group__1"


    // $ANTLR start "rule__PrintCell__Group__1__Impl"
    // InternalMyCsv.g:3909:1: rule__PrintCell__Group__1__Impl : ( ( rule__PrintCell__CellAssignment_1 ) ) ;
    public final void rule__PrintCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3913:1: ( ( ( rule__PrintCell__CellAssignment_1 ) ) )
            // InternalMyCsv.g:3914:1: ( ( rule__PrintCell__CellAssignment_1 ) )
            {
            // InternalMyCsv.g:3914:1: ( ( rule__PrintCell__CellAssignment_1 ) )
            // InternalMyCsv.g:3915:2: ( rule__PrintCell__CellAssignment_1 )
            {
             before(grammarAccess.getPrintCellAccess().getCellAssignment_1()); 
            // InternalMyCsv.g:3916:2: ( rule__PrintCell__CellAssignment_1 )
            // InternalMyCsv.g:3916:3: rule__PrintCell__CellAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrintCell__CellAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintCellAccess().getCellAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCell__Group__1__Impl"


    // $ANTLR start "rule__PrintExpr__Group__0"
    // InternalMyCsv.g:3925:1: rule__PrintExpr__Group__0 : rule__PrintExpr__Group__0__Impl rule__PrintExpr__Group__1 ;
    public final void rule__PrintExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3929:1: ( rule__PrintExpr__Group__0__Impl rule__PrintExpr__Group__1 )
            // InternalMyCsv.g:3930:2: rule__PrintExpr__Group__0__Impl rule__PrintExpr__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PrintExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrintExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintExpr__Group__0"


    // $ANTLR start "rule__PrintExpr__Group__0__Impl"
    // InternalMyCsv.g:3937:1: rule__PrintExpr__Group__0__Impl : ( 'expr' ) ;
    public final void rule__PrintExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3941:1: ( ( 'expr' ) )
            // InternalMyCsv.g:3942:1: ( 'expr' )
            {
            // InternalMyCsv.g:3942:1: ( 'expr' )
            // InternalMyCsv.g:3943:2: 'expr'
            {
             before(grammarAccess.getPrintExprAccess().getExprKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPrintExprAccess().getExprKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintExpr__Group__0__Impl"


    // $ANTLR start "rule__PrintExpr__Group__1"
    // InternalMyCsv.g:3952:1: rule__PrintExpr__Group__1 : rule__PrintExpr__Group__1__Impl ;
    public final void rule__PrintExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3956:1: ( rule__PrintExpr__Group__1__Impl )
            // InternalMyCsv.g:3957:2: rule__PrintExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintExpr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintExpr__Group__1"


    // $ANTLR start "rule__PrintExpr__Group__1__Impl"
    // InternalMyCsv.g:3963:1: rule__PrintExpr__Group__1__Impl : ( ( rule__PrintExpr__ExpAssignment_1 ) ) ;
    public final void rule__PrintExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3967:1: ( ( ( rule__PrintExpr__ExpAssignment_1 ) ) )
            // InternalMyCsv.g:3968:1: ( ( rule__PrintExpr__ExpAssignment_1 ) )
            {
            // InternalMyCsv.g:3968:1: ( ( rule__PrintExpr__ExpAssignment_1 ) )
            // InternalMyCsv.g:3969:2: ( rule__PrintExpr__ExpAssignment_1 )
            {
             before(grammarAccess.getPrintExprAccess().getExpAssignment_1()); 
            // InternalMyCsv.g:3970:2: ( rule__PrintExpr__ExpAssignment_1 )
            // InternalMyCsv.g:3970:3: rule__PrintExpr__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrintExpr__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintExprAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintExpr__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalMyCsv.g:3979:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3983:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalMyCsv.g:3984:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalMyCsv.g:3991:1: rule__OrExpression__Group__0__Impl : ( ( rule__OrExpression__LhsAssignment_0 ) ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:3995:1: ( ( ( rule__OrExpression__LhsAssignment_0 ) ) )
            // InternalMyCsv.g:3996:1: ( ( rule__OrExpression__LhsAssignment_0 ) )
            {
            // InternalMyCsv.g:3996:1: ( ( rule__OrExpression__LhsAssignment_0 ) )
            // InternalMyCsv.g:3997:2: ( rule__OrExpression__LhsAssignment_0 )
            {
             before(grammarAccess.getOrExpressionAccess().getLhsAssignment_0()); 
            // InternalMyCsv.g:3998:2: ( rule__OrExpression__LhsAssignment_0 )
            // InternalMyCsv.g:3998:3: rule__OrExpression__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalMyCsv.g:4006:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4010:1: ( rule__OrExpression__Group__1__Impl )
            // InternalMyCsv.g:4011:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalMyCsv.g:4017:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4021:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalMyCsv.g:4022:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalMyCsv.g:4022:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalMyCsv.g:4023:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalMyCsv.g:4024:2: ( rule__OrExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==50) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyCsv.g:4024:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalMyCsv.g:4033:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4037:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalMyCsv.g:4038:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalMyCsv.g:4045:1: rule__OrExpression__Group_1__0__Impl : ( 'or' ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4049:1: ( ( 'or' ) )
            // InternalMyCsv.g:4050:1: ( 'or' )
            {
            // InternalMyCsv.g:4050:1: ( 'or' )
            // InternalMyCsv.g:4051:2: 'or'
            {
             before(grammarAccess.getOrExpressionAccess().getOrKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getOrExpressionAccess().getOrKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalMyCsv.g:4060:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4064:1: ( rule__OrExpression__Group_1__1__Impl )
            // InternalMyCsv.g:4065:2: rule__OrExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalMyCsv.g:4071:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__RhsAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4075:1: ( ( ( rule__OrExpression__RhsAssignment_1_1 ) ) )
            // InternalMyCsv.g:4076:1: ( ( rule__OrExpression__RhsAssignment_1_1 ) )
            {
            // InternalMyCsv.g:4076:1: ( ( rule__OrExpression__RhsAssignment_1_1 ) )
            // InternalMyCsv.g:4077:2: ( rule__OrExpression__RhsAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getRhsAssignment_1_1()); 
            // InternalMyCsv.g:4078:2: ( rule__OrExpression__RhsAssignment_1_1 )
            // InternalMyCsv.g:4078:3: rule__OrExpression__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__RhsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRhsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalMyCsv.g:4087:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4091:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalMyCsv.g:4092:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalMyCsv.g:4099:1: rule__AndExpression__Group__0__Impl : ( ( rule__AndExpression__LhsAssignment_0 ) ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4103:1: ( ( ( rule__AndExpression__LhsAssignment_0 ) ) )
            // InternalMyCsv.g:4104:1: ( ( rule__AndExpression__LhsAssignment_0 ) )
            {
            // InternalMyCsv.g:4104:1: ( ( rule__AndExpression__LhsAssignment_0 ) )
            // InternalMyCsv.g:4105:2: ( rule__AndExpression__LhsAssignment_0 )
            {
             before(grammarAccess.getAndExpressionAccess().getLhsAssignment_0()); 
            // InternalMyCsv.g:4106:2: ( rule__AndExpression__LhsAssignment_0 )
            // InternalMyCsv.g:4106:3: rule__AndExpression__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalMyCsv.g:4114:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4118:1: ( rule__AndExpression__Group__1__Impl )
            // InternalMyCsv.g:4119:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalMyCsv.g:4125:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4129:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalMyCsv.g:4130:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalMyCsv.g:4130:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalMyCsv.g:4131:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalMyCsv.g:4132:2: ( rule__AndExpression__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==51) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyCsv.g:4132:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalMyCsv.g:4141:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4145:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalMyCsv.g:4146:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalMyCsv.g:4153:1: rule__AndExpression__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4157:1: ( ( 'and' ) )
            // InternalMyCsv.g:4158:1: ( 'and' )
            {
            // InternalMyCsv.g:4158:1: ( 'and' )
            // InternalMyCsv.g:4159:2: 'and'
            {
             before(grammarAccess.getAndExpressionAccess().getAndKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAndExpressionAccess().getAndKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalMyCsv.g:4168:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4172:1: ( rule__AndExpression__Group_1__1__Impl )
            // InternalMyCsv.g:4173:2: rule__AndExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalMyCsv.g:4179:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RhsAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4183:1: ( ( ( rule__AndExpression__RhsAssignment_1_1 ) ) )
            // InternalMyCsv.g:4184:1: ( ( rule__AndExpression__RhsAssignment_1_1 ) )
            {
            // InternalMyCsv.g:4184:1: ( ( rule__AndExpression__RhsAssignment_1_1 ) )
            // InternalMyCsv.g:4185:2: ( rule__AndExpression__RhsAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getRhsAssignment_1_1()); 
            // InternalMyCsv.g:4186:2: ( rule__AndExpression__RhsAssignment_1_1 )
            // InternalMyCsv.g:4186:3: rule__AndExpression__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RhsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRhsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryLogExpression__Group__0"
    // InternalMyCsv.g:4195:1: rule__UnaryLogExpression__Group__0 : rule__UnaryLogExpression__Group__0__Impl rule__UnaryLogExpression__Group__1 ;
    public final void rule__UnaryLogExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4199:1: ( rule__UnaryLogExpression__Group__0__Impl rule__UnaryLogExpression__Group__1 )
            // InternalMyCsv.g:4200:2: rule__UnaryLogExpression__Group__0__Impl rule__UnaryLogExpression__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__UnaryLogExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryLogExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryLogExpression__Group__0"


    // $ANTLR start "rule__UnaryLogExpression__Group__0__Impl"
    // InternalMyCsv.g:4207:1: rule__UnaryLogExpression__Group__0__Impl : ( ( rule__UnaryLogExpression__NotAssignment_0 )? ) ;
    public final void rule__UnaryLogExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4211:1: ( ( ( rule__UnaryLogExpression__NotAssignment_0 )? ) )
            // InternalMyCsv.g:4212:1: ( ( rule__UnaryLogExpression__NotAssignment_0 )? )
            {
            // InternalMyCsv.g:4212:1: ( ( rule__UnaryLogExpression__NotAssignment_0 )? )
            // InternalMyCsv.g:4213:2: ( rule__UnaryLogExpression__NotAssignment_0 )?
            {
             before(grammarAccess.getUnaryLogExpressionAccess().getNotAssignment_0()); 
            // InternalMyCsv.g:4214:2: ( rule__UnaryLogExpression__NotAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==55) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyCsv.g:4214:3: rule__UnaryLogExpression__NotAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryLogExpression__NotAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnaryLogExpressionAccess().getNotAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryLogExpression__Group__0__Impl"


    // $ANTLR start "rule__UnaryLogExpression__Group__1"
    // InternalMyCsv.g:4222:1: rule__UnaryLogExpression__Group__1 : rule__UnaryLogExpression__Group__1__Impl ;
    public final void rule__UnaryLogExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4226:1: ( rule__UnaryLogExpression__Group__1__Impl )
            // InternalMyCsv.g:4227:2: rule__UnaryLogExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryLogExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryLogExpression__Group__1"


    // $ANTLR start "rule__UnaryLogExpression__Group__1__Impl"
    // InternalMyCsv.g:4233:1: rule__UnaryLogExpression__Group__1__Impl : ( ( rule__UnaryLogExpression__ExprAssignment_1 ) ) ;
    public final void rule__UnaryLogExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4237:1: ( ( ( rule__UnaryLogExpression__ExprAssignment_1 ) ) )
            // InternalMyCsv.g:4238:1: ( ( rule__UnaryLogExpression__ExprAssignment_1 ) )
            {
            // InternalMyCsv.g:4238:1: ( ( rule__UnaryLogExpression__ExprAssignment_1 ) )
            // InternalMyCsv.g:4239:2: ( rule__UnaryLogExpression__ExprAssignment_1 )
            {
             before(grammarAccess.getUnaryLogExpressionAccess().getExprAssignment_1()); 
            // InternalMyCsv.g:4240:2: ( rule__UnaryLogExpression__ExprAssignment_1 )
            // InternalMyCsv.g:4240:3: rule__UnaryLogExpression__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryLogExpression__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryLogExpressionAccess().getExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryLogExpression__Group__1__Impl"


    // $ANTLR start "rule__NestedLogExpression__Group__0"
    // InternalMyCsv.g:4249:1: rule__NestedLogExpression__Group__0 : rule__NestedLogExpression__Group__0__Impl rule__NestedLogExpression__Group__1 ;
    public final void rule__NestedLogExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4253:1: ( rule__NestedLogExpression__Group__0__Impl rule__NestedLogExpression__Group__1 )
            // InternalMyCsv.g:4254:2: rule__NestedLogExpression__Group__0__Impl rule__NestedLogExpression__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__NestedLogExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedLogExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedLogExpression__Group__0"


    // $ANTLR start "rule__NestedLogExpression__Group__0__Impl"
    // InternalMyCsv.g:4261:1: rule__NestedLogExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__NestedLogExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4265:1: ( ( '(' ) )
            // InternalMyCsv.g:4266:1: ( '(' )
            {
            // InternalMyCsv.g:4266:1: ( '(' )
            // InternalMyCsv.g:4267:2: '('
            {
             before(grammarAccess.getNestedLogExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNestedLogExpressionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedLogExpression__Group__0__Impl"


    // $ANTLR start "rule__NestedLogExpression__Group__1"
    // InternalMyCsv.g:4276:1: rule__NestedLogExpression__Group__1 : rule__NestedLogExpression__Group__1__Impl rule__NestedLogExpression__Group__2 ;
    public final void rule__NestedLogExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4280:1: ( rule__NestedLogExpression__Group__1__Impl rule__NestedLogExpression__Group__2 )
            // InternalMyCsv.g:4281:2: rule__NestedLogExpression__Group__1__Impl rule__NestedLogExpression__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__NestedLogExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedLogExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedLogExpression__Group__1"


    // $ANTLR start "rule__NestedLogExpression__Group__1__Impl"
    // InternalMyCsv.g:4288:1: rule__NestedLogExpression__Group__1__Impl : ( ( rule__NestedLogExpression__ExprAssignment_1 ) ) ;
    public final void rule__NestedLogExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4292:1: ( ( ( rule__NestedLogExpression__ExprAssignment_1 ) ) )
            // InternalMyCsv.g:4293:1: ( ( rule__NestedLogExpression__ExprAssignment_1 ) )
            {
            // InternalMyCsv.g:4293:1: ( ( rule__NestedLogExpression__ExprAssignment_1 ) )
            // InternalMyCsv.g:4294:2: ( rule__NestedLogExpression__ExprAssignment_1 )
            {
             before(grammarAccess.getNestedLogExpressionAccess().getExprAssignment_1()); 
            // InternalMyCsv.g:4295:2: ( rule__NestedLogExpression__ExprAssignment_1 )
            // InternalMyCsv.g:4295:3: rule__NestedLogExpression__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NestedLogExpression__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNestedLogExpressionAccess().getExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedLogExpression__Group__1__Impl"


    // $ANTLR start "rule__NestedLogExpression__Group__2"
    // InternalMyCsv.g:4303:1: rule__NestedLogExpression__Group__2 : rule__NestedLogExpression__Group__2__Impl ;
    public final void rule__NestedLogExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4307:1: ( rule__NestedLogExpression__Group__2__Impl )
            // InternalMyCsv.g:4308:2: rule__NestedLogExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NestedLogExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedLogExpression__Group__2"


    // $ANTLR start "rule__NestedLogExpression__Group__2__Impl"
    // InternalMyCsv.g:4314:1: rule__NestedLogExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__NestedLogExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4318:1: ( ( ')' ) )
            // InternalMyCsv.g:4319:1: ( ')' )
            {
            // InternalMyCsv.g:4319:1: ( ')' )
            // InternalMyCsv.g:4320:2: ')'
            {
             before(grammarAccess.getNestedLogExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNestedLogExpressionAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedLogExpression__Group__2__Impl"


    // $ANTLR start "rule__ExpressionRel__Group__0"
    // InternalMyCsv.g:4330:1: rule__ExpressionRel__Group__0 : rule__ExpressionRel__Group__0__Impl rule__ExpressionRel__Group__1 ;
    public final void rule__ExpressionRel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4334:1: ( rule__ExpressionRel__Group__0__Impl rule__ExpressionRel__Group__1 )
            // InternalMyCsv.g:4335:2: rule__ExpressionRel__Group__0__Impl rule__ExpressionRel__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__ExpressionRel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionRel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionRel__Group__0"


    // $ANTLR start "rule__ExpressionRel__Group__0__Impl"
    // InternalMyCsv.g:4342:1: rule__ExpressionRel__Group__0__Impl : ( ( rule__ExpressionRel__FieldAssignment_0 ) ) ;
    public final void rule__ExpressionRel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4346:1: ( ( ( rule__ExpressionRel__FieldAssignment_0 ) ) )
            // InternalMyCsv.g:4347:1: ( ( rule__ExpressionRel__FieldAssignment_0 ) )
            {
            // InternalMyCsv.g:4347:1: ( ( rule__ExpressionRel__FieldAssignment_0 ) )
            // InternalMyCsv.g:4348:2: ( rule__ExpressionRel__FieldAssignment_0 )
            {
             before(grammarAccess.getExpressionRelAccess().getFieldAssignment_0()); 
            // InternalMyCsv.g:4349:2: ( rule__ExpressionRel__FieldAssignment_0 )
            // InternalMyCsv.g:4349:3: rule__ExpressionRel__FieldAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionRel__FieldAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionRelAccess().getFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionRel__Group__0__Impl"


    // $ANTLR start "rule__ExpressionRel__Group__1"
    // InternalMyCsv.g:4357:1: rule__ExpressionRel__Group__1 : rule__ExpressionRel__Group__1__Impl rule__ExpressionRel__Group__2 ;
    public final void rule__ExpressionRel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4361:1: ( rule__ExpressionRel__Group__1__Impl rule__ExpressionRel__Group__2 )
            // InternalMyCsv.g:4362:2: rule__ExpressionRel__Group__1__Impl rule__ExpressionRel__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ExpressionRel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionRel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionRel__Group__1"


    // $ANTLR start "rule__ExpressionRel__Group__1__Impl"
    // InternalMyCsv.g:4369:1: rule__ExpressionRel__Group__1__Impl : ( ( rule__ExpressionRel__OpAssignment_1 ) ) ;
    public final void rule__ExpressionRel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4373:1: ( ( ( rule__ExpressionRel__OpAssignment_1 ) ) )
            // InternalMyCsv.g:4374:1: ( ( rule__ExpressionRel__OpAssignment_1 ) )
            {
            // InternalMyCsv.g:4374:1: ( ( rule__ExpressionRel__OpAssignment_1 ) )
            // InternalMyCsv.g:4375:2: ( rule__ExpressionRel__OpAssignment_1 )
            {
             before(grammarAccess.getExpressionRelAccess().getOpAssignment_1()); 
            // InternalMyCsv.g:4376:2: ( rule__ExpressionRel__OpAssignment_1 )
            // InternalMyCsv.g:4376:3: rule__ExpressionRel__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionRel__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionRelAccess().getOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionRel__Group__1__Impl"


    // $ANTLR start "rule__ExpressionRel__Group__2"
    // InternalMyCsv.g:4384:1: rule__ExpressionRel__Group__2 : rule__ExpressionRel__Group__2__Impl ;
    public final void rule__ExpressionRel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4388:1: ( rule__ExpressionRel__Group__2__Impl )
            // InternalMyCsv.g:4389:2: rule__ExpressionRel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionRel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionRel__Group__2"


    // $ANTLR start "rule__ExpressionRel__Group__2__Impl"
    // InternalMyCsv.g:4395:1: rule__ExpressionRel__Group__2__Impl : ( ( rule__ExpressionRel__ValAssignment_2 ) ) ;
    public final void rule__ExpressionRel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4399:1: ( ( ( rule__ExpressionRel__ValAssignment_2 ) ) )
            // InternalMyCsv.g:4400:1: ( ( rule__ExpressionRel__ValAssignment_2 ) )
            {
            // InternalMyCsv.g:4400:1: ( ( rule__ExpressionRel__ValAssignment_2 ) )
            // InternalMyCsv.g:4401:2: ( rule__ExpressionRel__ValAssignment_2 )
            {
             before(grammarAccess.getExpressionRelAccess().getValAssignment_2()); 
            // InternalMyCsv.g:4402:2: ( rule__ExpressionRel__ValAssignment_2 )
            // InternalMyCsv.g:4402:3: rule__ExpressionRel__ValAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionRel__ValAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionRelAccess().getValAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionRel__Group__2__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__0"
    // InternalMyCsv.g:4411:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4415:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalMyCsv.g:4416:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__AdditiveExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__0"


    // $ANTLR start "rule__AdditiveExpression__Group__0__Impl"
    // InternalMyCsv.g:4423:1: rule__AdditiveExpression__Group__0__Impl : ( ( rule__AdditiveExpression__LhsAssignment_0 ) ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4427:1: ( ( ( rule__AdditiveExpression__LhsAssignment_0 ) ) )
            // InternalMyCsv.g:4428:1: ( ( rule__AdditiveExpression__LhsAssignment_0 ) )
            {
            // InternalMyCsv.g:4428:1: ( ( rule__AdditiveExpression__LhsAssignment_0 ) )
            // InternalMyCsv.g:4429:2: ( rule__AdditiveExpression__LhsAssignment_0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getLhsAssignment_0()); 
            // InternalMyCsv.g:4430:2: ( rule__AdditiveExpression__LhsAssignment_0 )
            // InternalMyCsv.g:4430:3: rule__AdditiveExpression__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__1"
    // InternalMyCsv.g:4438:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4442:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalMyCsv.g:4443:2: rule__AdditiveExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__1"


    // $ANTLR start "rule__AdditiveExpression__Group__1__Impl"
    // InternalMyCsv.g:4449:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__RhsAssignment_1 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4453:1: ( ( ( rule__AdditiveExpression__RhsAssignment_1 )* ) )
            // InternalMyCsv.g:4454:1: ( ( rule__AdditiveExpression__RhsAssignment_1 )* )
            {
            // InternalMyCsv.g:4454:1: ( ( rule__AdditiveExpression__RhsAssignment_1 )* )
            // InternalMyCsv.g:4455:2: ( rule__AdditiveExpression__RhsAssignment_1 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getRhsAssignment_1()); 
            // InternalMyCsv.g:4456:2: ( rule__AdditiveExpression__RhsAssignment_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=23 && LA30_0<=24)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyCsv.g:4456:3: rule__AdditiveExpression__RhsAssignment_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__AdditiveExpression__RhsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getAdditiveExpressionAccess().getRhsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditiveExpressionRhs__Group__0"
    // InternalMyCsv.g:4465:1: rule__AdditiveExpressionRhs__Group__0 : rule__AdditiveExpressionRhs__Group__0__Impl rule__AdditiveExpressionRhs__Group__1 ;
    public final void rule__AdditiveExpressionRhs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4469:1: ( rule__AdditiveExpressionRhs__Group__0__Impl rule__AdditiveExpressionRhs__Group__1 )
            // InternalMyCsv.g:4470:2: rule__AdditiveExpressionRhs__Group__0__Impl rule__AdditiveExpressionRhs__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__AdditiveExpressionRhs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpressionRhs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpressionRhs__Group__0"


    // $ANTLR start "rule__AdditiveExpressionRhs__Group__0__Impl"
    // InternalMyCsv.g:4477:1: rule__AdditiveExpressionRhs__Group__0__Impl : ( ( rule__AdditiveExpressionRhs__OpAssignment_0 ) ) ;
    public final void rule__AdditiveExpressionRhs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4481:1: ( ( ( rule__AdditiveExpressionRhs__OpAssignment_0 ) ) )
            // InternalMyCsv.g:4482:1: ( ( rule__AdditiveExpressionRhs__OpAssignment_0 ) )
            {
            // InternalMyCsv.g:4482:1: ( ( rule__AdditiveExpressionRhs__OpAssignment_0 ) )
            // InternalMyCsv.g:4483:2: ( rule__AdditiveExpressionRhs__OpAssignment_0 )
            {
             before(grammarAccess.getAdditiveExpressionRhsAccess().getOpAssignment_0()); 
            // InternalMyCsv.g:4484:2: ( rule__AdditiveExpressionRhs__OpAssignment_0 )
            // InternalMyCsv.g:4484:3: rule__AdditiveExpressionRhs__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpressionRhs__OpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionRhsAccess().getOpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpressionRhs__Group__0__Impl"


    // $ANTLR start "rule__AdditiveExpressionRhs__Group__1"
    // InternalMyCsv.g:4492:1: rule__AdditiveExpressionRhs__Group__1 : rule__AdditiveExpressionRhs__Group__1__Impl ;
    public final void rule__AdditiveExpressionRhs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4496:1: ( rule__AdditiveExpressionRhs__Group__1__Impl )
            // InternalMyCsv.g:4497:2: rule__AdditiveExpressionRhs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpressionRhs__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpressionRhs__Group__1"


    // $ANTLR start "rule__AdditiveExpressionRhs__Group__1__Impl"
    // InternalMyCsv.g:4503:1: rule__AdditiveExpressionRhs__Group__1__Impl : ( ( rule__AdditiveExpressionRhs__RhsAssignment_1 ) ) ;
    public final void rule__AdditiveExpressionRhs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4507:1: ( ( ( rule__AdditiveExpressionRhs__RhsAssignment_1 ) ) )
            // InternalMyCsv.g:4508:1: ( ( rule__AdditiveExpressionRhs__RhsAssignment_1 ) )
            {
            // InternalMyCsv.g:4508:1: ( ( rule__AdditiveExpressionRhs__RhsAssignment_1 ) )
            // InternalMyCsv.g:4509:2: ( rule__AdditiveExpressionRhs__RhsAssignment_1 )
            {
             before(grammarAccess.getAdditiveExpressionRhsAccess().getRhsAssignment_1()); 
            // InternalMyCsv.g:4510:2: ( rule__AdditiveExpressionRhs__RhsAssignment_1 )
            // InternalMyCsv.g:4510:3: rule__AdditiveExpressionRhs__RhsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpressionRhs__RhsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionRhsAccess().getRhsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpressionRhs__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0"
    // InternalMyCsv.g:4519:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4523:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalMyCsv.g:4524:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0__Impl"
    // InternalMyCsv.g:4531:1: rule__MultiplicativeExpression__Group__0__Impl : ( ( rule__MultiplicativeExpression__LhsAssignment_0 ) ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4535:1: ( ( ( rule__MultiplicativeExpression__LhsAssignment_0 ) ) )
            // InternalMyCsv.g:4536:1: ( ( rule__MultiplicativeExpression__LhsAssignment_0 ) )
            {
            // InternalMyCsv.g:4536:1: ( ( rule__MultiplicativeExpression__LhsAssignment_0 ) )
            // InternalMyCsv.g:4537:2: ( rule__MultiplicativeExpression__LhsAssignment_0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getLhsAssignment_0()); 
            // InternalMyCsv.g:4538:2: ( rule__MultiplicativeExpression__LhsAssignment_0 )
            // InternalMyCsv.g:4538:3: rule__MultiplicativeExpression__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1"
    // InternalMyCsv.g:4546:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4550:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalMyCsv.g:4551:2: rule__MultiplicativeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1__Impl"
    // InternalMyCsv.g:4557:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__RhsAssignment_1 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4561:1: ( ( ( rule__MultiplicativeExpression__RhsAssignment_1 )* ) )
            // InternalMyCsv.g:4562:1: ( ( rule__MultiplicativeExpression__RhsAssignment_1 )* )
            {
            // InternalMyCsv.g:4562:1: ( ( rule__MultiplicativeExpression__RhsAssignment_1 )* )
            // InternalMyCsv.g:4563:2: ( rule__MultiplicativeExpression__RhsAssignment_1 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getRhsAssignment_1()); 
            // InternalMyCsv.g:4564:2: ( rule__MultiplicativeExpression__RhsAssignment_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=25 && LA31_0<=26)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyCsv.g:4564:3: rule__MultiplicativeExpression__RhsAssignment_1
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__MultiplicativeExpression__RhsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getMultiplicativeExpressionAccess().getRhsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpressionRhs__Group__0"
    // InternalMyCsv.g:4573:1: rule__MultiplicativeExpressionRhs__Group__0 : rule__MultiplicativeExpressionRhs__Group__0__Impl rule__MultiplicativeExpressionRhs__Group__1 ;
    public final void rule__MultiplicativeExpressionRhs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4577:1: ( rule__MultiplicativeExpressionRhs__Group__0__Impl rule__MultiplicativeExpressionRhs__Group__1 )
            // InternalMyCsv.g:4578:2: rule__MultiplicativeExpressionRhs__Group__0__Impl rule__MultiplicativeExpressionRhs__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__MultiplicativeExpressionRhs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpressionRhs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpressionRhs__Group__0"


    // $ANTLR start "rule__MultiplicativeExpressionRhs__Group__0__Impl"
    // InternalMyCsv.g:4585:1: rule__MultiplicativeExpressionRhs__Group__0__Impl : ( ( rule__MultiplicativeExpressionRhs__OpAssignment_0 ) ) ;
    public final void rule__MultiplicativeExpressionRhs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4589:1: ( ( ( rule__MultiplicativeExpressionRhs__OpAssignment_0 ) ) )
            // InternalMyCsv.g:4590:1: ( ( rule__MultiplicativeExpressionRhs__OpAssignment_0 ) )
            {
            // InternalMyCsv.g:4590:1: ( ( rule__MultiplicativeExpressionRhs__OpAssignment_0 ) )
            // InternalMyCsv.g:4591:2: ( rule__MultiplicativeExpressionRhs__OpAssignment_0 )
            {
             before(grammarAccess.getMultiplicativeExpressionRhsAccess().getOpAssignment_0()); 
            // InternalMyCsv.g:4592:2: ( rule__MultiplicativeExpressionRhs__OpAssignment_0 )
            // InternalMyCsv.g:4592:3: rule__MultiplicativeExpressionRhs__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpressionRhs__OpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionRhsAccess().getOpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpressionRhs__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpressionRhs__Group__1"
    // InternalMyCsv.g:4600:1: rule__MultiplicativeExpressionRhs__Group__1 : rule__MultiplicativeExpressionRhs__Group__1__Impl ;
    public final void rule__MultiplicativeExpressionRhs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4604:1: ( rule__MultiplicativeExpressionRhs__Group__1__Impl )
            // InternalMyCsv.g:4605:2: rule__MultiplicativeExpressionRhs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpressionRhs__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpressionRhs__Group__1"


    // $ANTLR start "rule__MultiplicativeExpressionRhs__Group__1__Impl"
    // InternalMyCsv.g:4611:1: rule__MultiplicativeExpressionRhs__Group__1__Impl : ( ( rule__MultiplicativeExpressionRhs__RhsAssignment_1 ) ) ;
    public final void rule__MultiplicativeExpressionRhs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4615:1: ( ( ( rule__MultiplicativeExpressionRhs__RhsAssignment_1 ) ) )
            // InternalMyCsv.g:4616:1: ( ( rule__MultiplicativeExpressionRhs__RhsAssignment_1 ) )
            {
            // InternalMyCsv.g:4616:1: ( ( rule__MultiplicativeExpressionRhs__RhsAssignment_1 ) )
            // InternalMyCsv.g:4617:2: ( rule__MultiplicativeExpressionRhs__RhsAssignment_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionRhsAccess().getRhsAssignment_1()); 
            // InternalMyCsv.g:4618:2: ( rule__MultiplicativeExpressionRhs__RhsAssignment_1 )
            // InternalMyCsv.g:4618:3: rule__MultiplicativeExpressionRhs__RhsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpressionRhs__RhsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionRhsAccess().getRhsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpressionRhs__Group__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__0"
    // InternalMyCsv.g:4627:1: rule__UnaryExpression__Group__0 : rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 ;
    public final void rule__UnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4631:1: ( rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 )
            // InternalMyCsv.g:4632:2: rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__UnaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__0"


    // $ANTLR start "rule__UnaryExpression__Group__0__Impl"
    // InternalMyCsv.g:4639:1: rule__UnaryExpression__Group__0__Impl : ( ( rule__UnaryExpression__OpAssignment_0 )? ) ;
    public final void rule__UnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4643:1: ( ( ( rule__UnaryExpression__OpAssignment_0 )? ) )
            // InternalMyCsv.g:4644:1: ( ( rule__UnaryExpression__OpAssignment_0 )? )
            {
            // InternalMyCsv.g:4644:1: ( ( rule__UnaryExpression__OpAssignment_0 )? )
            // InternalMyCsv.g:4645:2: ( rule__UnaryExpression__OpAssignment_0 )?
            {
             before(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0()); 
            // InternalMyCsv.g:4646:2: ( rule__UnaryExpression__OpAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyCsv.g:4646:3: rule__UnaryExpression__OpAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryExpression__OpAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__1"
    // InternalMyCsv.g:4654:1: rule__UnaryExpression__Group__1 : rule__UnaryExpression__Group__1__Impl ;
    public final void rule__UnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4658:1: ( rule__UnaryExpression__Group__1__Impl )
            // InternalMyCsv.g:4659:2: rule__UnaryExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__1"


    // $ANTLR start "rule__UnaryExpression__Group__1__Impl"
    // InternalMyCsv.g:4665:1: rule__UnaryExpression__Group__1__Impl : ( ( rule__UnaryExpression__ExprAssignment_1 ) ) ;
    public final void rule__UnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4669:1: ( ( ( rule__UnaryExpression__ExprAssignment_1 ) ) )
            // InternalMyCsv.g:4670:1: ( ( rule__UnaryExpression__ExprAssignment_1 ) )
            {
            // InternalMyCsv.g:4670:1: ( ( rule__UnaryExpression__ExprAssignment_1 ) )
            // InternalMyCsv.g:4671:2: ( rule__UnaryExpression__ExprAssignment_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getExprAssignment_1()); 
            // InternalMyCsv.g:4672:2: ( rule__UnaryExpression__ExprAssignment_1 )
            // InternalMyCsv.g:4672:3: rule__UnaryExpression__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__1__Impl"


    // $ANTLR start "rule__ExpressionCalculPrimary__Group_0__0"
    // InternalMyCsv.g:4681:1: rule__ExpressionCalculPrimary__Group_0__0 : rule__ExpressionCalculPrimary__Group_0__0__Impl rule__ExpressionCalculPrimary__Group_0__1 ;
    public final void rule__ExpressionCalculPrimary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4685:1: ( rule__ExpressionCalculPrimary__Group_0__0__Impl rule__ExpressionCalculPrimary__Group_0__1 )
            // InternalMyCsv.g:4686:2: rule__ExpressionCalculPrimary__Group_0__0__Impl rule__ExpressionCalculPrimary__Group_0__1
            {
            pushFollow(FOLLOW_38);
            rule__ExpressionCalculPrimary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionCalculPrimary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionCalculPrimary__Group_0__0"


    // $ANTLR start "rule__ExpressionCalculPrimary__Group_0__0__Impl"
    // InternalMyCsv.g:4693:1: rule__ExpressionCalculPrimary__Group_0__0__Impl : ( () ) ;
    public final void rule__ExpressionCalculPrimary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4697:1: ( ( () ) )
            // InternalMyCsv.g:4698:1: ( () )
            {
            // InternalMyCsv.g:4698:1: ( () )
            // InternalMyCsv.g:4699:2: ()
            {
             before(grammarAccess.getExpressionCalculPrimaryAccess().getNbFieldAction_0_0()); 
            // InternalMyCsv.g:4700:2: ()
            // InternalMyCsv.g:4700:3: 
            {
            }

             after(grammarAccess.getExpressionCalculPrimaryAccess().getNbFieldAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionCalculPrimary__Group_0__0__Impl"


    // $ANTLR start "rule__ExpressionCalculPrimary__Group_0__1"
    // InternalMyCsv.g:4708:1: rule__ExpressionCalculPrimary__Group_0__1 : rule__ExpressionCalculPrimary__Group_0__1__Impl ;
    public final void rule__ExpressionCalculPrimary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4712:1: ( rule__ExpressionCalculPrimary__Group_0__1__Impl )
            // InternalMyCsv.g:4713:2: rule__ExpressionCalculPrimary__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionCalculPrimary__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionCalculPrimary__Group_0__1"


    // $ANTLR start "rule__ExpressionCalculPrimary__Group_0__1__Impl"
    // InternalMyCsv.g:4719:1: rule__ExpressionCalculPrimary__Group_0__1__Impl : ( ruleNbField ) ;
    public final void rule__ExpressionCalculPrimary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4723:1: ( ( ruleNbField ) )
            // InternalMyCsv.g:4724:1: ( ruleNbField )
            {
            // InternalMyCsv.g:4724:1: ( ruleNbField )
            // InternalMyCsv.g:4725:2: ruleNbField
            {
             before(grammarAccess.getExpressionCalculPrimaryAccess().getNbFieldParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleNbField();

            state._fsp--;

             after(grammarAccess.getExpressionCalculPrimaryAccess().getNbFieldParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionCalculPrimary__Group_0__1__Impl"


    // $ANTLR start "rule__AggregatExpression__Group__0"
    // InternalMyCsv.g:4735:1: rule__AggregatExpression__Group__0 : rule__AggregatExpression__Group__0__Impl rule__AggregatExpression__Group__1 ;
    public final void rule__AggregatExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4739:1: ( rule__AggregatExpression__Group__0__Impl rule__AggregatExpression__Group__1 )
            // InternalMyCsv.g:4740:2: rule__AggregatExpression__Group__0__Impl rule__AggregatExpression__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__AggregatExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatExpression__Group__0"


    // $ANTLR start "rule__AggregatExpression__Group__0__Impl"
    // InternalMyCsv.g:4747:1: rule__AggregatExpression__Group__0__Impl : ( ( rule__AggregatExpression__AggregatOpAssignment_0 ) ) ;
    public final void rule__AggregatExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4751:1: ( ( ( rule__AggregatExpression__AggregatOpAssignment_0 ) ) )
            // InternalMyCsv.g:4752:1: ( ( rule__AggregatExpression__AggregatOpAssignment_0 ) )
            {
            // InternalMyCsv.g:4752:1: ( ( rule__AggregatExpression__AggregatOpAssignment_0 ) )
            // InternalMyCsv.g:4753:2: ( rule__AggregatExpression__AggregatOpAssignment_0 )
            {
             before(grammarAccess.getAggregatExpressionAccess().getAggregatOpAssignment_0()); 
            // InternalMyCsv.g:4754:2: ( rule__AggregatExpression__AggregatOpAssignment_0 )
            // InternalMyCsv.g:4754:3: rule__AggregatExpression__AggregatOpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AggregatExpression__AggregatOpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAggregatExpressionAccess().getAggregatOpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatExpression__Group__0__Impl"


    // $ANTLR start "rule__AggregatExpression__Group__1"
    // InternalMyCsv.g:4762:1: rule__AggregatExpression__Group__1 : rule__AggregatExpression__Group__1__Impl ;
    public final void rule__AggregatExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4766:1: ( rule__AggregatExpression__Group__1__Impl )
            // InternalMyCsv.g:4767:2: rule__AggregatExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AggregatExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatExpression__Group__1"


    // $ANTLR start "rule__AggregatExpression__Group__1__Impl"
    // InternalMyCsv.g:4773:1: rule__AggregatExpression__Group__1__Impl : ( ( rule__AggregatExpression__ArgAssignment_1 ) ) ;
    public final void rule__AggregatExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4777:1: ( ( ( rule__AggregatExpression__ArgAssignment_1 ) ) )
            // InternalMyCsv.g:4778:1: ( ( rule__AggregatExpression__ArgAssignment_1 ) )
            {
            // InternalMyCsv.g:4778:1: ( ( rule__AggregatExpression__ArgAssignment_1 ) )
            // InternalMyCsv.g:4779:2: ( rule__AggregatExpression__ArgAssignment_1 )
            {
             before(grammarAccess.getAggregatExpressionAccess().getArgAssignment_1()); 
            // InternalMyCsv.g:4780:2: ( rule__AggregatExpression__ArgAssignment_1 )
            // InternalMyCsv.g:4780:3: rule__AggregatExpression__ArgAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AggregatExpression__ArgAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAggregatExpressionAccess().getArgAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatExpression__Group__1__Impl"


    // $ANTLR start "rule__NestedExpressionCalcul__Group__0"
    // InternalMyCsv.g:4789:1: rule__NestedExpressionCalcul__Group__0 : rule__NestedExpressionCalcul__Group__0__Impl rule__NestedExpressionCalcul__Group__1 ;
    public final void rule__NestedExpressionCalcul__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4793:1: ( rule__NestedExpressionCalcul__Group__0__Impl rule__NestedExpressionCalcul__Group__1 )
            // InternalMyCsv.g:4794:2: rule__NestedExpressionCalcul__Group__0__Impl rule__NestedExpressionCalcul__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__NestedExpressionCalcul__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedExpressionCalcul__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpressionCalcul__Group__0"


    // $ANTLR start "rule__NestedExpressionCalcul__Group__0__Impl"
    // InternalMyCsv.g:4801:1: rule__NestedExpressionCalcul__Group__0__Impl : ( '(' ) ;
    public final void rule__NestedExpressionCalcul__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4805:1: ( ( '(' ) )
            // InternalMyCsv.g:4806:1: ( '(' )
            {
            // InternalMyCsv.g:4806:1: ( '(' )
            // InternalMyCsv.g:4807:2: '('
            {
             before(grammarAccess.getNestedExpressionCalculAccess().getLeftParenthesisKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNestedExpressionCalculAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpressionCalcul__Group__0__Impl"


    // $ANTLR start "rule__NestedExpressionCalcul__Group__1"
    // InternalMyCsv.g:4816:1: rule__NestedExpressionCalcul__Group__1 : rule__NestedExpressionCalcul__Group__1__Impl rule__NestedExpressionCalcul__Group__2 ;
    public final void rule__NestedExpressionCalcul__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4820:1: ( rule__NestedExpressionCalcul__Group__1__Impl rule__NestedExpressionCalcul__Group__2 )
            // InternalMyCsv.g:4821:2: rule__NestedExpressionCalcul__Group__1__Impl rule__NestedExpressionCalcul__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__NestedExpressionCalcul__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedExpressionCalcul__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpressionCalcul__Group__1"


    // $ANTLR start "rule__NestedExpressionCalcul__Group__1__Impl"
    // InternalMyCsv.g:4828:1: rule__NestedExpressionCalcul__Group__1__Impl : ( ( rule__NestedExpressionCalcul__ExprAssignment_1 ) ) ;
    public final void rule__NestedExpressionCalcul__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4832:1: ( ( ( rule__NestedExpressionCalcul__ExprAssignment_1 ) ) )
            // InternalMyCsv.g:4833:1: ( ( rule__NestedExpressionCalcul__ExprAssignment_1 ) )
            {
            // InternalMyCsv.g:4833:1: ( ( rule__NestedExpressionCalcul__ExprAssignment_1 ) )
            // InternalMyCsv.g:4834:2: ( rule__NestedExpressionCalcul__ExprAssignment_1 )
            {
             before(grammarAccess.getNestedExpressionCalculAccess().getExprAssignment_1()); 
            // InternalMyCsv.g:4835:2: ( rule__NestedExpressionCalcul__ExprAssignment_1 )
            // InternalMyCsv.g:4835:3: rule__NestedExpressionCalcul__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NestedExpressionCalcul__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNestedExpressionCalculAccess().getExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpressionCalcul__Group__1__Impl"


    // $ANTLR start "rule__NestedExpressionCalcul__Group__2"
    // InternalMyCsv.g:4843:1: rule__NestedExpressionCalcul__Group__2 : rule__NestedExpressionCalcul__Group__2__Impl ;
    public final void rule__NestedExpressionCalcul__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4847:1: ( rule__NestedExpressionCalcul__Group__2__Impl )
            // InternalMyCsv.g:4848:2: rule__NestedExpressionCalcul__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NestedExpressionCalcul__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpressionCalcul__Group__2"


    // $ANTLR start "rule__NestedExpressionCalcul__Group__2__Impl"
    // InternalMyCsv.g:4854:1: rule__NestedExpressionCalcul__Group__2__Impl : ( ')' ) ;
    public final void rule__NestedExpressionCalcul__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4858:1: ( ( ')' ) )
            // InternalMyCsv.g:4859:1: ( ')' )
            {
            // InternalMyCsv.g:4859:1: ( ')' )
            // InternalMyCsv.g:4860:2: ')'
            {
             before(grammarAccess.getNestedExpressionCalculAccess().getRightParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNestedExpressionCalculAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpressionCalcul__Group__2__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalMyCsv.g:4870:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4874:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalMyCsv.g:4875:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__FLOAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0"


    // $ANTLR start "rule__FLOAT__Group__0__Impl"
    // InternalMyCsv.g:4882:1: rule__FLOAT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4886:1: ( ( RULE_INT ) )
            // InternalMyCsv.g:4887:1: ( RULE_INT )
            {
            // InternalMyCsv.g:4887:1: ( RULE_INT )
            // InternalMyCsv.g:4888:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0__Impl"


    // $ANTLR start "rule__FLOAT__Group__1"
    // InternalMyCsv.g:4897:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4901:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalMyCsv.g:4902:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__FLOAT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1"


    // $ANTLR start "rule__FLOAT__Group__1__Impl"
    // InternalMyCsv.g:4909:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4913:1: ( ( '.' ) )
            // InternalMyCsv.g:4914:1: ( '.' )
            {
            // InternalMyCsv.g:4914:1: ( '.' )
            // InternalMyCsv.g:4915:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__2"
    // InternalMyCsv.g:4924:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4928:1: ( rule__FLOAT__Group__2__Impl )
            // InternalMyCsv.g:4929:2: rule__FLOAT__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2"


    // $ANTLR start "rule__FLOAT__Group__2__Impl"
    // InternalMyCsv.g:4935:1: rule__FLOAT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4939:1: ( ( RULE_INT ) )
            // InternalMyCsv.g:4940:1: ( RULE_INT )
            {
            // InternalMyCsv.g:4940:1: ( RULE_INT )
            // InternalMyCsv.g:4941:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2__Impl"


    // $ANTLR start "rule__Program__StmtsAssignment"
    // InternalMyCsv.g:4951:1: rule__Program__StmtsAssignment : ( ruleStatement ) ;
    public final void rule__Program__StmtsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4955:1: ( ( ruleStatement ) )
            // InternalMyCsv.g:4956:2: ( ruleStatement )
            {
            // InternalMyCsv.g:4956:2: ( ruleStatement )
            // InternalMyCsv.g:4957:3: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStmtsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStmtsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StmtsAssignment"


    // $ANTLR start "rule__LineIndexCond__CondAssignment"
    // InternalMyCsv.g:4966:1: rule__LineIndexCond__CondAssignment : ( ruleExpressionLog ) ;
    public final void rule__LineIndexCond__CondAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4970:1: ( ( ruleExpressionLog ) )
            // InternalMyCsv.g:4971:2: ( ruleExpressionLog )
            {
            // InternalMyCsv.g:4971:2: ( ruleExpressionLog )
            // InternalMyCsv.g:4972:3: ruleExpressionLog
            {
             before(grammarAccess.getLineIndexCondAccess().getCondExpressionLogParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLog();

            state._fsp--;

             after(grammarAccess.getLineIndexCondAccess().getCondExpressionLogParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineIndexCond__CondAssignment"


    // $ANTLR start "rule__LineIndexNum__LinesAssignment"
    // InternalMyCsv.g:4981:1: rule__LineIndexNum__LinesAssignment : ( RULE_INT ) ;
    public final void rule__LineIndexNum__LinesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:4985:1: ( ( RULE_INT ) )
            // InternalMyCsv.g:4986:2: ( RULE_INT )
            {
            // InternalMyCsv.g:4986:2: ( RULE_INT )
            // InternalMyCsv.g:4987:3: RULE_INT
            {
             before(grammarAccess.getLineIndexNumAccess().getLinesINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLineIndexNumAccess().getLinesINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineIndexNum__LinesAssignment"


    // $ANTLR start "rule__FieldIndexName__FieldsAssignment"
    // InternalMyCsv.g:4996:1: rule__FieldIndexName__FieldsAssignment : ( ruleField ) ;
    public final void rule__FieldIndexName__FieldsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5000:1: ( ( ruleField ) )
            // InternalMyCsv.g:5001:2: ( ruleField )
            {
            // InternalMyCsv.g:5001:2: ( ruleField )
            // InternalMyCsv.g:5002:3: ruleField
            {
             before(grammarAccess.getFieldIndexNameAccess().getFieldsFieldParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldIndexNameAccess().getFieldsFieldParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldIndexName__FieldsAssignment"


    // $ANTLR start "rule__FieldIndexNum__ColumnsAssignment"
    // InternalMyCsv.g:5011:1: rule__FieldIndexNum__ColumnsAssignment : ( RULE_INT ) ;
    public final void rule__FieldIndexNum__ColumnsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5015:1: ( ( RULE_INT ) )
            // InternalMyCsv.g:5016:2: ( RULE_INT )
            {
            // InternalMyCsv.g:5016:2: ( RULE_INT )
            // InternalMyCsv.g:5017:3: RULE_INT
            {
             before(grammarAccess.getFieldIndexNumAccess().getColumnsINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFieldIndexNumAccess().getColumnsINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldIndexNum__ColumnsAssignment"


    // $ANTLR start "rule__CellIndex__LineAssignment_1"
    // InternalMyCsv.g:5026:1: rule__CellIndex__LineAssignment_1 : ( RULE_INT ) ;
    public final void rule__CellIndex__LineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5030:1: ( ( RULE_INT ) )
            // InternalMyCsv.g:5031:2: ( RULE_INT )
            {
            // InternalMyCsv.g:5031:2: ( RULE_INT )
            // InternalMyCsv.g:5032:3: RULE_INT
            {
             before(grammarAccess.getCellIndexAccess().getLineINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellIndexAccess().getLineINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellIndex__LineAssignment_1"


    // $ANTLR start "rule__CellIndex__ColnumAssignment_3_0"
    // InternalMyCsv.g:5041:1: rule__CellIndex__ColnumAssignment_3_0 : ( RULE_INT ) ;
    public final void rule__CellIndex__ColnumAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5045:1: ( ( RULE_INT ) )
            // InternalMyCsv.g:5046:2: ( RULE_INT )
            {
            // InternalMyCsv.g:5046:2: ( RULE_INT )
            // InternalMyCsv.g:5047:3: RULE_INT
            {
             before(grammarAccess.getCellIndexAccess().getColnumINTTerminalRuleCall_3_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellIndexAccess().getColnumINTTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellIndex__ColnumAssignment_3_0"


    // $ANTLR start "rule__CellIndex__ColnameAssignment_3_1"
    // InternalMyCsv.g:5056:1: rule__CellIndex__ColnameAssignment_3_1 : ( ruleField ) ;
    public final void rule__CellIndex__ColnameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5060:1: ( ( ruleField ) )
            // InternalMyCsv.g:5061:2: ( ruleField )
            {
            // InternalMyCsv.g:5061:2: ( ruleField )
            // InternalMyCsv.g:5062:3: ruleField
            {
             before(grammarAccess.getCellIndexAccess().getColnameFieldParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getCellIndexAccess().getColnameFieldParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellIndex__ColnameAssignment_3_1"


    // $ANTLR start "rule__Values__ValuesAssignment_1"
    // InternalMyCsv.g:5071:1: rule__Values__ValuesAssignment_1 : ( ruleValue ) ;
    public final void rule__Values__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5075:1: ( ( ruleValue ) )
            // InternalMyCsv.g:5076:2: ( ruleValue )
            {
            // InternalMyCsv.g:5076:2: ( ruleValue )
            // InternalMyCsv.g:5077:3: ruleValue
            {
             before(grammarAccess.getValuesAccess().getValuesValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValuesAccess().getValuesValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__ValuesAssignment_1"


    // $ANTLR start "rule__Values__ValuesAssignment_2_1"
    // InternalMyCsv.g:5086:1: rule__Values__ValuesAssignment_2_1 : ( ruleValue ) ;
    public final void rule__Values__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5090:1: ( ( ruleValue ) )
            // InternalMyCsv.g:5091:2: ( ruleValue )
            {
            // InternalMyCsv.g:5091:2: ( ruleValue )
            // InternalMyCsv.g:5092:3: ruleValue
            {
             before(grammarAccess.getValuesAccess().getValuesValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValuesAccess().getValuesValueParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__ValuesAssignment_2_1"


    // $ANTLR start "rule__Path__ValueAssignment"
    // InternalMyCsv.g:5101:1: rule__Path__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Path__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5105:1: ( ( RULE_STRING ) )
            // InternalMyCsv.g:5106:2: ( RULE_STRING )
            {
            // InternalMyCsv.g:5106:2: ( RULE_STRING )
            // InternalMyCsv.g:5107:3: RULE_STRING
            {
             before(grammarAccess.getPathAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPathAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__ValueAssignment"


    // $ANTLR start "rule__Field__ValueAssignment"
    // InternalMyCsv.g:5116:1: rule__Field__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Field__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5120:1: ( ( RULE_ID ) )
            // InternalMyCsv.g:5121:2: ( RULE_ID )
            {
            // InternalMyCsv.g:5121:2: ( RULE_ID )
            // InternalMyCsv.g:5122:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getValueIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getValueIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__ValueAssignment"


    // $ANTLR start "rule__Load__PathAssignment_1"
    // InternalMyCsv.g:5131:1: rule__Load__PathAssignment_1 : ( rulePath ) ;
    public final void rule__Load__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5135:1: ( ( rulePath ) )
            // InternalMyCsv.g:5136:2: ( rulePath )
            {
            // InternalMyCsv.g:5136:2: ( rulePath )
            // InternalMyCsv.g:5137:3: rulePath
            {
             before(grammarAccess.getLoadAccess().getPathPathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getLoadAccess().getPathPathParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__PathAssignment_1"


    // $ANTLR start "rule__Load__SepDefinedAssignment_2_0"
    // InternalMyCsv.g:5146:1: rule__Load__SepDefinedAssignment_2_0 : ( ( 'sep' ) ) ;
    public final void rule__Load__SepDefinedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5150:1: ( ( ( 'sep' ) ) )
            // InternalMyCsv.g:5151:2: ( ( 'sep' ) )
            {
            // InternalMyCsv.g:5151:2: ( ( 'sep' ) )
            // InternalMyCsv.g:5152:3: ( 'sep' )
            {
             before(grammarAccess.getLoadAccess().getSepDefinedSepKeyword_2_0_0()); 
            // InternalMyCsv.g:5153:3: ( 'sep' )
            // InternalMyCsv.g:5154:4: 'sep'
            {
             before(grammarAccess.getLoadAccess().getSepDefinedSepKeyword_2_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getSepDefinedSepKeyword_2_0_0()); 

            }

             after(grammarAccess.getLoadAccess().getSepDefinedSepKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__SepDefinedAssignment_2_0"


    // $ANTLR start "rule__Load__SepAssignment_2_2"
    // InternalMyCsv.g:5165:1: rule__Load__SepAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__Load__SepAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5169:1: ( ( RULE_STRING ) )
            // InternalMyCsv.g:5170:2: ( RULE_STRING )
            {
            // InternalMyCsv.g:5170:2: ( RULE_STRING )
            // InternalMyCsv.g:5171:3: RULE_STRING
            {
             before(grammarAccess.getLoadAccess().getSepSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getSepSTRINGTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__SepAssignment_2_2"


    // $ANTLR start "rule__Load__NoHeaderAssignment_3_0"
    // InternalMyCsv.g:5180:1: rule__Load__NoHeaderAssignment_3_0 : ( ( 'no' ) ) ;
    public final void rule__Load__NoHeaderAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5184:1: ( ( ( 'no' ) ) )
            // InternalMyCsv.g:5185:2: ( ( 'no' ) )
            {
            // InternalMyCsv.g:5185:2: ( ( 'no' ) )
            // InternalMyCsv.g:5186:3: ( 'no' )
            {
             before(grammarAccess.getLoadAccess().getNoHeaderNoKeyword_3_0_0()); 
            // InternalMyCsv.g:5187:3: ( 'no' )
            // InternalMyCsv.g:5188:4: 'no'
            {
             before(grammarAccess.getLoadAccess().getNoHeaderNoKeyword_3_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getNoHeaderNoKeyword_3_0_0()); 

            }

             after(grammarAccess.getLoadAccess().getNoHeaderNoKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__NoHeaderAssignment_3_0"


    // $ANTLR start "rule__Store__PathAssignment_1"
    // InternalMyCsv.g:5199:1: rule__Store__PathAssignment_1 : ( rulePath ) ;
    public final void rule__Store__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5203:1: ( ( rulePath ) )
            // InternalMyCsv.g:5204:2: ( rulePath )
            {
            // InternalMyCsv.g:5204:2: ( rulePath )
            // InternalMyCsv.g:5205:3: rulePath
            {
             before(grammarAccess.getStoreAccess().getPathPathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getStoreAccess().getPathPathParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__PathAssignment_1"


    // $ANTLR start "rule__Store__SepDefinedAssignment_2_0"
    // InternalMyCsv.g:5214:1: rule__Store__SepDefinedAssignment_2_0 : ( ( 'sep' ) ) ;
    public final void rule__Store__SepDefinedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5218:1: ( ( ( 'sep' ) ) )
            // InternalMyCsv.g:5219:2: ( ( 'sep' ) )
            {
            // InternalMyCsv.g:5219:2: ( ( 'sep' ) )
            // InternalMyCsv.g:5220:3: ( 'sep' )
            {
             before(grammarAccess.getStoreAccess().getSepDefinedSepKeyword_2_0_0()); 
            // InternalMyCsv.g:5221:3: ( 'sep' )
            // InternalMyCsv.g:5222:4: 'sep'
            {
             before(grammarAccess.getStoreAccess().getSepDefinedSepKeyword_2_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getSepDefinedSepKeyword_2_0_0()); 

            }

             after(grammarAccess.getStoreAccess().getSepDefinedSepKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__SepDefinedAssignment_2_0"


    // $ANTLR start "rule__Store__SepAssignment_2_2"
    // InternalMyCsv.g:5233:1: rule__Store__SepAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__Store__SepAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5237:1: ( ( RULE_STRING ) )
            // InternalMyCsv.g:5238:2: ( RULE_STRING )
            {
            // InternalMyCsv.g:5238:2: ( RULE_STRING )
            // InternalMyCsv.g:5239:3: RULE_STRING
            {
             before(grammarAccess.getStoreAccess().getSepSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getSepSTRINGTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__SepAssignment_2_2"


    // $ANTLR start "rule__Store__NoHeaderAssignment_3_0"
    // InternalMyCsv.g:5248:1: rule__Store__NoHeaderAssignment_3_0 : ( ( 'no' ) ) ;
    public final void rule__Store__NoHeaderAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5252:1: ( ( ( 'no' ) ) )
            // InternalMyCsv.g:5253:2: ( ( 'no' ) )
            {
            // InternalMyCsv.g:5253:2: ( ( 'no' ) )
            // InternalMyCsv.g:5254:3: ( 'no' )
            {
             before(grammarAccess.getStoreAccess().getNoHeaderNoKeyword_3_0_0()); 
            // InternalMyCsv.g:5255:3: ( 'no' )
            // InternalMyCsv.g:5256:4: 'no'
            {
             before(grammarAccess.getStoreAccess().getNoHeaderNoKeyword_3_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getNoHeaderNoKeyword_3_0_0()); 

            }

             after(grammarAccess.getStoreAccess().getNoHeaderNoKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__NoHeaderAssignment_3_0"


    // $ANTLR start "rule__ExportJson__PathAssignment_1"
    // InternalMyCsv.g:5267:1: rule__ExportJson__PathAssignment_1 : ( rulePath ) ;
    public final void rule__ExportJson__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5271:1: ( ( rulePath ) )
            // InternalMyCsv.g:5272:2: ( rulePath )
            {
            // InternalMyCsv.g:5272:2: ( rulePath )
            // InternalMyCsv.g:5273:3: rulePath
            {
             before(grammarAccess.getExportJsonAccess().getPathPathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getExportJsonAccess().getPathPathParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportJson__PathAssignment_1"


    // $ANTLR start "rule__Projection__FieldAssignment_1"
    // InternalMyCsv.g:5282:1: rule__Projection__FieldAssignment_1 : ( ruleFieldIndex ) ;
    public final void rule__Projection__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5286:1: ( ( ruleFieldIndex ) )
            // InternalMyCsv.g:5287:2: ( ruleFieldIndex )
            {
            // InternalMyCsv.g:5287:2: ( ruleFieldIndex )
            // InternalMyCsv.g:5288:3: ruleFieldIndex
            {
             before(grammarAccess.getProjectionAccess().getFieldFieldIndexParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldIndex();

            state._fsp--;

             after(grammarAccess.getProjectionAccess().getFieldFieldIndexParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__FieldAssignment_1"


    // $ANTLR start "rule__Select__LineAssignment_1"
    // InternalMyCsv.g:5297:1: rule__Select__LineAssignment_1 : ( ruleLineIndex ) ;
    public final void rule__Select__LineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5301:1: ( ( ruleLineIndex ) )
            // InternalMyCsv.g:5302:2: ( ruleLineIndex )
            {
            // InternalMyCsv.g:5302:2: ( ruleLineIndex )
            // InternalMyCsv.g:5303:3: ruleLineIndex
            {
             before(grammarAccess.getSelectAccess().getLineLineIndexParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLineIndex();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getLineLineIndexParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__LineAssignment_1"


    // $ANTLR start "rule__DeleteLine__LinesAssignment_1"
    // InternalMyCsv.g:5312:1: rule__DeleteLine__LinesAssignment_1 : ( ruleLineIndex ) ;
    public final void rule__DeleteLine__LinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5316:1: ( ( ruleLineIndex ) )
            // InternalMyCsv.g:5317:2: ( ruleLineIndex )
            {
            // InternalMyCsv.g:5317:2: ( ruleLineIndex )
            // InternalMyCsv.g:5318:3: ruleLineIndex
            {
             before(grammarAccess.getDeleteLineAccess().getLinesLineIndexParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLineIndex();

            state._fsp--;

             after(grammarAccess.getDeleteLineAccess().getLinesLineIndexParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteLine__LinesAssignment_1"


    // $ANTLR start "rule__DeleteField__FieldsAssignment_1"
    // InternalMyCsv.g:5327:1: rule__DeleteField__FieldsAssignment_1 : ( ruleFieldIndex ) ;
    public final void rule__DeleteField__FieldsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5331:1: ( ( ruleFieldIndex ) )
            // InternalMyCsv.g:5332:2: ( ruleFieldIndex )
            {
            // InternalMyCsv.g:5332:2: ( ruleFieldIndex )
            // InternalMyCsv.g:5333:3: ruleFieldIndex
            {
             before(grammarAccess.getDeleteFieldAccess().getFieldsFieldIndexParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldIndex();

            state._fsp--;

             after(grammarAccess.getDeleteFieldAccess().getFieldsFieldIndexParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteField__FieldsAssignment_1"


    // $ANTLR start "rule__InsertLine__ValuesAssignment_1"
    // InternalMyCsv.g:5342:1: rule__InsertLine__ValuesAssignment_1 : ( ruleValues ) ;
    public final void rule__InsertLine__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5346:1: ( ( ruleValues ) )
            // InternalMyCsv.g:5347:2: ( ruleValues )
            {
            // InternalMyCsv.g:5347:2: ( ruleValues )
            // InternalMyCsv.g:5348:3: ruleValues
            {
             before(grammarAccess.getInsertLineAccess().getValuesValuesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getInsertLineAccess().getValuesValuesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertLine__ValuesAssignment_1"


    // $ANTLR start "rule__InsertField__FieldnameAssignment_1"
    // InternalMyCsv.g:5357:1: rule__InsertField__FieldnameAssignment_1 : ( ruleField ) ;
    public final void rule__InsertField__FieldnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5361:1: ( ( ruleField ) )
            // InternalMyCsv.g:5362:2: ( ruleField )
            {
            // InternalMyCsv.g:5362:2: ( ruleField )
            // InternalMyCsv.g:5363:3: ruleField
            {
             before(grammarAccess.getInsertFieldAccess().getFieldnameFieldParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getInsertFieldAccess().getFieldnameFieldParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertField__FieldnameAssignment_1"


    // $ANTLR start "rule__InsertField__ValuesAssignment_3"
    // InternalMyCsv.g:5372:1: rule__InsertField__ValuesAssignment_3 : ( ruleValues ) ;
    public final void rule__InsertField__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5376:1: ( ( ruleValues ) )
            // InternalMyCsv.g:5377:2: ( ruleValues )
            {
            // InternalMyCsv.g:5377:2: ( ruleValues )
            // InternalMyCsv.g:5378:3: ruleValues
            {
             before(grammarAccess.getInsertFieldAccess().getValuesValuesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getInsertFieldAccess().getValuesValuesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertField__ValuesAssignment_3"


    // $ANTLR start "rule__ModifyLine__LinesAssignment_1"
    // InternalMyCsv.g:5387:1: rule__ModifyLine__LinesAssignment_1 : ( ruleLineIndex ) ;
    public final void rule__ModifyLine__LinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5391:1: ( ( ruleLineIndex ) )
            // InternalMyCsv.g:5392:2: ( ruleLineIndex )
            {
            // InternalMyCsv.g:5392:2: ( ruleLineIndex )
            // InternalMyCsv.g:5393:3: ruleLineIndex
            {
             before(grammarAccess.getModifyLineAccess().getLinesLineIndexParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLineIndex();

            state._fsp--;

             after(grammarAccess.getModifyLineAccess().getLinesLineIndexParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyLine__LinesAssignment_1"


    // $ANTLR start "rule__ModifyLine__ValuesAssignment_3"
    // InternalMyCsv.g:5402:1: rule__ModifyLine__ValuesAssignment_3 : ( ruleValues ) ;
    public final void rule__ModifyLine__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5406:1: ( ( ruleValues ) )
            // InternalMyCsv.g:5407:2: ( ruleValues )
            {
            // InternalMyCsv.g:5407:2: ( ruleValues )
            // InternalMyCsv.g:5408:3: ruleValues
            {
             before(grammarAccess.getModifyLineAccess().getValuesValuesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getModifyLineAccess().getValuesValuesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyLine__ValuesAssignment_3"


    // $ANTLR start "rule__ModifyField__FieldsAssignment_1"
    // InternalMyCsv.g:5417:1: rule__ModifyField__FieldsAssignment_1 : ( ruleFieldIndex ) ;
    public final void rule__ModifyField__FieldsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5421:1: ( ( ruleFieldIndex ) )
            // InternalMyCsv.g:5422:2: ( ruleFieldIndex )
            {
            // InternalMyCsv.g:5422:2: ( ruleFieldIndex )
            // InternalMyCsv.g:5423:3: ruleFieldIndex
            {
             before(grammarAccess.getModifyFieldAccess().getFieldsFieldIndexParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldIndex();

            state._fsp--;

             after(grammarAccess.getModifyFieldAccess().getFieldsFieldIndexParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyField__FieldsAssignment_1"


    // $ANTLR start "rule__ModifyField__ValuesAssignment_3"
    // InternalMyCsv.g:5432:1: rule__ModifyField__ValuesAssignment_3 : ( ruleValues ) ;
    public final void rule__ModifyField__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5436:1: ( ( ruleValues ) )
            // InternalMyCsv.g:5437:2: ( ruleValues )
            {
            // InternalMyCsv.g:5437:2: ( ruleValues )
            // InternalMyCsv.g:5438:3: ruleValues
            {
             before(grammarAccess.getModifyFieldAccess().getValuesValuesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getModifyFieldAccess().getValuesValuesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyField__ValuesAssignment_3"


    // $ANTLR start "rule__ModifyCell__CellAssignment_1"
    // InternalMyCsv.g:5447:1: rule__ModifyCell__CellAssignment_1 : ( ruleCellIndex ) ;
    public final void rule__ModifyCell__CellAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5451:1: ( ( ruleCellIndex ) )
            // InternalMyCsv.g:5452:2: ( ruleCellIndex )
            {
            // InternalMyCsv.g:5452:2: ( ruleCellIndex )
            // InternalMyCsv.g:5453:3: ruleCellIndex
            {
             before(grammarAccess.getModifyCellAccess().getCellCellIndexParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCellIndex();

            state._fsp--;

             after(grammarAccess.getModifyCellAccess().getCellCellIndexParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyCell__CellAssignment_1"


    // $ANTLR start "rule__ModifyCell__ValueAssignment_3"
    // InternalMyCsv.g:5462:1: rule__ModifyCell__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__ModifyCell__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5466:1: ( ( ruleValue ) )
            // InternalMyCsv.g:5467:2: ( ruleValue )
            {
            // InternalMyCsv.g:5467:2: ( ruleValue )
            // InternalMyCsv.g:5468:3: ruleValue
            {
             before(grammarAccess.getModifyCellAccess().getValueValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getModifyCellAccess().getValueValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyCell__ValueAssignment_3"


    // $ANTLR start "rule__PrintLine__LinesAssignment_1"
    // InternalMyCsv.g:5477:1: rule__PrintLine__LinesAssignment_1 : ( ruleLineIndex ) ;
    public final void rule__PrintLine__LinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5481:1: ( ( ruleLineIndex ) )
            // InternalMyCsv.g:5482:2: ( ruleLineIndex )
            {
            // InternalMyCsv.g:5482:2: ( ruleLineIndex )
            // InternalMyCsv.g:5483:3: ruleLineIndex
            {
             before(grammarAccess.getPrintLineAccess().getLinesLineIndexParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLineIndex();

            state._fsp--;

             after(grammarAccess.getPrintLineAccess().getLinesLineIndexParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLine__LinesAssignment_1"


    // $ANTLR start "rule__PrintField__FieldsAssignment_1"
    // InternalMyCsv.g:5492:1: rule__PrintField__FieldsAssignment_1 : ( ruleFieldIndex ) ;
    public final void rule__PrintField__FieldsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5496:1: ( ( ruleFieldIndex ) )
            // InternalMyCsv.g:5497:2: ( ruleFieldIndex )
            {
            // InternalMyCsv.g:5497:2: ( ruleFieldIndex )
            // InternalMyCsv.g:5498:3: ruleFieldIndex
            {
             before(grammarAccess.getPrintFieldAccess().getFieldsFieldIndexParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldIndex();

            state._fsp--;

             after(grammarAccess.getPrintFieldAccess().getFieldsFieldIndexParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintField__FieldsAssignment_1"


    // $ANTLR start "rule__PrintCell__CellAssignment_1"
    // InternalMyCsv.g:5507:1: rule__PrintCell__CellAssignment_1 : ( ruleCellIndex ) ;
    public final void rule__PrintCell__CellAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5511:1: ( ( ruleCellIndex ) )
            // InternalMyCsv.g:5512:2: ( ruleCellIndex )
            {
            // InternalMyCsv.g:5512:2: ( ruleCellIndex )
            // InternalMyCsv.g:5513:3: ruleCellIndex
            {
             before(grammarAccess.getPrintCellAccess().getCellCellIndexParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCellIndex();

            state._fsp--;

             after(grammarAccess.getPrintCellAccess().getCellCellIndexParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCell__CellAssignment_1"


    // $ANTLR start "rule__PrintExpr__ExpAssignment_1"
    // InternalMyCsv.g:5522:1: rule__PrintExpr__ExpAssignment_1 : ( ruleValue ) ;
    public final void rule__PrintExpr__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5526:1: ( ( ruleValue ) )
            // InternalMyCsv.g:5527:2: ( ruleValue )
            {
            // InternalMyCsv.g:5527:2: ( ruleValue )
            // InternalMyCsv.g:5528:3: ruleValue
            {
             before(grammarAccess.getPrintExprAccess().getExpValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPrintExprAccess().getExpValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintExpr__ExpAssignment_1"


    // $ANTLR start "rule__ExpressionLog__ExprAssignment"
    // InternalMyCsv.g:5537:1: rule__ExpressionLog__ExprAssignment : ( ruleOrExpression ) ;
    public final void rule__ExpressionLog__ExprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5541:1: ( ( ruleOrExpression ) )
            // InternalMyCsv.g:5542:2: ( ruleOrExpression )
            {
            // InternalMyCsv.g:5542:2: ( ruleOrExpression )
            // InternalMyCsv.g:5543:3: ruleOrExpression
            {
             before(grammarAccess.getExpressionLogAccess().getExprOrExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getExpressionLogAccess().getExprOrExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLog__ExprAssignment"


    // $ANTLR start "rule__OrExpression__LhsAssignment_0"
    // InternalMyCsv.g:5552:1: rule__OrExpression__LhsAssignment_0 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5556:1: ( ( ruleAndExpression ) )
            // InternalMyCsv.g:5557:2: ( ruleAndExpression )
            {
            // InternalMyCsv.g:5557:2: ( ruleAndExpression )
            // InternalMyCsv.g:5558:3: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getLhsAndExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getLhsAndExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__LhsAssignment_0"


    // $ANTLR start "rule__OrExpression__RhsAssignment_1_1"
    // InternalMyCsv.g:5567:1: rule__OrExpression__RhsAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5571:1: ( ( ruleAndExpression ) )
            // InternalMyCsv.g:5572:2: ( ruleAndExpression )
            {
            // InternalMyCsv.g:5572:2: ( ruleAndExpression )
            // InternalMyCsv.g:5573:3: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRhsAndExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRhsAndExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__RhsAssignment_1_1"


    // $ANTLR start "rule__AndExpression__LhsAssignment_0"
    // InternalMyCsv.g:5582:1: rule__AndExpression__LhsAssignment_0 : ( ruleUnaryLogExpression ) ;
    public final void rule__AndExpression__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5586:1: ( ( ruleUnaryLogExpression ) )
            // InternalMyCsv.g:5587:2: ( ruleUnaryLogExpression )
            {
            // InternalMyCsv.g:5587:2: ( ruleUnaryLogExpression )
            // InternalMyCsv.g:5588:3: ruleUnaryLogExpression
            {
             before(grammarAccess.getAndExpressionAccess().getLhsUnaryLogExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryLogExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getLhsUnaryLogExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__LhsAssignment_0"


    // $ANTLR start "rule__AndExpression__RhsAssignment_1_1"
    // InternalMyCsv.g:5597:1: rule__AndExpression__RhsAssignment_1_1 : ( ruleUnaryLogExpression ) ;
    public final void rule__AndExpression__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5601:1: ( ( ruleUnaryLogExpression ) )
            // InternalMyCsv.g:5602:2: ( ruleUnaryLogExpression )
            {
            // InternalMyCsv.g:5602:2: ( ruleUnaryLogExpression )
            // InternalMyCsv.g:5603:3: ruleUnaryLogExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRhsUnaryLogExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryLogExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRhsUnaryLogExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RhsAssignment_1_1"


    // $ANTLR start "rule__UnaryLogExpression__NotAssignment_0"
    // InternalMyCsv.g:5612:1: rule__UnaryLogExpression__NotAssignment_0 : ( ( 'not' ) ) ;
    public final void rule__UnaryLogExpression__NotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5616:1: ( ( ( 'not' ) ) )
            // InternalMyCsv.g:5617:2: ( ( 'not' ) )
            {
            // InternalMyCsv.g:5617:2: ( ( 'not' ) )
            // InternalMyCsv.g:5618:3: ( 'not' )
            {
             before(grammarAccess.getUnaryLogExpressionAccess().getNotNotKeyword_0_0()); 
            // InternalMyCsv.g:5619:3: ( 'not' )
            // InternalMyCsv.g:5620:4: 'not'
            {
             before(grammarAccess.getUnaryLogExpressionAccess().getNotNotKeyword_0_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getUnaryLogExpressionAccess().getNotNotKeyword_0_0()); 

            }

             after(grammarAccess.getUnaryLogExpressionAccess().getNotNotKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryLogExpression__NotAssignment_0"


    // $ANTLR start "rule__UnaryLogExpression__ExprAssignment_1"
    // InternalMyCsv.g:5631:1: rule__UnaryLogExpression__ExprAssignment_1 : ( ruleExpressionLogPrimary ) ;
    public final void rule__UnaryLogExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5635:1: ( ( ruleExpressionLogPrimary ) )
            // InternalMyCsv.g:5636:2: ( ruleExpressionLogPrimary )
            {
            // InternalMyCsv.g:5636:2: ( ruleExpressionLogPrimary )
            // InternalMyCsv.g:5637:3: ruleExpressionLogPrimary
            {
             before(grammarAccess.getUnaryLogExpressionAccess().getExprExpressionLogPrimaryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLogPrimary();

            state._fsp--;

             after(grammarAccess.getUnaryLogExpressionAccess().getExprExpressionLogPrimaryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryLogExpression__ExprAssignment_1"


    // $ANTLR start "rule__NestedLogExpression__ExprAssignment_1"
    // InternalMyCsv.g:5646:1: rule__NestedLogExpression__ExprAssignment_1 : ( ruleExpressionLog ) ;
    public final void rule__NestedLogExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5650:1: ( ( ruleExpressionLog ) )
            // InternalMyCsv.g:5651:2: ( ruleExpressionLog )
            {
            // InternalMyCsv.g:5651:2: ( ruleExpressionLog )
            // InternalMyCsv.g:5652:3: ruleExpressionLog
            {
             before(grammarAccess.getNestedLogExpressionAccess().getExprExpressionLogParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLog();

            state._fsp--;

             after(grammarAccess.getNestedLogExpressionAccess().getExprExpressionLogParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedLogExpression__ExprAssignment_1"


    // $ANTLR start "rule__ExpressionRel__FieldAssignment_0"
    // InternalMyCsv.g:5661:1: rule__ExpressionRel__FieldAssignment_0 : ( ruleField ) ;
    public final void rule__ExpressionRel__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5665:1: ( ( ruleField ) )
            // InternalMyCsv.g:5666:2: ( ruleField )
            {
            // InternalMyCsv.g:5666:2: ( ruleField )
            // InternalMyCsv.g:5667:3: ruleField
            {
             before(grammarAccess.getExpressionRelAccess().getFieldFieldParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getExpressionRelAccess().getFieldFieldParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionRel__FieldAssignment_0"


    // $ANTLR start "rule__ExpressionRel__OpAssignment_1"
    // InternalMyCsv.g:5676:1: rule__ExpressionRel__OpAssignment_1 : ( ruleBinOpRel ) ;
    public final void rule__ExpressionRel__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5680:1: ( ( ruleBinOpRel ) )
            // InternalMyCsv.g:5681:2: ( ruleBinOpRel )
            {
            // InternalMyCsv.g:5681:2: ( ruleBinOpRel )
            // InternalMyCsv.g:5682:3: ruleBinOpRel
            {
             before(grammarAccess.getExpressionRelAccess().getOpBinOpRelEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinOpRel();

            state._fsp--;

             after(grammarAccess.getExpressionRelAccess().getOpBinOpRelEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionRel__OpAssignment_1"


    // $ANTLR start "rule__ExpressionRel__ValAssignment_2"
    // InternalMyCsv.g:5691:1: rule__ExpressionRel__ValAssignment_2 : ( ruleValue ) ;
    public final void rule__ExpressionRel__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5695:1: ( ( ruleValue ) )
            // InternalMyCsv.g:5696:2: ( ruleValue )
            {
            // InternalMyCsv.g:5696:2: ( ruleValue )
            // InternalMyCsv.g:5697:3: ruleValue
            {
             before(grammarAccess.getExpressionRelAccess().getValValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getExpressionRelAccess().getValValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionRel__ValAssignment_2"


    // $ANTLR start "rule__ExpressionCalcul__ExprAssignment"
    // InternalMyCsv.g:5706:1: rule__ExpressionCalcul__ExprAssignment : ( ruleAdditiveExpression ) ;
    public final void rule__ExpressionCalcul__ExprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5710:1: ( ( ruleAdditiveExpression ) )
            // InternalMyCsv.g:5711:2: ( ruleAdditiveExpression )
            {
            // InternalMyCsv.g:5711:2: ( ruleAdditiveExpression )
            // InternalMyCsv.g:5712:3: ruleAdditiveExpression
            {
             before(grammarAccess.getExpressionCalculAccess().getExprAdditiveExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getExpressionCalculAccess().getExprAdditiveExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionCalcul__ExprAssignment"


    // $ANTLR start "rule__AdditiveExpression__LhsAssignment_0"
    // InternalMyCsv.g:5721:1: rule__AdditiveExpression__LhsAssignment_0 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5725:1: ( ( ruleMultiplicativeExpression ) )
            // InternalMyCsv.g:5726:2: ( ruleMultiplicativeExpression )
            {
            // InternalMyCsv.g:5726:2: ( ruleMultiplicativeExpression )
            // InternalMyCsv.g:5727:3: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getLhsMultiplicativeExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getLhsMultiplicativeExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__LhsAssignment_0"


    // $ANTLR start "rule__AdditiveExpression__RhsAssignment_1"
    // InternalMyCsv.g:5736:1: rule__AdditiveExpression__RhsAssignment_1 : ( ruleAdditiveExpressionRhs ) ;
    public final void rule__AdditiveExpression__RhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5740:1: ( ( ruleAdditiveExpressionRhs ) )
            // InternalMyCsv.g:5741:2: ( ruleAdditiveExpressionRhs )
            {
            // InternalMyCsv.g:5741:2: ( ruleAdditiveExpressionRhs )
            // InternalMyCsv.g:5742:3: ruleAdditiveExpressionRhs
            {
             before(grammarAccess.getAdditiveExpressionAccess().getRhsAdditiveExpressionRhsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveExpressionRhs();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getRhsAdditiveExpressionRhsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__RhsAssignment_1"


    // $ANTLR start "rule__AdditiveExpressionRhs__OpAssignment_0"
    // InternalMyCsv.g:5751:1: rule__AdditiveExpressionRhs__OpAssignment_0 : ( ruleBinOpAdd ) ;
    public final void rule__AdditiveExpressionRhs__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5755:1: ( ( ruleBinOpAdd ) )
            // InternalMyCsv.g:5756:2: ( ruleBinOpAdd )
            {
            // InternalMyCsv.g:5756:2: ( ruleBinOpAdd )
            // InternalMyCsv.g:5757:3: ruleBinOpAdd
            {
             before(grammarAccess.getAdditiveExpressionRhsAccess().getOpBinOpAddEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinOpAdd();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionRhsAccess().getOpBinOpAddEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpressionRhs__OpAssignment_0"


    // $ANTLR start "rule__AdditiveExpressionRhs__RhsAssignment_1"
    // InternalMyCsv.g:5766:1: rule__AdditiveExpressionRhs__RhsAssignment_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpressionRhs__RhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5770:1: ( ( ruleMultiplicativeExpression ) )
            // InternalMyCsv.g:5771:2: ( ruleMultiplicativeExpression )
            {
            // InternalMyCsv.g:5771:2: ( ruleMultiplicativeExpression )
            // InternalMyCsv.g:5772:3: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionRhsAccess().getRhsMultiplicativeExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionRhsAccess().getRhsMultiplicativeExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpressionRhs__RhsAssignment_1"


    // $ANTLR start "rule__MultiplicativeExpression__LhsAssignment_0"
    // InternalMyCsv.g:5781:1: rule__MultiplicativeExpression__LhsAssignment_0 : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5785:1: ( ( ruleUnaryExpression ) )
            // InternalMyCsv.g:5786:2: ( ruleUnaryExpression )
            {
            // InternalMyCsv.g:5786:2: ( ruleUnaryExpression )
            // InternalMyCsv.g:5787:3: ruleUnaryExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getLhsUnaryExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getLhsUnaryExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__LhsAssignment_0"


    // $ANTLR start "rule__MultiplicativeExpression__RhsAssignment_1"
    // InternalMyCsv.g:5796:1: rule__MultiplicativeExpression__RhsAssignment_1 : ( ruleMultiplicativeExpressionRhs ) ;
    public final void rule__MultiplicativeExpression__RhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5800:1: ( ( ruleMultiplicativeExpressionRhs ) )
            // InternalMyCsv.g:5801:2: ( ruleMultiplicativeExpressionRhs )
            {
            // InternalMyCsv.g:5801:2: ( ruleMultiplicativeExpressionRhs )
            // InternalMyCsv.g:5802:3: ruleMultiplicativeExpressionRhs
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getRhsMultiplicativeExpressionRhsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpressionRhs();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getRhsMultiplicativeExpressionRhsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__RhsAssignment_1"


    // $ANTLR start "rule__MultiplicativeExpressionRhs__OpAssignment_0"
    // InternalMyCsv.g:5811:1: rule__MultiplicativeExpressionRhs__OpAssignment_0 : ( ruleBinOpMult ) ;
    public final void rule__MultiplicativeExpressionRhs__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5815:1: ( ( ruleBinOpMult ) )
            // InternalMyCsv.g:5816:2: ( ruleBinOpMult )
            {
            // InternalMyCsv.g:5816:2: ( ruleBinOpMult )
            // InternalMyCsv.g:5817:3: ruleBinOpMult
            {
             before(grammarAccess.getMultiplicativeExpressionRhsAccess().getOpBinOpMultEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinOpMult();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionRhsAccess().getOpBinOpMultEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpressionRhs__OpAssignment_0"


    // $ANTLR start "rule__MultiplicativeExpressionRhs__RhsAssignment_1"
    // InternalMyCsv.g:5826:1: rule__MultiplicativeExpressionRhs__RhsAssignment_1 : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpressionRhs__RhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5830:1: ( ( ruleUnaryExpression ) )
            // InternalMyCsv.g:5831:2: ( ruleUnaryExpression )
            {
            // InternalMyCsv.g:5831:2: ( ruleUnaryExpression )
            // InternalMyCsv.g:5832:3: ruleUnaryExpression
            {
             before(grammarAccess.getMultiplicativeExpressionRhsAccess().getRhsUnaryExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionRhsAccess().getRhsUnaryExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpressionRhs__RhsAssignment_1"


    // $ANTLR start "rule__UnaryExpression__OpAssignment_0"
    // InternalMyCsv.g:5841:1: rule__UnaryExpression__OpAssignment_0 : ( ( '-' ) ) ;
    public final void rule__UnaryExpression__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5845:1: ( ( ( '-' ) ) )
            // InternalMyCsv.g:5846:2: ( ( '-' ) )
            {
            // InternalMyCsv.g:5846:2: ( ( '-' ) )
            // InternalMyCsv.g:5847:3: ( '-' )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_0_0()); 
            // InternalMyCsv.g:5848:3: ( '-' )
            // InternalMyCsv.g:5849:4: '-'
            {
             before(grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_0_0()); 

            }

             after(grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__OpAssignment_0"


    // $ANTLR start "rule__UnaryExpression__ExprAssignment_1"
    // InternalMyCsv.g:5860:1: rule__UnaryExpression__ExprAssignment_1 : ( ruleExpressionCalculPrimary ) ;
    public final void rule__UnaryExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5864:1: ( ( ruleExpressionCalculPrimary ) )
            // InternalMyCsv.g:5865:2: ( ruleExpressionCalculPrimary )
            {
            // InternalMyCsv.g:5865:2: ( ruleExpressionCalculPrimary )
            // InternalMyCsv.g:5866:3: ruleExpressionCalculPrimary
            {
             before(grammarAccess.getUnaryExpressionAccess().getExprExpressionCalculPrimaryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionCalculPrimary();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getExprExpressionCalculPrimaryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__ExprAssignment_1"


    // $ANTLR start "rule__AggregatExpression__AggregatOpAssignment_0"
    // InternalMyCsv.g:5875:1: rule__AggregatExpression__AggregatOpAssignment_0 : ( ruleAggregat ) ;
    public final void rule__AggregatExpression__AggregatOpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5879:1: ( ( ruleAggregat ) )
            // InternalMyCsv.g:5880:2: ( ruleAggregat )
            {
            // InternalMyCsv.g:5880:2: ( ruleAggregat )
            // InternalMyCsv.g:5881:3: ruleAggregat
            {
             before(grammarAccess.getAggregatExpressionAccess().getAggregatOpAggregatEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAggregat();

            state._fsp--;

             after(grammarAccess.getAggregatExpressionAccess().getAggregatOpAggregatEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatExpression__AggregatOpAssignment_0"


    // $ANTLR start "rule__AggregatExpression__ArgAssignment_1"
    // InternalMyCsv.g:5890:1: rule__AggregatExpression__ArgAssignment_1 : ( ruleField ) ;
    public final void rule__AggregatExpression__ArgAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5894:1: ( ( ruleField ) )
            // InternalMyCsv.g:5895:2: ( ruleField )
            {
            // InternalMyCsv.g:5895:2: ( ruleField )
            // InternalMyCsv.g:5896:3: ruleField
            {
             before(grammarAccess.getAggregatExpressionAccess().getArgFieldParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getAggregatExpressionAccess().getArgFieldParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatExpression__ArgAssignment_1"


    // $ANTLR start "rule__LitteralInt__ValAssignment"
    // InternalMyCsv.g:5905:1: rule__LitteralInt__ValAssignment : ( RULE_INT ) ;
    public final void rule__LitteralInt__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5909:1: ( ( RULE_INT ) )
            // InternalMyCsv.g:5910:2: ( RULE_INT )
            {
            // InternalMyCsv.g:5910:2: ( RULE_INT )
            // InternalMyCsv.g:5911:3: RULE_INT
            {
             before(grammarAccess.getLitteralIntAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLitteralIntAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LitteralInt__ValAssignment"


    // $ANTLR start "rule__LitteralFloat__ValAssignment"
    // InternalMyCsv.g:5920:1: rule__LitteralFloat__ValAssignment : ( ruleFLOAT ) ;
    public final void rule__LitteralFloat__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5924:1: ( ( ruleFLOAT ) )
            // InternalMyCsv.g:5925:2: ( ruleFLOAT )
            {
            // InternalMyCsv.g:5925:2: ( ruleFLOAT )
            // InternalMyCsv.g:5926:3: ruleFLOAT
            {
             before(grammarAccess.getLitteralFloatAccess().getValFLOATParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getLitteralFloatAccess().getValFLOATParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LitteralFloat__ValAssignment"


    // $ANTLR start "rule__LitteralString__ValAssignment"
    // InternalMyCsv.g:5935:1: rule__LitteralString__ValAssignment : ( RULE_STRING ) ;
    public final void rule__LitteralString__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5939:1: ( ( RULE_STRING ) )
            // InternalMyCsv.g:5940:2: ( RULE_STRING )
            {
            // InternalMyCsv.g:5940:2: ( RULE_STRING )
            // InternalMyCsv.g:5941:3: RULE_STRING
            {
             before(grammarAccess.getLitteralStringAccess().getValSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLitteralStringAccess().getValSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LitteralString__ValAssignment"


    // $ANTLR start "rule__NestedExpressionCalcul__ExprAssignment_1"
    // InternalMyCsv.g:5950:1: rule__NestedExpressionCalcul__ExprAssignment_1 : ( ruleExpressionCalcul ) ;
    public final void rule__NestedExpressionCalcul__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyCsv.g:5954:1: ( ( ruleExpressionCalcul ) )
            // InternalMyCsv.g:5955:2: ( ruleExpressionCalcul )
            {
            // InternalMyCsv.g:5955:2: ( ruleExpressionCalcul )
            // InternalMyCsv.g:5956:3: ruleExpressionCalcul
            {
             before(grammarAccess.getNestedExpressionCalculAccess().getExprExpressionCalculParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionCalcul();

            state._fsp--;

             after(grammarAccess.getNestedExpressionCalculAccess().getExprExpressionCalculParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpressionCalcul__ExprAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000129F200000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000009781030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0080000008000050L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000049781030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000860000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0002860000000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0080000008000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000009781010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});

}