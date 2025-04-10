// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class SyncSensitiveWordShrinkRequest extends TeaModel {
    @NameInMap("BodyData")
    public String bodyDataShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Commit")
    public Boolean commit;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SyncSensitiveWordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncSensitiveWordShrinkRequest self = new SyncSensitiveWordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SyncSensitiveWordShrinkRequest setBodyDataShrink(String bodyDataShrink) {
        this.bodyDataShrink = bodyDataShrink;
        return this;
    }
    public String getBodyDataShrink() {
        return this.bodyDataShrink;
    }

    public SyncSensitiveWordShrinkRequest setCommit(Boolean commit) {
        this.commit = commit;
        return this;
    }
    public Boolean getCommit() {
        return this.commit;
    }

    public SyncSensitiveWordShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
