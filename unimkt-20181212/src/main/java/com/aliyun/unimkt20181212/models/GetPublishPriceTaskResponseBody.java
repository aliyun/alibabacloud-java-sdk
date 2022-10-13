// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetPublishPriceTaskResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    @NameInMap("Header")
    public GetPublishPriceTaskResponseBodyHeader header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetPublishPriceTaskResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetPublishPriceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPublishPriceTaskResponseBody self = new GetPublishPriceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPublishPriceTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPublishPriceTaskResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetPublishPriceTaskResponseBody setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public GetPublishPriceTaskResponseBody setHeader(GetPublishPriceTaskResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public GetPublishPriceTaskResponseBodyHeader getHeader() {
        return this.header;
    }

    public GetPublishPriceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPublishPriceTaskResponseBody setResult(GetPublishPriceTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetPublishPriceTaskResponseBodyResult getResult() {
        return this.result;
    }

    public GetPublishPriceTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPublishPriceTaskResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Version")
        public String version;

        public static GetPublishPriceTaskResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            GetPublishPriceTaskResponseBodyHeader self = new GetPublishPriceTaskResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public GetPublishPriceTaskResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public GetPublishPriceTaskResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetPublishPriceTaskResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetPublishPriceTaskResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetPublishPriceTaskResponseBodyResult extends TeaModel {
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Approver")
        public String approver;

        @NameInMap("BpmsProcId")
        public String bpmsProcId;

        @NameInMap("BpmsProcInsId")
        public String bpmsProcInsId;

        @NameInMap("CatalogPrice")
        public Long catalogPrice;

        @NameInMap("Code")
        public String code;

        @NameInMap("DeleteFlag")
        public String deleteFlag;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Remarks")
        public String remarks;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static GetPublishPriceTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetPublishPriceTaskResponseBodyResult self = new GetPublishPriceTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetPublishPriceTaskResponseBodyResult setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetPublishPriceTaskResponseBodyResult setApprover(String approver) {
            this.approver = approver;
            return this;
        }
        public String getApprover() {
            return this.approver;
        }

        public GetPublishPriceTaskResponseBodyResult setBpmsProcId(String bpmsProcId) {
            this.bpmsProcId = bpmsProcId;
            return this;
        }
        public String getBpmsProcId() {
            return this.bpmsProcId;
        }

        public GetPublishPriceTaskResponseBodyResult setBpmsProcInsId(String bpmsProcInsId) {
            this.bpmsProcInsId = bpmsProcInsId;
            return this;
        }
        public String getBpmsProcInsId() {
            return this.bpmsProcInsId;
        }

        public GetPublishPriceTaskResponseBodyResult setCatalogPrice(Long catalogPrice) {
            this.catalogPrice = catalogPrice;
            return this;
        }
        public Long getCatalogPrice() {
            return this.catalogPrice;
        }

        public GetPublishPriceTaskResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetPublishPriceTaskResponseBodyResult setDeleteFlag(String deleteFlag) {
            this.deleteFlag = deleteFlag;
            return this;
        }
        public String getDeleteFlag() {
            return this.deleteFlag;
        }

        public GetPublishPriceTaskResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPublishPriceTaskResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPublishPriceTaskResponseBodyResult setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public GetPublishPriceTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetPublishPriceTaskResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetPublishPriceTaskResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
