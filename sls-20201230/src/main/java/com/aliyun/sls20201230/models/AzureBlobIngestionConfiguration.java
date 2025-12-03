// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class AzureBlobIngestionConfiguration extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>myLogstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    @NameInMap("source")
    public AzureBlobIngestionConfigurationSource source;

    public static AzureBlobIngestionConfiguration build(java.util.Map<String, ?> map) throws Exception {
        AzureBlobIngestionConfiguration self = new AzureBlobIngestionConfiguration();
        return TeaModel.build(map, self);
    }

    public AzureBlobIngestionConfiguration setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public AzureBlobIngestionConfiguration setSource(AzureBlobIngestionConfigurationSource source) {
        this.source = source;
        return this;
    }
    public AzureBlobIngestionConfigurationSource getSource() {
        return this.source;
    }

}
