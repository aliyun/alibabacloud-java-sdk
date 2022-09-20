// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SelectComputeTaskRequest extends TeaModel {
    @NameInMap("body")
    public Long body;

    public static SelectComputeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SelectComputeTaskRequest self = new SelectComputeTaskRequest();
        return TeaModel.build(map, self);
    }

    public SelectComputeTaskRequest setBody(Long body) {
        this.body = body;
        return this;
    }
    public Long getBody() {
        return this.body;
    }

}
