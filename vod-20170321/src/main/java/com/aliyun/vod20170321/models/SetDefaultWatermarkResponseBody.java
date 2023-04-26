// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultWatermarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetDefaultWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultWatermarkResponseBody self = new SetDefaultWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
