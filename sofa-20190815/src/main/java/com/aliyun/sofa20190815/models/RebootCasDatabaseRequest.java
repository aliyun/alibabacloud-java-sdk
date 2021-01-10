// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RebootCasDatabaseRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static RebootCasDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootCasDatabaseRequest self = new RebootCasDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public RebootCasDatabaseRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
