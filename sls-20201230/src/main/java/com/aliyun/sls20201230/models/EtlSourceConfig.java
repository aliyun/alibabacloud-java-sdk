// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class EtlSourceConfig extends TeaModel {
    @NameInMap("logstoreName")
    public String logstoreName;

    public static EtlSourceConfig build(java.util.Map<String, ?> map) throws Exception {
        EtlSourceConfig self = new EtlSourceConfig();
        return TeaModel.build(map, self);
    }

    public EtlSourceConfig setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

}
