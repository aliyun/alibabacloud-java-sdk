// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ChangeTenantStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ChangeTenantStatusResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ChangeTenantStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeTenantStatusResponseBody self = new ChangeTenantStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeTenantStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChangeTenantStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChangeTenantStatusResponseBody setModel(ChangeTenantStatusResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ChangeTenantStatusResponseBodyModel getModel() {
        return this.model;
    }

    public ChangeTenantStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeTenantStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChangeTenantStatusResponseBodyModel extends TeaModel {
        @NameInMap("Business")
        public String business;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("SettleInfo")
        public String settleInfo;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantDescription")
        public String tenantDescription;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("UserName")
        public String userName;

        public static ChangeTenantStatusResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ChangeTenantStatusResponseBodyModel self = new ChangeTenantStatusResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ChangeTenantStatusResponseBodyModel setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public ChangeTenantStatusResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ChangeTenantStatusResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ChangeTenantStatusResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ChangeTenantStatusResponseBodyModel setSettleInfo(String settleInfo) {
            this.settleInfo = settleInfo;
            return this;
        }
        public String getSettleInfo() {
            return this.settleInfo;
        }

        public ChangeTenantStatusResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ChangeTenantStatusResponseBodyModel setTenantDescription(String tenantDescription) {
            this.tenantDescription = tenantDescription;
            return this;
        }
        public String getTenantDescription() {
            return this.tenantDescription;
        }

        public ChangeTenantStatusResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ChangeTenantStatusResponseBodyModel setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public ChangeTenantStatusResponseBodyModel setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
