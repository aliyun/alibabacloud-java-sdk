// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ReplicationDestination extends TeaModel {
    // The destination bucket to which the data is replicated
    @NameInMap("Bucket")
    public String bucket;

    // The region in which the destination bucket is located
    @NameInMap("Location")
    public String location;

    // The link used to transfer data in CRR
    @NameInMap("TransferType")
    public String transferType;

    public static ReplicationDestination build(java.util.Map<String, ?> map) throws Exception {
        ReplicationDestination self = new ReplicationDestination();
        return TeaModel.build(map, self);
    }

    public ReplicationDestination setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public ReplicationDestination setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public ReplicationDestination setTransferType(String transferType) {
        this.transferType = transferType;
        return this;
    }
    public String getTransferType() {
        return this.transferType;
    }

}
