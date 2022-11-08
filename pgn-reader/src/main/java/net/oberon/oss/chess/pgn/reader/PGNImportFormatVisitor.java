// Generated from java-escape by ANTLR 4.11.1

package net.oberon.oss.chess.pgn.reader;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PGNImportFormatParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
@SuppressWarnings("java:S100")
public interface PGNImportFormatVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#parse}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitParse(PGNImportFormatParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#pgn_database}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitPgn_database(PGNImportFormatParser.Pgn_databaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#pgn_game}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitPgn_game(PGNImportFormatParser.Pgn_gameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#tag_section}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitTag_section(PGNImportFormatParser.Tag_sectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#tag_pair}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitTag_pair(PGNImportFormatParser.Tag_pairContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#tag_name}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitTag_name(PGNImportFormatParser.Tag_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#tag_value}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitTag_value(PGNImportFormatParser.Tag_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#movetext_section}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitMovetext_section(PGNImportFormatParser.Movetext_sectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#element_sequence}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitElement_sequence(PGNImportFormatParser.Element_sequenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#element}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitElement(PGNImportFormatParser.ElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#move_number_indication}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitMove_number_indication(PGNImportFormatParser.Move_number_indicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#san_move}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitSan_move(PGNImportFormatParser.San_moveContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#recursive_variation}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitRecursive_variation(PGNImportFormatParser.Recursive_variationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#move_comment}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitMove_comment(PGNImportFormatParser.Move_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#nag}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitNag(PGNImportFormatParser.NagContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#rest_of_line_comment}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitRest_of_line_comment(PGNImportFormatParser.Rest_of_line_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#processing_instruction}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitProcessing_instruction(PGNImportFormatParser.Processing_instructionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNImportFormatParser#game_termination}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitGame_termination(PGNImportFormatParser.Game_terminationContext ctx);
}