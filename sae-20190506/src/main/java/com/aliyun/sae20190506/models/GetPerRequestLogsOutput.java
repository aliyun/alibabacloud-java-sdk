// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetPerRequestLogsOutput extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("requestId")
    public String requestId;

    public static GetPerRequestLogsOutput build(java.util.Map<String, ?> map) throws Exception {
        GetPerRequestLogsOutput self = new GetPerRequestLogsOutput();
        return TeaModel.build(map, self);
    }

    public GetPerRequestLogsOutput setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetPerRequestLogsOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
