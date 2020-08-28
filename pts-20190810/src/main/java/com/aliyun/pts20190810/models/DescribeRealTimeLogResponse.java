// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeRealTimeLogResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RouteResponseBody")
    @Validation(required = true)
    public String routeResponseBody;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    public static DescribeRealTimeLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRealTimeLogResponse self = new DescribeRealTimeLogResponse();
        return TeaModel.build(map, self);
    }

}
