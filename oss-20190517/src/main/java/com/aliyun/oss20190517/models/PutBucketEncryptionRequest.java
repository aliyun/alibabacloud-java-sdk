// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutBucketEncryptionRequest extends TeaModel {
    @NameInMap("ServerSideEncryptionRule")
    public ServerSideEncryptionRule serverSideEncryptionRule;

    public static PutBucketEncryptionRequest build(java.util.Map<String, ?> map) throws Exception {
        PutBucketEncryptionRequest self = new PutBucketEncryptionRequest();
        return TeaModel.build(map, self);
    }

    public PutBucketEncryptionRequest setServerSideEncryptionRule(ServerSideEncryptionRule serverSideEncryptionRule) {
        this.serverSideEncryptionRule = serverSideEncryptionRule;
        return this;
    }
    public ServerSideEncryptionRule getServerSideEncryptionRule() {
        return this.serverSideEncryptionRule;
    }

}
