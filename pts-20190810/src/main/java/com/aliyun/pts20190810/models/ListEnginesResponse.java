// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class ListEnginesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RouteResponseBody")
    @Validation(required = true)
    public String routeResponseBody;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    public static ListEnginesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnginesResponse self = new ListEnginesResponse();
        return TeaModel.build(map, self);
    }

}
