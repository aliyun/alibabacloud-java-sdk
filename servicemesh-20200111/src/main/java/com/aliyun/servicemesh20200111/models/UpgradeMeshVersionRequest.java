// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpgradeMeshVersionRequest extends TeaModel {
    @NameInMap("PreCheck")
    public Boolean preCheck;

    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static UpgradeMeshVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMeshVersionRequest self = new UpgradeMeshVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeMeshVersionRequest setPreCheck(Boolean preCheck) {
        this.preCheck = preCheck;
        return this;
    }
    public Boolean getPreCheck() {
        return this.preCheck;
    }

    public UpgradeMeshVersionRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
