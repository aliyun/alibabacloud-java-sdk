// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CheckDeviceResponseBody extends TeaModel {
    @NameInMap("Available")
    public Boolean available;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDeviceResponseBody self = new CheckDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDeviceResponseBody setAvailable(Boolean available) {
        this.available = available;
        return this;
    }
    public Boolean getAvailable() {
        return this.available;
    }

    public CheckDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
