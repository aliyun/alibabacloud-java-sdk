// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineItemListResponseBody extends TeaModel {
    @NameInMap("BaselineItemInfos")
    public java.util.List<DescribeImageBaselineItemListResponseBodyBaselineItemInfos> baselineItemInfos;

    @NameInMap("PageInfo")
    public DescribeImageBaselineItemListResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageBaselineItemListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBaselineItemListResponseBody self = new DescribeImageBaselineItemListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageBaselineItemListResponseBody setBaselineItemInfos(java.util.List<DescribeImageBaselineItemListResponseBodyBaselineItemInfos> baselineItemInfos) {
        this.baselineItemInfos = baselineItemInfos;
        return this;
    }
    public java.util.List<DescribeImageBaselineItemListResponseBodyBaselineItemInfos> getBaselineItemInfos() {
        return this.baselineItemInfos;
    }

    public DescribeImageBaselineItemListResponseBody setPageInfo(DescribeImageBaselineItemListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeImageBaselineItemListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeImageBaselineItemListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageBaselineItemListResponseBodyBaselineItemInfos extends TeaModel {
        @NameInMap("BaselineClassAlias")
        public String baselineClassAlias;

        @NameInMap("BaselineClassKey")
        public String baselineClassKey;

        @NameInMap("BaselineItemAlias")
        public String baselineItemAlias;

        @NameInMap("BaselineItemKey")
        public String baselineItemKey;

        @NameInMap("BaselineNameAlias")
        public String baselineNameAlias;

        @NameInMap("BaselineNameKey")
        public String baselineNameKey;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("WhiteList")
        public Integer whiteList;

        public static DescribeImageBaselineItemListResponseBodyBaselineItemInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageBaselineItemListResponseBodyBaselineItemInfos self = new DescribeImageBaselineItemListResponseBodyBaselineItemInfos();
            return TeaModel.build(map, self);
        }

        public DescribeImageBaselineItemListResponseBodyBaselineItemInfos setBaselineClassAlias(String baselineClassAlias) {
            this.baselineClassAlias = baselineClassAlias;
            return this;
        }
        public String getBaselineClassAlias() {
            return this.baselineClassAlias;
        }

        public DescribeImageBaselineItemListResponseBodyBaselineItemInfos setBaselineClassKey(String baselineClassKey) {
            this.baselineClassKey = baselineClassKey;
            return this;
        }
        public String getBaselineClassKey() {
            return this.baselineClassKey;
        }

        public DescribeImageBaselineItemListResponseBodyBaselineItemInfos setBaselineItemAlias(String baselineItemAlias) {
            this.baselineItemAlias = baselineItemAlias;
            return this;
        }
        public String getBaselineItemAlias() {
            return this.baselineItemAlias;
        }

        public DescribeImageBaselineItemListResponseBodyBaselineItemInfos setBaselineItemKey(String baselineItemKey) {
            this.baselineItemKey = baselineItemKey;
            return this;
        }
        public String getBaselineItemKey() {
            return this.baselineItemKey;
        }

        public DescribeImageBaselineItemListResponseBodyBaselineItemInfos setBaselineNameAlias(String baselineNameAlias) {
            this.baselineNameAlias = baselineNameAlias;
            return this;
        }
        public String getBaselineNameAlias() {
            return this.baselineNameAlias;
        }

        public DescribeImageBaselineItemListResponseBodyBaselineItemInfos setBaselineNameKey(String baselineNameKey) {
            this.baselineNameKey = baselineNameKey;
            return this;
        }
        public String getBaselineNameKey() {
            return this.baselineNameKey;
        }

        public DescribeImageBaselineItemListResponseBodyBaselineItemInfos setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeImageBaselineItemListResponseBodyBaselineItemInfos setWhiteList(Integer whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public Integer getWhiteList() {
            return this.whiteList;
        }

    }

    public static class DescribeImageBaselineItemListResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageBaselineItemListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageBaselineItemListResponseBodyPageInfo self = new DescribeImageBaselineItemListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageBaselineItemListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageBaselineItemListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageBaselineItemListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageBaselineItemListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
