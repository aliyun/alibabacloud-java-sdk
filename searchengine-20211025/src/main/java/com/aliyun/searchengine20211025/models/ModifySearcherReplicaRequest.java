// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifySearcherReplicaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("partition")
    public Integer partition;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("replica")
    public Integer replica;

    public static ModifySearcherReplicaRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySearcherReplicaRequest self = new ModifySearcherReplicaRequest();
        return TeaModel.build(map, self);
    }

    public ModifySearcherReplicaRequest setPartition(Integer partition) {
        this.partition = partition;
        return this;
    }
    public Integer getPartition() {
        return this.partition;
    }

    public ModifySearcherReplicaRequest setReplica(Integer replica) {
        this.replica = replica;
        return this;
    }
    public Integer getReplica() {
        return this.replica;
    }

}
