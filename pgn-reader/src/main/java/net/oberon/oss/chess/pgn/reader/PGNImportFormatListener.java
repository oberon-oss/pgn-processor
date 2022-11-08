// Generated from java-escape by ANTLR 4.11.1

package net.oberon.oss.chess.pgn.reader;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PGNImportFormatParser}.
 */
@SuppressWarnings("java:S100")
public interface PGNImportFormatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#parse}.
	 *
	 * @param ctx the parse tree
	 */
	void enterParse(PGNImportFormatParser.ParseContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#parse}.
	 *
	 * @param ctx the parse tree
	 */
	void exitParse(PGNImportFormatParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#pgn_database}.
	 *
	 * @param ctx the parse tree
	 */
	void enterPgn_database(PGNImportFormatParser.Pgn_databaseContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#pgn_database}.
	 *
	 * @param ctx the parse tree
	 */
	void exitPgn_database(PGNImportFormatParser.Pgn_databaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#pgn_game}.
	 *
	 * @param ctx the parse tree
	 */
	void enterPgn_game(PGNImportFormatParser.Pgn_gameContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#pgn_game}.
	 *
	 * @param ctx the parse tree
	 */
	void exitPgn_game(PGNImportFormatParser.Pgn_gameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#tag_section}.
	 *
	 * @param ctx the parse tree
	 */
	void enterTag_section(PGNImportFormatParser.Tag_sectionContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#tag_section}.
	 *
	 * @param ctx the parse tree
	 */
	void exitTag_section(PGNImportFormatParser.Tag_sectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#tag_pair}.
	 *
	 * @param ctx the parse tree
	 */
	void enterTag_pair(PGNImportFormatParser.Tag_pairContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#tag_pair}.
	 *
	 * @param ctx the parse tree
	 */
	void exitTag_pair(PGNImportFormatParser.Tag_pairContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#tag_name}.
	 *
	 * @param ctx the parse tree
	 */
	void enterTag_name(PGNImportFormatParser.Tag_nameContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#tag_name}.
	 *
	 * @param ctx the parse tree
	 */
	void exitTag_name(PGNImportFormatParser.Tag_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#tag_value}.
	 *
	 * @param ctx the parse tree
	 */
	void enterTag_value(PGNImportFormatParser.Tag_valueContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#tag_value}.
	 *
	 * @param ctx the parse tree
	 */
	void exitTag_value(PGNImportFormatParser.Tag_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#movetext_section}.
	 *
	 * @param ctx the parse tree
	 */
	void enterMovetext_section(PGNImportFormatParser.Movetext_sectionContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#movetext_section}.
	 *
	 * @param ctx the parse tree
	 */
	void exitMovetext_section(PGNImportFormatParser.Movetext_sectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#element_sequence}.
	 *
	 * @param ctx the parse tree
	 */
	void enterElement_sequence(PGNImportFormatParser.Element_sequenceContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#element_sequence}.
	 *
	 * @param ctx the parse tree
	 */
	void exitElement_sequence(PGNImportFormatParser.Element_sequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#element}.
	 *
	 * @param ctx the parse tree
	 */
	void enterElement(PGNImportFormatParser.ElementContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#element}.
	 *
	 * @param ctx the parse tree
	 */
	void exitElement(PGNImportFormatParser.ElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#move_number_indication}.
	 *
	 * @param ctx the parse tree
	 */
	void enterMove_number_indication(PGNImportFormatParser.Move_number_indicationContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#move_number_indication}.
	 *
	 * @param ctx the parse tree
	 */
	void exitMove_number_indication(PGNImportFormatParser.Move_number_indicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#san_move}.
	 *
	 * @param ctx the parse tree
	 */
	void enterSan_move(PGNImportFormatParser.San_moveContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#san_move}.
	 *
	 * @param ctx the parse tree
	 */
	void exitSan_move(PGNImportFormatParser.San_moveContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#recursive_variation}.
	 *
	 * @param ctx the parse tree
	 */
	void enterRecursive_variation(PGNImportFormatParser.Recursive_variationContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#recursive_variation}.
	 *
	 * @param ctx the parse tree
	 */
	void exitRecursive_variation(PGNImportFormatParser.Recursive_variationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#move_comment}.
	 *
	 * @param ctx the parse tree
	 */
	void enterMove_comment(PGNImportFormatParser.Move_commentContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#move_comment}.
	 *
	 * @param ctx the parse tree
	 */
	void exitMove_comment(PGNImportFormatParser.Move_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#nag}.
	 *
	 * @param ctx the parse tree
	 */
	void enterNag(PGNImportFormatParser.NagContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#nag}.
	 *
	 * @param ctx the parse tree
	 */
	void exitNag(PGNImportFormatParser.NagContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#rest_of_line_comment}.
	 *
	 * @param ctx the parse tree
	 */
	void enterRest_of_line_comment(PGNImportFormatParser.Rest_of_line_commentContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#rest_of_line_comment}.
	 *
	 * @param ctx the parse tree
	 */
	void exitRest_of_line_comment(PGNImportFormatParser.Rest_of_line_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#processing_instruction}.
	 *
	 * @param ctx the parse tree
	 */
	void enterProcessing_instruction(PGNImportFormatParser.Processing_instructionContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#processing_instruction}.
	 *
	 * @param ctx the parse tree
	 */
	void exitProcessing_instruction(PGNImportFormatParser.Processing_instructionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNImportFormatParser#game_termination}.
	 *
	 * @param ctx the parse tree
	 */
	void enterGame_termination(PGNImportFormatParser.Game_terminationContext ctx);

	/**
	 * Exit a parse tree produced by {@link PGNImportFormatParser#game_termination}.
	 *
	 * @param ctx the parse tree
	 */
	void exitGame_termination(PGNImportFormatParser.Game_terminationContext ctx);
}