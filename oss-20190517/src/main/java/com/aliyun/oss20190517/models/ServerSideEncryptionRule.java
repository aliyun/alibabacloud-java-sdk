// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ServerSideEncryptionRule extends TeaModel {
    @NameInMap("ApplyServerSideEncryptionByDefault")
    public ApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault;

    public static ServerSideEncryptionRule build(java.util.Map<String, ?> map) throws Exception {
        ServerSideEncryptionRule self = new ServerSideEncryptionRule();
        return TeaModel.build(map, self);
    }

    public ServerSideEncryptionRule setApplyServerSideEncryptionByDefault(ApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault) {
        this.applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault;
        return this;
    }
    public ApplyServerSideEncryptionByDefault getApplyServerSideEncryptionByDefault() {
        return this.applyServerSideEncryptionByDefault;
    }

}
