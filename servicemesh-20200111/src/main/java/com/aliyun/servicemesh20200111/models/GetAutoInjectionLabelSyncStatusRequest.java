// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetAutoInjectionLabelSyncStatusRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static GetAutoInjectionLabelSyncStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutoInjectionLabelSyncStatusRequest self = new GetAutoInjectionLabelSyncStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAutoInjectionLabelSyncStatusRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
