// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class OmaDeleteResourceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static OmaDeleteResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        OmaDeleteResourceRequest self = new OmaDeleteResourceRequest();
        return TeaModel.build(map, self);
    }

    public OmaDeleteResourceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
