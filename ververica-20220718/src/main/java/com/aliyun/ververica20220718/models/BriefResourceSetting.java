// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class BriefResourceSetting extends TeaModel {
    /**
     * <p>The resource configuration for the deployment in batch mode. This parameter is required for a deployment in batch mode.</p>
     */
    @NameInMap("batchResourceSetting")
    public BatchResourceSetting batchResourceSetting;

    /**
     * <p>The Realtime Compute for Apache Flink configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>“execution.checkpointing.interval: 180s”</p>
     */
    @NameInMap("flinkConf")
    public java.util.Map<String, ?> flinkConf;

    /**
     * <p>The resource configuration for the deployment in streaming mode. This parameter is required for a deployment in streaming mode.</p>
     */
    @NameInMap("streamingResourceSetting")
    public StreamingResourceSetting streamingResourceSetting;

    public static BriefResourceSetting build(java.util.Map<String, ?> map) throws Exception {
        BriefResourceSetting self = new BriefResourceSetting();
        return TeaModel.build(map, self);
    }

    public BriefResourceSetting setBatchResourceSetting(BatchResourceSetting batchResourceSetting) {
        this.batchResourceSetting = batchResourceSetting;
        return this;
    }
    public BatchResourceSetting getBatchResourceSetting() {
        return this.batchResourceSetting;
    }

    public BriefResourceSetting setFlinkConf(java.util.Map<String, ?> flinkConf) {
        this.flinkConf = flinkConf;
        return this;
    }
    public java.util.Map<String, ?> getFlinkConf() {
        return this.flinkConf;
    }

    public BriefResourceSetting setStreamingResourceSetting(StreamingResourceSetting streamingResourceSetting) {
        this.streamingResourceSetting = streamingResourceSetting;
        return this;
    }
    public StreamingResourceSetting getStreamingResourceSetting() {
        return this.streamingResourceSetting;
    }

}
