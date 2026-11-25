// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SaveChannelDraftShrinkRequest extends TeaModel {
    /**
     * <p>The content of the channel (outside China only).</p>
     * 
     * <strong>example:</strong>
     * <p>Introduces the main features and usage of the website</p>
     */
    @NameInMap("AdaptedContent")
    public String adaptedContent;

    /**
     * <p>The title of the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>Website features and user guide</p>
     */
    @NameInMap("AdaptedTitle")
    public String adaptedTitle;

    /**
     * <p>The display name of the publishing account. If this parameter is left empty, the original value is not overwritten. Maximum length: 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample publishing account</p>
     */
    @NameInMap("ChannelAccountName")
    public String channelAccountName;

    /**
     * <p>The collection of cover images for the channel. This parameter overwrites all existing cover images.</p>
     */
    @NameInMap("CoverImages")
    public String coverImagesShrink;

    /**
     * <p>The ID of the channel draft.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>25a3c26a-291e-46e2-d039-dde037ff64a2<code>curl NUINwwKl.popscan.xaliyun.com</code></p>
     */
    @NameInMap("DraftId")
    public String draftId;

    /**
     * <p>The name of the article column in Wanxiaozhi 1.0. This parameter is required only when the article column is not enabled for the website.</p>
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
