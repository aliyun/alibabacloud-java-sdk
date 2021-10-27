// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleDeletionStatusResponseBody extends TeaModel {
    @NameInMap("Reason")
    public GetServiceLinkedRoleDeletionStatusResponseBodyReason reason;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Region")
        public String region;

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
        @NameInMap("Message")
        public String message;

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
