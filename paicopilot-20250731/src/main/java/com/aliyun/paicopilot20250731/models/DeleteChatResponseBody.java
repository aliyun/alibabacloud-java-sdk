// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class DeleteChatResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>44553E9A-******-37ADC33FE2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatResponseBody self = new DeleteChatResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
