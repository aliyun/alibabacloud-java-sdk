// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaApplicationRequest extends TeaModel {
    // The ID of the application.
    @NameInMap("ApplicationId")
    public String applicationId;

    public static GetQuotaApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaApplicationRequest self = new GetQuotaApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetQuotaApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
