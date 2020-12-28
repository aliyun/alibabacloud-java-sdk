// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessageResendByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<String> data;

    public static OnsDLQMessageResendByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsDLQMessageResendByIdResponseBody self = new OnsDLQMessageResendByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsDLQMessageResendByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsDLQMessageResendByIdResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

}
