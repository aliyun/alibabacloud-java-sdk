// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class CreateStacksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static CreateStacksResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStacksResponse self = new CreateStacksResponse();
        return TeaModel.build(map, self);
    }

}
