// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SetVsStreamsNotifyUrlConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
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
