package mod.adrenix.nostalgic.client.config.feature;

import mod.adrenix.nostalgic.client.config.reflect.GroupType;

public enum CandyFeature implements IFeature
{
    FIX_ITEM_MODEL_GAP,
    VERSION_OVERLAY,
    BUTTON_HOVER,
    TOOLTIP_BOXES,
    LIGHT_FLICKER,
    DURABILITY_COLORS,
    ITEM_HOLDING,
    ITEM_MERGING,
    FLAT_ITEMS,
    FLAT_FRAMES,
    FLAT_THROWN_ITEMS,
    FLAT_ENCHANTED_ITEMS,
    TITLE_SCREEN,
    ALPHA_LOGO,
    LOADING_SCREENS,
    LIGHTING,
    FOG,
    NETHER_FOG,
    SUNRISE_SUNSET_FOG,
    FOG_COLOR,
    SKY_COLOR,
    BLUE_VOID,
    BLUE_VOID_OVERRIDE,
    SQUARE_BORDER,
    SWEEP,
    MIXED_EXPLOSION_PARTICLES,
    EXPLOSION_PARTICLES,
    SUNRISE_AT_NORTH,
    OPAQUE_EXPERIENCE,
    NO_DAMAGE_PARTICLES,
    NO_CRIT_PARTICLES,
    NO_MAGIC_HIT_PARTICLES,
    NO_SELECTED_ITEM_NAME,
    PLAIN_SELECTED_ITEM_NAME,
    CLOUD_HEIGHT;

    /* Implementation */

    private String key;
    private boolean loaded = false;

    @Override public String getKey() { return this.key; }
    @Override public GroupType getGroup() { return GroupType.CANDY; }

    @Override public boolean isLoaded() { return this.loaded; }
    @Override public void setLoaded(boolean state) { this.loaded = state; }
    @Override public void setKey(String key) { this.key = key; }
}