// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateOrderForLicenseResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrderForLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderForLicenseResponseBody self = new CreateOrderForLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderForLicenseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateOrderForLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
