// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class SaveEnvShrinkRequest extends TeaModel {
    // 环境
    @NameInMap("Env")
    public String envShrink;

    public static SaveEnvShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveEnvShrinkRequest self = new SaveEnvShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveEnvShrinkRequest setEnvShrink(String envShrink) {
        this.envShrink = envShrink;
        return this;
    }
    public String getEnvShrink() {
        return this.envShrink;
    }

}
