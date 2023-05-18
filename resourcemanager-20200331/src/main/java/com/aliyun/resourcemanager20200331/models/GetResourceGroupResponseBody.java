// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The information of the resource group.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The display name of the resource group.</p>
     */
    @NameInMap("ResourceGroup")
    public GetResourceGroupResponseBodyResourceGroup resourceGroup;

    public static GetResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupResponseBody self = new GetResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceGroupResponseBody setResourceGroup(GetResourceGroupResponseBodyResourceGroup resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public GetResourceGroupResponseBodyResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    public static class GetResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus extends TeaModel {
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

        public static GetResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus self = new GetResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetResourceGroupResponseBodyResourceGroupRegionStatuses extends TeaModel {
        @NameInMap("RegionStatus")
        public java.util.List<GetResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus> regionStatus;

        public static GetResourceGroupResponseBodyResourceGroupRegionStatuses build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupResponseBodyResourceGroupRegionStatuses self = new GetResourceGroupResponseBodyResourceGroupRegionStatuses();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupResponseBodyResourceGroupRegionStatuses setRegionStatus(java.util.List<GetResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus> regionStatus) {
            this.regionStatus = regionStatus;
            return this;
        }
        public java.util.List<GetResourceGroupResponseBodyResourceGroupRegionStatusesRegionStatus> getRegionStatus() {
            return this.regionStatus;
        }

    }

    public static class GetResourceGroupResponseBodyResourceGroupTagsTag extends TeaModel {
        /**
         * <p>The tag value.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static GetResourceGroupResponseBodyResourceGroupTagsTag build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupResponseBodyResourceGroupTagsTag self = new GetResourceGroupResponseBodyResourceGroupTagsTag();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupResponseBodyResourceGroupTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetResourceGroupResponseBodyResourceGroupTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetResourceGroupResponseBodyResourceGroupTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<GetResourceGroupResponseBodyResourceGroupTagsTag> tag;

        public static GetResourceGroupResponseBodyResourceGroupTags build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupResponseBodyResourceGroupTags self = new GetResourceGroupResponseBodyResourceGroupTags();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupResponseBodyResourceGroupTags setTag(java.util.List<GetResourceGroupResponseBodyResourceGroupTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<GetResourceGroupResponseBodyResourceGroupTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class GetResourceGroupResponseBodyResourceGroup extends TeaModel {
        /**
         * <p>The identifier of the resource group.</p>
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
         * <p>*   PendingDelete: The resource group is waiting to be deleted.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The tags that are added to the resource group.</p>
         */
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
         * <p>*   PendingDelete: The resource group is waiting to be deleted.</p>
         * <p>*   Deleting: The resource group is being deleted.</p>
         */
        @NameInMap("RegionStatuses")
        public GetResourceGroupResponseBodyResourceGroupRegionStatuses regionStatuses;

        /**
         * <p>The status of the resource group in all regions.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Tags")
        public GetResourceGroupResponseBodyResourceGroupTags tags;

        public static GetResourceGroupResponseBodyResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupResponseBodyResourceGroup self = new GetResourceGroupResponseBodyResourceGroup();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupResponseBodyResourceGroup setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetResourceGroupResponseBodyResourceGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetResourceGroupResponseBodyResourceGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetResourceGroupResponseBodyResourceGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetResourceGroupResponseBodyResourceGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetResourceGroupResponseBodyResourceGroup setRegionStatuses(GetResourceGroupResponseBodyResourceGroupRegionStatuses regionStatuses) {
            this.regionStatuses = regionStatuses;
            return this;
        }
        public GetResourceGroupResponseBodyResourceGroupRegionStatuses getRegionStatuses() {
            return this.regionStatuses;
        }

        public GetResourceGroupResponseBodyResourceGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetResourceGroupResponseBodyResourceGroup setTags(GetResourceGroupResponseBodyResourceGroupTags tags) {
            this.tags = tags;
            return this;
        }
        public GetResourceGroupResponseBodyResourceGroupTags getTags() {
            return this.tags;
        }

    }

}
