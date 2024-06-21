// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackOperationRisksResponseBody extends TeaModel {
    /**
     * <p>The operations on which the permissions are not granted to the Alibaba Cloud account of the caller.</p>
     */
    @NameInMap("MissingPolicyActions")
    public java.util.List<String> missingPolicyActions;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>72108E7A-E874-4A5E-B22C-A61E94AD12CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resources that are at risk.</p>
     */
    @NameInMap("RiskResources")
    public java.util.List<ListStackOperationRisksResponseBodyRiskResources> riskResources;

    public static ListStackOperationRisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackOperationRisksResponseBody self = new ListStackOperationRisksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackOperationRisksResponseBody setMissingPolicyActions(java.util.List<String> missingPolicyActions) {
        this.missingPolicyActions = missingPolicyActions;
        return this;
    }
    public java.util.List<String> getMissingPolicyActions() {
        return this.missingPolicyActions;
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
        /**
         * <p>The error code that is returned when the risk detection fails.</p>
         * <blockquote>
         * <p> This parameter is not returned if the risk detection is successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NoPermission</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The logical ID of the resource. The logical ID is the resource name that is defined in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>MySG</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The error message that is returned when the risk detection fails.</p>
         * <blockquote>
         * <p> This parameter is not returned if the risk detection is successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>You are not authorized to complete this action.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The physical ID of the resource. The physical ID is the actual ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1dpioafqphedg9****</p>
         */
        @NameInMap("PhysicalResourceId")
        public String physicalResourceId;

        /**
         * <p>The cause of the risk.</p>
         * 
         * <strong>example:</strong>
         * <p>There are some ECS instances (i-bp18el96s4wq635e****) depending on the security group.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The ID of the request when the risk detection fails.</p>
         * <blockquote>
         * <p> This parameter is not returned if the risk detection is successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DF4296CF-F45F-4845-A72B-BE617601DB25</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ECS::SecurityGroup</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The type of the risk. Valid values:</p>
         * <ul>
         * <li>Referenced: The resource is referenced by other resources.</li>
         * <li>MaybeReferenced: The resource may be referenced by other resources.</li>
         * <li>AdditionalRiskCheckRequired: An additional risk detection is required for a nested stack.</li>
         * <li>OperationIgnored: The operation does not take effect for the resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Referenced</p>
         */
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
