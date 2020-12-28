// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class UpdateSamplingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static UpdateSamplingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSamplingResponseBody self = new UpdateSamplingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSamplingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSamplingResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
