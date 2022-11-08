/*
     Copyright © 2000 and beyond by Fabien H. Dumay

  	Licensed under the Apache License, Version 2.0 (the "License");
  	you may not use this file except in compliance with the License.
  	You may obtain a copy of the License at

  	http://www.apache.org/licenses/LICENSE-2.0

  	Unless required by applicable law or agreed to in writing, software
  	distributed under the License is distributed on an "AS IS" BASIS,
  	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  	See the License for the specific language governing permissions and
  	limitations under the License.
 */

package net.oberon.oss.chess.pgn.cli;

import picocli.CommandLine;

import java.io.IOException;
import java.util.concurrent.Callable;

/**
 * Command line interface for accessing and controlling of the PGN processor.
 *
 * @author Fabien H. Dumay
 * @since 1.0.0
 */
@CommandLine.Command(
	name = "Main",
	description = "Allows control over loading and processing data from input sources.",
	version = "1.0.0"
)
public class Main implements Callable<Integer> {

	public static void main(String[] args) {
		new CommandLine(Main.class).execute(args);
	}

	@Override
	public Integer call() throws Exception {
		throw new IOException("Not Implemented yet");
	}
}