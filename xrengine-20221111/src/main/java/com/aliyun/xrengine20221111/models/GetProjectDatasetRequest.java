// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class GetProjectDatasetRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("OssKey")
    public String ossKey;

    public static GetProjectDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectDatasetRequest self = new GetProjectDatasetRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectDatasetRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public GetProjectDatasetRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

}
