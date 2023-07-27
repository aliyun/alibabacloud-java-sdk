// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CreateAccessPointResult extends TeaModel {
    @NameInMap("AccessPointArn")
    public String accessPointArn;

    @NameInMap("Alias")
    public String alias;

    public static CreateAccessPointResult build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessPointResult self = new CreateAccessPointResult();
        return TeaModel.build(map, self);
    }

    public CreateAccessPointResult setAccessPointArn(String accessPointArn) {
        this.accessPointArn = accessPointArn;
        return this;
    }
    public String getAccessPointArn() {
        return this.accessPointArn;
    }

    public CreateAccessPointResult setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

}
