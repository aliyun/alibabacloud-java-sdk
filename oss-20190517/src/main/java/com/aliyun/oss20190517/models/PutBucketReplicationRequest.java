// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutBucketReplicationRequest extends TeaModel {
    @NameInMap("ReplicationConfiguration")
    public ReplicationConfiguration replicationConfiguration;

    public static PutBucketReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        PutBucketReplicationRequest self = new PutBucketReplicationRequest();
        return TeaModel.build(map, self);
    }

    public PutBucketReplicationRequest setReplicationConfiguration(ReplicationConfiguration replicationConfiguration) {
        this.replicationConfiguration = replicationConfiguration;
        return this;
    }
    public ReplicationConfiguration getReplicationConfiguration() {
        return this.replicationConfiguration;
    }

}
