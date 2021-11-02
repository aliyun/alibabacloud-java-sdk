// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ModifyTenantInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ModifyTenantInfoResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyTenantInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantInfoResponseBody self = new ModifyTenantInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyTenantInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyTenantInfoResponseBody setModel(ModifyTenantInfoResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ModifyTenantInfoResponseBodyModel getModel() {
        return this.model;
    }

    public ModifyTenantInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTenantInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyTenantInfoResponseBodyModel extends TeaModel {
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

        @NameInMap("Version")
        public Long version;

        public static ModifyTenantInfoResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ModifyTenantInfoResponseBodyModel self = new ModifyTenantInfoResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ModifyTenantInfoResponseBodyModel setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public ModifyTenantInfoResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ModifyTenantInfoResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ModifyTenantInfoResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ModifyTenantInfoResponseBodyModel setSettleInfo(String settleInfo) {
            this.settleInfo = settleInfo;
            return this;
        }
        public String getSettleInfo() {
            return this.settleInfo;
        }

        public ModifyTenantInfoResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyTenantInfoResponseBodyModel setTenantDescription(String tenantDescription) {
            this.tenantDescription = tenantDescription;
            return this;
        }
        public String getTenantDescription() {
            return this.tenantDescription;
        }

        public ModifyTenantInfoResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ModifyTenantInfoResponseBodyModel setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public ModifyTenantInfoResponseBodyModel setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ModifyTenantInfoResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
