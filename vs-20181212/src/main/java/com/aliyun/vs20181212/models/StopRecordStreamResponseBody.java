// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopRecordStreamResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopRecordStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopRecordStreamResponseBody self = new StopRecordStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public StopRecordStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
