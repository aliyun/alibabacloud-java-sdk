// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdatePublishAutoUpgradeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoUpgrade")
    public Integer autoUpgrade;

    public static UpdatePublishAutoUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublishAutoUpgradeRequest self = new UpdatePublishAutoUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePublishAutoUpgradeRequest setAutoUpgrade(Integer autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
        return this;
    }
    public Integer getAutoUpgrade() {
        return this.autoUpgrade;
    }

}
