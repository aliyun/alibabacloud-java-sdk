// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSContainerservicesRequest extends TeaModel {
    @NameInMap("ContainerServiceName")
    public String containerServiceName;

    @NameInMap("Workspace")
    public String workspace;

    public static GetAKSContainerservicesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAKSContainerservicesRequest self = new GetAKSContainerservicesRequest();
        return TeaModel.build(map, self);
    }

    public GetAKSContainerservicesRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public GetAKSContainerservicesRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
