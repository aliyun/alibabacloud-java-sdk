// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeEndpointSchemaObjectsViaWildcardResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEndpointSchemaObjectsViaWildcardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointSchemaObjectsViaWildcardResponseBody self = new DescribeEndpointSchemaObjectsViaWildcardResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointSchemaObjectsViaWildcardResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeEndpointSchemaObjectsViaWildcardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEndpointSchemaObjectsViaWildcardResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
