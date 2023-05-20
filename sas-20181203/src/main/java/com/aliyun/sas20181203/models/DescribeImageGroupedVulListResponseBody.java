// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageGroupedVulListResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("GroupedVulItems")
    public java.util.List<DescribeImageGroupedVulListResponseBodyGroupedVulItems> groupedVulItems;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImageGroupedVulListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageGroupedVulListResponseBody self = new DescribeImageGroupedVulListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageGroupedVulListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageGroupedVulListResponseBody setGroupedVulItems(java.util.List<DescribeImageGroupedVulListResponseBodyGroupedVulItems> groupedVulItems) {
        this.groupedVulItems = groupedVulItems;
        return this;
    }
    public java.util.List<DescribeImageGroupedVulListResponseBodyGroupedVulItems> getGroupedVulItems() {
        return this.groupedVulItems;
    }

    public DescribeImageGroupedVulListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageGroupedVulListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageGroupedVulListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeImageGroupedVulListResponseBodyGroupedVulItems extends TeaModel {
        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("AsapCount")
        public Integer asapCount;

        /**
         * <p>是否可支持修复。取值：</p>
         * <p>- **yes**：支持修复</p>
         * <p>- **no**： 不支持修复</p>
         */
        @NameInMap("CanFix")
        public String canFix;

        @NameInMap("GmtLast")
        public Long gmtLast;

        @NameInMap("LastScanTime")
        public Long lastScanTime;

        @NameInMap("LaterCount")
        public Integer laterCount;

        @NameInMap("Name")
        public String name;

        @NameInMap("NntfCount")
        public Integer nntfCount;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("Type")
        public String type;

        public static DescribeImageGroupedVulListResponseBodyGroupedVulItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageGroupedVulListResponseBodyGroupedVulItems self = new DescribeImageGroupedVulListResponseBodyGroupedVulItems();
            return TeaModel.build(map, self);
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setAsapCount(Integer asapCount) {
            this.asapCount = asapCount;
            return this;
        }
        public Integer getAsapCount() {
            return this.asapCount;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setCanFix(String canFix) {
            this.canFix = canFix;
            return this;
        }
        public String getCanFix() {
            return this.canFix;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setGmtLast(Long gmtLast) {
            this.gmtLast = gmtLast;
            return this;
        }
        public Long getGmtLast() {
            return this.gmtLast;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setLaterCount(Integer laterCount) {
            this.laterCount = laterCount;
            return this;
        }
        public Integer getLaterCount() {
            return this.laterCount;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setNntfCount(Integer nntfCount) {
            this.nntfCount = nntfCount;
            return this;
        }
        public Integer getNntfCount() {
            return this.nntfCount;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
