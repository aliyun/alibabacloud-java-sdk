// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class InvokeCommandResponseBody extends TeaModel {
    /**
     * <p>The execution ID of the command.</p>
     * 
     * <strong>example:</strong>
     * <p>t-bj02prjhw1n****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InvokeCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeCommandResponseBody self = new InvokeCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeCommandResponseBody setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public InvokeCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
