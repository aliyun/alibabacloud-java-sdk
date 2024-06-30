// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ModifyQuotaTemplateServiceStatusRequest extends TeaModel {
    /**
     * <p>The status of the quota template. Valid values:</p>
     * <ul>
     * <li>\-1: The quota template is disabled.</li>
     * <li>1: The quota template is enabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
