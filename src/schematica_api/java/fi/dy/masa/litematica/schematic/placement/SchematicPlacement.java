/*
 * This file is part of Baritone.
 *
 * Baritone is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Baritone is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Baritone.  If not, see <https://www.gnu.org/licenses/>.
 */

package fi.dy.masa.litematica.schematic.placement;

import fi.dy.masa.litematica.schematic.ISchematic;
import fi.dy.masa.litematica.selection.SelectionBox;
import fi.dy.masa.malilib.util.data.EnabledCondition;
import fi.dy.masa.malilib.util.position.IntBoundingBox;

public class SchematicPlacement extends BasePlacement {

    public IntBoundingBox getEnclosingBox() {
        return null;
    }

    public ISchematic getSchematic() {
        return null;
    }

    public SelectionBox getSubRegionBox(String regionName, EnabledCondition condition) {
        return null;
    }

}
