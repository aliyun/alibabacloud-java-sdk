// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AddRegisteredDeviceRequest extends TeaModel {
    @NameInMap("Dsn")
    public String dsn;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegisterCode")
    public String registerCode;

    @NameInMap("SecretKey")
    public String secretKey;

    @NameInMap("Vendor")
    public String vendor;

    public static AddRegisteredDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRegisteredDeviceRequest self = new AddRegisteredDeviceRequest();
        return TeaModel.build(map, self);
    }

    public AddRegisteredDeviceRequest setDsn(String dsn) {
        this.dsn = dsn;
        return this;
    }
    public String getDsn() {
        return this.dsn;
    }

    public AddRegisteredDeviceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddRegisteredDeviceRequest setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
        return this;
    }
    public String getRegisterCode() {
        return this.registerCode;
    }

    public AddRegisteredDeviceRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public AddRegisteredDeviceRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
