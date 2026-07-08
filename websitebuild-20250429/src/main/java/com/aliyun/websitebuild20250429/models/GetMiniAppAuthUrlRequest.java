// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetMiniAppAuthUrlRequest extends TeaModel {
    /**
     * <p>The site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250731233102000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The channel information.</p>
     * 
     * <strong>example:</strong>
     * <p>WECHAT</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>The redirect URL.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("RedirectUri")
    public String redirectUri;

    public static GetMiniAppAuthUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMiniAppAuthUrlRequest self = new GetMiniAppAuthUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetMiniAppAuthUrlRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetMiniAppAuthUrlRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetMiniAppAuthUrlRequest setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    public String getRedirectUri() {
        return this.redirectUri;
    }

}
