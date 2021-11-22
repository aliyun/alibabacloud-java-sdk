// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackOperationRisksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskResources")
    public java.util.List<ListStackOperationRisksResponseBodyRiskResources> riskResources;

    public static ListStackOperationRisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackOperationRisksResponseBody self = new ListStackOperationRisksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackOperationRisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackOperationRisksResponseBody setRiskResources(java.util.List<ListStackOperationRisksResponseBodyRiskResources> riskResources) {
        this.riskResources = riskResources;
        return this;
    }
    public java.util.List<ListStackOperationRisksResponseBodyRiskResources> getRiskResources() {
        return this.riskResources;
    }

    public static class ListStackOperationRisksResponseBodyRiskResources extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        @NameInMap("Message")
        public String message;

        @NameInMap("PhysicalResourceId")
        public String physicalResourceId;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("RiskType")
        public String riskType;

        public static ListStackOperationRisksResponseBodyRiskResources build(java.util.Map<String, ?> map) throws Exception {
            ListStackOperationRisksResponseBodyRiskResources self = new ListStackOperationRisksResponseBodyRiskResources();
            return TeaModel.build(map, self);
        }

        public ListStackOperationRisksResponseBodyRiskResources setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListStackOperationRisksResponseBodyRiskResources setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public ListStackOperationRisksResponseBodyRiskResources setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListStackOperationRisksResponseBodyRiskResources setPhysicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        public ListStackOperationRisksResponseBodyRiskResources setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListStackOperationRisksResponseBodyRiskResources setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListStackOperationRisksResponseBodyRiskResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListStackOperationRisksResponseBodyRiskResources setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

    }

}
