// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class CheckReadyFlagResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckReadyFlagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckReadyFlagResponseBody self = new CheckReadyFlagResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckReadyFlagResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CheckReadyFlagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
