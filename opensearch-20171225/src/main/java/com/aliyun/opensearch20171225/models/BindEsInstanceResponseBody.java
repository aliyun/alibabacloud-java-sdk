// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class BindEsInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F5099063-6B86-F398-D843-905F9EFB683A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static BindEsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindEsInstanceResponseBody self = new BindEsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public BindEsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindEsInstanceResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
