// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StartJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public StartJobRequestBody body;

    public static StartJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StartJobRequest self = new StartJobRequest();
        return TeaModel.build(map, self);
    }

    public StartJobRequest setBody(StartJobRequestBody body) {
        this.body = body;
        return this;
    }
    public StartJobRequestBody getBody() {
        return this.body;
    }

}
