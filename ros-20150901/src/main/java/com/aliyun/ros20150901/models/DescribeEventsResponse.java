// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class DescribeEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DescribeEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsResponse self = new DescribeEventsResponse();
        return TeaModel.build(map, self);
    }

}
