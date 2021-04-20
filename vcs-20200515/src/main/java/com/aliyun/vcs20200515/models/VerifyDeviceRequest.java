// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class VerifyDeviceRequest extends TeaModel {
    // 城市编码
    @NameInMap("CityCode")
    public String cityCode;

    // OSS路径
    @NameInMap("FilePath")
    public String filePath;

    public static VerifyDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDeviceRequest self = new VerifyDeviceRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDeviceRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public VerifyDeviceRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
