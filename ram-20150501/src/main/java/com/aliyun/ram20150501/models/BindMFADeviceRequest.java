// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class BindMFADeviceRequest extends TeaModel {
    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("AuthenticationCode1")
    public String authenticationCode1;

    @NameInMap("AuthenticationCode2")
    public String authenticationCode2;

    public static BindMFADeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindMFADeviceRequest self = new BindMFADeviceRequest();
        return TeaModel.build(map, self);
    }

}
