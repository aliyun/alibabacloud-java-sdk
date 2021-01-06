// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceGroup")
    @Validation(required = true)
    public GetResourceGroupResponseResourceGroup resourceGroup;

    public static GetResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupResponse self = new GetResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceGroupResponse setResourceGroup(GetResourceGroupResponseResourceGroup resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public GetResourceGroupResponseResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    public static class GetResourceGroupResponseResourceGroupRegionStatusesRegionStatus extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        public static GetResourceGroupResponseResourceGroupRegionStatusesRegionStatus build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupResponseResourceGroupRegionStatusesRegionStatus self = new GetResourceGroupResponseResourceGroupRegionStatusesRegionStatus();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupResponseResourceGroupRegionStatusesRegionStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetResourceGroupResponseResourceGroupRegionStatusesRegionStatus setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetResourceGroupResponseResourceGroupRegionStatuses extends TeaModel {
        @NameInMap("RegionStatus")
        @Validation(required = true)
        public java.util.List<GetResourceGroupResponseResourceGroupRegionStatusesRegionStatus> regionStatus;

        public static GetResourceGroupResponseResourceGroupRegionStatuses build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupResponseResourceGroupRegionStatuses self = new GetResourceGroupResponseResourceGroupRegionStatuses();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupResponseResourceGroupRegionStatuses setRegionStatus(java.util.List<GetResourceGroupResponseResourceGroupRegionStatusesRegionStatus> regionStatus) {
            this.regionStatus = regionStatus;
            return this;
        }
        public java.util.List<GetResourceGroupResponseResourceGroupRegionStatusesRegionStatus> getRegionStatus() {
            return this.regionStatus;
        }

    }

    public static class GetResourceGroupResponseResourceGroup extends TeaModel {
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
        public GetResourceGroupResponseResourceGroupRegionStatuses regionStatuses;

        public static GetResourceGroupResponseResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupResponseResourceGroup self = new GetResourceGroupResponseResourceGroup();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupResponseResourceGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetResourceGroupResponseResourceGroup setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetResourceGroupResponseResourceGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetResourceGroupResponseResourceGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetResourceGroupResponseResourceGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetResourceGroupResponseResourceGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetResourceGroupResponseResourceGroup setRegionStatuses(GetResourceGroupResponseResourceGroupRegionStatuses regionStatuses) {
            this.regionStatuses = regionStatuses;
            return this;
        }
        public GetResourceGroupResponseResourceGroupRegionStatuses getRegionStatuses() {
            return this.regionStatuses;
        }

    }

}
