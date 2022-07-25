// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateLayoutDataRequest extends TeaModel {
    @NameInMap("LayoutData")
    public String layoutData;

    @NameInMap("SubSceneId")
    public String subSceneId;

    public static UpdateLayoutDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLayoutDataRequest self = new UpdateLayoutDataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLayoutDataRequest setLayoutData(String layoutData) {
        this.layoutData = layoutData;
        return this;
    }
    public String getLayoutData() {
        return this.layoutData;
    }

    public UpdateLayoutDataRequest setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

}
