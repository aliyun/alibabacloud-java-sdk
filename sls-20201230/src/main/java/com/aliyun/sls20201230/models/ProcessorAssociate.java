// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ProcessorAssociate extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ingest-processor-1</p>
     */
    @NameInMap("processorId")
    public String processorId;

    public static ProcessorAssociate build(java.util.Map<String, ?> map) throws Exception {
        ProcessorAssociate self = new ProcessorAssociate();
        return TeaModel.build(map, self);
    }

    public ProcessorAssociate setProcessorId(String processorId) {
        this.processorId = processorId;
        return this;
    }
    public String getProcessorId() {
        return this.processorId;
    }

}
