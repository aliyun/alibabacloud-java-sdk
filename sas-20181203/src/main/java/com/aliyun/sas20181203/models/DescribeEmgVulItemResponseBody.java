// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEmgVulItemResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("GroupedVulItems")
    public java.util.List<DescribeEmgVulItemResponseBodyGroupedVulItems> groupedVulItems;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEmgVulItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmgVulItemResponseBody self = new DescribeEmgVulItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEmgVulItemResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEmgVulItemResponseBody setGroupedVulItems(java.util.List<DescribeEmgVulItemResponseBodyGroupedVulItems> groupedVulItems) {
        this.groupedVulItems = groupedVulItems;
        return this;
    }
    public java.util.List<DescribeEmgVulItemResponseBodyGroupedVulItems> getGroupedVulItems() {
        return this.groupedVulItems;
    }

    public DescribeEmgVulItemResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEmgVulItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEmgVulItemResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEmgVulItemResponseBodyGroupedVulItems extends TeaModel {
        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("CheckType")
        public Integer checkType;

        @NameInMap("GmtLastCheck")
        public Long gmtLastCheck;

        @NameInMap("GmtPublish")
        public Long gmtPublish;

        @NameInMap("Name")
        public String name;

        @NameInMap("PendingCount")
        public Integer pendingCount;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public String type;

        public static DescribeEmgVulItemResponseBodyGroupedVulItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEmgVulItemResponseBodyGroupedVulItems self = new DescribeEmgVulItemResponseBodyGroupedVulItems();
            return TeaModel.build(map, self);
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setGmtLastCheck(Long gmtLastCheck) {
            this.gmtLastCheck = gmtLastCheck;
            return this;
        }
        public Long getGmtLastCheck() {
            return this.gmtLastCheck;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setGmtPublish(Long gmtPublish) {
            this.gmtPublish = gmtPublish;
            return this;
        }
        public Long getGmtPublish() {
            return this.gmtPublish;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setPendingCount(Integer pendingCount) {
            this.pendingCount = pendingCount;
            return this;
        }
        public Integer getPendingCount() {
            return this.pendingCount;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
