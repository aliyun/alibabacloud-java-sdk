// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class BucketAntiDDOSInfo extends TeaModel {
    @NameInMap("ActiveTime")
    public Long activeTime;

    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("Cnames")
    public Cnames cnames;

    @NameInMap("Ctime")
    public Long ctime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mtime")
    public Long mtime;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    public static BucketAntiDDOSInfo build(java.util.Map<String, ?> map) throws Exception {
        BucketAntiDDOSInfo self = new BucketAntiDDOSInfo();
        return TeaModel.build(map, self);
    }

    public BucketAntiDDOSInfo setActiveTime(Long activeTime) {
        this.activeTime = activeTime;
        return this;
    }
    public Long getActiveTime() {
        return this.activeTime;
    }

    public BucketAntiDDOSInfo setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public BucketAntiDDOSInfo setCnames(Cnames cnames) {
        this.cnames = cnames;
        return this;
    }
    public Cnames getCnames() {
        return this.cnames;
    }

    public BucketAntiDDOSInfo setCtime(Long ctime) {
        this.ctime = ctime;
        return this;
    }
    public Long getCtime() {
        return this.ctime;
    }

    public BucketAntiDDOSInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BucketAntiDDOSInfo setMtime(Long mtime) {
        this.mtime = mtime;
        return this;
    }
    public Long getMtime() {
        return this.mtime;
    }

    public BucketAntiDDOSInfo setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public BucketAntiDDOSInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BucketAntiDDOSInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class Cnames extends TeaModel {
        @NameInMap("Domain")
        public java.util.List<String> domain;

        public static Cnames build(java.util.Map<String, ?> map) throws Exception {
            Cnames self = new Cnames();
            return TeaModel.build(map, self);
        }

        public Cnames setDomain(java.util.List<String> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<String> getDomain() {
            return this.domain;
        }

    }

}
