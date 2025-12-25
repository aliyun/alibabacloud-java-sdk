// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class RecoveryOriginImageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>skjjskjk****</p>
     */
    @NameInMap("SubSceneId")
    public String subSceneId;

    public static RecoveryOriginImageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoveryOriginImageRequest self = new RecoveryOriginImageRequest();
        return TeaModel.build(map, self);
    }

    public RecoveryOriginImageRequest setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

}
