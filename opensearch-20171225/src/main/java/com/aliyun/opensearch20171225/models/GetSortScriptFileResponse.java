// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetSortScriptFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSortScriptFileResponseBody body;

    public static GetSortScriptFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSortScriptFileResponse self = new GetSortScriptFileResponse();
        return TeaModel.build(map, self);
    }

}
