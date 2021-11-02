// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryTenantUserByUserIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryTenantUserByUserIdResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTenantUserByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantUserByUserIdResponseBody self = new QueryTenantUserByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTenantUserByUserIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTenantUserByUserIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTenantUserByUserIdResponseBody setModel(QueryTenantUserByUserIdResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryTenantUserByUserIdResponseBodyModel getModel() {
        return this.model;
    }

    public QueryTenantUserByUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTenantUserByUserIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTenantUserByUserIdResponseBodyModel extends TeaModel {
        @NameInMap("Business")
        public String business;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("OriginSite")
        public String originSite;

        @NameInMap("OriginSiteUserId")
        public String originSiteUserId;

        @NameInMap("OriginSiteUserName")
        public String originSiteUserName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Version")
        public Long version;

        public static QueryTenantUserByUserIdResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryTenantUserByUserIdResponseBodyModel self = new QueryTenantUserByUserIdResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryTenantUserByUserIdResponseBodyModel setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public QueryTenantUserByUserIdResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryTenantUserByUserIdResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QueryTenantUserByUserIdResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public QueryTenantUserByUserIdResponseBodyModel setOriginSite(String originSite) {
            this.originSite = originSite;
            return this;
        }
        public String getOriginSite() {
            return this.originSite;
        }

        public QueryTenantUserByUserIdResponseBodyModel setOriginSiteUserId(String originSiteUserId) {
            this.originSiteUserId = originSiteUserId;
            return this;
        }
        public String getOriginSiteUserId() {
            return this.originSiteUserId;
        }

        public QueryTenantUserByUserIdResponseBodyModel setOriginSiteUserName(String originSiteUserName) {
            this.originSiteUserName = originSiteUserName;
            return this;
        }
        public String getOriginSiteUserName() {
            return this.originSiteUserName;
        }

        public QueryTenantUserByUserIdResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTenantUserByUserIdResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryTenantUserByUserIdResponseBodyModel setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public QueryTenantUserByUserIdResponseBodyModel setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryTenantUserByUserIdResponseBodyModel setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public QueryTenantUserByUserIdResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
