// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListTenantResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<ListTenantResponseBodyModel> model;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTenantResponseBody self = new ListTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTenantResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTenantResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTenantResponseBody setModel(java.util.List<ListTenantResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListTenantResponseBodyModel> getModel() {
        return this.model;
    }

    public ListTenantResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTenantResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTenantResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTenantResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListTenantResponseBodyModel extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

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

        public static ListTenantResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListTenantResponseBodyModel self = new ListTenantResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListTenantResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListTenantResponseBodyModel setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public ListTenantResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListTenantResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListTenantResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListTenantResponseBodyModel setSettleInfo(String settleInfo) {
            this.settleInfo = settleInfo;
            return this;
        }
        public String getSettleInfo() {
            return this.settleInfo;
        }

        public ListTenantResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTenantResponseBodyModel setTenantDescription(String tenantDescription) {
            this.tenantDescription = tenantDescription;
            return this;
        }
        public String getTenantDescription() {
            return this.tenantDescription;
        }

        public ListTenantResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListTenantResponseBodyModel setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public ListTenantResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
