// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SendRenderingInstanceCommandsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Thu Jun 27 16:06:26 CST 2024</p>
     */
    @NameInMap("Result")
    public String result;

    public static SendRenderingInstanceCommandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendRenderingInstanceCommandsResponseBody self = new SendRenderingInstanceCommandsResponseBody();
        return TeaModel.build(map, self);
    }

    public SendRenderingInstanceCommandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendRenderingInstanceCommandsResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
