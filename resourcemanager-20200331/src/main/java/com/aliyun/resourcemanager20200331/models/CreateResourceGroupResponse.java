// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateResourceGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceGroup")
    @Validation(required = true)
    public CreateResourceGroupResponseResourceGroup resourceGroup;

    public static CreateResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceGroupResponse self = new CreateResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResourceGroupResponse setResourceGroup(CreateResourceGroupResponseResourceGroup resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public CreateResourceGroupResponseResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    public static class CreateResourceGroupResponseResourceGroupRegionStatusesRegionStatus extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        public static CreateResourceGroupResponseResourceGroupRegionStatusesRegionStatus build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceGroupResponseResourceGroupRegionStatusesRegionStatus self = new CreateResourceGroupResponseResourceGroupRegionStatusesRegionStatus();
            return TeaModel.build(map, self);
        }

        public CreateResourceGroupResponseResourceGroupRegionStatusesRegionStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateResourceGroupResponseResourceGroupRegionStatusesRegionStatus setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateResourceGroupResponseResourceGroupRegionStatuses extends TeaModel {
        @NameInMap("RegionStatus")
        @Validation(required = true)
        public java.util.List<CreateResourceGroupResponseResourceGroupRegionStatusesRegionStatus> regionStatus;

        public static CreateResourceGroupResponseResourceGroupRegionStatuses build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceGroupResponseResourceGroupRegionStatuses self = new CreateResourceGroupResponseResourceGroupRegionStatuses();
            return TeaModel.build(map, self);
        }

        public CreateResourceGroupResponseResourceGroupRegionStatuses setRegionStatus(java.util.List<CreateResourceGroupResponseResourceGroupRegionStatusesRegionStatus> regionStatus) {
            this.regionStatus = regionStatus;
            return this;
        }
        public java.util.List<CreateResourceGroupResponseResourceGroupRegionStatusesRegionStatus> getRegionStatus() {
            return this.regionStatus;
        }

    }

    public static class CreateResourceGroupResponseResourceGroup extends TeaModel {
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
        public CreateResourceGroupResponseResourceGroupRegionStatuses regionStatuses;

        public static CreateResourceGroupResponseResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceGroupResponseResourceGroup self = new CreateResourceGroupResponseResourceGroup();
            return TeaModel.build(map, self);
        }

        public CreateResourceGroupResponseResourceGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateResourceGroupResponseResourceGroup setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CreateResourceGroupResponseResourceGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateResourceGroupResponseResourceGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateResourceGroupResponseResourceGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateResourceGroupResponseResourceGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateResourceGroupResponseResourceGroup setRegionStatuses(CreateResourceGroupResponseResourceGroupRegionStatuses regionStatuses) {
            this.regionStatuses = regionStatuses;
            return this;
        }
        public CreateResourceGroupResponseResourceGroupRegionStatuses getRegionStatuses() {
            return this.regionStatuses;
        }

    }

}
