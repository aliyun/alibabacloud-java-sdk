// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateSortScriptResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9F165784-5507-5342-ABF3-545293F9808A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateSortScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSortScriptResponseBody self = new UpdateSortScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSortScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
