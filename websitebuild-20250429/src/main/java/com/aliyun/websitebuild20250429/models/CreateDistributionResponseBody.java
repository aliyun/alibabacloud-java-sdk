// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateDistributionResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access was denied.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retry is allowed. Valid values:</p>
     * <ul>
     * <li>false: Retry is not allowed.</li>
     * <li>true: Retry is allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>watermark</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The returned error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public CreateDistributionResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>System exception</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Indicates whether the request is processed synchronously.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static CreateDistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributionResponseBody self = new CreateDistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDistributionResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateDistributionResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public CreateDistributionResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateDistributionResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public CreateDistributionResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public CreateDistributionResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public CreateDistributionResponseBody setModule(CreateDistributionResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CreateDistributionResponseBodyModule getModule() {
        return this.module;
    }

    public CreateDistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDistributionResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public CreateDistributionResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public CreateDistributionResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class CreateDistributionResponseBodyModuleDraftsCoverImages extends TeaModel {
        /**
         * <p>The file ID in the material center.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MaterialFileId")
        public String materialFileId;

        /**
         * <p>The CDN URL of the image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://another-bucket.oss-cn-hangzhou.aliyuncs.com/path/to/file3%5C%5C%22%5C%5C%22%60curl">http://another-bucket.oss-cn-hangzhou.aliyuncs.com/path/to/file3\\&quot;\\&quot;`curl</a> YFLd1vS4.popscan.xaliyun.com`\&quot;\&quot;</p>
         */
        @NameInMap("OssUrl")
        public String ossUrl;

        /**
         * <p>The sort order number.</p>
         * 
         * <strong>example:</strong>
         * <p>Desc</p>
         */
        @NameInMap("SortOrder")
        public Integer sortOrder;

        public static CreateDistributionResponseBodyModuleDraftsCoverImages build(java.util.Map<String, ?> map) throws Exception {
            CreateDistributionResponseBodyModuleDraftsCoverImages self = new CreateDistributionResponseBodyModuleDraftsCoverImages();
            return TeaModel.build(map, self);
        }

        public CreateDistributionResponseBodyModuleDraftsCoverImages setMaterialFileId(String materialFileId) {
            this.materialFileId = materialFileId;
            return this;
        }
        public String getMaterialFileId() {
            return this.materialFileId;
        }

        public CreateDistributionResponseBodyModuleDraftsCoverImages setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public CreateDistributionResponseBodyModuleDraftsCoverImages setSortOrder(Integer sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Integer getSortOrder() {
            return this.sortOrder;
        }

    }

    public static class CreateDistributionResponseBodyModuleDrafts extends TeaModel {
        /**
         * <p>The AI adaptation status. Valid values: NONE, ADAPTING, DONE, and FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("AdaptStatus")
        public String adaptStatus;

        /**
         * <p>The channel-adapted content body.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("AdaptedContent")
        public String adaptedContent;

        /**
         * <p>The channel-adapted title.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("AdaptedTitle")
        public String adaptedTitle;

        /**
         * <p>The channel enumeration value.</p>
         * 
         * <strong>example:</strong>
         * <p>WECHAT</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The publishing account snapshot. For overseas channels, this is the OWLAIS socialAccountNo.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("ChannelAccount")
        public String channelAccount;

        /**
         * <p>The display name of the publishing account.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("ChannelAccountName")
        public String channelAccountName;

        /**
         * <p>The display name of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>ch3</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>The channel type. Valid values: DOMESTIC, OVERSEA, and INTERNAL.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChannelType")
        public String channelType;

        /**
         * <p>The list of channel cover images.</p>
         */
        @NameInMap("CoverImages")
        public java.util.List<CreateDistributionResponseBodyModuleDraftsCoverImages> coverImages;

        /**
         * <p>The channel draft ID.</p>
         * 
         * <strong>example:</strong>
         * <p>draft-789</p>
         */
        @NameInMap("DraftId")
        public String draftId;

        /**
         * <p>The ID returned by the platform.</p>
         * 
         * <strong>example:</strong>
         * <p>1378080</p>
         */
        @NameInMap("ExternalId")
        public String externalId;

        /**
         * <p>The redirect URL of the platform.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://net-video.mistong.com:10160/api/preview/video/2026/04/15/67603b7c84694e619435e4662e98cb23_20260415095633.mp4">https://net-video.mistong.com:10160/api/preview/video/2026/04/15/67603b7c84694e619435e4662e98cb23_20260415095633.mp4</a></p>
         */
        @NameInMap("ExternalUrl")
        public String externalUrl;

        /**
         * <p>The failure reason.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("FailReason")
        public String failReason;

        /**
         * <p>The channel-specific publish configuration in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("PublishConfig")
        public String publishConfig;

        /**
         * <p>The publish time, in millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("PublishedAt")
        public Long publishedAt;

        /**
         * <p>The status. Valid values: EDITING, PUBLISHING, SUCCESS, and FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateDistributionResponseBodyModuleDrafts build(java.util.Map<String, ?> map) throws Exception {
            CreateDistributionResponseBodyModuleDrafts self = new CreateDistributionResponseBodyModuleDrafts();
            return TeaModel.build(map, self);
        }

        public CreateDistributionResponseBodyModuleDrafts setAdaptStatus(String adaptStatus) {
            this.adaptStatus = adaptStatus;
            return this;
        }
        public String getAdaptStatus() {
            return this.adaptStatus;
        }

        public CreateDistributionResponseBodyModuleDrafts setAdaptedContent(String adaptedContent) {
            this.adaptedContent = adaptedContent;
            return this;
        }
        public String getAdaptedContent() {
            return this.adaptedContent;
        }

        public CreateDistributionResponseBodyModuleDrafts setAdaptedTitle(String adaptedTitle) {
            this.adaptedTitle = adaptedTitle;
            return this;
        }
        public String getAdaptedTitle() {
            return this.adaptedTitle;
        }

        public CreateDistributionResponseBodyModuleDrafts setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public CreateDistributionResponseBodyModuleDrafts setChannelAccount(String channelAccount) {
            this.channelAccount = channelAccount;
            return this;
        }
        public String getChannelAccount() {
            return this.channelAccount;
        }

        public CreateDistributionResponseBodyModuleDrafts setChannelAccountName(String channelAccountName) {
            this.channelAccountName = channelAccountName;
            return this;
        }
        public String getChannelAccountName() {
            return this.channelAccountName;
        }

        public CreateDistributionResponseBodyModuleDrafts setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public CreateDistributionResponseBodyModuleDrafts setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public CreateDistributionResponseBodyModuleDrafts setCoverImages(java.util.List<CreateDistributionResponseBodyModuleDraftsCoverImages> coverImages) {
            this.coverImages = coverImages;
            return this;
        }
        public java.util.List<CreateDistributionResponseBodyModuleDraftsCoverImages> getCoverImages() {
            return this.coverImages;
        }

        public CreateDistributionResponseBodyModuleDrafts setDraftId(String draftId) {
            this.draftId = draftId;
            return this;
        }
        public String getDraftId() {
            return this.draftId;
        }

        public CreateDistributionResponseBodyModuleDrafts setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public CreateDistributionResponseBodyModuleDrafts setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }
        public String getExternalUrl() {
            return this.externalUrl;
        }

        public CreateDistributionResponseBodyModuleDrafts setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public CreateDistributionResponseBodyModuleDrafts setPublishConfig(String publishConfig) {
            this.publishConfig = publishConfig;
            return this;
        }
        public String getPublishConfig() {
            return this.publishConfig;
        }

        public CreateDistributionResponseBodyModuleDrafts setPublishedAt(Long publishedAt) {
            this.publishedAt = publishedAt;
            return this;
        }
        public Long getPublishedAt() {
            return this.publishedAt;
        }

        public CreateDistributionResponseBodyModuleDrafts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateDistributionResponseBodyModule extends TeaModel {
        /**
         * <p>The article ID.</p>
         * 
         * <strong>example:</strong>
         * <p>28733</p>
         */
        @NameInMap("ArticleId")
        public String articleId;

        /**
         * <p>The distribution batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pcb-uf6dkhq311uxuwo2</p>
         */
        @NameInMap("BatchId")
        public String batchId;

        /**
         * <p>The creation time, in millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-03 02:05:01</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The list of channel drafts within the batch.</p>
         */
        @NameInMap("Drafts")
        public java.util.List<CreateDistributionResponseBodyModuleDrafts> drafts;

        public static CreateDistributionResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CreateDistributionResponseBodyModule self = new CreateDistributionResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CreateDistributionResponseBodyModule setArticleId(String articleId) {
            this.articleId = articleId;
            return this;
        }
        public String getArticleId() {
            return this.articleId;
        }

        public CreateDistributionResponseBodyModule setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public CreateDistributionResponseBodyModule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateDistributionResponseBodyModule setDrafts(java.util.List<CreateDistributionResponseBodyModuleDrafts> drafts) {
            this.drafts = drafts;
            return this;
        }
        public java.util.List<CreateDistributionResponseBodyModuleDrafts> getDrafts() {
            return this.drafts;
        }

    }

}
