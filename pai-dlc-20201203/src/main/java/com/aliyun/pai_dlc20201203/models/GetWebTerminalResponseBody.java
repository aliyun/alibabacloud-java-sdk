// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetWebTerminalResponseBody extends TeaModel {
    @NameInMap("URL")
    public String URL;

    @NameInMap("requestId")
    public String requestId;

    public static GetWebTerminalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebTerminalResponseBody self = new GetWebTerminalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebTerminalResponseBody setURL(String URL) {
        this.URL = URL;
        return this;
    }
    public String getURL() {
        return this.URL;
    }

    public GetWebTerminalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
