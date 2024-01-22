// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetInstanceLogsOutput extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("requestId")
    public String requestId;

    public static GetInstanceLogsOutput build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceLogsOutput self = new GetInstanceLogsOutput();
        return TeaModel.build(map, self);
    }

    public GetInstanceLogsOutput setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetInstanceLogsOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
