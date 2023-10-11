// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopUploadMaterialRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    public static PopUploadMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        PopUploadMaterialRequest self = new PopUploadMaterialRequest();
        return TeaModel.build(map, self);
    }

    public PopUploadMaterialRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
