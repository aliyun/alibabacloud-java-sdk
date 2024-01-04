// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class GenerateMotionShopVideoUploadUrlRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    public static GenerateMotionShopVideoUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateMotionShopVideoUploadUrlRequest self = new GenerateMotionShopVideoUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GenerateMotionShopVideoUploadUrlRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
