// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListFlowResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<ListFlowResponseBodyModel> model;

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

    public static ListFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowResponseBody self = new ListFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFlowResponseBody setModel(java.util.List<ListFlowResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListFlowResponseBodyModel> getModel() {
        return this.model;
    }

    public ListFlowResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListFlowResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListFlowResponseBodyModel extends TeaModel {
        @NameInMap("ApplyUserId")
        public String applyUserId;

        @NameInMap("ApproveTime")
        public Long approveTime;

        @NameInMap("ApproveUserId")
        public String approveUserId;

        @NameInMap("BusinessKey")
        public String businessKey;

        @NameInMap("ChildStatus")
        public String childStatus;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("GmtCreateTime")
        public Long gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public Long gmtModifiedTime;

        @NameInMap("NewData")
        public String newData;

        @NameInMap("OldData")
        public String oldData;

        @NameInMap("ReasonType")
        public String reasonType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Type")
        public String type;

        public static ListFlowResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListFlowResponseBodyModel self = new ListFlowResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListFlowResponseBodyModel setApplyUserId(String applyUserId) {
            this.applyUserId = applyUserId;
            return this;
        }
        public String getApplyUserId() {
            return this.applyUserId;
        }

        public ListFlowResponseBodyModel setApproveTime(Long approveTime) {
            this.approveTime = approveTime;
            return this;
        }
        public Long getApproveTime() {
            return this.approveTime;
        }

        public ListFlowResponseBodyModel setApproveUserId(String approveUserId) {
            this.approveUserId = approveUserId;
            return this;
        }
        public String getApproveUserId() {
            return this.approveUserId;
        }

        public ListFlowResponseBodyModel setBusinessKey(String businessKey) {
            this.businessKey = businessKey;
            return this;
        }
        public String getBusinessKey() {
            return this.businessKey;
        }

        public ListFlowResponseBodyModel setChildStatus(String childStatus) {
            this.childStatus = childStatus;
            return this;
        }
        public String getChildStatus() {
            return this.childStatus;
        }

        public ListFlowResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListFlowResponseBodyModel setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListFlowResponseBodyModel setGmtCreateTime(Long gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public Long getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListFlowResponseBodyModel setGmtModifiedTime(Long gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public Long getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListFlowResponseBodyModel setNewData(String newData) {
            this.newData = newData;
            return this;
        }
        public String getNewData() {
            return this.newData;
        }

        public ListFlowResponseBodyModel setOldData(String oldData) {
            this.oldData = oldData;
            return this;
        }
        public String getOldData() {
            return this.oldData;
        }

        public ListFlowResponseBodyModel setReasonType(String reasonType) {
            this.reasonType = reasonType;
            return this;
        }
        public String getReasonType() {
            return this.reasonType;
        }

        public ListFlowResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFlowResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListFlowResponseBodyModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
