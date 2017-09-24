package com.base.game.dialogue.eventLog;

import com.base.game.inventory.item.AbstractItemType;
import com.base.main.Main;
import com.base.utils.Colour;
import com.base.utils.Util;

/**
 * @since 0.1.85
 * @version 0.1.85
 * @author Innoxia
 */
public class EventLogEntryBookAddedToLibrary extends EventLogEntry {

	private static final long serialVersionUID = 1L;
	
	public EventLogEntryBookAddedToLibrary(AbstractItemType book) {
		super(Main.game.getMinutesPassed(), "Added to Library", "<span style='color:"+book.getRarity().getColour().toWebHexString()+";'>"+Util.capitaliseSentence(book.getName(false))+"</span>");
	}
	
	@Override
	public String getFormattedEntry() {
		return "<span style='color:"+Colour.GENERIC_GOOD.toWebHexString()+";'>"+name+"</span>: "+description;
	}
	
	@Override
	public String getMainDialogueDescription() {
		return "<p style='text-align:center;'>"
				+ "<b style='color:"+Colour.GENERIC_EXCELLENT.toWebHexString()+";'>Book added to Lilaya's library</b>"
				+ "</br>"
				+ description
			+ "</p>";
	}
}
