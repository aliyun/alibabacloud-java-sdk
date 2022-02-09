// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsEndpointSchemaObjectsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<String> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOmsEndpointSchemaObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsEndpointSchemaObjectsResponseBody self = new DescribeOmsEndpointSchemaObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOmsEndpointSchemaObjectsResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public DescribeOmsEndpointSchemaObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
