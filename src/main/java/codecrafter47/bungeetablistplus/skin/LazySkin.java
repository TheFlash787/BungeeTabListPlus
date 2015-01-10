/*
 *
 *  * BungeeTabListPlus - a bungeecord plugin to customize the tablist
 *  *
 *  * Copyright (C) 2014 Florian Stober
 *  *
 *  * This program is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * This program is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package codecrafter47.bungeetablistplus.skin;

import codecrafter47.bungeetablistplus.BungeeTabListPlus;

import java.util.UUID;

public class LazySkin implements Skin {

    private final String nameOrUUID;

    public LazySkin(String nameOrUUID) {
        this.nameOrUUID = nameOrUUID;
    }

    @Override
    public String[] toProperty() {
        return BungeeTabListPlus.getInstance().getSkinManager().getSkin(nameOrUUID).toProperty();
    }

    @Override
    public UUID getOwner() {
        return BungeeTabListPlus.getInstance().getSkinManager().getSkin(nameOrUUID).getOwner();
    }
}