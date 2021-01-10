// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkeBahamutAppcreateorimporttaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static RetryLinkeBahamutAppcreateorimporttaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkeBahamutAppcreateorimporttaskRequest self = new RetryLinkeBahamutAppcreateorimporttaskRequest();
        return TeaModel.build(map, self);
    }

    public RetryLinkeBahamutAppcreateorimporttaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RetryLinkeBahamutAppcreateorimporttaskRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
