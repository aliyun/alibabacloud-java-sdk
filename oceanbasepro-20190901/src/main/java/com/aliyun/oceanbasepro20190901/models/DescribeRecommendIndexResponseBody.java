// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRecommendIndexResponseBody extends TeaModel {
    /**
     * <p>The information about the recommended index.</p>
     */
    @NameInMap("RecommendIndex")
    public DescribeRecommendIndexResponseBodyRecommendIndex recommendIndex;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRecommendIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendIndexResponseBody self = new DescribeRecommendIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendIndexResponseBody setRecommendIndex(DescribeRecommendIndexResponseBodyRecommendIndex recommendIndex) {
        this.recommendIndex = recommendIndex;
        return this;
    }
    public DescribeRecommendIndexResponseBodyRecommendIndex getRecommendIndex() {
        return this.recommendIndex;
    }

    public DescribeRecommendIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRecommendIndexResponseBodyRecommendIndex extends TeaModel {
        /**
         * <p>The index recommended for the SQL statement after calculation by the diagnostic system.   </p>
         * <p>- If the recommended index is the primary key, PRIMARY is returned.  </p>
         * <p>- If an index created by the user is recommended, the index name is returned.   </p>
         * <p>The system recommends only one index for an SQL statement. You can call the DescribeIndexes operation to view the indexes of a table.</p>
         */
        @NameInMap("SuggestIndex")
        public String suggestIndex;

        /**
         * <p>The tables.   </p>
         * <p>The data tables involved in the SQL statement corresponding to the SQL ID are returned. For a single-table query, the data table accessed is returned. For a join query, all data tables accessed by the SQL statement are returned and separated with vertical bars (|), for example, "Table1|Table2".</p>
         */
        @NameInMap("TableList")
        public String tableList;

        /**
         * <p>The tenant mode.   Valid values:  </p>
         * <p>Oracle   </p>
         * <p>MySQL</p>
         */
        @NameInMap("TenantMode")
        public String tenantMode;

        public static DescribeRecommendIndexResponseBodyRecommendIndex build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendIndexResponseBodyRecommendIndex self = new DescribeRecommendIndexResponseBodyRecommendIndex();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendIndexResponseBodyRecommendIndex setSuggestIndex(String suggestIndex) {
            this.suggestIndex = suggestIndex;
            return this;
        }
        public String getSuggestIndex() {
            return this.suggestIndex;
        }

        public DescribeRecommendIndexResponseBodyRecommendIndex setTableList(String tableList) {
            this.tableList = tableList;
            return this;
        }
        public String getTableList() {
            return this.tableList;
        }

        public DescribeRecommendIndexResponseBodyRecommendIndex setTenantMode(String tenantMode) {
            this.tenantMode = tenantMode;
            return this;
        }
        public String getTenantMode() {
            return this.tenantMode;
        }

    }

}
