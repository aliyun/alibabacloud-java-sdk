// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ModifyQuotaTemplateServiceStatusRequest extends TeaModel {
    /**
     * <p>The state of the quota template. Valid values:</p>
     * <br>
     * <p>*   \-1: The quota template is disabled.</p>
     * <p>*   1: The quota template is enabled.</p>
     */
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
