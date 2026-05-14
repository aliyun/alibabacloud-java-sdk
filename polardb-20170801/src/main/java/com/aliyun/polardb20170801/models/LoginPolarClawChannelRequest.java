// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class LoginPolarClawChannelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>openclaw-weixin</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    public static LoginPolarClawChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        LoginPolarClawChannelRequest self = new LoginPolarClawChannelRequest();
        return TeaModel.build(map, self);
    }

    public LoginPolarClawChannelRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public LoginPolarClawChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

}
