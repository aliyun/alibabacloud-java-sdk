// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AddHiveEdgeWorkersShrinkRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hive-xxxx-xxx-xxx</p>
     */
    @NameInMap("HiveId")
    public String hiveId;

    /**
     * <p>A list of instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;acp-c4b9pbj4fzkagfexv\&quot;, \&quot;acp-c4b9pbj4fzkagfexw\&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    public static AddHiveEdgeWorkersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddHiveEdgeWorkersShrinkRequest self = new AddHiveEdgeWorkersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddHiveEdgeWorkersShrinkRequest setHiveId(String hiveId) {
        this.hiveId = hiveId;
        return this;
    }
    public String getHiveId() {
        return this.hiveId;
    }

    public AddHiveEdgeWorkersShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

}
