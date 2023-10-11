// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class LivePortraitFaceDetectRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("JwtToken")
    public String jwtToken;

    public static LivePortraitFaceDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        LivePortraitFaceDetectRequest self = new LivePortraitFaceDetectRequest();
        return TeaModel.build(map, self);
    }

    public LivePortraitFaceDetectRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public LivePortraitFaceDetectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
