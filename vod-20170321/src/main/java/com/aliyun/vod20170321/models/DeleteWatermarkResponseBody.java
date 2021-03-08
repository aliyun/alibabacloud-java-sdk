// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteWatermarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatermarkResponseBody self = new DeleteWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
