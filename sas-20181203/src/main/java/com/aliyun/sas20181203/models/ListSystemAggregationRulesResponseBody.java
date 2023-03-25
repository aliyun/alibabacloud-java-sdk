// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSystemAggregationRulesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details about the aggregation types.</p>
     */
    @NameInMap("AggregationList")
    public java.util.List<ListSystemAggregationRulesResponseBodyAggregationList> aggregationList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListSystemAggregationRulesResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSystemAggregationRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSystemAggregationRulesResponseBody self = new ListSystemAggregationRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSystemAggregationRulesResponseBody setAggregationList(java.util.List<ListSystemAggregationRulesResponseBodyAggregationList> aggregationList) {
        this.aggregationList = aggregationList;
        return this;
    }
    public java.util.List<ListSystemAggregationRulesResponseBodyAggregationList> getAggregationList() {
        return this.aggregationList;
    }

    public ListSystemAggregationRulesResponseBody setPageInfo(ListSystemAggregationRulesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListSystemAggregationRulesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListSystemAggregationRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSystemAggregationRulesResponseBodyAggregationList extends TeaModel {
        /**
         * <p>The ID of the aggregation type.</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The name of the aggregation type.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of rules that are of the aggregation type.</p>
         */
        @NameInMap("RuleCount")
        public Integer ruleCount;

        public static ListSystemAggregationRulesResponseBodyAggregationList build(java.util.Map<String, ?> map) throws Exception {
            ListSystemAggregationRulesResponseBodyAggregationList self = new ListSystemAggregationRulesResponseBodyAggregationList();
            return TeaModel.build(map, self);
        }

        public ListSystemAggregationRulesResponseBodyAggregationList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListSystemAggregationRulesResponseBodyAggregationList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSystemAggregationRulesResponseBodyAggregationList setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

    }

    public static class ListSystemAggregationRulesResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSystemAggregationRulesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSystemAggregationRulesResponseBodyPageInfo self = new ListSystemAggregationRulesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListSystemAggregationRulesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListSystemAggregationRulesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSystemAggregationRulesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
