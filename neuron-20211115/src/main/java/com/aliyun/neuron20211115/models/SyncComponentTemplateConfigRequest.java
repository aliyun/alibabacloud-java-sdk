// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SyncComponentTemplateConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>125</p>
     */
    @NameInMap("id")
    public Long id;

    public static SyncComponentTemplateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncComponentTemplateConfigRequest self = new SyncComponentTemplateConfigRequest();
        return TeaModel.build(map, self);
    }

    public SyncComponentTemplateConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
