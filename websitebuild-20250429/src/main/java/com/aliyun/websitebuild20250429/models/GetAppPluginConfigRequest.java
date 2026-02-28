// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppPluginConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250801154628000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1bae9ceaceea432d91c7069fab0dfc02</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    public static GetAppPluginConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppPluginConfigRequest self = new GetAppPluginConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAppPluginConfigRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetAppPluginConfigRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
