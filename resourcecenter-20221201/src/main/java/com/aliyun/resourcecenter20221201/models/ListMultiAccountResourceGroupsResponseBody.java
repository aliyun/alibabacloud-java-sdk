// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountResourceGroupsResponseBody extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAU5VsT9R1adMTuz9GzginZ3Y+7Y/5JATS+6q5GK9kT75</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0FF0A66E-781F-51EE-9531-928F197558F2</p>
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
         * 
         * <strong>example:</strong>
         * <p>1394339739****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The time when the resource group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-30T09:20:08Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The display name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
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
