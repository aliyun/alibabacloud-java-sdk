// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryFlowResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryFlowResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowResponseBody self = new QueryFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryFlowResponseBody setModel(QueryFlowResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryFlowResponseBodyModel getModel() {
        return this.model;
    }

    public QueryFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFlowResponseBodyModel extends TeaModel {
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

        public static QueryFlowResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryFlowResponseBodyModel self = new QueryFlowResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryFlowResponseBodyModel setApplyUserId(String applyUserId) {
            this.applyUserId = applyUserId;
            return this;
        }
        public String getApplyUserId() {
            return this.applyUserId;
        }

        public QueryFlowResponseBodyModel setApproveTime(Long approveTime) {
            this.approveTime = approveTime;
            return this;
        }
        public Long getApproveTime() {
            return this.approveTime;
        }

        public QueryFlowResponseBodyModel setApproveUserId(String approveUserId) {
            this.approveUserId = approveUserId;
            return this;
        }
        public String getApproveUserId() {
            return this.approveUserId;
        }

        public QueryFlowResponseBodyModel setBusinessKey(String businessKey) {
            this.businessKey = businessKey;
            return this;
        }
        public String getBusinessKey() {
            return this.businessKey;
        }

        public QueryFlowResponseBodyModel setChildStatus(String childStatus) {
            this.childStatus = childStatus;
            return this;
        }
        public String getChildStatus() {
            return this.childStatus;
        }

        public QueryFlowResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QueryFlowResponseBodyModel setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public QueryFlowResponseBodyModel setGmtCreateTime(Long gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public Long getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public QueryFlowResponseBodyModel setGmtModifiedTime(Long gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public Long getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public QueryFlowResponseBodyModel setNewData(String newData) {
            this.newData = newData;
            return this;
        }
        public String getNewData() {
            return this.newData;
        }

        public QueryFlowResponseBodyModel setOldData(String oldData) {
            this.oldData = oldData;
            return this;
        }
        public String getOldData() {
            return this.oldData;
        }

        public QueryFlowResponseBodyModel setReasonType(String reasonType) {
            this.reasonType = reasonType;
            return this;
        }
        public String getReasonType() {
            return this.reasonType;
        }

        public QueryFlowResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryFlowResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryFlowResponseBodyModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
