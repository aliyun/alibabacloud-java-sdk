// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RewriteChannelTitleResponseBody extends TeaModel {
    /**
     * <p>The details of the permission verification failure.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retry is allowed.</p>
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
     * <p>ish-intelligence-store-platform-admin-web</p>
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
     * <p>The dynamic error message, which is used to replace the <code>%s</code> placeholder in the <strong>ErrMessage</strong> response parameter.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the value of the request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>Indicates whether the operation is successful.</p>
     */
    @NameInMap("Module")
    public RewriteChannelTitleResponseBodyModule module;

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

    public static RewriteChannelTitleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RewriteChannelTitleResponseBody self = new RewriteChannelTitleResponseBody();
        return TeaModel.build(map, self);
    }

    public RewriteChannelTitleResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public RewriteChannelTitleResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public RewriteChannelTitleResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public RewriteChannelTitleResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public RewriteChannelTitleResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public RewriteChannelTitleResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public RewriteChannelTitleResponseBody setModule(RewriteChannelTitleResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public RewriteChannelTitleResponseBodyModule getModule() {
        return this.module;
    }

    public RewriteChannelTitleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RewriteChannelTitleResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public RewriteChannelTitleResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public RewriteChannelTitleResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class RewriteChannelTitleResponseBodyModuleCoverImages extends TeaModel {
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
         * <p><a href="https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/30516570">https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/30516570</a></p>
         */
        @NameInMap("OssUrl")
        public String ossUrl;

        /**
         * <p>The sort order number.</p>
         * 
         * <strong>example:</strong>
         * <p>Ascending</p>
         */
        @NameInMap("SortOrder")
        public Integer sortOrder;

        public static RewriteChannelTitleResponseBodyModuleCoverImages build(java.util.Map<String, ?> map) throws Exception {
            RewriteChannelTitleResponseBodyModuleCoverImages self = new RewriteChannelTitleResponseBodyModuleCoverImages();
            return TeaModel.build(map, self);
        }

        public RewriteChannelTitleResponseBodyModuleCoverImages setMaterialFileId(String materialFileId) {
            this.materialFileId = materialFileId;
            return this;
        }
        public String getMaterialFileId() {
            return this.materialFileId;
        }

        public RewriteChannelTitleResponseBodyModuleCoverImages setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public RewriteChannelTitleResponseBodyModuleCoverImages setSortOrder(Integer sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Integer getSortOrder() {
            return this.sortOrder;
        }

    }

    public static class RewriteChannelTitleResponseBodyModule extends TeaModel {
        /**
         * <p>The AI adaptation status. Valid values: NONE, ADAPTING, DONE, and FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AdaptStatus")
        public String adaptStatus;

        /**
         * <p>The channel-adapted content.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AdaptedContent")
        public String adaptedContent;

        /**
         * <p>The channel-adapted title.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
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
         * <p>The publishing account snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
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
         * <p>sipmplm</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>The channel type. Valid values: DOMESTIC, OVERSEA, and INTERNAL.</p>
         * 
         * <strong>example:</strong>
         * <p>wechat</p>
         */
        @NameInMap("ChannelType")
        public String channelType;

        /**
         * <p>The list of channel cover images.</p>
         */
        @NameInMap("CoverImages")
        public java.util.List<RewriteChannelTitleResponseBodyModuleCoverImages> coverImages;

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
         * <p>a2b36d4b1dab614623187f01f01d138e809d</p>
         */
        @NameInMap("ExternalId")
        public String externalId;

        /**
         * <p>The redirect URL of the platform.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://net-video.mistong.com:10160/api/preview/video/2025/11/03/53a90dd9bdfa44bda53aa2534bb8f463_20251103100032.mp4">https://net-video.mistong.com:10160/api/preview/video/2025/11/03/53a90dd9bdfa44bda53aa2534bb8f463_20251103100032.mp4</a></p>
         */
        @NameInMap("ExternalUrl")
        public String externalUrl;

        /**
         * <p>The failure reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid parameter</p>
         */
        @NameInMap("FailReason")
        public String failReason;

        /**
         * <p>The channel-specific publishing configuration in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("PublishConfig")
        public String publishConfig;

        /**
         * <p>The publishing time, in millisecond timestamp.</p>
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
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static RewriteChannelTitleResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            RewriteChannelTitleResponseBodyModule self = new RewriteChannelTitleResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public RewriteChannelTitleResponseBodyModule setAdaptStatus(String adaptStatus) {
            this.adaptStatus = adaptStatus;
            return this;
        }
        public String getAdaptStatus() {
            return this.adaptStatus;
        }

        public RewriteChannelTitleResponseBodyModule setAdaptedContent(String adaptedContent) {
            this.adaptedContent = adaptedContent;
            return this;
        }
        public String getAdaptedContent() {
            return this.adaptedContent;
        }

        public RewriteChannelTitleResponseBodyModule setAdaptedTitle(String adaptedTitle) {
            this.adaptedTitle = adaptedTitle;
            return this;
        }
        public String getAdaptedTitle() {
            return this.adaptedTitle;
        }

        public RewriteChannelTitleResponseBodyModule setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public RewriteChannelTitleResponseBodyModule setChannelAccount(String channelAccount) {
            this.channelAccount = channelAccount;
            return this;
        }
        public String getChannelAccount() {
            return this.channelAccount;
        }

        public RewriteChannelTitleResponseBodyModule setChannelAccountName(String channelAccountName) {
            this.channelAccountName = channelAccountName;
            return this;
        }
        public String getChannelAccountName() {
            return this.channelAccountName;
        }

        public RewriteChannelTitleResponseBodyModule setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public RewriteChannelTitleResponseBodyModule setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public RewriteChannelTitleResponseBodyModule setCoverImages(java.util.List<RewriteChannelTitleResponseBodyModuleCoverImages> coverImages) {
            this.coverImages = coverImages;
            return this;
        }
        public java.util.List<RewriteChannelTitleResponseBodyModuleCoverImages> getCoverImages() {
            return this.coverImages;
        }

        public RewriteChannelTitleResponseBodyModule setDraftId(String draftId) {
            this.draftId = draftId;
            return this;
        }
        public String getDraftId() {
            return this.draftId;
        }

        public RewriteChannelTitleResponseBodyModule setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public RewriteChannelTitleResponseBodyModule setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }
        public String getExternalUrl() {
            return this.externalUrl;
        }

        public RewriteChannelTitleResponseBodyModule setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public RewriteChannelTitleResponseBodyModule setPublishConfig(String publishConfig) {
            this.publishConfig = publishConfig;
            return this;
        }
        public String getPublishConfig() {
            return this.publishConfig;
        }

        public RewriteChannelTitleResponseBodyModule setPublishedAt(Long publishedAt) {
            this.publishedAt = publishedAt;
            return this;
        }
        public Long getPublishedAt() {
            return this.publishedAt;
        }

        public RewriteChannelTitleResponseBodyModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
