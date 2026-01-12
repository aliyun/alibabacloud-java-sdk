// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class CreateSourcePolicyRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("OssKey")
    public String ossKey;

    public static CreateSourcePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSourcePolicyRequest self = new CreateSourcePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateSourcePolicyRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public CreateSourcePolicyRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

}
