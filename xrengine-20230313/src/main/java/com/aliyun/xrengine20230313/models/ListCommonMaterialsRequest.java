// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class ListCommonMaterialsRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("Type")
    public String type;

    public static ListCommonMaterialsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommonMaterialsRequest self = new ListCommonMaterialsRequest();
        return TeaModel.build(map, self);
    }

    public ListCommonMaterialsRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public ListCommonMaterialsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
