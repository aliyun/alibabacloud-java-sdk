// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateMultiOrderForLicenseResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateMultiOrderForLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiOrderForLicenseResponseBody self = new CreateMultiOrderForLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMultiOrderForLicenseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateMultiOrderForLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
