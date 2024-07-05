// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeDetailDataResponseBody extends TeaModel {
    /**
     * <p>The returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;time_stp&quot;: &quot;2018-06-05T20:00:00Z&quot;,
     *             &quot;domain_name&quot;: &quot;example.com&quot;,
     *             &quot;location&quot;: &quot;Guangdong&quot;,
     *             &quot;isp&quot;: &quot;telecom&quot;,
     *             &quot;qps&quot;: 10
     *       },
     *       {
     *             &quot;time_stp&quot;: &quot;2018-06-05T20:00:00Z&quot;,
     *             &quot;domain_name&quot;: &quot;example.com&quot;,
     *             &quot;location&quot;: &quot;Jiangsu&quot;,
     *             &quot;isp&quot;: &quot;unicom&quot;,
     *             &quot;qps&quot;: 11.1
     *       }
     * ]</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1710298E-8AFA-5F6D-A3E9-47103C52177D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodDomainRealTimeDetailDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeDetailDataResponseBody self = new DescribeVodDomainRealTimeDetailDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealTimeDetailDataResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeVodDomainRealTimeDetailDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
