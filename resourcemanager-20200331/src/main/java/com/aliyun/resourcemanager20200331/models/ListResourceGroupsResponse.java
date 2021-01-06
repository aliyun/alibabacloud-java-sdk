// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourceGroupsResponse extends TeaModel {
    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("ResourceGroups")
    @Validation(required = true)
    public ListResourceGroupsResponseResourceGroups resourceGroups;

    public static ListResourceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsResponse self = new ListResourceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListResourceGroupsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceGroupsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceGroupsResponse setResourceGroups(ListResourceGroupsResponseResourceGroups resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }
    public ListResourceGroupsResponseResourceGroups getResourceGroups() {
        return this.resourceGroups;
    }

    public static class ListResourceGroupsResponseResourceGroupsResourceGroup extends TeaModel {
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

        public static ListResourceGroupsResponseResourceGroupsResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseResourceGroupsResourceGroup self = new ListResourceGroupsResponseResourceGroupsResourceGroup();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseResourceGroupsResourceGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourceGroupsResponseResourceGroupsResourceGroup setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListResourceGroupsResponseResourceGroupsResourceGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListResourceGroupsResponseResourceGroupsResourceGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourceGroupsResponseResourceGroupsResourceGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListResourceGroupsResponseResourceGroupsResourceGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListResourceGroupsResponseResourceGroups extends TeaModel {
        @NameInMap("ResourceGroup")
        @Validation(required = true)
        public java.util.List<ListResourceGroupsResponseResourceGroupsResourceGroup> resourceGroup;

        public static ListResourceGroupsResponseResourceGroups build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseResourceGroups self = new ListResourceGroupsResponseResourceGroups();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseResourceGroups setResourceGroup(java.util.List<ListResourceGroupsResponseResourceGroupsResourceGroup> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public java.util.List<ListResourceGroupsResponseResourceGroupsResourceGroup> getResourceGroup() {
            return this.resourceGroup;
        }

    }

}
