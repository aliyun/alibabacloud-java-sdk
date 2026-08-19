// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeDetailDataResponseBody extends TeaModel {
    /**
     * <p>The returned data details. The data is returned as a JSON string. The following table describes the structure and fields:</p>
     * <blockquote>
     * <p>If no data exists for a field, the field is not returned.</p>
     * </blockquote>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Type</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>domain_name</td>
     * <td>String</td>
     * <td>The accelerated domain name.</td>
     * </tr>
     * <tr>
     * <td>isp</td>
     * <td>String</td>
     * <td>The ISP name.</td>
     * </tr>
     * <tr>
     * <td>location</td>
     * <td>String</td>
     * <td>The region name.</td>
     * </tr>
     * <tr>
     * <td>qps</td>
     * <td>Long</td>
     * <td>The queries per second (QPS).</td>
     * </tr>
     * <tr>
     * <td>bps</td>
     * <td>Long</td>
     * <td>The bandwidth data. Unit: bit/s.</td>
     * </tr>
     * <tr>
     * <td>http_code</td>
     * <td>Map</td>
     * <td>The HTTP status code details. The key is the status code name, and the value is the count of the status code.</td>
     * </tr>
     * <tr>
     * <td>time_stp</td>
     * <td>String</td>
     * <td>The data timestamp. The time is in the ISO 8601 standard in UTC.</td>
     * </tr>
     * </tbody></table>
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
     * <p>The request ID.</p>
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
