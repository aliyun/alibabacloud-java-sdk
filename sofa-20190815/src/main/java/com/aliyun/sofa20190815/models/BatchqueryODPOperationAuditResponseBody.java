// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPOperationAuditResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public BatchqueryODPOperationAuditResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BatchqueryODPOperationAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPOperationAuditResponseBody self = new BatchqueryODPOperationAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPOperationAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchqueryODPOperationAuditResponseBody setData(BatchqueryODPOperationAuditResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchqueryODPOperationAuditResponseBodyData getData() {
        return this.data;
    }

    public BatchqueryODPOperationAuditResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchqueryODPOperationAuditResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class BatchqueryODPOperationAuditResponseBodyDataContent extends TeaModel {
        @NameInMap("EnvTenant")
        public String envTenant;

        @NameInMap("UserType")
        public String userType;

        @NameInMap("ProductInstanceId")
        public String productInstanceId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ResultCode")
        public String resultCode;

        @NameInMap("OperationDescription")
        public String operationDescription;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Params")
        public String params;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("EnvMode")
        public String envMode;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("InvokeType")
        public String invokeType;

        @NameInMap("OpenApiName")
        public String openApiName;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("AliyunMasterId")
        public String aliyunMasterId;

        public static BatchqueryODPOperationAuditResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPOperationAuditResponseBodyDataContent self = new BatchqueryODPOperationAuditResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setProductInstanceId(String productInstanceId) {
            this.productInstanceId = productInstanceId;
            return this;
        }
        public String getProductInstanceId() {
            return this.productInstanceId;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setOperationDescription(String operationDescription) {
            this.operationDescription = operationDescription;
            return this;
        }
        public String getOperationDescription() {
            return this.operationDescription;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setInvokeType(String invokeType) {
            this.invokeType = invokeType;
            return this;
        }
        public String getInvokeType() {
            return this.invokeType;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setOpenApiName(String openApiName) {
            this.openApiName = openApiName;
            return this;
        }
        public String getOpenApiName() {
            return this.openApiName;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public BatchqueryODPOperationAuditResponseBodyDataContent setAliyunMasterId(String aliyunMasterId) {
            this.aliyunMasterId = aliyunMasterId;
            return this;
        }
        public String getAliyunMasterId() {
            return this.aliyunMasterId;
        }

    }

    public static class BatchqueryODPOperationAuditResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Content")
        public java.util.List<BatchqueryODPOperationAuditResponseBodyDataContent> content;

        public static BatchqueryODPOperationAuditResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPOperationAuditResponseBodyData self = new BatchqueryODPOperationAuditResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPOperationAuditResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public BatchqueryODPOperationAuditResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public BatchqueryODPOperationAuditResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public BatchqueryODPOperationAuditResponseBodyData setContent(java.util.List<BatchqueryODPOperationAuditResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<BatchqueryODPOperationAuditResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
