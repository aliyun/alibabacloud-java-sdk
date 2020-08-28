// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("RouteResponseBody")
    @Validation(required = true)
    public String routeResponseBody;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    public static DescribeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigResponse self = new DescribeConfigResponse();
        return TeaModel.build(map, self);
    }

}
