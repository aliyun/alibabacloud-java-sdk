// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StartJobWithParamsRequest extends TeaModel {
    @NameInMap("body")
    public JobStartParameters body;

    public static StartJobWithParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        StartJobWithParamsRequest self = new StartJobWithParamsRequest();
        return TeaModel.build(map, self);
    }

    public StartJobWithParamsRequest setBody(JobStartParameters body) {
        this.body = body;
        return this;
    }
    public JobStartParameters getBody() {
        return this.body;
    }

}
