// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourceGroupsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the resource groups.</p>
     */
    @NameInMap("ResourceGroups")
    public ListResourceGroupsResponseBodyResourceGroups resourceGroups;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListResourceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsResponseBody self = new ListResourceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceGroupsResponseBody setResourceGroups(ListResourceGroupsResponseBodyResourceGroups resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }
    public ListResourceGroupsResponseBodyResourceGroups getResourceGroups() {
        return this.resourceGroups;
    }

    public ListResourceGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourceGroupsResponseBodyResourceGroupsResourceGroupTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListResourceGroupsResponseBodyResourceGroupsResourceGroupTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyResourceGroupsResourceGroupTagsTag self = new ListResourceGroupsResponseBodyResourceGroupsResourceGroupTagsTag();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroupTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroupTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListResourceGroupsResponseBodyResourceGroupsResourceGroupTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListResourceGroupsResponseBodyResourceGroupsResourceGroupTagsTag> tag;

        public static ListResourceGroupsResponseBodyResourceGroupsResourceGroupTags build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyResourceGroupsResourceGroupTags self = new ListResourceGroupsResponseBodyResourceGroupsResourceGroupTags();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroupTags setTag(java.util.List<ListResourceGroupsResponseBodyResourceGroupsResourceGroupTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListResourceGroupsResponseBodyResourceGroupsResourceGroupTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class ListResourceGroupsResponseBodyResourceGroupsResourceGroup extends TeaModel {
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
         * <p>The identifier of the resource group.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the resource group. Valid values:</p>
         * <br>
         * <p>*   Creating: The resource group is being created.</p>
         * <p>*   OK: The resource group is created.</p>
         * <p>*   PendingDelete: The resource group is waiting to be deleted.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags that are added to the resource group.</p>
         */
        @NameInMap("Tags")
        public ListResourceGroupsResponseBodyResourceGroupsResourceGroupTags tags;

        public static ListResourceGroupsResponseBodyResourceGroupsResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyResourceGroupsResourceGroup self = new ListResourceGroupsResponseBodyResourceGroupsResourceGroup();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroup setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroup setTags(ListResourceGroupsResponseBodyResourceGroupsResourceGroupTags tags) {
            this.tags = tags;
            return this;
        }
        public ListResourceGroupsResponseBodyResourceGroupsResourceGroupTags getTags() {
            return this.tags;
        }

    }

    public static class ListResourceGroupsResponseBodyResourceGroups extends TeaModel {
        @NameInMap("ResourceGroup")
        public java.util.List<ListResourceGroupsResponseBodyResourceGroupsResourceGroup> resourceGroup;

        public static ListResourceGroupsResponseBodyResourceGroups build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyResourceGroups self = new ListResourceGroupsResponseBodyResourceGroups();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyResourceGroups setResourceGroup(java.util.List<ListResourceGroupsResponseBodyResourceGroupsResourceGroup> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public java.util.List<ListResourceGroupsResponseBodyResourceGroupsResourceGroup> getResourceGroup() {
            return this.resourceGroup;
        }

    }

}
