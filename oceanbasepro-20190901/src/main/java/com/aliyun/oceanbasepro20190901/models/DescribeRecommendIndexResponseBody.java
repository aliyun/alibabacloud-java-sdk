// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRecommendIndexResponseBody extends TeaModel {
    // 推荐索引信息
    @NameInMap("RecommendIndex")
    public DescribeRecommendIndexResponseBodyRecommendIndex recommendIndex;

    // 请求ID
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
        // 建议索引，如果是主键，就是 PRIMARY，如果不是主键，以用户取名为准
        @NameInMap("SuggestIndex")
        public String suggestIndex;

        // 表信息
        @NameInMap("TableList")
        public String tableList;

        // 租户模式
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
