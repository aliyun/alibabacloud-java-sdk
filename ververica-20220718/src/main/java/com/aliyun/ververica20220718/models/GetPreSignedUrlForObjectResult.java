// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetPreSignedUrlForObjectResult extends TeaModel {
    @NameInMap("jarUrl")
    public String jarUrl;

    @NameInMap("preSignedUrl")
    public String preSignedUrl;

    public static GetPreSignedUrlForObjectResult build(java.util.Map<String, ?> map) throws Exception {
        GetPreSignedUrlForObjectResult self = new GetPreSignedUrlForObjectResult();
        return TeaModel.build(map, self);
    }

    public GetPreSignedUrlForObjectResult setJarUrl(String jarUrl) {
        this.jarUrl = jarUrl;
        return this;
    }
    public String getJarUrl() {
        return this.jarUrl;
    }

    public GetPreSignedUrlForObjectResult setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
        return this;
    }
    public String getPreSignedUrl() {
        return this.preSignedUrl;
    }

}
