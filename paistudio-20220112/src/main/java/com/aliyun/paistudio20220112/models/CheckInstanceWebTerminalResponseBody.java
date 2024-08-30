// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CheckInstanceWebTerminalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F2D0392B-D749-5C48-A98A-3FAE5C9444A6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckInstanceWebTerminalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceWebTerminalResponseBody self = new CheckInstanceWebTerminalResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckInstanceWebTerminalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
