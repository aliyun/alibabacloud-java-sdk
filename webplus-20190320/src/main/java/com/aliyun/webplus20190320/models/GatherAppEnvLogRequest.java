// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class GatherAppEnvLogRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    @NameInMap("TargetInstances")
    public String targetInstances;

    @NameInMap("LogPath")
    public String logPath;

    public static GatherAppEnvLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GatherAppEnvLogRequest self = new GatherAppEnvLogRequest();
        return TeaModel.build(map, self);
    }

    public GatherAppEnvLogRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public GatherAppEnvLogRequest setTargetInstances(String targetInstances) {
        this.targetInstances = targetInstances;
        return this;
    }
    public String getTargetInstances() {
        return this.targetInstances;
    }

    public GatherAppEnvLogRequest setLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }
    public String getLogPath() {
        return this.logPath;
    }

}
