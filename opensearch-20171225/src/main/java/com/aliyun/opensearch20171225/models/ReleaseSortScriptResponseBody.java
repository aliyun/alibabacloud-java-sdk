// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ReleaseSortScriptResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    public static ReleaseSortScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseSortScriptResponseBody self = new ReleaseSortScriptResponseBody();
        return TeaModel.build(map, self);
    }

}
