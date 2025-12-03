// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ESIngestionConfiguration extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("source")
    public ESIngestionConfigurationSource source;

    public static ESIngestionConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ESIngestionConfiguration self = new ESIngestionConfiguration();
        return TeaModel.build(map, self);
    }

    public ESIngestionConfiguration setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ESIngestionConfiguration setSource(ESIngestionConfigurationSource source) {
        this.source = source;
        return this;
    }
    public ESIngestionConfigurationSource getSource() {
        return this.source;
    }

}
