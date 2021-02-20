// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class SetChannelPropertyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetChannelPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetChannelPropertyResponseBody self = new SetChannelPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetChannelPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
