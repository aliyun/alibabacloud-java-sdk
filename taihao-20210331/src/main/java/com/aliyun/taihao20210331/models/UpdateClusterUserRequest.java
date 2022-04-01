// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateClusterUserRequest extends TeaModel {
    @NameInMap("updateClusterUserParam")
    public UpdateClusterUserParam updateClusterUserParam;

    public static UpdateClusterUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterUserRequest self = new UpdateClusterUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterUserRequest setUpdateClusterUserParam(UpdateClusterUserParam updateClusterUserParam) {
        this.updateClusterUserParam = updateClusterUserParam;
        return this;
    }
    public UpdateClusterUserParam getUpdateClusterUserParam() {
        return this.updateClusterUserParam;
    }

}
