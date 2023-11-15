// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateProduceLoaIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateProduceLoaIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProduceLoaIdResponseBody self = new UpdateProduceLoaIdResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProduceLoaIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProduceLoaIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
