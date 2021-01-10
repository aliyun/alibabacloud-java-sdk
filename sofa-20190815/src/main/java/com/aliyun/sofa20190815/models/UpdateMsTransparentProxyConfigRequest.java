// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsTransparentProxyConfigRequest extends TeaModel {
    @NameInMap("AppConfig")
    public String appConfig;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateMsTransparentProxyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsTransparentProxyConfigRequest self = new UpdateMsTransparentProxyConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsTransparentProxyConfigRequest setAppConfig(String appConfig) {
        this.appConfig = appConfig;
        return this;
    }
    public String getAppConfig() {
        return this.appConfig;
    }

    public UpdateMsTransparentProxyConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMsTransparentProxyConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
