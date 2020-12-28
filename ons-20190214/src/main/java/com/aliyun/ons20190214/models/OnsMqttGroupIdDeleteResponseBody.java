// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttGroupIdDeleteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnsMqttGroupIdDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttGroupIdDeleteResponseBody self = new OnsMqttGroupIdDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMqttGroupIdDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
