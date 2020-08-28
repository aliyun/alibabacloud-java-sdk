// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class SaveHotspotTagRequest extends TeaModel {
    @NameInMap("ParamTag")
    public String paramTag;

    @NameInMap("SubSceneUuid")
    public String subSceneUuid;

    public static SaveHotspotTagRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveHotspotTagRequest self = new SaveHotspotTagRequest();
        return TeaModel.build(map, self);
    }

}
