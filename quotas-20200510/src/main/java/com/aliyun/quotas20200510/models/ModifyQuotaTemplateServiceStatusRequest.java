// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ModifyQuotaTemplateServiceStatusRequest extends TeaModel {
    @NameInMap("ServiceStatus")
    public Integer serviceStatus;

    public static ModifyQuotaTemplateServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyQuotaTemplateServiceStatusRequest self = new ModifyQuotaTemplateServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyQuotaTemplateServiceStatusRequest setServiceStatus(Integer serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public Integer getServiceStatus() {
        return this.serviceStatus;
    }

}
