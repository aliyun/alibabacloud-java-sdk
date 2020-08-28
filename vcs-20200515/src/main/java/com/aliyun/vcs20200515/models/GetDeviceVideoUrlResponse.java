// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceVideoUrlResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Url")
    @Validation(required = true)
    public String url;

    public static GetDeviceVideoUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceVideoUrlResponse self = new GetDeviceVideoUrlResponse();
        return TeaModel.build(map, self);
    }

}
