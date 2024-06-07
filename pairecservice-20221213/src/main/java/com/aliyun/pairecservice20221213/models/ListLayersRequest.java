// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListLayersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LaboratoryId")
    public String laboratoryId;

    public static ListLayersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLayersRequest self = new ListLayersRequest();
        return TeaModel.build(map, self);
    }

    public ListLayersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListLayersRequest setLaboratoryId(String laboratoryId) {
        this.laboratoryId = laboratoryId;
        return this;
    }
    public String getLaboratoryId() {
        return this.laboratoryId;
    }

}
