// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetIOCsResponseBody extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetIOCsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIOCsResponseBody self = new GetIOCsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIOCsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetIOCsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
