// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class S3IngestionConfiguration extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>myLogstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    @NameInMap("source")
    public S3IngestionConfigurationSource source;

    public static S3IngestionConfiguration build(java.util.Map<String, ?> map) throws Exception {
        S3IngestionConfiguration self = new S3IngestionConfiguration();
        return TeaModel.build(map, self);
    }

    public S3IngestionConfiguration setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public S3IngestionConfiguration setSource(S3IngestionConfigurationSource source) {
        this.source = source;
        return this;
    }
    public S3IngestionConfigurationSource getSource() {
        return this.source;
    }

}
