// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class RevokeSagInstanceFromCcnResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BCB97739-0CB5-4C94-9A5C-13051FFAB0E9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeSagInstanceFromCcnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeSagInstanceFromCcnResponseBody self = new RevokeSagInstanceFromCcnResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeSagInstanceFromCcnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
