// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateMetricStoreProcessorRequest extends TeaModel {
    /**
     * <p>The identifier of the ingest processor.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>filter-metrics</p>
     */
    @NameInMap("processorName")
    public String processorName;

    public static UpdateMetricStoreProcessorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetricStoreProcessorRequest self = new UpdateMetricStoreProcessorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetricStoreProcessorRequest setProcessorName(String processorName) {
        this.processorName = processorName;
        return this;
    }
    public String getProcessorName() {
        return this.processorName;
    }

}
