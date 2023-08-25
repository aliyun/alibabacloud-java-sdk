// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReleaseProjectRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static ReleaseProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseProjectRequest self = new ReleaseProjectRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseProjectRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
