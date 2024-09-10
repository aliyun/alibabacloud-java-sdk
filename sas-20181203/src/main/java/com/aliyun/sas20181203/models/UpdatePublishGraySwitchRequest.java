// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdatePublishGraySwitchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GraySwitchStatus")
    public Integer graySwitchStatus;

    public static UpdatePublishGraySwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublishGraySwitchRequest self = new UpdatePublishGraySwitchRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePublishGraySwitchRequest setGraySwitchStatus(Integer graySwitchStatus) {
        this.graySwitchStatus = graySwitchStatus;
        return this;
    }
    public Integer getGraySwitchStatus() {
        return this.graySwitchStatus;
    }

}
