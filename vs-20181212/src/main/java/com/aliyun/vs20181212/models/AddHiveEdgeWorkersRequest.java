// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AddHiveEdgeWorkersRequest extends TeaModel {
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
     * <p>[\&quot;acp-c4b9pbj4fzkagfexv\&quot;, \&quot;acp-c4b9pbj4fzkagfexw\&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static AddHiveEdgeWorkersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddHiveEdgeWorkersRequest self = new AddHiveEdgeWorkersRequest();
        return TeaModel.build(map, self);
    }

    public AddHiveEdgeWorkersRequest setHiveId(String hiveId) {
        this.hiveId = hiveId;
        return this;
    }
    public String getHiveId() {
        return this.hiveId;
    }

    public AddHiveEdgeWorkersRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
