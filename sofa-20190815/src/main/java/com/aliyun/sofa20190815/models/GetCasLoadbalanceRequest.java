// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCasLoadbalanceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetCasLoadbalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCasLoadbalanceRequest self = new GetCasLoadbalanceRequest();
        return TeaModel.build(map, self);
    }

    public GetCasLoadbalanceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
