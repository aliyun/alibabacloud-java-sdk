// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class BindPhoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindPhoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindPhoneResponseBody self = new BindPhoneResponseBody();
        return TeaModel.build(map, self);
    }

    public BindPhoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
