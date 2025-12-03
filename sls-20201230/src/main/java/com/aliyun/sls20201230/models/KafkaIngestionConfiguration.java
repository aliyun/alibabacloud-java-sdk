// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class KafkaIngestionConfiguration extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("source")
    public KafkaIngestionConfigurationSource source;

    public static KafkaIngestionConfiguration build(java.util.Map<String, ?> map) throws Exception {
        KafkaIngestionConfiguration self = new KafkaIngestionConfiguration();
        return TeaModel.build(map, self);
    }

    public KafkaIngestionConfiguration setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public KafkaIngestionConfiguration setSource(KafkaIngestionConfigurationSource source) {
        this.source = source;
        return this;
    }
    public KafkaIngestionConfigurationSource getSource() {
        return this.source;
    }

}
