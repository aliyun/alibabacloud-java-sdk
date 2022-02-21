// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AddRegisteredDeviceResponseBody extends TeaModel {
    @NameInMap("Dsn")
    public String dsn;

    @NameInMap("Id")
    public String id;

    @NameInMap("RegisterCode")
    public String registerCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecretKey")
    public String secretKey;

    @NameInMap("Vendor")
    public String vendor;

    public static AddRegisteredDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRegisteredDeviceResponseBody self = new AddRegisteredDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRegisteredDeviceResponseBody setDsn(String dsn) {
        this.dsn = dsn;
        return this;
    }
    public String getDsn() {
        return this.dsn;
    }

    public AddRegisteredDeviceResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddRegisteredDeviceResponseBody setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
        return this;
    }
    public String getRegisterCode() {
        return this.registerCode;
    }

    public AddRegisteredDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddRegisteredDeviceResponseBody setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public AddRegisteredDeviceResponseBody setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
