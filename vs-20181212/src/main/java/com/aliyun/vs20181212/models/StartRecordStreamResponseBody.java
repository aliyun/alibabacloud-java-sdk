// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartRecordStreamResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartRecordStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartRecordStreamResponseBody self = new StartRecordStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public StartRecordStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
