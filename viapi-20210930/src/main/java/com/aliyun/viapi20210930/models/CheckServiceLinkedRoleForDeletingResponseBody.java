// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleForDeletingResponseBody extends TeaModel {
    @NameInMap("Deletable")
    public Boolean deletable;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoleUsages")
    public java.util.List<CheckServiceLinkedRoleForDeletingResponseBodyRoleUsages> roleUsages;

    public static CheckServiceLinkedRoleForDeletingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleForDeletingResponseBody self = new CheckServiceLinkedRoleForDeletingResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleForDeletingResponseBody setDeletable(Boolean deletable) {
        this.deletable = deletable;
        return this;
    }
    public Boolean getDeletable() {
        return this.deletable;
    }

    public CheckServiceLinkedRoleForDeletingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckServiceLinkedRoleForDeletingResponseBody setRoleUsages(java.util.List<CheckServiceLinkedRoleForDeletingResponseBodyRoleUsages> roleUsages) {
        this.roleUsages = roleUsages;
        return this;
    }
    public java.util.List<CheckServiceLinkedRoleForDeletingResponseBodyRoleUsages> getRoleUsages() {
        return this.roleUsages;
    }

    public static class CheckServiceLinkedRoleForDeletingResponseBodyRoleUsages extends TeaModel {
        @NameInMap("Region")
        public String region;

        @NameInMap("Resources")
        public java.util.List<byte[]> resources;

        public static CheckServiceLinkedRoleForDeletingResponseBodyRoleUsages build(java.util.Map<String, ?> map) throws Exception {
            CheckServiceLinkedRoleForDeletingResponseBodyRoleUsages self = new CheckServiceLinkedRoleForDeletingResponseBodyRoleUsages();
            return TeaModel.build(map, self);
        }

        public CheckServiceLinkedRoleForDeletingResponseBodyRoleUsages setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CheckServiceLinkedRoleForDeletingResponseBodyRoleUsages setResources(java.util.List<byte[]> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<byte[]> getResources() {
            return this.resources;
        }

    }

}
