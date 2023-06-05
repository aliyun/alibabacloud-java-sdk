// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class VerifyDeviceRequest extends TeaModel {
    @NameInMap("DeviceAddress")
    public String deviceAddress;

    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("NvrExisted")
    public Long nvrExisted;

    public static VerifyDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDeviceRequest self = new VerifyDeviceRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDeviceRequest setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
        return this;
    }
    public String getDeviceAddress() {
        return this.deviceAddress;
    }

    public VerifyDeviceRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public VerifyDeviceRequest setNvrExisted(Long nvrExisted) {
        this.nvrExisted = nvrExisted;
        return this;
    }
    public Long getNvrExisted() {
        return this.nvrExisted;
    }

}
