// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppResponseBody body;

    public static DescribeAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppResponse self = new DescribeAppResponse();
        return TeaModel.build(map, self);
    }

}
