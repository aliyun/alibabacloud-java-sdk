// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GroupConfiguration extends TeaModel {
    @NameInMap("fields")
    public java.util.List<String> fields;

    @NameInMap("type")
    public String type;

    public static GroupConfiguration build(java.util.Map<String, ?> map) throws Exception {
        GroupConfiguration self = new GroupConfiguration();
        return TeaModel.build(map, self);
    }

    public GroupConfiguration setFields(java.util.List<String> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<String> getFields() {
        return this.fields;
    }

    public GroupConfiguration setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
