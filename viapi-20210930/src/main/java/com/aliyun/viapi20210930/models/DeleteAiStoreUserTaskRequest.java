// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class DeleteAiStoreUserTaskRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DeleteAiStoreUserTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiStoreUserTaskRequest self = new DeleteAiStoreUserTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAiStoreUserTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
