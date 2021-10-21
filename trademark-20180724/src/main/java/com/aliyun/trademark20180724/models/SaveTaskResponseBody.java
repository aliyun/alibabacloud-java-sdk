// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SaveTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SaveTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskResponseBody self = new SaveTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
