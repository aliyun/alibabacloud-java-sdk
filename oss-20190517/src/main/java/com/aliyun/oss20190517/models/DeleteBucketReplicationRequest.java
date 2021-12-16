// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class DeleteBucketReplicationRequest extends TeaModel {
    @NameInMap("body")
    public ReplicationRules body;

    public static DeleteBucketReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketReplicationRequest self = new DeleteBucketReplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBucketReplicationRequest setBody(ReplicationRules body) {
        this.body = body;
        return this;
    }
    public ReplicationRules getBody() {
        return this.body;
    }

}
