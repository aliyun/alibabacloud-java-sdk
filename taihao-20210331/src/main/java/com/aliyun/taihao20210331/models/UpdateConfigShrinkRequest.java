// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateConfigShrinkRequest extends TeaModel {
    // updateConfigParam
    @NameInMap("updateConfigParam")
    public String updateConfigParamShrink;

    public static UpdateConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigShrinkRequest self = new UpdateConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigShrinkRequest setUpdateConfigParamShrink(String updateConfigParamShrink) {
        this.updateConfigParamShrink = updateConfigParamShrink;
        return this;
    }
    public String getUpdateConfigParamShrink() {
        return this.updateConfigParamShrink;
    }

}
