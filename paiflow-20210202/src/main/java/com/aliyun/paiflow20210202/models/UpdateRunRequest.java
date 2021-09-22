// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class UpdateRunRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static UpdateRunRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRunRequest self = new UpdateRunRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRunRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
