// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ReleaseSortScriptResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ReleaseSortScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseSortScriptResponseBody self = new ReleaseSortScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseSortScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
