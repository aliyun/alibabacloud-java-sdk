// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryUpgradableVersionsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to query the minor versions that you can upgrade to. Default value: true. Valid values:</p>
     * <ul>
     * <li>true: The minor versions that you can upgrade to.</li>
     * <li>false: The major versions that you can upgrade to.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Minor")
    public Boolean minor;

    public static QueryUpgradableVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUpgradableVersionsRequest self = new QueryUpgradableVersionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryUpgradableVersionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryUpgradableVersionsRequest setMinor(Boolean minor) {
        this.minor = minor;
        return this;
    }
    public Boolean getMinor() {
        return this.minor;
    }

}
