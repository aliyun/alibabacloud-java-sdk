// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class UpdatePipelineRunRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static UpdatePipelineRunRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineRunRequest self = new UpdatePipelineRunRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineRunRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
