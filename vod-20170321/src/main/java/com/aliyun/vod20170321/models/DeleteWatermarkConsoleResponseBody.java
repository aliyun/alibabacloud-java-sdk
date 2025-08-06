// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteWatermarkConsoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWatermarkConsoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatermarkConsoleResponseBody self = new DeleteWatermarkConsoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWatermarkConsoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
