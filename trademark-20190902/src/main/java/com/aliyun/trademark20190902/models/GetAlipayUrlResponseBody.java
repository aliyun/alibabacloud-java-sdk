// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class GetAlipayUrlResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAlipayUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlipayUrlResponseBody self = new GetAlipayUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlipayUrlResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAlipayUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
