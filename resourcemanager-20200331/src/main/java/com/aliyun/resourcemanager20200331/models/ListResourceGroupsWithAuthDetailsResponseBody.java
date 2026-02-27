// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourceGroupsWithAuthDetailsResponseBody extends TeaModel {
    /**
     * <p>The authorization details for resource groups.</p>
     */
    @NameInMap("AuthDetails")
    public java.util.List<ListResourceGroupsWithAuthDetailsResponseBodyAuthDetails> authDetails;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>4141780B-4E3D-5D2A-A8F4-44D6D34F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the resource groups.</p>
     */
    @NameInMap("ResourceGroups")
    public java.util.List<ListResourceGroupsWithAuthDetailsResponseBodyResourceGroups> resourceGroups;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListResourceGroupsWithAuthDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsWithAuthDetailsResponseBody self = new ListResourceGroupsWithAuthDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsWithAuthDetailsResponseBody setAuthDetails(java.util.List<ListResourceGroupsWithAuthDetailsResponseBodyAuthDetails> authDetails) {
        this.authDetails = authDetails;
        return this;
    }
    public java.util.List<ListResourceGroupsWithAuthDetailsResponseBodyAuthDetails> getAuthDetails() {
        return this.authDetails;
    }

    public ListResourceGroupsWithAuthDetailsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceGroupsWithAuthDetailsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceGroupsWithAuthDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceGroupsWithAuthDetailsResponseBody setResourceGroups(java.util.List<ListResourceGroupsWithAuthDetailsResponseBodyResourceGroups> resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }
    public java.util.List<ListResourceGroupsWithAuthDetailsResponseBodyResourceGroups> getResourceGroups() {
        return this.resourceGroups;
    }

    public ListResourceGroupsWithAuthDetailsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourceGroupsWithAuthDetailsResponseBodyAuthDetailsAuthOfResourceGroups extends TeaModel {
        /**
         * <p>Indicates whether the user has permissions on the resource group for the specified resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasPermission")
        public Boolean hasPermission;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzscexx6w3u2y</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListResourceGroupsWithAuthDetailsResponseBodyAuthDetailsAuthOfResourceGroups build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsWithAuthDetailsResponseBodyAuthDetailsAuthOfResourceGroups self = new ListResourceGroupsWithAuthDetailsResponseBodyAuthDetailsAuthOfResourceGroups();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsWithAuthDetailsResponseBodyAuthDetailsAuthOfResourceGroups setHasPermission(Boolean hasPermission) {
            this.hasPermission = hasPermission;
            return this;
        }
        public Boolean getHasPermission() {
            return this.hasPermission;
        }

        public ListResourceGroupsWithAuthDetailsResponseBodyAuthDetailsAuthOfResourceGroups setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListResourceGroupsWithAuthDetailsResponseBodyAuthDetails extends TeaModel {
        /**
         * <p>Indicates whether the user has account-level authorization for this resource type.</p>
         */
        @NameInMap("AccountScopeAuth")
        public Boolean accountScopeAuth;

        /**
         * <p>The permission details for the resource groups on the specified resource types.</p>
         */
        @NameInMap("AuthOfResourceGroups")
        public java.util.List<ListResourceGroupsWithAuthDetailsResponseBodyAuthDetailsAuthOfResourceGroups> authOfResourceGroups;

        /**
         * <p>The resource type.</p>
         * <p>You can obtain the resource type from the <strong>Resource type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the Alibaba Cloud service.</p>
         * <p>You can obtain the ID from the <strong>Service code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Service")
        public String service;

        public static ListResourceGroupsWithAuthDetailsResponseBodyAuthDetails build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsWithAuthDetailsResponseBodyAuthDetails self = new ListResourceGroupsWithAuthDetailsResponseBodyAuthDetails();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsWithAuthDetailsResponseBodyAuthDetails setAccountScopeAuth(Boolean accountScopeAuth) {
            this.accountScopeAuth = accountScopeAuth;
            return this;
        }
        public Boolean getAccountScopeAuth() {
            return this.accountScopeAuth;
        }

        public ListResourceGroupsWithAuthDetailsResponseBodyAuthDetails setAuthOfResourceGroups(java.util.List<ListResourceGroupsWithAuthDetailsResponseBodyAuthDetailsAuthOfResourceGroups> authOfResourceGroups) {
            this.authOfResourceGroups = authOfResourceGroups;
            return this;
        }
        public java.util.List<ListResourceGroupsWithAuthDetailsResponseBodyAuthDetailsAuthOfResourceGroups> getAuthOfResourceGroups() {
            return this.authOfResourceGroups;
        }

        public ListResourceGroupsWithAuthDetailsResponseBodyAuthDetails setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourceGroupsWithAuthDetailsResponseBodyAuthDetails setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

    public static class ListResourceGroupsWithAuthDetailsResponseBodyResourceGroupsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListResourceGroupsWithAuthDetailsResponseBodyResourceGroupsTags build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsWithAuthDetailsResponseBodyResourceGroupsTags self = new ListResourceGroupsWithAuthDetailsResponseBodyResourceGroupsTags();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsWithAuthDetailsResponseBodyResourceGroupsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListResourceGroupsWithAuthDetailsResponseBodyResourceGroupsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListResourceGroupsWithAuthDetailsResponseBodyResourceGroups extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the resource group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The time when the resource group was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The display name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>my-project</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of your Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-9gLOoK****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The unique identifier of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>my-project</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the resource group. Valid values:</p>
         * <ul>
         * <li>Creating: The resource group is being created.</li>
         * <li>OK: The resource group is created.</li>
         * <li>PendingDelete: The resource group is waiting to be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListResourceGroupsWithAuthDetailsResponseBodyResourceGroupsTags> tags;

        public static ListResourceGroupsWithAuthDetailsResponseBodyResourceGroups build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsWithAuthDetailsResponseBodyResourceGroups self = new ListResourceGroupsWithAuthDetailsResponseBodyResourceGroups();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsWithAuthDetailsResponseBodyResourceGroups setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListResourceGroupsWithAuthDetailsResponseBodyResourceGroups setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListResourceGroupsWithAuthDetailsResponseBodyResourceGroups setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListResourceGroupsWithAuthDetailsResponseBodyResourceGroups setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourceGroupsWithAuthDetailsResponseBodyResourceGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceGroupsWithAuthDetailsResponseBodyResourceGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourceGroupsWithAuthDetailsResponseBodyResourceGroups setTags(java.util.List<ListResourceGroupsWithAuthDetailsResponseBodyResourceGroupsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListResourceGroupsWithAuthDetailsResponseBodyResourceGroupsTags> getTags() {
            return this.tags;
        }

    }

}
