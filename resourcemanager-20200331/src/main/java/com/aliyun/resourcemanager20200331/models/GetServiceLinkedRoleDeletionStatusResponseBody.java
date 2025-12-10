// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleDeletionStatusResponseBody extends TeaModel {
    /**
     * <p>The cause for the failure of the deletion task.</p>
     */
    @NameInMap("Reason")
    public GetServiceLinkedRoleDeletionStatusResponseBodyReason reason;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>07194EB1-DB50-4513-A51D-99B30D635AEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the task.</p>
     * <ul>
     * <li>SUCCEEDED</li>
     * <li>IN_PROGRESS</li>
     * <li>FAILED</li>
     * <li>NOT_STARTED</li>
     * <li>INTERNAL_ERROR</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FAILED</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetServiceLinkedRoleDeletionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLinkedRoleDeletionStatusResponseBody self = new GetServiceLinkedRoleDeletionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceLinkedRoleDeletionStatusResponseBody setReason(GetServiceLinkedRoleDeletionStatusResponseBodyReason reason) {
        this.reason = reason;
        return this;
    }
    public GetServiceLinkedRoleDeletionStatusResponseBodyReason getReason() {
        return this.reason;
    }

    public GetServiceLinkedRoleDeletionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceLinkedRoleDeletionStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsageResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<String> resource;

        public static GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsageResources build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsageResources self = new GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsageResources();
            return TeaModel.build(map, self);
        }

        public GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsageResources setResource(java.util.List<String> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<String> getResource() {
            return this.resource;
        }

    }

    public static class GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsage extends TeaModel {
        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The information about resources.</p>
         */
        @NameInMap("Resources")
        public GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsageResources resources;

        public static GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsage build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsage self = new GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsage();
            return TeaModel.build(map, self);
        }

        public GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsage setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsage setResources(GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsageResources resources) {
            this.resources = resources;
            return this;
        }
        public GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsageResources getResources() {
            return this.resources;
        }

    }

    public static class GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsages extends TeaModel {
        @NameInMap("RoleUsage")
        public java.util.List<GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsage> roleUsage;

        public static GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsages build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsages self = new GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsages();
            return TeaModel.build(map, self);
        }

        public GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsages setRoleUsage(java.util.List<GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsage> roleUsage) {
            this.roleUsage = roleUsage;
            return this;
        }
        public java.util.List<GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsagesRoleUsage> getRoleUsage() {
            return this.roleUsage;
        }

    }

    public static class GetServiceLinkedRoleDeletionStatusResponseBodyReason extends TeaModel {
        /**
         * <p>The failure information.</p>
         * 
         * <strong>example:</strong>
         * <p>Service-Linked Role acs:ram::196813227629****:role/aliyunserviceroleforhdr cannot be deleted as it is in use by hdr.aliyuncs.com.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The information about the resources that the service-linked role can use.</p>
         */
        @NameInMap("RoleUsages")
        public GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsages roleUsages;

        public static GetServiceLinkedRoleDeletionStatusResponseBodyReason build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLinkedRoleDeletionStatusResponseBodyReason self = new GetServiceLinkedRoleDeletionStatusResponseBodyReason();
            return TeaModel.build(map, self);
        }

        public GetServiceLinkedRoleDeletionStatusResponseBodyReason setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetServiceLinkedRoleDeletionStatusResponseBodyReason setRoleUsages(GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsages roleUsages) {
            this.roleUsages = roleUsages;
            return this;
        }
        public GetServiceLinkedRoleDeletionStatusResponseBodyReasonRoleUsages getRoleUsages() {
            return this.roleUsages;
        }

    }

}
