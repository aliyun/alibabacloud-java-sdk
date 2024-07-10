// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class MetricsCollectConfig extends TeaModel {
    @NameInMap("EnablePushToUserSLS")
    public Boolean enablePushToUserSLS;

    /**
     * <strong>example:</strong>
     * <p>my-sls-logstorename</p>
     */
    @NameInMap("LogstoreName")
    public String logstoreName;

    /**
     * <strong>example:</strong>
     * <p>my-sls-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static MetricsCollectConfig build(java.util.Map<String, ?> map) throws Exception {
        MetricsCollectConfig self = new MetricsCollectConfig();
        return TeaModel.build(map, self);
    }

    public MetricsCollectConfig setEnablePushToUserSLS(Boolean enablePushToUserSLS) {
        this.enablePushToUserSLS = enablePushToUserSLS;
        return this;
    }
    public Boolean getEnablePushToUserSLS() {
        return this.enablePushToUserSLS;
    }

    public MetricsCollectConfig setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public MetricsCollectConfig setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
