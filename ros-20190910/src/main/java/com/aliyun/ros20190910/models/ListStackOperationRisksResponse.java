// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackOperationRisksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RiskResources")
    @Validation(required = true)
    public java.util.List<ListStackOperationRisksResponseRiskResources> riskResources;

    public static ListStackOperationRisksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackOperationRisksResponse self = new ListStackOperationRisksResponse();
        return TeaModel.build(map, self);
    }

    public ListStackOperationRisksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackOperationRisksResponse setRiskResources(java.util.List<ListStackOperationRisksResponseRiskResources> riskResources) {
        this.riskResources = riskResources;
        return this;
    }
    public java.util.List<ListStackOperationRisksResponseRiskResources> getRiskResources() {
        return this.riskResources;
    }

    public static class ListStackOperationRisksResponseRiskResources extends TeaModel {
        @NameInMap("LogicalResourceId")
        @Validation(required = true)
        public String logicalResourceId;

        @NameInMap("PhysicalResourceId")
        @Validation(required = true)
        public String physicalResourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("Reason")
        @Validation(required = true)
        public String reason;

        @NameInMap("RiskType")
        @Validation(required = true)
        public String riskType;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("RequestId")
        @Validation(required = true)
        public String requestId;

        public static ListStackOperationRisksResponseRiskResources build(java.util.Map<String, ?> map) throws Exception {
            ListStackOperationRisksResponseRiskResources self = new ListStackOperationRisksResponseRiskResources();
            return TeaModel.build(map, self);
        }

        public ListStackOperationRisksResponseRiskResources setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public ListStackOperationRisksResponseRiskResources setPhysicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        public ListStackOperationRisksResponseRiskResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListStackOperationRisksResponseRiskResources setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListStackOperationRisksResponseRiskResources setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

        public ListStackOperationRisksResponseRiskResources setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListStackOperationRisksResponseRiskResources setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListStackOperationRisksResponseRiskResources setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
