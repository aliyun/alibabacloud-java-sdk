// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RevokeReviewCmd extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("version")
    public String version;

    public static RevokeReviewCmd build(java.util.Map<String, ?> map) throws Exception {
        RevokeReviewCmd self = new RevokeReviewCmd();
        return TeaModel.build(map, self);
    }

    public RevokeReviewCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RevokeReviewCmd setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
