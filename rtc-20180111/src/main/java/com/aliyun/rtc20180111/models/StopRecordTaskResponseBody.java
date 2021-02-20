// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopRecordTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopRecordTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopRecordTaskResponseBody self = new StopRecordTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopRecordTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
