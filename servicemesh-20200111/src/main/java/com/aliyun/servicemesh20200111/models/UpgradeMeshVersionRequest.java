// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpgradeMeshVersionRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a precheck. Default value: false. If this parameter is set to true, this call only checks whether the current ASM instance meets the upgrade conditions and does not actually perform an upgrade.</p>
     */
    @NameInMap("PreCheck")
    public Boolean preCheck;

    /**
     * <p>The ASM instance ID.</p>
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
