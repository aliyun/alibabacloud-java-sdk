// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopObjectRetrievalUploadDataRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    public static PopObjectRetrievalUploadDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PopObjectRetrievalUploadDataRequest self = new PopObjectRetrievalUploadDataRequest();
        return TeaModel.build(map, self);
    }

    public PopObjectRetrievalUploadDataRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
