// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class MoveHiveEdgeWorkersRequest extends TeaModel {
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
    public java.util.List<String> instanceIds;

    public static MoveHiveEdgeWorkersRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveHiveEdgeWorkersRequest self = new MoveHiveEdgeWorkersRequest();
        return TeaModel.build(map, self);
    }

    public MoveHiveEdgeWorkersRequest setHiveId(String hiveId) {
        this.hiveId = hiveId;
        return this;
    }
    public String getHiveId() {
        return this.hiveId;
    }

    public MoveHiveEdgeWorkersRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
