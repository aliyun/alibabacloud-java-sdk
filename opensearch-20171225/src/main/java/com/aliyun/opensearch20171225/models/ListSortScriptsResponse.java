// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSortScriptsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSortScriptsResponseBody body;

    public static ListSortScriptsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSortScriptsResponse self = new ListSortScriptsResponse();
        return TeaModel.build(map, self);
    }

}
