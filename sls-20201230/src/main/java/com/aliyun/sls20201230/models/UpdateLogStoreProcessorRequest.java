// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateLogStoreProcessorRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>parse-nginx-log</p>
     */
    @NameInMap("processorName")
    public String processorName;

    public static UpdateLogStoreProcessorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogStoreProcessorRequest self = new UpdateLogStoreProcessorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogStoreProcessorRequest setProcessorName(String processorName) {
        this.processorName = processorName;
        return this;
    }
    public String getProcessorName() {
        return this.processorName;
    }

}
