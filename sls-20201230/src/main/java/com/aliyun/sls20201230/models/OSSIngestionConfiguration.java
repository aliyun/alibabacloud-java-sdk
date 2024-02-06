// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class OSSIngestionConfiguration extends TeaModel {
    @NameInMap("logstore")
    public String logstore;

    @NameInMap("source")
    public OSSIngestionConfigurationSource source;

    public static OSSIngestionConfiguration build(java.util.Map<String, ?> map) throws Exception {
        OSSIngestionConfiguration self = new OSSIngestionConfiguration();
        return TeaModel.build(map, self);
    }

    public OSSIngestionConfiguration setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public OSSIngestionConfiguration setSource(OSSIngestionConfigurationSource source) {
        this.source = source;
        return this;
    }
    public OSSIngestionConfigurationSource getSource() {
        return this.source;
    }

}
