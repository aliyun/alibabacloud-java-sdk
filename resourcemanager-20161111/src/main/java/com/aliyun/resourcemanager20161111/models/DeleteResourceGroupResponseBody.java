// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class DeleteResourceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroup")
    public DeleteResourceGroupResponseBodyResourceGroup resourceGroup;

    public static DeleteResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceGroupResponseBody self = new DeleteResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteResourceGroupResponseBody setResourceGroup(DeleteResourceGroupResponseBodyResourceGroup resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public DeleteResourceGroupResponseBodyResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    public static class DeleteResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        public static DeleteResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus build(java.util.Map<String, ?> map) throws Exception {
            DeleteResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus self = new DeleteResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus();
            return TeaModel.build(map, self);
        }

        public DeleteResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DeleteResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DeleteResourceGroupResponseBodyResourceGroupRegionStatuses extends TeaModel {
        @NameInMap("RegionStatus")
        public java.util.List<DeleteResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus> regionStatus;

        public static DeleteResourceGroupResponseBodyResourceGroupRegionStatuses build(java.util.Map<String, ?> map) throws Exception {
            DeleteResourceGroupResponseBodyResourceGroupRegionStatuses self = new DeleteResourceGroupResponseBodyResourceGroupRegionStatuses();
            return TeaModel.build(map, self);
        }

        public DeleteResourceGroupResponseBodyResourceGroupRegionStatuses setRegionStatus(java.util.List<DeleteResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus> regionStatus) {
            this.regionStatus = regionStatus;
            return this;
        }
        public java.util.List<DeleteResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus> getRegionStatus() {
            return this.regionStatus;
        }

    }

    public static class DeleteResourceGroupResponseBodyResourceGroup extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionStatuses")
        public DeleteResourceGroupResponseBodyResourceGroupRegionStatuses regionStatuses;

        @NameInMap("Status")
        public String status;

        public static DeleteResourceGroupResponseBodyResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            DeleteResourceGroupResponseBodyResourceGroup self = new DeleteResourceGroupResponseBodyResourceGroup();
            return TeaModel.build(map, self);
        }

        public DeleteResourceGroupResponseBodyResourceGroup setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DeleteResourceGroupResponseBodyResourceGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public DeleteResourceGroupResponseBodyResourceGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DeleteResourceGroupResponseBodyResourceGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteResourceGroupResponseBodyResourceGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteResourceGroupResponseBodyResourceGroup setRegionStatuses(DeleteResourceGroupResponseBodyResourceGroupRegionStatuses regionStatuses) {
            this.regionStatuses = regionStatuses;
            return this;
        }
        public DeleteResourceGroupResponseBodyResourceGroupRegionStatuses getRegionStatuses() {
            return this.regionStatuses;
        }

        public DeleteResourceGroupResponseBodyResourceGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
