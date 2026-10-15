// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SaveChannelDraftRequest extends TeaModel {
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
    public java.util.List<SaveChannelDraftRequestCoverImages> coverImages;

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

    public static SaveChannelDraftRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveChannelDraftRequest self = new SaveChannelDraftRequest();
        return TeaModel.build(map, self);
    }

    public SaveChannelDraftRequest setAdaptedContent(String adaptedContent) {
        this.adaptedContent = adaptedContent;
        return this;
    }
    public String getAdaptedContent() {
        return this.adaptedContent;
    }

    public SaveChannelDraftRequest setAdaptedTitle(String adaptedTitle) {
        this.adaptedTitle = adaptedTitle;
        return this;
    }
    public String getAdaptedTitle() {
        return this.adaptedTitle;
    }

    public SaveChannelDraftRequest setChannelAccountName(String channelAccountName) {
        this.channelAccountName = channelAccountName;
        return this;
    }
    public String getChannelAccountName() {
        return this.channelAccountName;
    }

    public SaveChannelDraftRequest setCoverImages(java.util.List<SaveChannelDraftRequestCoverImages> coverImages) {
        this.coverImages = coverImages;
        return this;
    }
    public java.util.List<SaveChannelDraftRequestCoverImages> getCoverImages() {
        return this.coverImages;
    }

    public SaveChannelDraftRequest setDraftId(String draftId) {
        this.draftId = draftId;
        return this;
    }
    public String getDraftId() {
        return this.draftId;
    }

    public SaveChannelDraftRequest setWebsiteNavName(String websiteNavName) {
        this.websiteNavName = websiteNavName;
        return this;
    }
    public String getWebsiteNavName() {
        return this.websiteNavName;
    }

    public static class SaveChannelDraftRequestCoverImages extends TeaModel {
        /**
         * <p>The image URL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://campus-retail-prod.oss-cn-hangzhou.aliyuncs.com/d1c5efed9b3a419bb54b75056d54dae6.jpg?Expires=4928263770&OSSAccessKeyId=LTAI5tLYirCpzCVXoArh1VYt&Signature=">http://campus-retail-prod.oss-cn-hangzhou.aliyuncs.com/d1c5efed9b3a419bb54b75056d54dae6.jpg?Expires=4928263770&amp;OSSAccessKeyId=LTAI5tLYirCpzCVXoArh1VYt&amp;Signature=</a>******************************</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The material center file ID (optional).</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("MaterialFileId")
        public String materialFileId;

        /**
         * <p>The sort order.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ascending</p>
         */
        @NameInMap("SortOrder")
        public Integer sortOrder;

        public static SaveChannelDraftRequestCoverImages build(java.util.Map<String, ?> map) throws Exception {
            SaveChannelDraftRequestCoverImages self = new SaveChannelDraftRequestCoverImages();
            return TeaModel.build(map, self);
        }

        public SaveChannelDraftRequestCoverImages setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public SaveChannelDraftRequestCoverImages setMaterialFileId(String materialFileId) {
            this.materialFileId = materialFileId;
            return this;
        }
        public String getMaterialFileId() {
            return this.materialFileId;
        }

        public SaveChannelDraftRequestCoverImages setSortOrder(Integer sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Integer getSortOrder() {
            return this.sortOrder;
        }

    }

}
