// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class EnableAiStoreUserTaskRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static EnableAiStoreUserTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAiStoreUserTaskRequest self = new EnableAiStoreUserTaskRequest();
        return TeaModel.build(map, self);
    }

    public EnableAiStoreUserTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
