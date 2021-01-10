// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutAppcreateorimporttaskabortRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static CreateLinkeBahamutAppcreateorimporttaskabortRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutAppcreateorimporttaskabortRequest self = new CreateLinkeBahamutAppcreateorimporttaskabortRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutAppcreateorimporttaskabortRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateLinkeBahamutAppcreateorimporttaskabortRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
