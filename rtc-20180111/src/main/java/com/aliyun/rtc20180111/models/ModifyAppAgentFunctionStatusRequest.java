// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppAgentFunctionStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static ModifyAppAgentFunctionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppAgentFunctionStatusRequest self = new ModifyAppAgentFunctionStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppAgentFunctionStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
