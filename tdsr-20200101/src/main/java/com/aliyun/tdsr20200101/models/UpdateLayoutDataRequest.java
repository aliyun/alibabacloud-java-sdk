// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateLayoutDataRequest extends TeaModel {
    // 子场景ID
    @NameInMap("SubSceneId")
    public String subSceneId;

    // 标注数据
    @NameInMap("LayoutData")
    public String layoutData;

    public static UpdateLayoutDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLayoutDataRequest self = new UpdateLayoutDataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLayoutDataRequest setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

    public UpdateLayoutDataRequest setLayoutData(String layoutData) {
        this.layoutData = layoutData;
        return this;
    }
    public String getLayoutData() {
        return this.layoutData;
    }

}
