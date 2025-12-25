// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListSubSceneResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public ListSubSceneResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasNext")
    public Boolean hasNext;

    @NameInMap("List")
    public java.util.List<ListSubSceneResponseBodyList> list;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>4F882EA7-3A1D-0113-94E4-70162C4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalPage")
    public Long totalPage;

    public static ListSubSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubSceneResponseBody self = new ListSubSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubSceneResponseBody setAccessDeniedDetail(ListSubSceneResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ListSubSceneResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListSubSceneResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListSubSceneResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListSubSceneResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListSubSceneResponseBody setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public ListSubSceneResponseBody setList(java.util.List<ListSubSceneResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListSubSceneResponseBodyList> getList() {
        return this.list;
    }

    public ListSubSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSubSceneResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class ListSubSceneResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static ListSubSceneResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ListSubSceneResponseBodyAccessDeniedDetail self = new ListSubSceneResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ListSubSceneResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ListSubSceneResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ListSubSceneResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ListSubSceneResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ListSubSceneResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ListSubSceneResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ListSubSceneResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ListSubSceneResponseBodyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>https:/image-demo.oss-cn-hangzhou.aliyuncs.com/****.jpg</p>
         */
        @NameInMap("BaseImageUrl")
        public String baseImageUrl;

        /**
         * <strong>example:</strong>
         * <p>https:/image-demo.oss-cn-hangzhou.aliyuncs.com/****.jpg</p>
         */
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CubemapPath")
        public String cubemapPath;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Deleted")
        public Boolean deleted;

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
         * <p>xsfwsddd==</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("LayoutData")
        public String layoutData;

        /**
         * <strong>example:</strong>
         * <p>c俄式</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>https:/image-demo.oss-cn-hangzhou.aliyuncs.com/****.jpg</p>
         */
        @NameInMap("OriginUrl")
        public String originUrl;

        /**
         * <strong>example:</strong>
         * <p>2345****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>xxxx.jpg</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>https:/image-demo.oss-cn-hangzhou.aliyuncs.com/****.jpg</p>
         */
        @NameInMap("Url")
        public String url;

        public static ListSubSceneResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListSubSceneResponseBodyList self = new ListSubSceneResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListSubSceneResponseBodyList setBaseImageUrl(String baseImageUrl) {
            this.baseImageUrl = baseImageUrl;
            return this;
        }
        public String getBaseImageUrl() {
            return this.baseImageUrl;
        }

        public ListSubSceneResponseBodyList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListSubSceneResponseBodyList setCubemapPath(String cubemapPath) {
            this.cubemapPath = cubemapPath;
            return this;
        }
        public String getCubemapPath() {
            return this.cubemapPath;
        }

        public ListSubSceneResponseBodyList setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListSubSceneResponseBodyList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSubSceneResponseBodyList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListSubSceneResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSubSceneResponseBodyList setLayoutData(String layoutData) {
            this.layoutData = layoutData;
            return this;
        }
        public String getLayoutData() {
            return this.layoutData;
        }

        public ListSubSceneResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSubSceneResponseBodyList setOriginUrl(String originUrl) {
            this.originUrl = originUrl;
            return this;
        }
        public String getOriginUrl() {
            return this.originUrl;
        }

        public ListSubSceneResponseBodyList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListSubSceneResponseBodyList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListSubSceneResponseBodyList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListSubSceneResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSubSceneResponseBodyList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
