// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class UpdateAlertPlanRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataSourceId")
    public String dataSourceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("planId")
    public Long planId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("versions")
    public String versions;

    public static UpdateAlertPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertPlanRequest self = new UpdateAlertPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertPlanRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public UpdateAlertPlanRequest setPlanId(Long planId) {
        this.planId = planId;
        return this;
    }
    public Long getPlanId() {
        return this.planId;
    }

    public UpdateAlertPlanRequest setVersions(String versions) {
        this.versions = versions;
        return this;
    }
    public String getVersions() {
        return this.versions;
    }

}
