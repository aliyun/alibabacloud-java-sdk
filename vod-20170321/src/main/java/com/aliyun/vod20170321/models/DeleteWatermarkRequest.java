// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteWatermarkRequest extends TeaModel {
    @NameInMap("WatermarkId")
    public String watermarkId;

    public static DeleteWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatermarkRequest self = new DeleteWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWatermarkRequest setWatermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
        return this;
    }
    public String getWatermarkId() {
        return this.watermarkId;
    }

}
