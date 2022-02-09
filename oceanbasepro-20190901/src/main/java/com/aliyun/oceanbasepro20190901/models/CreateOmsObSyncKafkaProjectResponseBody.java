// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsObSyncKafkaProjectResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateOmsObSyncKafkaProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsObSyncKafkaProjectResponseBody self = new CreateOmsObSyncKafkaProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOmsObSyncKafkaProjectResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateOmsObSyncKafkaProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
