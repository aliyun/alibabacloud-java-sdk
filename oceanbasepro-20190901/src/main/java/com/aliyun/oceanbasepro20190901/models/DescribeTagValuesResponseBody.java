// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTagValuesResponseBody extends TeaModel {
    @NameInMap("Map")
    public String map;

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
