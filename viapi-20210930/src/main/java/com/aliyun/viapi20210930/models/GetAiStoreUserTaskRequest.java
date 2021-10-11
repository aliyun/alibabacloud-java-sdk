// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class GetAiStoreUserTaskRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static GetAiStoreUserTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiStoreUserTaskRequest self = new GetAiStoreUserTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetAiStoreUserTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
