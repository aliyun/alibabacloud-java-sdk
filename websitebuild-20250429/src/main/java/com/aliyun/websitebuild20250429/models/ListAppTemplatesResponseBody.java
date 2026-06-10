// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppTemplatesResponseBody extends TeaModel {
    /**
     * <p>Detailed reason for access denial.</p>
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
     * <p>Application name.</p>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>Dynamic message. Not currently used. Ignore it.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>Faulty parameters</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>Number of results returned per query.  </p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Response data</p>
     */
    @NameInMap("Module")
    public ListAppTemplatesResponseBodyModule module;

    /**
     * <p>Token for starting the next query. It is empty if there is no next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh3BFw8paIJ7ylB6A7Qn9JjM</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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
     * <p>Abnormal message</p>
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

    public static ListAppTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppTemplatesResponseBody self = new ListAppTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppTemplatesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAppTemplatesResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListAppTemplatesResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppTemplatesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAppTemplatesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAppTemplatesResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListAppTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppTemplatesResponseBody setModule(ListAppTemplatesResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListAppTemplatesResponseBodyModule getModule() {
        return this.module;
    }

    public ListAppTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppTemplatesResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListAppTemplatesResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListAppTemplatesResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListAppTemplatesResponseBodyModuleData extends TeaModel {
        /**
         * <p>application Type</p>
         * 
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>application instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>Color</p>
         * 
         * <strong>example:</strong>
         * <p>Red</p>
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
         * <p>Creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>SOAR</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>Creation Time</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-20T02:26:38Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Updated At</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>1627545952000</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>primary key</p>
         * 
         * <strong>example:</strong>
         * <p>9953352</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Industry of the file to be analyzed. Default value: <strong>common</strong> (general industry). Select an appropriate industry to enable the backend to match an algorithm combination suitable for that industry. Valid values:  </p>
         * <ul>
         * <li><strong>microVideo</strong>: Short video industry.  </li>
         * <li><strong>common</strong>: General industry.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NOUSE</p>
         */
        @NameInMap("Industry")
        public String industry;

        /**
         * <p>Industry Name</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("IndustryName")
        public String industryName;

        /**
         * <p>Editor ID</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("LastModifier")
        public String lastModifier;

        /**
         * <p>Number of likes.</p>
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
         * <p>Remediation action.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;memFrom\&quot;: \&quot;text\&quot;, \&quot;uid\&quot;: \&quot;text\&quot;, \&quot;labels\&quot;: \&quot;jsonb\&quot;, \&quot;content\&quot;: \&quot;text\&quot;, \&quot;fromId\&quot;: \&quot;text\&quot;, \&quot;uuid\&quot;: \&quot;text\&quot;}</p>
         */
        @NameInMap("Metadata")
        public String metadata;

        /**
         * <p>Preview URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://preview-lyj.aliyuncs.com/preview/b2c5a245c44946b99cf5435210bbb8b8?subSceneIds=728166">https://preview-lyj.aliyuncs.com/preview/b2c5a245c44946b99cf5435210bbb8b8?subSceneIds=728166</a></p>
         */
        @NameInMap("PreviewUrl")
        public String previewUrl;

        /**
         * <p>Edition. Valid values:  </p>
         * <ul>
         * <li><strong>BasicVersion</strong>: Basic Edition.  </li>
         * <li><strong>EnterpriseVersion</strong>: Enterprise Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseVersion</p>
         */
        @NameInMap("ProductVersion")
        public String productVersion;

        /**
         * <p>Edition name.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.1</p>
         */
        @NameInMap("ProductVersionName")
        public String productVersionName;

        /**
         * <p>Share Count</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ShareCount")
        public Integer shareCount;

        /**
         * <p>File Status</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Template ID</p>
         * 
         * <strong>example:</strong>
         * <p>de10bf7d782392a70f293a3b1f7bb8fc</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>Template Name.  </p>
         * <ul>
         * <li>Maximum length: 128 characters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cfdna6</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>Application thumbnail</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
         */
        @NameInMap("ThumbnailUrl")
        public String thumbnailUrl;

        /**
         * <p>View Count.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ViewCount")
        public Integer viewCount;

        /**
         * <p>weight</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static ListAppTemplatesResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            ListAppTemplatesResponseBodyModuleData self = new ListAppTemplatesResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public ListAppTemplatesResponseBodyModuleData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListAppTemplatesResponseBodyModuleData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListAppTemplatesResponseBodyModuleData setColorScheme(String colorScheme) {
            this.colorScheme = colorScheme;
            return this;
        }
        public String getColorScheme() {
            return this.colorScheme;
        }

        public ListAppTemplatesResponseBodyModuleData setColorSchemeName(String colorSchemeName) {
            this.colorSchemeName = colorSchemeName;
            return this;
        }
        public String getColorSchemeName() {
            return this.colorSchemeName;
        }

        public ListAppTemplatesResponseBodyModuleData setCopyCount(Integer copyCount) {
            this.copyCount = copyCount;
            return this;
        }
        public Integer getCopyCount() {
            return this.copyCount;
        }

        public ListAppTemplatesResponseBodyModuleData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListAppTemplatesResponseBodyModuleData setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListAppTemplatesResponseBodyModuleData setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListAppTemplatesResponseBodyModuleData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppTemplatesResponseBodyModuleData setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public ListAppTemplatesResponseBodyModuleData setIndustryName(String industryName) {
            this.industryName = industryName;
            return this;
        }
        public String getIndustryName() {
            return this.industryName;
        }

        public ListAppTemplatesResponseBodyModuleData setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public ListAppTemplatesResponseBodyModuleData setLikeCount(Integer likeCount) {
            this.likeCount = likeCount;
            return this;
        }
        public Integer getLikeCount() {
            return this.likeCount;
        }

        public ListAppTemplatesResponseBodyModuleData setLiked(Boolean liked) {
            this.liked = liked;
            return this;
        }
        public Boolean getLiked() {
            return this.liked;
        }

        public ListAppTemplatesResponseBodyModuleData setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

        public ListAppTemplatesResponseBodyModuleData setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public ListAppTemplatesResponseBodyModuleData setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListAppTemplatesResponseBodyModuleData setProductVersionName(String productVersionName) {
            this.productVersionName = productVersionName;
            return this;
        }
        public String getProductVersionName() {
            return this.productVersionName;
        }

        public ListAppTemplatesResponseBodyModuleData setShareCount(Integer shareCount) {
            this.shareCount = shareCount;
            return this;
        }
        public Integer getShareCount() {
            return this.shareCount;
        }

        public ListAppTemplatesResponseBodyModuleData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppTemplatesResponseBodyModuleData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListAppTemplatesResponseBodyModuleData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListAppTemplatesResponseBodyModuleData setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }
        public String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public ListAppTemplatesResponseBodyModuleData setViewCount(Integer viewCount) {
            this.viewCount = viewCount;
            return this;
        }
        public Integer getViewCount() {
            return this.viewCount;
        }

        public ListAppTemplatesResponseBodyModuleData setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ListAppTemplatesResponseBodyModuleNext extends TeaModel {
        /**
         * <p>Application Type</p>
         * 
         * <strong>example:</strong>
         * <p>memory</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>bizId of the associated application instance</p>
         * 
         * <strong>example:</strong>
         * <p>WS20260502160409000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>Color</p>
         * 
         * <strong>example:</strong>
         * <p>red</p>
         */
        @NameInMap("ColorScheme")
        public String colorScheme;

        /**
         * <p>Color scheme name</p>
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
         * <p>Tenant User Information</p>
         * 
         * <strong>example:</strong>
         * <p>208116853206125255</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>Creation Time</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-17 20:43:21</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Updated At</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-18T10:03:56+08:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Primary key</p>
         * 
         * <strong>example:</strong>
         * <p>1000039405002</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Industry. Default value: <strong>common</strong> (General Industry). Valid values:  </p>
         * <ul>
         * <li><p><strong>microVideo</strong>: Short Video Industry.  </p>
         * </li>
         * <li><p><strong>common</strong>: General Industry.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NOUSE</p>
         */
        @NameInMap("Industry")
        public String industry;

        /**
         * <p>Industry Name</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("IndustryName")
        public String industryName;

        /**
         * <p>ID of the last modifier</p>
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
         * <p>Whether the current user has liked the item.</p>
         */
        @NameInMap("Liked")
        public Boolean liked;

        /**
         * <p>Fix Content.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;knowledge_point\&quot;:\&quot;text\&quot;,\&quot;trunk_id\&quot;:\&quot;text\&quot;,\&quot;doc_name\&quot;:\&quot;text\&quot;,\&quot;knowledge_point_id\&quot;:\&quot;text\&quot;,\&quot;doc_id\&quot;:\&quot;text\&quot;,\&quot;trunk_content\&quot;:\&quot;text\&quot;}</p>
         */
        @NameInMap("Metadata")
        public String metadata;

        /**
         * <p>Preview URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://preview-lyj.aliyuncs.com/preview/b989c9ac526e4fb48e018805f43d5fb1?subSceneIds=816576">https://preview-lyj.aliyuncs.com/preview/b989c9ac526e4fb48e018805f43d5fb1?subSceneIds=816576</a></p>
         */
        @NameInMap("PreviewUrl")
        public String previewUrl;

        /**
         * <p>Edition. Valid values:  </p>
         * <ul>
         * <li><strong>BasicVersion</strong>: Basic Edition.  </li>
         * <li><strong>EnterpriseVersion</strong>: Enterprise Edition.  <blockquote>
         * <p>This parameter is required only when ProductForm is set to IntegrationForm.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BasicVersion</p>
         */
        @NameInMap("ProductVersion")
        public String productVersion;

        /**
         * <p>Edition name.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.2</p>
         */
        @NameInMap("ProductVersionName")
        public String productVersionName;

        /**
         * <p>Share Count</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ShareCount")
        public Integer shareCount;

        /**
         * <p>Possible values: unknown, init, testing, online</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Template ID</p>
         * 
         * <strong>example:</strong>
         * <p>3802aefc8cb0003b71286c47afc83624</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>Template Name</p>
         * 
         * <strong>example:</strong>
         * <p>iem</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>Application thumbnail</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
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
         * <p>Weight</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static ListAppTemplatesResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            ListAppTemplatesResponseBodyModuleNext self = new ListAppTemplatesResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public ListAppTemplatesResponseBodyModuleNext setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListAppTemplatesResponseBodyModuleNext setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListAppTemplatesResponseBodyModuleNext setColorScheme(String colorScheme) {
            this.colorScheme = colorScheme;
            return this;
        }
        public String getColorScheme() {
            return this.colorScheme;
        }

        public ListAppTemplatesResponseBodyModuleNext setColorSchemeName(String colorSchemeName) {
            this.colorSchemeName = colorSchemeName;
            return this;
        }
        public String getColorSchemeName() {
            return this.colorSchemeName;
        }

        public ListAppTemplatesResponseBodyModuleNext setCopyCount(Integer copyCount) {
            this.copyCount = copyCount;
            return this;
        }
        public Integer getCopyCount() {
            return this.copyCount;
        }

        public ListAppTemplatesResponseBodyModuleNext setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListAppTemplatesResponseBodyModuleNext setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppTemplatesResponseBodyModuleNext setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppTemplatesResponseBodyModuleNext setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppTemplatesResponseBodyModuleNext setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public ListAppTemplatesResponseBodyModuleNext setIndustryName(String industryName) {
            this.industryName = industryName;
            return this;
        }
        public String getIndustryName() {
            return this.industryName;
        }

        public ListAppTemplatesResponseBodyModuleNext setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public ListAppTemplatesResponseBodyModuleNext setLikeCount(Integer likeCount) {
            this.likeCount = likeCount;
            return this;
        }
        public Integer getLikeCount() {
            return this.likeCount;
        }

        public ListAppTemplatesResponseBodyModuleNext setLiked(Boolean liked) {
            this.liked = liked;
            return this;
        }
        public Boolean getLiked() {
            return this.liked;
        }

        public ListAppTemplatesResponseBodyModuleNext setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

        public ListAppTemplatesResponseBodyModuleNext setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public ListAppTemplatesResponseBodyModuleNext setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListAppTemplatesResponseBodyModuleNext setProductVersionName(String productVersionName) {
            this.productVersionName = productVersionName;
            return this;
        }
        public String getProductVersionName() {
            return this.productVersionName;
        }

        public ListAppTemplatesResponseBodyModuleNext setShareCount(Integer shareCount) {
            this.shareCount = shareCount;
            return this;
        }
        public Integer getShareCount() {
            return this.shareCount;
        }

        public ListAppTemplatesResponseBodyModuleNext setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppTemplatesResponseBodyModuleNext setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListAppTemplatesResponseBodyModuleNext setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListAppTemplatesResponseBodyModuleNext setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }
        public String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public ListAppTemplatesResponseBodyModuleNext setViewCount(Integer viewCount) {
            this.viewCount = viewCount;
            return this;
        }
        public Integer getViewCount() {
            return this.viewCount;
        }

        public ListAppTemplatesResponseBodyModuleNext setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ListAppTemplatesResponseBodyModule extends TeaModel {
        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        /**
         * <p>Request Result.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListAppTemplatesResponseBodyModuleData> data;

        /**
         * <p>Decision weight</p>
         */
        @NameInMap("Next")
        public ListAppTemplatesResponseBodyModuleNext next;

        /**
         * <p>Whether there is a next page.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("NextPage")
        public Boolean nextPage;

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Indicates whether there is a previous page.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("PrePage")
        public Boolean prePage;

        /**
         * <p>For the current query, aside from paging limits, the server-side processes at most the latest 1000 records. If the result exceeds 1000 records, <strong>ResultLimit</strong> is <strong>true</strong>; you should narrow the Time Range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("ResultLimit")
        public Boolean resultLimit;

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalItemNum")
        public Integer totalItemNum;

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPageNum")
        public Integer totalPageNum;

        public static ListAppTemplatesResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListAppTemplatesResponseBodyModule self = new ListAppTemplatesResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListAppTemplatesResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public ListAppTemplatesResponseBodyModule setData(java.util.List<ListAppTemplatesResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListAppTemplatesResponseBodyModuleData> getData() {
            return this.data;
        }

        public ListAppTemplatesResponseBodyModule setNext(ListAppTemplatesResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public ListAppTemplatesResponseBodyModuleNext getNext() {
            return this.next;
        }

        public ListAppTemplatesResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public ListAppTemplatesResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAppTemplatesResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public ListAppTemplatesResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public ListAppTemplatesResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public ListAppTemplatesResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
