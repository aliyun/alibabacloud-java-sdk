// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetWatermarkRequest extends TeaModel {
    /**
     * <p>The ID of the watermark.</p>
     */
    @NameInMap("WatermarkId")
    public String watermarkId;

    public static GetWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkRequest self = new GetWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public GetWatermarkRequest setWatermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
        return this;
    }
    public String getWatermarkId() {
        return this.watermarkId;
    }

}
