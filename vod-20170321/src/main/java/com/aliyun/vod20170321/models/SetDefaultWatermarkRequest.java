// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultWatermarkRequest extends TeaModel {
    @NameInMap("WatermarkId")
    public String watermarkId;

    public static SetDefaultWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultWatermarkRequest self = new SetDefaultWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public SetDefaultWatermarkRequest setWatermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
        return this;
    }
    public String getWatermarkId() {
        return this.watermarkId;
    }

}
