/*
 * Copyright 2010 The gwtquery plugins team.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package gwtquery.plugins.droppable.client.events;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.EventHandler;
import gwtquery.plugins.draggable.client.events.DragContext;

/**
 * Event fired when a droppable element is deactivated.
 *
 * @author Julien Dramaix (julien.dramaix@gmail.com)
 */
public class DeactivateDroppableEvent
        extends AbstractDroppableEvent<DeactivateDroppableEvent.DeactivateDroppableEventHandler> {
    public interface DeactivateDroppableEventHandler extends EventHandler {
        public void onDeactivateDroppable(DeactivateDroppableEvent event);
    }

    public static Type<DeactivateDroppableEventHandler> TYPE = new Type<DeactivateDroppableEventHandler>();

    public DeactivateDroppableEvent(DragAndDropContext ctx) {
        super(ctx);
    }

    public DeactivateDroppableEvent(Element droppable, DragContext dragCtx) {
        super(droppable, dragCtx);
    }

    @Override
    public Type<DeactivateDroppableEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(DeactivateDroppableEventHandler handler) {
        handler.onDeactivateDroppable(this);
    }
}
