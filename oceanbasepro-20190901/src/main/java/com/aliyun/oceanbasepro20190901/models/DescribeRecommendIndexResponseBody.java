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
     * <p>The tenant mode.   Valid values:<br>Oracle<br>MySQL</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
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
         * <p>Example 1</p>
         * 
         * <strong>example:</strong>
         * <p>PRIMARY</p>
         */
        @NameInMap("SuggestIndex")
        public String suggestIndex;

        /**
         * <strong>example:</strong>
         * <p>testtable</p>
         */
        @NameInMap("TableList")
        public String tableList;

        /**
         * <strong>example:</strong>
         * <p>mysql</p>
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
