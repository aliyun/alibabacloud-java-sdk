// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DetailProjectRequest extends TeaModel {
    // 项目Id
    @NameInMap("Id")
    public String id;

    public static DetailProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailProjectRequest self = new DetailProjectRequest();
        return TeaModel.build(map, self);
    }

    public DetailProjectRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
