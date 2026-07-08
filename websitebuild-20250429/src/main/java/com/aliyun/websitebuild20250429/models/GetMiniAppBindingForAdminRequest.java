// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetMiniAppBindingForAdminRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250801152639000005</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>WECHAT</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>The mini program ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("PlatformAppid")
    public String platformAppid;

    public static GetMiniAppBindingForAdminRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMiniAppBindingForAdminRequest self = new GetMiniAppBindingForAdminRequest();
        return TeaModel.build(map, self);
    }

    public GetMiniAppBindingForAdminRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetMiniAppBindingForAdminRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetMiniAppBindingForAdminRequest setPlatformAppid(String platformAppid) {
        this.platformAppid = platformAppid;
        return this;
    }
    public String getPlatformAppid() {
        return this.platformAppid;
    }

}
