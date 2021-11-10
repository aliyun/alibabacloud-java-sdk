// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CreateExportTaskRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("AudienceId")
    public String audienceId;

    @NameInMap("TenantId")
    public String tenantId;

    public static CreateExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExportTaskRequest self = new CreateExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateExportTaskRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public CreateExportTaskRequest setAudienceId(String audienceId) {
        this.audienceId = audienceId;
        return this;
    }
    public String getAudienceId() {
        return this.audienceId;
    }

    public CreateExportTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
