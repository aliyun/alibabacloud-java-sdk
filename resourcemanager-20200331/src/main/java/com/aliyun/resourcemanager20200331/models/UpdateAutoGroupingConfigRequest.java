// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAutoGroupingConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the Transfer Existing Associated Resources feature. Valid values:</p>
     * <ul>
     * <li>false</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableExistingResourcesTransfer")
    public Boolean enableExistingResourcesTransfer;

    public static UpdateAutoGroupingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoGroupingConfigRequest self = new UpdateAutoGroupingConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoGroupingConfigRequest setEnableExistingResourcesTransfer(Boolean enableExistingResourcesTransfer) {
        this.enableExistingResourcesTransfer = enableExistingResourcesTransfer;
        return this;
    }
    public Boolean getEnableExistingResourcesTransfer() {
        return this.enableExistingResourcesTransfer;
    }

}
