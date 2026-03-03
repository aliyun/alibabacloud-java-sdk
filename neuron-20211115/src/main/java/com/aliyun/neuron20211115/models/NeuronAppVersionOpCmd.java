// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppVersionOpCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("appVersionId")
    public Long appVersionId;

    public static NeuronAppVersionOpCmd build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppVersionOpCmd self = new NeuronAppVersionOpCmd();
        return TeaModel.build(map, self);
    }

    public NeuronAppVersionOpCmd setAppVersionId(Long appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public Long getAppVersionId() {
        return this.appVersionId;
    }

}
