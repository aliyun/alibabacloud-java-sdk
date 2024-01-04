// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class MotionShopVideoDetectRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("OssKey")
    public String ossKey;

    public static MotionShopVideoDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        MotionShopVideoDetectRequest self = new MotionShopVideoDetectRequest();
        return TeaModel.build(map, self);
    }

    public MotionShopVideoDetectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public MotionShopVideoDetectRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

}
