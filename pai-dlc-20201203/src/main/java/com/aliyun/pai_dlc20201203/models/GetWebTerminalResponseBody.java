// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetWebTerminalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WebTerminalUrl")
    public String webTerminalUrl;

    public static GetWebTerminalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebTerminalResponseBody self = new GetWebTerminalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebTerminalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWebTerminalResponseBody setWebTerminalUrl(String webTerminalUrl) {
        this.webTerminalUrl = webTerminalUrl;
        return this;
    }
    public String getWebTerminalUrl() {
        return this.webTerminalUrl;
    }

}
