// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourceGroupsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ResourceGroups")
    public ListResourceGroupsResponseBodyResourceGroups resourceGroups;

    public static ListResourceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsResponseBody self = new ListResourceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListResourceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceGroupsResponseBody setResourceGroups(ListResourceGroupsResponseBodyResourceGroups resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }
    public ListResourceGroupsResponseBodyResourceGroups getResourceGroups() {
        return this.resourceGroups;
    }

    public static class ListResourceGroupsResponseBodyResourceGroupsResourceGroup extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Status")
        public String status;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("Name")
        public String name;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Id")
        public String id;

        public static ListResourceGroupsResponseBodyResourceGroupsResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyResourceGroupsResourceGroup self = new ListResourceGroupsResponseBodyResourceGroupsResourceGroup();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroup setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListResourceGroupsResponseBodyResourceGroupsResourceGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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
