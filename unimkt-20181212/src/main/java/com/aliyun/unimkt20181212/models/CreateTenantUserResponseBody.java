// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreateTenantUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CreateTenantUserResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateTenantUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantUserResponseBody self = new CreateTenantUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTenantUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTenantUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTenantUserResponseBody setModel(CreateTenantUserResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CreateTenantUserResponseBodyModel getModel() {
        return this.model;
    }

    public CreateTenantUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTenantUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTenantUserResponseBodyModel extends TeaModel {
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

        @NameInMap("SettleInfo")
        public String settleInfo;

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
        public String version;

        public static CreateTenantUserResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateTenantUserResponseBodyModel self = new CreateTenantUserResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateTenantUserResponseBodyModel setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public CreateTenantUserResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateTenantUserResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public CreateTenantUserResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public CreateTenantUserResponseBodyModel setOriginSite(String originSite) {
            this.originSite = originSite;
            return this;
        }
        public String getOriginSite() {
            return this.originSite;
        }

        public CreateTenantUserResponseBodyModel setOriginSiteUserId(String originSiteUserId) {
            this.originSiteUserId = originSiteUserId;
            return this;
        }
        public String getOriginSiteUserId() {
            return this.originSiteUserId;
        }

        public CreateTenantUserResponseBodyModel setOriginSiteUserName(String originSiteUserName) {
            this.originSiteUserName = originSiteUserName;
            return this;
        }
        public String getOriginSiteUserName() {
            return this.originSiteUserName;
        }

        public CreateTenantUserResponseBodyModel setSettleInfo(String settleInfo) {
            this.settleInfo = settleInfo;
            return this;
        }
        public String getSettleInfo() {
            return this.settleInfo;
        }

        public CreateTenantUserResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateTenantUserResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreateTenantUserResponseBodyModel setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public CreateTenantUserResponseBodyModel setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CreateTenantUserResponseBodyModel setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public CreateTenantUserResponseBodyModel setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
