// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTagValuesResponseBody extends TeaModel {
    /**
     * <p>The mappings between tag groups and tags.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;Tag group 2\&quot;:[\&quot;Tag 2-1\&quot;,\&quot;Tag 2-2\&quot;],\&quot;Tag group 1\&quot;:[\&quot;Tag 1-1\&quot;]}&quot;</p>
     */
    @NameInMap("Map")
    public String map;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4C91F7BA-xxxx-xxxx-xxxx-846ECA1A9908</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTagValuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagValuesResponseBody self = new DescribeTagValuesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagValuesResponseBody setMap(String map) {
        this.map = map;
        return this;
    }
    public String getMap() {
        return this.map;
    }

    public DescribeTagValuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
