// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PutLogsRequest extends TeaModel {
    /**
     * <p>The compressed Protobuf data.</p>
     */
    @NameInMap("body")
    public LogGroup body;

    public static PutLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        PutLogsRequest self = new PutLogsRequest();
        return TeaModel.build(map, self);
    }

    public PutLogsRequest setBody(LogGroup body) {
        this.body = body;
        return this;
    }
    public LogGroup getBody() {
        return this.body;
    }

}
