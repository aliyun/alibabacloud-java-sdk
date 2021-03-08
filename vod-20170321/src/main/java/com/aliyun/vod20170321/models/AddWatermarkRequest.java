// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddWatermarkRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Name")
    public String name;

    @NameInMap("WatermarkConfig")
    public String watermarkConfig;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("AppId")
    public String appId;

    public static AddWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWatermarkRequest self = new AddWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public AddWatermarkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddWatermarkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddWatermarkRequest setWatermarkConfig(String watermarkConfig) {
        this.watermarkConfig = watermarkConfig;
        return this;
    }
    public String getWatermarkConfig() {
        return this.watermarkConfig;
    }

    public AddWatermarkRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public AddWatermarkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
