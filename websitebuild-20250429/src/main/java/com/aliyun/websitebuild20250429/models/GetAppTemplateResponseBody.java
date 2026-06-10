// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppTemplateResponseBody extends TeaModel {
    /**
     * <p>permission denied information</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>is retry allowed</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>App Name.</p>
     * 
     * <strong>example:</strong>
     * <p>ish-intelligence-store-platform-admin-web</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>dynamic error Code</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>dynamic error message, used to replace the <code>%s</code> placeholder in the <strong>ErrMessage</strong> error message.  </p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>returned error parameters</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>whether deletion succeeded</p>
     */
    @NameInMap("Module")
    public GetAppTemplateResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>abnormal message</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static GetAppTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppTemplateResponseBody self = new GetAppTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppTemplateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAppTemplateResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetAppTemplateResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppTemplateResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAppTemplateResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAppTemplateResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetAppTemplateResponseBody setModule(GetAppTemplateResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppTemplateResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppTemplateResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetAppTemplateResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetAppTemplateResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetAppTemplateResponseBodyModule extends TeaModel {
        /**
         * <p>Application type</p>
         * 
         * <strong>example:</strong>
         * <p>TRACE</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>Business ID</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>color</p>
         * 
         * <strong>example:</strong>
         * <p>red</p>
         */
        @NameInMap("ColorScheme")
        public String colorScheme;

        /**
         * <p>Color name</p>
         * 
         * <strong>example:</strong>
         * <p>red</p>
         */
        @NameInMap("ColorSchemeName")
        public String colorSchemeName;

        /**
         * <p>The actual data volume of the original table copied during DMS lockless change.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CopyCount")
        public Integer copyCount;

        /**
         * <p>User ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>208614160512124381</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>Creation UTC time, in ISO 8601 date format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-04T01:40:25Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Modify time</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-05T11:16:57.785Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>Primary key</p>
         * 
         * <strong>example:</strong>
         * <p>16257</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Industry. Default value: <strong>common</strong> (general industry). Valid values:</p>
         * <ul>
         * <li><p><strong>microVideo</strong>: Short video industry.</p>
         * </li>
         * <li><p><strong>common</strong>: General industry.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>通用</p>
         */
        @NameInMap("Industry")
        public String industry;

        /**
         * <p>Industry name.</p>
         * 
         * <strong>example:</strong>
         * <p>indextry</p>
         */
        @NameInMap("IndustryName")
        public String industryName;

        /**
         * <p>Last modifier</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("LastModifier")
        public String lastModifier;

        /**
         * <p>Like count.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("LikeCount")
        public Integer likeCount;

        /**
         * <p>Whether the current user has liked it</p>
         */
        @NameInMap("Liked")
        public Boolean liked;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>Map of metadata for text segmentation.</p>
         * <blockquote>
         * <p>In document-search-type knowledge bases, the <code>file_path</code> field in the metadata Map is meaningless. Do not use it in your business code.</p>
         * </blockquote>
         * <blockquote>
         * <p>When retrieving a document-search-type knowledge base, if a segment contains an image, the image URL will be exposed through the <code>image_url</code> field in the metadata Map, along with a time-to-live (TTL).</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>Map of metadata for text segmentation.</p>
         * <blockquote>
         * <p>In document-search-type knowledge bases, the <code>file_path</code> field in the metadata Map is meaningless. Do not use it in your business code.</p>
         * </blockquote>
         * <blockquote>
         * <p>When retrieving a document-search-type knowledge base, if a segment contains an image, the image URL will be exposed through the <code>image_url</code> field in the metadata Map, along with a time-to-live (TTL).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;operations\&quot;:[{\&quot;operator\&quot;:\&quot;replace\&quot;,\&quot;oldMetaName\&quot;:\&quot;character2_add\&quot;,\&quot;newMetaType\&quot;:\&quot;varchar(2)\&quot;}]}</p>
         */
        @NameInMap("Metadata")
        public String metadata;

        /**
         * <p>Preview URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://preview-lyj.aliyuncs.com/preview/4825a3849c2e49e1b48804c7f90b766f?subSceneIds=807648">https://preview-lyj.aliyuncs.com/preview/4825a3849c2e49e1b48804c7f90b766f?subSceneIds=807648</a></p>
         */
        @NameInMap("PreviewUrl")
        public String previewUrl;

        /**
         * <p>Edition. Valid values:</p>
         * <ul>
         * <li><strong>BasicVersion</strong>: Basic Edition.</li>
         * <li><strong>EnterpriseVersion</strong>: Enterprise Edition.<blockquote>
         * <p>This parameter is required only when ProductForm is set to IntegrationForm.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>V2</p>
         */
        @NameInMap("ProductVersion")
        public String productVersion;

        /**
         * <p>Edition Name.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.2</p>
         */
        @NameInMap("ProductVersionName")
        public String productVersionName;

        /**
         * <p>Share count</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ShareCount")
        public Integer shareCount;

        /**
         * <p>trial, draft, live, refunded, expired, released</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Template ID</p>
         * 
         * <strong>example:</strong>
         * <p>7cc17da1-b670-4be7-a6b4-0b3cdf7bf5f7</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>Template Name</p>
         * 
         * <strong>example:</strong>
         * <p>siemProtect_All_</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>application thumbnail</p>
         * 
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("ThumbnailUrl")
        public String thumbnailUrl;

        /**
         * <p>View count.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ViewCount")
        public Integer viewCount;

        /**
         * <p>Hot word weight, an integer in the range [1, 5].<br>Common value: 4.<br>If the effect is not obvious, you can moderately increase the weight. However, if the weight is too high, it may cause negative effects and reduce the accuracy of detecting other words.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static GetAppTemplateResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppTemplateResponseBodyModule self = new GetAppTemplateResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppTemplateResponseBodyModule setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetAppTemplateResponseBodyModule setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetAppTemplateResponseBodyModule setColorScheme(String colorScheme) {
            this.colorScheme = colorScheme;
            return this;
        }
        public String getColorScheme() {
            return this.colorScheme;
        }

        public GetAppTemplateResponseBodyModule setColorSchemeName(String colorSchemeName) {
            this.colorSchemeName = colorSchemeName;
            return this;
        }
        public String getColorSchemeName() {
            return this.colorSchemeName;
        }

        public GetAppTemplateResponseBodyModule setCopyCount(Integer copyCount) {
            this.copyCount = copyCount;
            return this;
        }
        public Integer getCopyCount() {
            return this.copyCount;
        }

        public GetAppTemplateResponseBodyModule setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetAppTemplateResponseBodyModule setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetAppTemplateResponseBodyModule setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetAppTemplateResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAppTemplateResponseBodyModule setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public GetAppTemplateResponseBodyModule setIndustryName(String industryName) {
            this.industryName = industryName;
            return this;
        }
        public String getIndustryName() {
            return this.industryName;
        }

        public GetAppTemplateResponseBodyModule setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetAppTemplateResponseBodyModule setLikeCount(Integer likeCount) {
            this.likeCount = likeCount;
            return this;
        }
        public Integer getLikeCount() {
            return this.likeCount;
        }

        public GetAppTemplateResponseBodyModule setLiked(Boolean liked) {
            this.liked = liked;
            return this;
        }
        public Boolean getLiked() {
            return this.liked;
        }

        public GetAppTemplateResponseBodyModule setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

        public GetAppTemplateResponseBodyModule setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public GetAppTemplateResponseBodyModule setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public GetAppTemplateResponseBodyModule setProductVersionName(String productVersionName) {
            this.productVersionName = productVersionName;
            return this;
        }
        public String getProductVersionName() {
            return this.productVersionName;
        }

        public GetAppTemplateResponseBodyModule setShareCount(Integer shareCount) {
            this.shareCount = shareCount;
            return this;
        }
        public Integer getShareCount() {
            return this.shareCount;
        }

        public GetAppTemplateResponseBodyModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAppTemplateResponseBodyModule setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetAppTemplateResponseBodyModule setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetAppTemplateResponseBodyModule setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }
        public String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public GetAppTemplateResponseBodyModule setViewCount(Integer viewCount) {
            this.viewCount = viewCount;
            return this;
        }
        public Integer getViewCount() {
            return this.viewCount;
        }

        public GetAppTemplateResponseBodyModule setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
