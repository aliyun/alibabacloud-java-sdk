// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceLiveUrlResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Url")
    @Validation(required = true)
    public String url;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static GetDeviceLiveUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceLiveUrlResponse self = new GetDeviceLiveUrlResponse();
        return TeaModel.build(map, self);
    }

}
