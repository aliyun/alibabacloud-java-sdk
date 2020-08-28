// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateSortScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSortScriptResponseBody body;

    public static CreateSortScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSortScriptResponse self = new CreateSortScriptResponse();
        return TeaModel.build(map, self);
    }

}
