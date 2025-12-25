// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DetailSubSceneResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public DetailSubSceneResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p><a href="https://image-demo.oss-cn-hangzhou.aliyuncs.com/****.jpg">https://image-demo.oss-cn-hangzhou.aliyuncs.com/****.jpg</a></p>
     */
    @NameInMap("CoverUrl")
    public String coverUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="https://image-demo.oss-cn-hangzhou.aliyuncs.com/cubemap/">https://image-demo.oss-cn-hangzhou.aliyuncs.com/cubemap/</a>****</p>
     */
    @NameInMap("CubemapPath")
    public String cubemapPath;

    /**
     * <strong>example:</strong>
     * <p>1621236933677</p>
     */
    @NameInMap("GmtCreate")
    public Long gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>1621236933677</p>
     */
    @NameInMap("GmtModified")
    public Long gmtModified;

    /**
     * <strong>example:</strong>
     * <p>1234***</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/test1.jpg">http://www.aliyun.com/test1.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("LayoutData")
    public String layoutData;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/test.jpg">http://www.aliyun.com/test.jpg</a></p>
     */
    @NameInMap("OriginUrl")
    public String originUrl;

    /**
     * <strong>example:</strong>
     * <p>[-0.8928,-0.21467,0.39603]</p>
     */
    @NameInMap("Position")
    public String position;

    /**
     * <strong>example:</strong>
     * <p>4F882EA7-3A1D-0113-94E4-70162C4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1234***</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p><a href="https://image-demo.oss-cn-hangzhou.aliyuncs.com/****.jpg">https://image-demo.oss-cn-hangzhou.aliyuncs.com/****.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static DetailSubSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetailSubSceneResponseBody self = new DetailSubSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DetailSubSceneResponseBody setAccessDeniedDetail(DetailSubSceneResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DetailSubSceneResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DetailSubSceneResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DetailSubSceneResponseBody setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public DetailSubSceneResponseBody setCubemapPath(String cubemapPath) {
        this.cubemapPath = cubemapPath;
        return this;
    }
    public String getCubemapPath() {
        return this.cubemapPath;
    }

    public DetailSubSceneResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DetailSubSceneResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public DetailSubSceneResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DetailSubSceneResponseBody setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DetailSubSceneResponseBody setLayoutData(String layoutData) {
        this.layoutData = layoutData;
        return this;
    }
    public String getLayoutData() {
        return this.layoutData;
    }

    public DetailSubSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetailSubSceneResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DetailSubSceneResponseBody setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
        return this;
    }
    public String getOriginUrl() {
        return this.originUrl;
    }

    public DetailSubSceneResponseBody setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public DetailSubSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetailSubSceneResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DetailSubSceneResponseBody setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public DetailSubSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DetailSubSceneResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DetailSubSceneResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class DetailSubSceneResponseBodyAccessDeniedDetail extends TeaModel {
        @NameInMap("AuthAction")
        public String authAction;

        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        @NameInMap("NoPermissionType")
        public String noPermissionType;

        @NameInMap("PolicyType")
        public String policyType;

        public static DetailSubSceneResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DetailSubSceneResponseBodyAccessDeniedDetail self = new DetailSubSceneResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DetailSubSceneResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DetailSubSceneResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DetailSubSceneResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DetailSubSceneResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DetailSubSceneResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DetailSubSceneResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DetailSubSceneResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
