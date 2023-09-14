// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationsForTemplateResponseBody extends TeaModel {
    @NameInMap("AliyunUids")
    public java.util.List<String> aliyunUids;

    @NameInMap("BatchQuotaApplicationId")
    public String batchQuotaApplicationId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateQuotaApplicationsForTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaApplicationsForTemplateResponseBody self = new CreateQuotaApplicationsForTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQuotaApplicationsForTemplateResponseBody setAliyunUids(java.util.List<String> aliyunUids) {
        this.aliyunUids = aliyunUids;
        return this;
    }
    public java.util.List<String> getAliyunUids() {
        return this.aliyunUids;
    }

    public CreateQuotaApplicationsForTemplateResponseBody setBatchQuotaApplicationId(String batchQuotaApplicationId) {
        this.batchQuotaApplicationId = batchQuotaApplicationId;
        return this;
    }
    public String getBatchQuotaApplicationId() {
        return this.batchQuotaApplicationId;
    }

    public CreateQuotaApplicationsForTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
