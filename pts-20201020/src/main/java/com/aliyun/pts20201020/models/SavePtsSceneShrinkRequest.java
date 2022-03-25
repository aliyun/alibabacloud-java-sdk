// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class SavePtsSceneShrinkRequest extends TeaModel {
    // 场景详细信息
    @NameInMap("Scene")
    public String sceneShrink;

    public static SavePtsSceneShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SavePtsSceneShrinkRequest self = new SavePtsSceneShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SavePtsSceneShrinkRequest setSceneShrink(String sceneShrink) {
        this.sceneShrink = sceneShrink;
        return this;
    }
    public String getSceneShrink() {
        return this.sceneShrink;
    }

}
