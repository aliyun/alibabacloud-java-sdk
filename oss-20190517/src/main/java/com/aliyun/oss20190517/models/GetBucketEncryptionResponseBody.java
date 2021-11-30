// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketEncryptionResponseBody extends TeaModel {
    @NameInMap("ApplyServerSideEncryptionByDefault")
    public ApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault;

    public static GetBucketEncryptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketEncryptionResponseBody self = new GetBucketEncryptionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketEncryptionResponseBody setApplyServerSideEncryptionByDefault(ApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault) {
        this.applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault;
        return this;
    }
    public ApplyServerSideEncryptionByDefault getApplyServerSideEncryptionByDefault() {
        return this.applyServerSideEncryptionByDefault;
    }

}
