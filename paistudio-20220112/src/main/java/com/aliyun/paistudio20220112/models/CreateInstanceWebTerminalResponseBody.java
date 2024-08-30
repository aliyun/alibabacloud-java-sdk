// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateInstanceWebTerminalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>wss://pai-dlc-proxy-cn-shanghai.aliyun.com/terminal/t1157703270994901/dlcmjzjt1dxbmx4h/dlcmjzjt1dxbmx4h-worker-0?Token=******</p>
     */
    @NameInMap("WebTerminalId")
    public String webTerminalId;

    public static CreateInstanceWebTerminalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceWebTerminalResponseBody self = new CreateInstanceWebTerminalResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceWebTerminalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceWebTerminalResponseBody setWebTerminalId(String webTerminalId) {
        this.webTerminalId = webTerminalId;
        return this;
    }
    public String getWebTerminalId() {
        return this.webTerminalId;
    }

}
