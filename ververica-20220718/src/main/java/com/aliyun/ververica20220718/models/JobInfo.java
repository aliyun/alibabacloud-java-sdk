// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JobInfo extends TeaModel {
    @NameInMap("id")
    public String id;

    @NameInMap("properties")
    public java.util.Map<String, ?> properties;

    public static JobInfo build(java.util.Map<String, ?> map) throws Exception {
        JobInfo self = new JobInfo();
        return TeaModel.build(map, self);
    }

    public JobInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public JobInfo setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

}
