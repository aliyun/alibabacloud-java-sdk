// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SubmitDataSetTaskRequest extends TeaModel {
    @NameInMap("body")
    public Long body;

    public static SubmitDataSetTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDataSetTaskRequest self = new SubmitDataSetTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDataSetTaskRequest setBody(Long body) {
        this.body = body;
        return this;
    }
    public Long getBody() {
        return this.body;
    }

}
