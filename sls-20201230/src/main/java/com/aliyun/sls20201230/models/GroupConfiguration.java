// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GroupConfiguration extends TeaModel {
    @NameInMap("fileds")
    public java.util.List<String> fileds;

    @NameInMap("type")
    public String type;

    public static GroupConfiguration build(java.util.Map<String, ?> map) throws Exception {
        GroupConfiguration self = new GroupConfiguration();
        return TeaModel.build(map, self);
    }

    public GroupConfiguration setFileds(java.util.List<String> fileds) {
        this.fileds = fileds;
        return this;
    }
    public java.util.List<String> getFileds() {
        return this.fileds;
    }

    public GroupConfiguration setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
