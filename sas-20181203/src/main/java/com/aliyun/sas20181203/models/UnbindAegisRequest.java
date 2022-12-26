// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UnbindAegisRequest extends TeaModel {
    @NameInMap("Uuids")
    public String uuids;

    public static UnbindAegisRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAegisRequest self = new UnbindAegisRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAegisRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
