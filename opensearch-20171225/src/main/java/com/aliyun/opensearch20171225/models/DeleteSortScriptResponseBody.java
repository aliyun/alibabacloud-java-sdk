// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteSortScriptResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteSortScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSortScriptResponseBody self = new DeleteSortScriptResponseBody();
        return TeaModel.build(map, self);
    }

}
