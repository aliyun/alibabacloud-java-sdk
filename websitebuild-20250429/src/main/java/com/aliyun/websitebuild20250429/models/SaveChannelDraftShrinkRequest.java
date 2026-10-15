// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SaveChannelDraftShrinkRequest extends TeaModel {
    /**
     * <p>The channel content (outside China only).</p>
     * 
     * <strong>example:</strong>
     * <p>x</p>
     */
    @NameInMap("AdaptedContent")
    public String adaptedContent;

    /**
     * <p>The channel title.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("AdaptedTitle")
    public String adaptedTitle;

    /**
     * <p>The display name of the publishing account. A null value does not overwrite the original value. Maximum length: 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("ChannelAccountName")
    public String channelAccountName;

    /**
     * <p>The collection of channel cover images (full overwrite).</p>
     */
    @NameInMap("CoverImages")
    public String coverImagesShrink;

    /**
     * <p>The channel draft ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>25a3c26a-291e-46e2-d039-dde037ff64a2<code>curl NUINwwKl.popscan.xaliyun.com</code></p>
     */
    @NameInMap("DraftId")
    public String draftId;

    /**
     * <p>The article column name for Wanxiaozhi 1.0. This parameter is required only when the website has not enabled an article column.</p>
     * 
     * <strong>example:</strong>
     * <p>Article</p>
     */
    @NameInMap("WebsiteNavName")
    public String websiteNavName;

    public static SaveChannelDraftShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveChannelDraftShrinkRequest self = new SaveChannelDraftShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveChannelDraftShrinkRequest setAdaptedContent(String adaptedContent) {
        this.adaptedContent = adaptedContent;
        return this;
    }
    public String getAdaptedContent() {
        return this.adaptedContent;
    }

    public SaveChannelDraftShrinkRequest setAdaptedTitle(String adaptedTitle) {
        this.adaptedTitle = adaptedTitle;
        return this;
    }
    public String getAdaptedTitle() {
        return this.adaptedTitle;
    }

    public SaveChannelDraftShrinkRequest setChannelAccountName(String channelAccountName) {
        this.channelAccountName = channelAccountName;
        return this;
    }
    public String getChannelAccountName() {
        return this.channelAccountName;
    }

    public SaveChannelDraftShrinkRequest setCoverImagesShrink(String coverImagesShrink) {
        this.coverImagesShrink = coverImagesShrink;
        return this;
    }
    public String getCoverImagesShrink() {
        return this.coverImagesShrink;
    }

    public SaveChannelDraftShrinkRequest setDraftId(String draftId) {
        this.draftId = draftId;
        return this;
    }
    public String getDraftId() {
        return this.draftId;
    }

    public SaveChannelDraftShrinkRequest setWebsiteNavName(String websiteNavName) {
        this.websiteNavName = websiteNavName;
        return this;
    }
    public String getWebsiteNavName() {
        return this.websiteNavName;
    }

}
