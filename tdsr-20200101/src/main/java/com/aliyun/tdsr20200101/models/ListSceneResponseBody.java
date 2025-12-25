// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListSceneResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public ListSceneResponseBodyAccessDeniedDetail accessDeniedDetail;

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
    public java.util.List<ListSceneResponseBodyList> list;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>4F882EA7-3A1D-0113-94E4-70162C4B***</p>
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

    public static ListSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSceneResponseBody self = new ListSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSceneResponseBody setAccessDeniedDetail(ListSceneResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ListSceneResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListSceneResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListSceneResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListSceneResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListSceneResponseBody setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public ListSceneResponseBody setList(java.util.List<ListSceneResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListSceneResponseBodyList> getList() {
        return this.list;
    }

    public ListSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSceneResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class ListSceneResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static ListSceneResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ListSceneResponseBodyAccessDeniedDetail self = new ListSceneResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ListSceneResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ListSceneResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ListSceneResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ListSceneResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ListSceneResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ListSceneResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ListSceneResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ListSceneResponseBodyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/xxxx/xxx.jpg">www.example.com/xxxx/xxx.jpg</a></p>
         */
        @NameInMap("CoverUrl")
        public String coverUrl;

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
         * <p>1234****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>厨房</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>d989623696ab4f87a80b8d5b0b00****</p>
         */
        @NameInMap("PreviewToken")
        public String previewToken;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Published")
        public Boolean published;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SourceNum")
        public Long sourceNum;

        /**
         * <strong>example:</strong>
         * <p>init</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StatusName")
        public String statusName;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SubSceneNum")
        public Long subSceneNum;

        /**
         * <strong>example:</strong>
         * <p>MODEL_3D</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListSceneResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListSceneResponseBodyList self = new ListSceneResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListSceneResponseBodyList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListSceneResponseBodyList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSceneResponseBodyList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListSceneResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSceneResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSceneResponseBodyList setPreviewToken(String previewToken) {
            this.previewToken = previewToken;
            return this;
        }
        public String getPreviewToken() {
            return this.previewToken;
        }

        public ListSceneResponseBodyList setPublished(Boolean published) {
            this.published = published;
            return this;
        }
        public Boolean getPublished() {
            return this.published;
        }

        public ListSceneResponseBodyList setSourceNum(Long sourceNum) {
            this.sourceNum = sourceNum;
            return this;
        }
        public Long getSourceNum() {
            return this.sourceNum;
        }

        public ListSceneResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSceneResponseBodyList setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public ListSceneResponseBodyList setSubSceneNum(Long subSceneNum) {
            this.subSceneNum = subSceneNum;
            return this;
        }
        public Long getSubSceneNum() {
            return this.subSceneNum;
        }

        public ListSceneResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
