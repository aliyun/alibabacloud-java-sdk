// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteSwimLaneRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("SwimLaneName")
    public String swimLaneName;

    public static DeleteSwimLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSwimLaneRequest self = new DeleteSwimLaneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSwimLaneRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public DeleteSwimLaneRequest setSwimLaneName(String swimLaneName) {
        this.swimLaneName = swimLaneName;
        return this;
    }
    public String getSwimLaneName() {
        return this.swimLaneName;
    }

}
