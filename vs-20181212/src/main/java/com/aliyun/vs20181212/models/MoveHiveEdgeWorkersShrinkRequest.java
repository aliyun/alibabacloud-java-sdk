// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class MoveHiveEdgeWorkersShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hive-xxxx-xxx-xxx</p>
     */
    @NameInMap("HiveId")
    public String hiveId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ew-xxxx&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    public static MoveHiveEdgeWorkersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveHiveEdgeWorkersShrinkRequest self = new MoveHiveEdgeWorkersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MoveHiveEdgeWorkersShrinkRequest setHiveId(String hiveId) {
        this.hiveId = hiveId;
        return this;
    }
    public String getHiveId() {
        return this.hiveId;
    }

    public MoveHiveEdgeWorkersShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

}
