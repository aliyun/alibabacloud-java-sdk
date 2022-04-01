// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateFullClusterByMainVersionRequest extends TeaModel {
    @NameInMap("createFullClusterByMainVersionParam")
    public CreateFullClusterByMainVersionParam createFullClusterByMainVersionParam;

    public static CreateFullClusterByMainVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFullClusterByMainVersionRequest self = new CreateFullClusterByMainVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateFullClusterByMainVersionRequest setCreateFullClusterByMainVersionParam(CreateFullClusterByMainVersionParam createFullClusterByMainVersionParam) {
        this.createFullClusterByMainVersionParam = createFullClusterByMainVersionParam;
        return this;
    }
    public CreateFullClusterByMainVersionParam getCreateFullClusterByMainVersionParam() {
        return this.createFullClusterByMainVersionParam;
    }

}
