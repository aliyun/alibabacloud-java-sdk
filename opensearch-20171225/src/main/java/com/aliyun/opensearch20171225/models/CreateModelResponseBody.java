// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateModelResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("result")
    @Validation(required = true)
    public java.util.Map<String, ?> result;

    public static CreateModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelResponseBody self = new CreateModelResponseBody();
        return TeaModel.build(map, self);
    }

}
