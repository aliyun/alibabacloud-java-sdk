// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class DescribeResourceTypesRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    public DescribeResourceTypesQuery query;

    public static DescribeResourceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceTypesRequest self = new DescribeResourceTypesRequest();
        return TeaModel.build(map, self);
    }

}
