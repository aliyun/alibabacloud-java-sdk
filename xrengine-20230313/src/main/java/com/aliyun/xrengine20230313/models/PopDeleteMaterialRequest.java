// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopDeleteMaterialRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("MaterialId")
    public String materialId;

    public static PopDeleteMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        PopDeleteMaterialRequest self = new PopDeleteMaterialRequest();
        return TeaModel.build(map, self);
    }

    public PopDeleteMaterialRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PopDeleteMaterialRequest setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

}
