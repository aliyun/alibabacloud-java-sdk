// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppResponseBody body;

    public static CreateAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppResponse self = new CreateAppResponse();
        return TeaModel.build(map, self);
    }

}
