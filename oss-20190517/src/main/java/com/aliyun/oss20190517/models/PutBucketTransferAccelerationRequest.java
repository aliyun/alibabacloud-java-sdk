// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutBucketTransferAccelerationRequest extends TeaModel {
    @NameInMap("TransferAccelerationConfiguration")
    public TransferAccelerationConfiguration transferAccelerationConfiguration;

    public static PutBucketTransferAccelerationRequest build(java.util.Map<String, ?> map) throws Exception {
        PutBucketTransferAccelerationRequest self = new PutBucketTransferAccelerationRequest();
        return TeaModel.build(map, self);
    }

    public PutBucketTransferAccelerationRequest setTransferAccelerationConfiguration(TransferAccelerationConfiguration transferAccelerationConfiguration) {
        this.transferAccelerationConfiguration = transferAccelerationConfiguration;
        return this;
    }
    public TransferAccelerationConfiguration getTransferAccelerationConfiguration() {
        return this.transferAccelerationConfiguration;
    }

}
