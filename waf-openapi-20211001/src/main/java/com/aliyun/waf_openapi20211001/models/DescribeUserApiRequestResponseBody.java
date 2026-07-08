// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserApiRequestResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D13E4540-4432-5AD7-B216-6369512514F4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of statistics.</p>
     */
    @NameInMap("Requests")
    public java.util.List<DescribeUserApiRequestResponseBodyRequests> requests;

    public static DescribeUserApiRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserApiRequestResponseBody self = new DescribeUserApiRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserApiRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserApiRequestResponseBody setRequests(java.util.List<DescribeUserApiRequestResponseBodyRequests> requests) {
        this.requests = requests;
        return this;
    }
    public java.util.List<DescribeUserApiRequestResponseBodyRequests> getRequests() {
        return this.requests;
    }

    public static class DescribeUserApiRequestResponseBodyRequests extends TeaModel {
        /**
         * <p>The number of statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>76</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The statistics information. This includes:</p>
         * <ul>
         * <li><p><strong>client_list</strong>: the client tool.</p>
         * </li>
         * <li><p><strong>ip</strong>: the IP address information.</p>
         * </li>
         * <li><p><strong>region_id</strong>: the region.</p>
         * </li>
         * <li><p><strong>country_id</strong>: the country.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;client_list&quot;: [
         *         &quot;Unknown&quot;
         *     ],
         *     &quot;ip&quot;: &quot;47.92.113.***&quot;,
         *     &quot;region_id&quot;: &quot;110000&quot;,
         *     &quot;country_id&quot;: &quot;CN&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeUserApiRequestResponseBodyRequests build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserApiRequestResponseBodyRequests self = new DescribeUserApiRequestResponseBodyRequests();
            return TeaModel.build(map, self);
        }

        public DescribeUserApiRequestResponseBodyRequests setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeUserApiRequestResponseBodyRequests setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
