// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedVulResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("GroupedVulItems")
    public java.util.List<DescribeGroupedVulResponseBodyGroupedVulItems> groupedVulItems;

    public static DescribeGroupedVulResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedVulResponseBody self = new DescribeGroupedVulResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedVulResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupedVulResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupedVulResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupedVulResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeGroupedVulResponseBody setGroupedVulItems(java.util.List<DescribeGroupedVulResponseBodyGroupedVulItems> groupedVulItems) {
        this.groupedVulItems = groupedVulItems;
        return this;
    }
    public java.util.List<DescribeGroupedVulResponseBodyGroupedVulItems> getGroupedVulItems() {
        return this.groupedVulItems;
    }

    public static class DescribeGroupedVulResponseBodyGroupedVulItems extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("NntfCount")
        public Integer nntfCount;

        @NameInMap("HandledCount")
        public Integer handledCount;

        @NameInMap("GmtLast")
        public Long gmtLast;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("LaterCount")
        public Integer laterCount;

        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("Name")
        public String name;

        @NameInMap("TotalFixCount")
        public Long totalFixCount;

        @NameInMap("AsapCount")
        public Integer asapCount;

        public static DescribeGroupedVulResponseBodyGroupedVulItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupedVulResponseBodyGroupedVulItems self = new DescribeGroupedVulResponseBodyGroupedVulItems();
            return TeaModel.build(map, self);
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setNntfCount(Integer nntfCount) {
            this.nntfCount = nntfCount;
            return this;
        }
        public Integer getNntfCount() {
            return this.nntfCount;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setHandledCount(Integer handledCount) {
            this.handledCount = handledCount;
            return this;
        }
        public Integer getHandledCount() {
            return this.handledCount;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setGmtLast(Long gmtLast) {
            this.gmtLast = gmtLast;
            return this;
        }
        public Long getGmtLast() {
            return this.gmtLast;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setLaterCount(Integer laterCount) {
            this.laterCount = laterCount;
            return this;
        }
        public Integer getLaterCount() {
            return this.laterCount;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setTotalFixCount(Long totalFixCount) {
            this.totalFixCount = totalFixCount;
            return this;
        }
        public Long getTotalFixCount() {
            return this.totalFixCount;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setAsapCount(Integer asapCount) {
            this.asapCount = asapCount;
            return this;
        }
        public Integer getAsapCount() {
            return this.asapCount;
        }

    }

}
