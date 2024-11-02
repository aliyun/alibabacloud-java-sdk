// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentListResponseBody extends TeaModel {
    /**
     * <p>The information about the components. The value is a JSON array.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;actions&quot;: [
     *             {
     *                 &quot;description&quot;: &quot;mysql component&quot;,
     *                 &quot;name&quot;: &quot;storeIdb&quot;,
     *                 &quot;parameters&quot;: [
     *                     {
     *                         &quot;description&quot;: &quot;update the mysql db&quot;,
     *                         &quot;name&quot;: &quot;updateSql&quot;,
     *                         &quot;required&quot;: false
     *                     }
     *                 ]
     *             }
     *         ],
     *         &quot;basic&quot;: {
     *             &quot;description&quot;: &quot;mysq sql component for 5.6&quot;,
     *             &quot;logo&quot;: &quot;<a href="https://img.alicdn.com/tfs/TB1H89IpH3nBKNjSZFMXXaUSFXa-200-200.svg">https://img.alicdn.com/tfs/TB1H89IpH3nBKNjSZFMXXaUSFXa-200-200.svg</a>&quot;,
     *             &quot;name&quot;: &quot;Mysql&quot;
     *         }
     *     }
     * ]</p>
     */
    @NameInMap("Components")
    public String components;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B0A255B3-495C-56FB-8B6B-DB073F80388A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComponentListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentListResponseBody self = new DescribeComponentListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComponentListResponseBody setComponents(String components) {
        this.components = components;
        return this;
    }
    public String getComponents() {
        return this.components;
    }

    public DescribeComponentListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
