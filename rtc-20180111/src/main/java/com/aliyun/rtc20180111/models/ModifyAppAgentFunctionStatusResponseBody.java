// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppAgentFunctionStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6159ba01-6687-4fb2-a831-f0cd8d188648</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppAgentFunctionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppAgentFunctionStatusResponseBody self = new ModifyAppAgentFunctionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppAgentFunctionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
