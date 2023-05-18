// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the resource group.</p>
     */
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
        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the resource group. Valid values:</p>
         * <br>
         * <p>*   Creating: The resource group is being created.</p>
         * <p>*   OK: The resource group is created.</p>
         * <p>*   PendingDelete: The resource group is waiting to be deleted.</p>
         * <p>*   Deleting: The resource group is being deleted.</p>
         */
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
        /**
         * <p>The ID of the Alibaba Cloud account to which the resource group belongs.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The time when the resource group was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The display name of the resource group.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The unique identifier of the resource group.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the resource group in all regions.</p>
         */
        @NameInMap("RegionStatuses")
        public DeleteResourceGroupResponseBodyResourceGroupRegionStatuses regionStatuses;

        /**
         * <p>The status of the resource group. Valid values:</p>
         * <br>
         * <p>*   Creating: The resource group is being created.</p>
         * <p>*   OK: The resource group is created.</p>
         * <p>*   PendingDelete: The resource group is waiting to be deleted.</p>
         */
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
