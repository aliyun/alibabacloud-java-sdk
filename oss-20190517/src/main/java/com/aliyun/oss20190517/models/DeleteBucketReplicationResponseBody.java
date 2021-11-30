// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class DeleteBucketReplicationResponseBody extends TeaModel {
    @NameInMap("ID")
    public String ID;

    public static DeleteBucketReplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketReplicationResponseBody self = new DeleteBucketReplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBucketReplicationResponseBody setID(String ID) {
        this.ID = ID;
        return this;
    }
    public String getID() {
        return this.ID;
    }

}
