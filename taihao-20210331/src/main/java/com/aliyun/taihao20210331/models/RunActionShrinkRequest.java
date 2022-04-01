// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RunActionShrinkRequest extends TeaModel {
    // runActionParam
    @NameInMap("runActionParam")
    public String runActionParamShrink;

    public static RunActionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunActionShrinkRequest self = new RunActionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunActionShrinkRequest setRunActionParamShrink(String runActionParamShrink) {
        this.runActionParamShrink = runActionParamShrink;
        return this;
    }
    public String getRunActionParamShrink() {
        return this.runActionParamShrink;
    }

}
