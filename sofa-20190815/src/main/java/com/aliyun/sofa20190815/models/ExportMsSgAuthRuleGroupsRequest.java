// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportMsSgAuthRuleGroupsRequest extends TeaModel {
    @NameInMap("AuthRuleIds")
    public String authRuleIds;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsExportAll")
    public Boolean isExportAll;

    public static ExportMsSgAuthRuleGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportMsSgAuthRuleGroupsRequest self = new ExportMsSgAuthRuleGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ExportMsSgAuthRuleGroupsRequest setAuthRuleIds(String authRuleIds) {
        this.authRuleIds = authRuleIds;
        return this;
    }
    public String getAuthRuleIds() {
        return this.authRuleIds;
    }

    public ExportMsSgAuthRuleGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportMsSgAuthRuleGroupsRequest setIsExportAll(Boolean isExportAll) {
        this.isExportAll = isExportAll;
        return this;
    }
    public Boolean getIsExportAll() {
        return this.isExportAll;
    }

}
