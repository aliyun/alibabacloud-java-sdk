// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteSortScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSortScriptResponseBody body;

    public static DeleteSortScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSortScriptResponse self = new DeleteSortScriptResponse();
        return TeaModel.build(map, self);
    }

}
