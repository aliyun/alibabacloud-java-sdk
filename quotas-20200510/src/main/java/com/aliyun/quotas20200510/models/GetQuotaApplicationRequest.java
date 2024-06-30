// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>d314d6ae-867d-484c-9009-3d421a80****</p>
     */
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
