// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ApplicationId")
    public String applicationId;

    public static CreateQuotaApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaApplicationResponseBody self = new CreateQuotaApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQuotaApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateQuotaApplicationResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
