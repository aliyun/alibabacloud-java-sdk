// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SaveChannelDraftRequest extends TeaModel {
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
    public java.util.List<SaveChannelDraftRequestCoverImages> coverImages;

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
         * <p>The URL of the image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://campus-retail-prod.oss-cn-hangzhou.aliyuncs.com/d1c5efed9b3a419bb54b75056d54dae6.jpg?Expires=4928263770&OSSAccessKeyId=LTAI5tLYir****VXoArh1VYt&Signature=">http://campus-retail-prod.oss-cn-hangzhou.aliyuncs.com/d1c5efed9b3a419bb54b75056d54dae6.jpg?Expires=4928263770&amp;OSSAccessKeyId=LTAI5tLYir****VXoArh1VYt&amp;Signature=</a>******************************</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The ID of the file in the material center. This parameter is optional.</p>
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
         * <p>1</p>
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
