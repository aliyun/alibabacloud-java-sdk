// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppGroupResponseBody body;

    public static CreateAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupResponse self = new CreateAppGroupResponse();
        return TeaModel.build(map, self);
    }

}
