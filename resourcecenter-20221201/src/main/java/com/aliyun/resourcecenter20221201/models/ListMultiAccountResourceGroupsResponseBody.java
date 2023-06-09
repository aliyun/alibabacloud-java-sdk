// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountResourceGroupsResponseBody extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the resource groups.</p>
     */
    @NameInMap("ResourceGroups")
    public java.util.List<ListMultiAccountResourceGroupsResponseBodyResourceGroups> resourceGroups;

    public static ListMultiAccountResourceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMultiAccountResourceGroupsResponseBody self = new ListMultiAccountResourceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMultiAccountResourceGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMultiAccountResourceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMultiAccountResourceGroupsResponseBody setResourceGroups(java.util.List<ListMultiAccountResourceGroupsResponseBodyResourceGroups> resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }
    public java.util.List<ListMultiAccountResourceGroupsResponseBodyResourceGroups> getResourceGroups() {
        return this.resourceGroups;
    }

    public static class ListMultiAccountResourceGroupsResponseBodyResourceGroups extends TeaModel {
        /**
         * <p>The ID of the management account or member of the resource directory.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The time when the resource group was created.</p>
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
         * <p>The status of the resource group. Valid values:</p>
         * <br>
         * <p>*   Creating: The resource group is being created.</p>
         * <p>*   OK: The resource group is created.</p>
         * <p>*   PendingDelete: The resource group is waiting to be deleted.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListMultiAccountResourceGroupsResponseBodyResourceGroups build(java.util.Map<String, ?> map) throws Exception {
            ListMultiAccountResourceGroupsResponseBodyResourceGroups self = new ListMultiAccountResourceGroupsResponseBodyResourceGroups();
            return TeaModel.build(map, self);
        }

        public ListMultiAccountResourceGroupsResponseBodyResourceGroups setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListMultiAccountResourceGroupsResponseBodyResourceGroups setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListMultiAccountResourceGroupsResponseBodyResourceGroups setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListMultiAccountResourceGroupsResponseBodyResourceGroups setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMultiAccountResourceGroupsResponseBodyResourceGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMultiAccountResourceGroupsResponseBodyResourceGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
