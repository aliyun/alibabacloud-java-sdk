// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class DescribeChangeSetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChangeSetsResponseBody body;

    public static DescribeChangeSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeSetsResponse self = new DescribeChangeSetsResponse();
        return TeaModel.build(map, self);
    }

}
