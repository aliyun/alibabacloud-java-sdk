// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultWatermarkConsoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetDefaultWatermarkConsoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultWatermarkConsoleResponseBody self = new SetDefaultWatermarkConsoleResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultWatermarkConsoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
