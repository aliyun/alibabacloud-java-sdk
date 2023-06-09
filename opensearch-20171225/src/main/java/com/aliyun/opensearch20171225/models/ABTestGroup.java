// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ABTestGroup extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("status")
    public Integer status;

    public static ABTestGroup build(java.util.Map<String, ?> map) throws Exception {
        ABTestGroup self = new ABTestGroup();
        return TeaModel.build(map, self);
    }

    public ABTestGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ABTestGroup setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
