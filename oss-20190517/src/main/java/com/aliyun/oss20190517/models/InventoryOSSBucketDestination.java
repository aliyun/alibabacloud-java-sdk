// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InventoryOSSBucketDestination extends TeaModel {
    // The account ID granted by the bucket owner
    @NameInMap("AccountId")
    public String accountId;

    // The bucket that stores the exported inventory list
    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("Encryption")
    public InventoryEncryption encryption;

    @NameInMap("Format")
    public String format;

    // The path of the exported inventory list
    @NameInMap("Prefix")
    public String prefix;

    // The name of the role to which the bucket owner grants permissions
    @NameInMap("RoleArn")
    public String roleArn;

    public static InventoryOSSBucketDestination build(java.util.Map<String, ?> map) throws Exception {
        InventoryOSSBucketDestination self = new InventoryOSSBucketDestination();
        return TeaModel.build(map, self);
    }

    public InventoryOSSBucketDestination setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public InventoryOSSBucketDestination setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public InventoryOSSBucketDestination setEncryption(InventoryEncryption encryption) {
        this.encryption = encryption;
        return this;
    }
    public InventoryEncryption getEncryption() {
        return this.encryption;
    }

    public InventoryOSSBucketDestination setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public InventoryOSSBucketDestination setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public InventoryOSSBucketDestination setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

}
