// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecMatchedHostsResponseBody extends TeaModel {
    /**
     * <p>The domain names.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeApisecMatchedHostsResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8D4CA088-F72B-5658-BD5B-ECE8B8F0C7BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeApisecMatchedHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecMatchedHostsResponseBody self = new DescribeApisecMatchedHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecMatchedHostsResponseBody setData(java.util.List<DescribeApisecMatchedHostsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeApisecMatchedHostsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeApisecMatchedHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisecMatchedHostsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisecMatchedHostsResponseBodyData extends TeaModel {
        /**
         * <p>The number of APIs related to the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>31</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The domain name or IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>bc.aliyun.com</p>
         */
        @NameInMap("MatchedHost")
        public String matchedHost;

        public static DescribeApisecMatchedHostsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecMatchedHostsResponseBodyData self = new DescribeApisecMatchedHostsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecMatchedHostsResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeApisecMatchedHostsResponseBodyData setMatchedHost(String matchedHost) {
            this.matchedHost = matchedHost;
            return this;
        }
        public String getMatchedHost() {
            return this.matchedHost;
        }

    }

}
