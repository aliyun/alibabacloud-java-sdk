// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class CreateChangeSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateChangeSetResponseBody body;

    public static CreateChangeSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChangeSetResponse self = new CreateChangeSetResponse();
        return TeaModel.build(map, self);
    }

}
