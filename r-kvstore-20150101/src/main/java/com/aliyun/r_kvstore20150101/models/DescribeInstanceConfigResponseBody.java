// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceConfigResponseBody extends TeaModel {
    /**
     * <p>The parameter settings of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/43885.html">Parameter overview and configuration guide</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;EvictionPolicy\&quot;:\&quot;volatile-lru\&quot;,\&quot;hash-max-ziplist-entries\&quot;:512,\&quot;zset-max-ziplist-entries\&quot;:128,\&quot;list-max-ziplist-entries\&quot;:512,\&quot;list-max-ziplist-value\&quot;:64,\&quot;zset-max-ziplist-value\&quot;:64,\&quot;set-max-intset-entries\&quot;:512,\&quot;hash-max-ziplist-value\&quot;:64}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4E2C08F6-2D11-4ECD-9A4C-27EF2D3D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceConfigResponseBody self = new DescribeInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
