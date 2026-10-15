// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class TranslateChannelDraftResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access was denied.</p>
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
     * <p>The application name used to query the application.</p>
     * 
     * <strong>example:</strong>
     * <p>ish-intelligence-store-platform-admin-web</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The dynamic code. This parameter is not in use. Ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message that is used to replace the <code>%s</code> variable in the <strong>ErrMessage</strong> return parameter.</p>
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
     * <p>Indicates whether the deletion was successful.</p>
     */
    @NameInMap("Module")
    public TranslateChannelDraftResponseBodyModule module;

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
     * <p>The exception message.</p>
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

    public static TranslateChannelDraftResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TranslateChannelDraftResponseBody self = new TranslateChannelDraftResponseBody();
        return TeaModel.build(map, self);
    }

    public TranslateChannelDraftResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public TranslateChannelDraftResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public TranslateChannelDraftResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public TranslateChannelDraftResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public TranslateChannelDraftResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public TranslateChannelDraftResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public TranslateChannelDraftResponseBody setModule(TranslateChannelDraftResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TranslateChannelDraftResponseBodyModule getModule() {
        return this.module;
    }

    public TranslateChannelDraftResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TranslateChannelDraftResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public TranslateChannelDraftResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public TranslateChannelDraftResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class TranslateChannelDraftResponseBodyModuleCoverImages extends TeaModel {
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
         * <p>oss://anchashiscan.oss-cn-hangzhou.aliyuncs.com/prodpopscanBnlK054f</p>
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

        public static TranslateChannelDraftResponseBodyModuleCoverImages build(java.util.Map<String, ?> map) throws Exception {
            TranslateChannelDraftResponseBodyModuleCoverImages self = new TranslateChannelDraftResponseBodyModuleCoverImages();
            return TeaModel.build(map, self);
        }

        public TranslateChannelDraftResponseBodyModuleCoverImages setMaterialFileId(String materialFileId) {
            this.materialFileId = materialFileId;
            return this;
        }
        public String getMaterialFileId() {
            return this.materialFileId;
        }

        public TranslateChannelDraftResponseBodyModuleCoverImages setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public TranslateChannelDraftResponseBodyModuleCoverImages setSortOrder(Integer sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Integer getSortOrder() {
            return this.sortOrder;
        }

    }

    public static class TranslateChannelDraftResponseBodyModule extends TeaModel {
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
         * <p>The publishing account snapshot.</p>
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
         * <p>channel_905</p>
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
        public java.util.List<TranslateChannelDraftResponseBodyModuleCoverImages> coverImages;

        /**
         * <p>The ID of the channel draft.</p>
         * 
         * <strong>example:</strong>
         * <p>85e219ef-c458-4a0d-a249-2776864143bb</p>
         */
        @NameInMap("DraftId")
        public String draftId;

        /**
         * <p>The ID returned by the platform.</p>
         * 
         * <strong>example:</strong>
         * <p>a367d19c02ff004ac20a7b2078066fe1f370</p>
         */
        @NameInMap("ExternalId")
        public String externalId;

        /**
         * <p>The redirect URL of the platform.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://net-video.mistong.com:10160/api/preview/video/2026/02/02/7181627703f6437480a7bffe8ed1e7b0_20260202100338.mp4">https://net-video.mistong.com:10160/api/preview/video/2026/02/02/7181627703f6437480a7bffe8ed1e7b0_20260202100338.mp4</a></p>
         */
        @NameInMap("ExternalUrl")
        public String externalUrl;

        /**
         * <p>The reason for the failure.</p>
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
         * <p>The publishing time, in millisecond timestamp format.</p>
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

        public static TranslateChannelDraftResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TranslateChannelDraftResponseBodyModule self = new TranslateChannelDraftResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TranslateChannelDraftResponseBodyModule setAdaptStatus(String adaptStatus) {
            this.adaptStatus = adaptStatus;
            return this;
        }
        public String getAdaptStatus() {
            return this.adaptStatus;
        }

        public TranslateChannelDraftResponseBodyModule setAdaptedContent(String adaptedContent) {
            this.adaptedContent = adaptedContent;
            return this;
        }
        public String getAdaptedContent() {
            return this.adaptedContent;
        }

        public TranslateChannelDraftResponseBodyModule setAdaptedTitle(String adaptedTitle) {
            this.adaptedTitle = adaptedTitle;
            return this;
        }
        public String getAdaptedTitle() {
            return this.adaptedTitle;
        }

        public TranslateChannelDraftResponseBodyModule setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public TranslateChannelDraftResponseBodyModule setChannelAccount(String channelAccount) {
            this.channelAccount = channelAccount;
            return this;
        }
        public String getChannelAccount() {
            return this.channelAccount;
        }

        public TranslateChannelDraftResponseBodyModule setChannelAccountName(String channelAccountName) {
            this.channelAccountName = channelAccountName;
            return this;
        }
        public String getChannelAccountName() {
            return this.channelAccountName;
        }

        public TranslateChannelDraftResponseBodyModule setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public TranslateChannelDraftResponseBodyModule setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public TranslateChannelDraftResponseBodyModule setCoverImages(java.util.List<TranslateChannelDraftResponseBodyModuleCoverImages> coverImages) {
            this.coverImages = coverImages;
            return this;
        }
        public java.util.List<TranslateChannelDraftResponseBodyModuleCoverImages> getCoverImages() {
            return this.coverImages;
        }

        public TranslateChannelDraftResponseBodyModule setDraftId(String draftId) {
            this.draftId = draftId;
            return this;
        }
        public String getDraftId() {
            return this.draftId;
        }

        public TranslateChannelDraftResponseBodyModule setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public TranslateChannelDraftResponseBodyModule setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }
        public String getExternalUrl() {
            return this.externalUrl;
        }

        public TranslateChannelDraftResponseBodyModule setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public TranslateChannelDraftResponseBodyModule setPublishConfig(String publishConfig) {
            this.publishConfig = publishConfig;
            return this;
        }
        public String getPublishConfig() {
            return this.publishConfig;
        }

        public TranslateChannelDraftResponseBodyModule setPublishedAt(Long publishedAt) {
            this.publishedAt = publishedAt;
            return this;
        }
        public Long getPublishedAt() {
            return this.publishedAt;
        }

        public TranslateChannelDraftResponseBodyModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
