// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CheckDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Available")
    public Boolean available;

    public static CheckDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDeviceResponseBody self = new CheckDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDeviceResponseBody setAvailable(Boolean available) {
        this.available = available;
        return this;
    }
    public Boolean getAvailable() {
        return this.available;
    }

}
