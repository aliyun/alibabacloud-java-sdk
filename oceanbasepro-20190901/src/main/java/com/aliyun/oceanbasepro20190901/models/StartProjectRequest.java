// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StartProjectRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static StartProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        StartProjectRequest self = new StartProjectRequest();
        return TeaModel.build(map, self);
    }

    public StartProjectRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
