// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterOperationResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Data data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetClusterOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterOperationResponseBody self = new GetClusterOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterOperationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetClusterOperationResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public GetClusterOperationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetClusterOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterOperationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FailReason extends TeaModel {
        @NameInMap("errorCode")
        public String errorCode;

        @NameInMap("errorMessage")
        public String errorMessage;

        public static FailReason build(java.util.Map<String, ?> map) throws Exception {
            FailReason self = new FailReason();
            return TeaModel.build(map, self);
        }

        public FailReason setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public FailReason setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class Data extends TeaModel {
        // clusterId
        @NameInMap("clusterId")
        public String clusterId;

        @NameInMap("creator")
        public String creator;

        // endTime
        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("failReason")
        public FailReason failReason;

        // gmtCreate
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // gmtModified
        @NameInMap("gmtModified")
        public Long gmtModified;

        // modifier
        @NameInMap("modifier")
        public String modifier;

        // operationId
        @NameInMap("operationId")
        public String operationId;

        // operationType
        @NameInMap("operationType")
        public String operationType;

        // resourceIds
        @NameInMap("resourceIds")
        public String resourceIds;

        // resourceType
        @NameInMap("resourceType")
        public String resourceType;

        // startTime
        @NameInMap("startTime")
        public Long startTime;

        // status
        @NameInMap("status")
        public String status;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public Data setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public Data setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public Data setFailReason(FailReason failReason) {
            this.failReason = failReason;
            return this;
        }
        public FailReason getFailReason() {
            return this.failReason;
        }

        public Data setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public Data setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public Data setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public Data setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public Data setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public Data setResourceIds(String resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public String getResourceIds() {
            return this.resourceIds;
        }

        public Data setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public Data setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public Data setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
