// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class RemoveInstanceFromGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static RemoveInstanceFromGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstanceFromGroupResponse self = new RemoveInstanceFromGroupResponse();
        return TeaModel.build(map, self);
    }

}
