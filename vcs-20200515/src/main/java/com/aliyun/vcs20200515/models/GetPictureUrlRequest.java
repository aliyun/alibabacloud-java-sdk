// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetPictureUrlRequest extends TeaModel {
    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("OriginUrl")
    public String originUrl;

    @NameInMap("Protocol")
    public String protocol;

    public static GetPictureUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPictureUrlRequest self = new GetPictureUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetPictureUrlRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GetPictureUrlRequest setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
        return this;
    }
    public String getOriginUrl() {
        return this.originUrl;
    }

    public GetPictureUrlRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
