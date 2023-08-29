// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class IgnoreEventsResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static IgnoreEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IgnoreEventsResponseBody self = new IgnoreEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public IgnoreEventsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public IgnoreEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
