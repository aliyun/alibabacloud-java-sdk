// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradeApplicationVersionRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The upgrade policy.</p>
     * 
     * <strong>example:</strong>
     * <p>HOT</p>
     */
    @NameInMap("UpgradePolicy")
    public String upgradePolicy;

    public static UpgradeApplicationVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeApplicationVersionRequest self = new UpgradeApplicationVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeApplicationVersionRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpgradeApplicationVersionRequest setUpgradePolicy(String upgradePolicy) {
        this.upgradePolicy = upgradePolicy;
        return this;
    }
    public String getUpgradePolicy() {
        return this.upgradePolicy;
    }

}
