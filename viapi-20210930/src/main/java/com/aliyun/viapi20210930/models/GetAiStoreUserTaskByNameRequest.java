// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class GetAiStoreUserTaskByNameRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static GetAiStoreUserTaskByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiStoreUserTaskByNameRequest self = new GetAiStoreUserTaskByNameRequest();
        return TeaModel.build(map, self);
    }

    public GetAiStoreUserTaskByNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
