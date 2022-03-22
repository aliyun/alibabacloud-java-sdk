// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetUserByIdRequest extends TeaModel {
    @NameInMap("accessKeyId")
    public String accessKeyId;

    @NameInMap("accessKeySecret")
    public String accessKeySecret;

    @NameInMap("userId")
    public String userId;

    public static GetUserByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserByIdRequest self = new GetUserByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetUserByIdRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public GetUserByIdRequest setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public GetUserByIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
