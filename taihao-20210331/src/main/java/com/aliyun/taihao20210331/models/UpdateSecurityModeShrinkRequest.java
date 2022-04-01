// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateSecurityModeShrinkRequest extends TeaModel {
    // updateSecurityModeParam
    @NameInMap("updateClusterSecurityModeParam")
    public String updateClusterSecurityModeParamShrink;

    public static UpdateSecurityModeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityModeShrinkRequest self = new UpdateSecurityModeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityModeShrinkRequest setUpdateClusterSecurityModeParamShrink(String updateClusterSecurityModeParamShrink) {
        this.updateClusterSecurityModeParamShrink = updateClusterSecurityModeParamShrink;
        return this;
    }
    public String getUpdateClusterSecurityModeParamShrink() {
        return this.updateClusterSecurityModeParamShrink;
    }

}
