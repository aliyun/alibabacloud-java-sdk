// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StopJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public StopJobRequestBody body;

    public static StopJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StopJobRequest self = new StopJobRequest();
        return TeaModel.build(map, self);
    }

    public StopJobRequest setBody(StopJobRequestBody body) {
        this.body = body;
        return this;
    }
    public StopJobRequestBody getBody() {
        return this.body;
    }

}
