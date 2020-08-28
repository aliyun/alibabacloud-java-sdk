// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class DescribeResourceDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DescribeResourceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceDetailResponse self = new DescribeResourceDetailResponse();
        return TeaModel.build(map, self);
    }

}
