// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class BindSerialNumberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindSerialNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindSerialNumberResponseBody self = new BindSerialNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public BindSerialNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
