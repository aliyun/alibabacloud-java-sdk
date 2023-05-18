// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The information of the resource group.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The display name of the resource group.</p>
     */
    @NameInMap("ResourceGroup")
    public CreateResourceGroupResponseBodyResourceGroup resourceGroup;

    public static CreateResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceGroupResponseBody self = new CreateResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResourceGroupResponseBody setResourceGroup(CreateResourceGroupResponseBodyResourceGroup resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public CreateResourceGroupResponseBodyResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    public static class CreateResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the resource group belongs.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus self = new CreateResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus();
            return TeaModel.build(map, self);
        }

        public CreateResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateResourceGroupResponseBodyResourceGroupRegionStatuses extends TeaModel {
        @NameInMap("RegionStatus")
        public java.util.List<CreateResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus> regionStatus;

        public static CreateResourceGroupResponseBodyResourceGroupRegionStatuses build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceGroupResponseBodyResourceGroupRegionStatuses self = new CreateResourceGroupResponseBodyResourceGroupRegionStatuses();
            return TeaModel.build(map, self);
        }

        public CreateResourceGroupResponseBodyResourceGroupRegionStatuses setRegionStatus(java.util.List<CreateResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus> regionStatus) {
            this.regionStatus = regionStatus;
            return this;
        }
        public java.util.List<CreateResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus> getRegionStatus() {
            return this.regionStatus;
        }

    }

    public static class CreateResourceGroupResponseBodyResourceGroup extends TeaModel {
        /**
         * <p>The unique identifier of the resource group.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The status of the resource group. Valid values:</p>
         * <br>
         * <p>*   Creating: The resource group is being created.</p>
         * <p>*   OK: The resource group is created.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        /**
         * <p>The time when the resource group was created. The time is displayed in UTC.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the resource group. Valid values:</p>
         * <br>
         * <p>*   Creating: The resource group is being created.</p>
         * <p>*   OK: The resource group is created.</p>
         */
        @NameInMap("RegionStatuses")
        public CreateResourceGroupResponseBodyResourceGroupRegionStatuses regionStatuses;

        /**
         * <p>The status of the resource group in all regions.</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateResourceGroupResponseBodyResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceGroupResponseBodyResourceGroup self = new CreateResourceGroupResponseBodyResourceGroup();
            return TeaModel.build(map, self);
        }

        public CreateResourceGroupResponseBodyResourceGroup setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CreateResourceGroupResponseBodyResourceGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateResourceGroupResponseBodyResourceGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateResourceGroupResponseBodyResourceGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateResourceGroupResponseBodyResourceGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateResourceGroupResponseBodyResourceGroup setRegionStatuses(CreateResourceGroupResponseBodyResourceGroupRegionStatuses regionStatuses) {
            this.regionStatuses = regionStatuses;
            return this;
        }
        public CreateResourceGroupResponseBodyResourceGroupRegionStatuses getRegionStatuses() {
            return this.regionStatuses;
        }

        public CreateResourceGroupResponseBodyResourceGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
