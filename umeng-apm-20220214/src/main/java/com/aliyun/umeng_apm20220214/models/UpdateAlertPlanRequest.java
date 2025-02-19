// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class UpdateAlertPlanRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5fb6001a73749c24fd9cb356</p>
     */
    @NameInMap("dataSourceId")
    public String dataSourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>18288</p>
     */
    @NameInMap("planId")
    public Long planId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;1.1.0,1.2.0,1.3.0&quot;</p>
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
