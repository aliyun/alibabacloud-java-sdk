// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class LocateRequest extends TeaModel {
    @NameInMap("Image")
    public String image;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("Params")
    public String params;

    public static LocateRequest build(java.util.Map<String, ?> map) throws Exception {
        LocateRequest self = new LocateRequest();
        return TeaModel.build(map, self);
    }

    public LocateRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public LocateRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public LocateRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
