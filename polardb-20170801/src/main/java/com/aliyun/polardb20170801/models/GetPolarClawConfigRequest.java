// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GetPolarClawConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>models</p>
     */
    @NameInMap("ConfigPath")
    public String configPath;

    public static GetPolarClawConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolarClawConfigRequest self = new GetPolarClawConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetPolarClawConfigRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public GetPolarClawConfigRequest setConfigPath(String configPath) {
        this.configPath = configPath;
        return this;
    }
    public String getConfigPath() {
        return this.configPath;
    }

}
