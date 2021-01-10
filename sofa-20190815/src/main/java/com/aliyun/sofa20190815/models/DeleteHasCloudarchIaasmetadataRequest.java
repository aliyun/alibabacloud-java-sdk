// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchIaasmetadataRequest extends TeaModel {
    @NameInMap("IaasId")
    public String iaasId;

    public static DeleteHasCloudarchIaasmetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchIaasmetadataRequest self = new DeleteHasCloudarchIaasmetadataRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchIaasmetadataRequest setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

}
