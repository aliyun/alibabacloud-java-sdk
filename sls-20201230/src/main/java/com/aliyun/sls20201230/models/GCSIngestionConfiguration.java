// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GCSIngestionConfiguration extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myLogstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("source")
    public GCSIngestionConfigurationSource source;

    public static GCSIngestionConfiguration build(java.util.Map<String, ?> map) throws Exception {
        GCSIngestionConfiguration self = new GCSIngestionConfiguration();
        return TeaModel.build(map, self);
    }

    public GCSIngestionConfiguration setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public GCSIngestionConfiguration setSource(GCSIngestionConfigurationSource source) {
        this.source = source;
        return this;
    }
    public GCSIngestionConfigurationSource getSource() {
        return this.source;
    }

}
