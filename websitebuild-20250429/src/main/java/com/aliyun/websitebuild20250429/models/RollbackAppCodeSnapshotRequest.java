// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RollbackAppCodeSnapshotRequest extends TeaModel {
    /**
     * <p>site ID</p>
     * 
     * <strong>example:</strong>
     * <p>1067072706415168</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    /**
     * <p>Target snapshot version number</p>
     * 
     * <strong>example:</strong>
     * <p>1231</p>
     */
    @NameInMap("TargetLogicalNumber")
    public Integer targetLogicalNumber;

    public static RollbackAppCodeSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackAppCodeSnapshotRequest self = new RollbackAppCodeSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public RollbackAppCodeSnapshotRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public RollbackAppCodeSnapshotRequest setTargetLogicalNumber(Integer targetLogicalNumber) {
        this.targetLogicalNumber = targetLogicalNumber;
        return this;
    }
    public Integer getTargetLogicalNumber() {
        return this.targetLogicalNumber;
    }

}
