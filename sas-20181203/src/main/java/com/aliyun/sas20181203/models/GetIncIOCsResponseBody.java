// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetIncIOCsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public String data;

    public static GetIncIOCsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIncIOCsResponseBody self = new GetIncIOCsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIncIOCsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIncIOCsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
