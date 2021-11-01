// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddMosaicsRequest extends TeaModel {
    // 马赛克位置数据
    @NameInMap("MarkPosition")
    public String markPosition;

    // 子场景ID
    @NameInMap("SubSceneId")
    public String subSceneId;

    public static AddMosaicsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMosaicsRequest self = new AddMosaicsRequest();
        return TeaModel.build(map, self);
    }

    public AddMosaicsRequest setMarkPosition(String markPosition) {
        this.markPosition = markPosition;
        return this;
    }
    public String getMarkPosition() {
        return this.markPosition;
    }

    public AddMosaicsRequest setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

}
