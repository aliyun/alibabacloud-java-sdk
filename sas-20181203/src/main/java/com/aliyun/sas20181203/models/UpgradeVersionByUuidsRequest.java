// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpgradeVersionByUuidsRequest extends TeaModel {
    /**
     * <p>The target version to which you want to upgrade.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.9</p>
     */
    @NameInMap("UpgradeVersion")
    public String upgradeVersion;

    /**
     * <p>The list of UUIDs of the assets to be checked.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static UpgradeVersionByUuidsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeVersionByUuidsRequest self = new UpgradeVersionByUuidsRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeVersionByUuidsRequest setUpgradeVersion(String upgradeVersion) {
        this.upgradeVersion = upgradeVersion;
        return this;
    }
    public String getUpgradeVersion() {
        return this.upgradeVersion;
    }

    public UpgradeVersionByUuidsRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
