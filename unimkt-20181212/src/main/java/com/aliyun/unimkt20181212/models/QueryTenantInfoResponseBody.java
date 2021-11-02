// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryTenantInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryTenantInfoResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTenantInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantInfoResponseBody self = new QueryTenantInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTenantInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTenantInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTenantInfoResponseBody setModel(QueryTenantInfoResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryTenantInfoResponseBodyModel getModel() {
        return this.model;
    }

    public QueryTenantInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTenantInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTenantInfoResponseBodyModel extends TeaModel {
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

        @NameInMap("Version")
        public Long version;

        public static QueryTenantInfoResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryTenantInfoResponseBodyModel self = new QueryTenantInfoResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryTenantInfoResponseBodyModel setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public QueryTenantInfoResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryTenantInfoResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QueryTenantInfoResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public QueryTenantInfoResponseBodyModel setSettleInfo(String settleInfo) {
            this.settleInfo = settleInfo;
            return this;
        }
        public String getSettleInfo() {
            return this.settleInfo;
        }

        public QueryTenantInfoResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTenantInfoResponseBodyModel setTenantDescription(String tenantDescription) {
            this.tenantDescription = tenantDescription;
            return this;
        }
        public String getTenantDescription() {
            return this.tenantDescription;
        }

        public QueryTenantInfoResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryTenantInfoResponseBodyModel setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public QueryTenantInfoResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
