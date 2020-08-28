// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteDeviceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static DeleteDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceResponse self = new DeleteDeviceResponse();
        return TeaModel.build(map, self);
    }

}
