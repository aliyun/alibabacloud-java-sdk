// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttGroupIdCreateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnsMqttGroupIdCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttGroupIdCreateResponseBody self = new OnsMqttGroupIdCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMqttGroupIdCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
