// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class DescribeStacksRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    public DescribeStacksQuery query;

    public static DescribeStacksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStacksRequest self = new DescribeStacksRequest();
        return TeaModel.build(map, self);
    }

}
