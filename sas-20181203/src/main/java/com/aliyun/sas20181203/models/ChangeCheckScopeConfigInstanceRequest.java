// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeCheckScopeConfigInstanceRequest extends TeaModel {
    /**
     * <p>The list of unique IDs of cloud assets to add.</p>
     */
    @NameInMap("AddAssetUuids")
    public java.util.List<String> addAssetUuids;

    /**
     * <p>The ID of the scan scope configuration.</p>
     * <blockquote>
     * <p>Call the <a href="~~GetCheckScopeConfig~~">GetCheckScopeConfig</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00cfa8161da093089e6804ba6a33****</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The list of unique IDs of cloud assets to delete.</p>
     */
    @NameInMap("DeleteAssetUuids")
    public java.util.List<String> deleteAssetUuids;

    public static ChangeCheckScopeConfigInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckScopeConfigInstanceRequest self = new ChangeCheckScopeConfigInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ChangeCheckScopeConfigInstanceRequest setAddAssetUuids(java.util.List<String> addAssetUuids) {
        this.addAssetUuids = addAssetUuids;
        return this;
    }
    public java.util.List<String> getAddAssetUuids() {
        return this.addAssetUuids;
    }

    public ChangeCheckScopeConfigInstanceRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public ChangeCheckScopeConfigInstanceRequest setDeleteAssetUuids(java.util.List<String> deleteAssetUuids) {
        this.deleteAssetUuids = deleteAssetUuids;
        return this;
    }
    public java.util.List<String> getDeleteAssetUuids() {
        return this.deleteAssetUuids;
    }

}
