// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class SaveOpenJMeterSceneShrinkRequest extends TeaModel {
    // 场景详情
    @NameInMap("OpenJMeterScene")
    public String openJMeterSceneShrink;

    public static SaveOpenJMeterSceneShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveOpenJMeterSceneShrinkRequest self = new SaveOpenJMeterSceneShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveOpenJMeterSceneShrinkRequest setOpenJMeterSceneShrink(String openJMeterSceneShrink) {
        this.openJMeterSceneShrink = openJMeterSceneShrink;
        return this;
    }
    public String getOpenJMeterSceneShrink() {
        return this.openJMeterSceneShrink;
    }

}
