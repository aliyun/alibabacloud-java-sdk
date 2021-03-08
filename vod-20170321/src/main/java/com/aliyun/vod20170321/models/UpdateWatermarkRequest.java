// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateWatermarkRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("WatermarkId")
    public String watermarkId;

    @NameInMap("WatermarkConfig")
    public String watermarkConfig;

    public static UpdateWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatermarkRequest self = new UpdateWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWatermarkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWatermarkRequest setWatermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
        return this;
    }
    public String getWatermarkId() {
        return this.watermarkId;
    }

    public UpdateWatermarkRequest setWatermarkConfig(String watermarkConfig) {
        this.watermarkConfig = watermarkConfig;
        return this;
    }
    public String getWatermarkConfig() {
        return this.watermarkConfig;
    }

}
