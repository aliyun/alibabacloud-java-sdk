// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class DeleteChangeSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteChangeSetResponseBody body;

    public static DeleteChangeSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChangeSetResponse self = new DeleteChangeSetResponse();
        return TeaModel.build(map, self);
    }

}
