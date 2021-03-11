// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SetVsStreamsNotifyUrlConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetVsStreamsNotifyUrlConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetVsStreamsNotifyUrlConfigResponseBody self = new SetVsStreamsNotifyUrlConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetVsStreamsNotifyUrlConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
