// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CheckAudienceExportStatusRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("AudienceId")
    public String audienceId;

    @NameInMap("TenantId")
    public String tenantId;

    public static CheckAudienceExportStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAudienceExportStatusRequest self = new CheckAudienceExportStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckAudienceExportStatusRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public CheckAudienceExportStatusRequest setAudienceId(String audienceId) {
        this.audienceId = audienceId;
        return this;
    }
    public String getAudienceId() {
        return this.audienceId;
    }

    public CheckAudienceExportStatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
