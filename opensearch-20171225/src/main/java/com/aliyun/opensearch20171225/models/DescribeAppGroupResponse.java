// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppGroupResponseBody body;

    public static DescribeAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppGroupResponse self = new DescribeAppGroupResponse();
        return TeaModel.build(map, self);
    }

}
