// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountResourceGroupsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

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
