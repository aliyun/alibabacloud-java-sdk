// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateSampleBatchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public Boolean data;

    public static UpdateSampleBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSampleBatchResponseBody self = new UpdateSampleBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSampleBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSampleBatchResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
