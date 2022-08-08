// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRMSUnifiedAlarmRuleRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static DeleteRMSUnifiedAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRMSUnifiedAlarmRuleRequest self = new DeleteRMSUnifiedAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRMSUnifiedAlarmRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteRMSUnifiedAlarmRuleRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
