// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleDeletionStatusResponse extends TeaModel {
    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Reason")
    @Validation(required = true)
    public GetServiceLinkedRoleDeletionStatusResponseReason reason;

    public static GetServiceLinkedRoleDeletionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLinkedRoleDeletionStatusResponse self = new GetServiceLinkedRoleDeletionStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceLinkedRoleDeletionStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetServiceLinkedRoleDeletionStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceLinkedRoleDeletionStatusResponse setReason(GetServiceLinkedRoleDeletionStatusResponseReason reason) {
        this.reason = reason;
        return this;
    }
    public GetServiceLinkedRoleDeletionStatusResponseReason getReason() {
        return this.reason;
    }

    public static class GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsageResources extends TeaModel {
        // Resource
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<String> resource;

        public static GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsageResources build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsageResources self = new GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsageResources();
            return TeaModel.build(map, self);
        }

        public GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsageResources setResource(java.util.List<String> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<String> getResource() {
            return this.resource;
        }

    }

    public static class GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsage extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Resources")
        @Validation(required = true)
        public GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsageResources resources;

        public static GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsage build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsage self = new GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsage();
            return TeaModel.build(map, self);
        }

        public GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsage setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsage setResources(GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsageResources resources) {
            this.resources = resources;
            return this;
        }
        public GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsageResources getResources() {
            return this.resources;
        }

    }

    public static class GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsages extends TeaModel {
        @NameInMap("RoleUsage")
        @Validation(required = true)
        public java.util.List<GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsage> roleUsage;

        public static GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsages build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsages self = new GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsages();
            return TeaModel.build(map, self);
        }

        public GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsages setRoleUsage(java.util.List<GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsage> roleUsage) {
            this.roleUsage = roleUsage;
            return this;
        }
        public java.util.List<GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsagesRoleUsage> getRoleUsage() {
            return this.roleUsage;
        }

    }

    public static class GetServiceLinkedRoleDeletionStatusResponseReason extends TeaModel {
        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("RoleUsages")
        @Validation(required = true)
        public GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsages roleUsages;

        public static GetServiceLinkedRoleDeletionStatusResponseReason build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLinkedRoleDeletionStatusResponseReason self = new GetServiceLinkedRoleDeletionStatusResponseReason();
            return TeaModel.build(map, self);
        }

        public GetServiceLinkedRoleDeletionStatusResponseReason setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetServiceLinkedRoleDeletionStatusResponseReason setRoleUsages(GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsages roleUsages) {
            this.roleUsages = roleUsages;
            return this;
        }
        public GetServiceLinkedRoleDeletionStatusResponseReasonRoleUsages getRoleUsages() {
            return this.roleUsages;
        }

    }

}
