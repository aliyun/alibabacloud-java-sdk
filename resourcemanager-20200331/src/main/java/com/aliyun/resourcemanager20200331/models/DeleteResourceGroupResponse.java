// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteResourceGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceGroup")
    @Validation(required = true)
    public DeleteResourceGroupResponseResourceGroup resourceGroup;

    public static DeleteResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceGroupResponse self = new DeleteResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteResourceGroupResponse setResourceGroup(DeleteResourceGroupResponseResourceGroup resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public DeleteResourceGroupResponseResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    public static class DeleteResourceGroupResponseResourceGroupRegionStatusesRegionStatus extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        public static DeleteResourceGroupResponseResourceGroupRegionStatusesRegionStatus build(java.util.Map<String, ?> map) throws Exception {
            DeleteResourceGroupResponseResourceGroupRegionStatusesRegionStatus self = new DeleteResourceGroupResponseResourceGroupRegionStatusesRegionStatus();
            return TeaModel.build(map, self);
        }

        public DeleteResourceGroupResponseResourceGroupRegionStatusesRegionStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteResourceGroupResponseResourceGroupRegionStatusesRegionStatus setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DeleteResourceGroupResponseResourceGroupRegionStatuses extends TeaModel {
        @NameInMap("RegionStatus")
        @Validation(required = true)
        public java.util.List<DeleteResourceGroupResponseResourceGroupRegionStatusesRegionStatus> regionStatus;

        public static DeleteResourceGroupResponseResourceGroupRegionStatuses build(java.util.Map<String, ?> map) throws Exception {
            DeleteResourceGroupResponseResourceGroupRegionStatuses self = new DeleteResourceGroupResponseResourceGroupRegionStatuses();
            return TeaModel.build(map, self);
        }

        public DeleteResourceGroupResponseResourceGroupRegionStatuses setRegionStatus(java.util.List<DeleteResourceGroupResponseResourceGroupRegionStatusesRegionStatus> regionStatus) {
            this.regionStatus = regionStatus;
            return this;
        }
        public java.util.List<DeleteResourceGroupResponseResourceGroupRegionStatusesRegionStatus> getRegionStatus() {
            return this.regionStatus;
        }

    }

    public static class DeleteResourceGroupResponseResourceGroup extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("RegionStatuses")
        @Validation(required = true)
        public DeleteResourceGroupResponseResourceGroupRegionStatuses regionStatuses;

        public static DeleteResourceGroupResponseResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            DeleteResourceGroupResponseResourceGroup self = new DeleteResourceGroupResponseResourceGroup();
            return TeaModel.build(map, self);
        }

        public DeleteResourceGroupResponseResourceGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteResourceGroupResponseResourceGroup setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DeleteResourceGroupResponseResourceGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DeleteResourceGroupResponseResourceGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteResourceGroupResponseResourceGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public DeleteResourceGroupResponseResourceGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteResourceGroupResponseResourceGroup setRegionStatuses(DeleteResourceGroupResponseResourceGroupRegionStatuses regionStatuses) {
            this.regionStatuses = regionStatuses;
            return this;
        }
        public DeleteResourceGroupResponseResourceGroupRegionStatuses getRegionStatuses() {
            return this.regionStatuses;
        }

    }

}
