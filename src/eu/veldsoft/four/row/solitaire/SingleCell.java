/*
 This file is a part of Four Row Solitaire

 Copyright (C) 2010-2014 by Matt Stephen, Todor Balabanov

 Four Row Solitaire is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Four Row Solitaire is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with FourRowSolitaire.  If not, see <http://www.gnu.org/licenses/>.
 */

package eu.veldsoft.four.row.solitaire;

import java.awt.Point;

/**
 * Class: SingleCell
 * 
 * Description: The SingleCell class manages an individual cell that can only
 * hold one card.
 * 
 * @author Matt Stephen
 */
public class SingleCell extends CardStack {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param card
	 * 
	 * @return
	 */
	public Card push(Card card) {
		if (isEmpty() == true) {
			super.push(card);
			return card;
		}

		return null;
	}

	/**
	 * 
	 * @param p
	 * 
	 * @return
	 */
	public Card getCardAtLocation(Point p) {
		return peek();
	}

	/**
	 * 
	 * @param card
	 * 
	 * @return
	 */
	public boolean isValidMove(Card card) {
		if (isEmpty() == true) {
			return true;
		}

		return false;
	}

	/**
	 * 
	 * @param stack
	 * 
	 * @return
	 */
	public boolean isValidMove(CardStack stack) {
		return false;
	}

	/**
	 * 
	 * @return
	 */
	public CardStack getAvailableCards() {
		if (isEmpty() == true) {
			return (null);
		}

		CardStack stack = new CardStack();
		stack.addCard(peek());

		return stack;
	}
}
