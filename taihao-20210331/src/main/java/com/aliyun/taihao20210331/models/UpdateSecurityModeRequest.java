// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateSecurityModeRequest extends TeaModel {
    // updateSecurityModeParam
    @NameInMap("updateClusterSecurityModeParam")
    public UpdateSecurityModeParam updateClusterSecurityModeParam;

    public static UpdateSecurityModeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityModeRequest self = new UpdateSecurityModeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityModeRequest setUpdateClusterSecurityModeParam(UpdateSecurityModeParam updateClusterSecurityModeParam) {
        this.updateClusterSecurityModeParam = updateClusterSecurityModeParam;
        return this;
    }
    public UpdateSecurityModeParam getUpdateClusterSecurityModeParam() {
        return this.updateClusterSecurityModeParam;
    }

}
