// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class EtlLogConfig extends TeaModel {
    @NameInMap("endpoint")
    public String endpoint;

    @NameInMap("logstoreName")
    public String logstoreName;

    @NameInMap("projectName")
    public String projectName;

    public static EtlLogConfig build(java.util.Map<String, ?> map) throws Exception {
        EtlLogConfig self = new EtlLogConfig();
        return TeaModel.build(map, self);
    }

    public EtlLogConfig setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public EtlLogConfig setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public EtlLogConfig setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
