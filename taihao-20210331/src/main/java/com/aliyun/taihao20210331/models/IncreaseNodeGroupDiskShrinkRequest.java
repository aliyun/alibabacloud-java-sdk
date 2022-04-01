// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class IncreaseNodeGroupDiskShrinkRequest extends TeaModel {
    // IncreaseDiskParam
    @NameInMap("increaseDiskParam")
    public String increaseDiskParamShrink;

    public static IncreaseNodeGroupDiskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IncreaseNodeGroupDiskShrinkRequest self = new IncreaseNodeGroupDiskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IncreaseNodeGroupDiskShrinkRequest setIncreaseDiskParamShrink(String increaseDiskParamShrink) {
        this.increaseDiskParamShrink = increaseDiskParamShrink;
        return this;
    }
    public String getIncreaseDiskParamShrink() {
        return this.increaseDiskParamShrink;
    }

}
