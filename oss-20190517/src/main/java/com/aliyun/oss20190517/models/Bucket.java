// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class Bucket extends TeaModel {
    // The time when the bucket is created.
    @NameInMap("CreationDate")
    public String creationDate;

    // The public endpoint used to access the bucket over the Internet.
    @NameInMap("ExtranetEndpoint")
    public String extranetEndpoint;

    // The internal endpoint used to access the bucket from ECS instances in the same region.
    @NameInMap("IntranetEndpoint")
    public String intranetEndpoint;

    // The data center in which the bucket is located.
    @NameInMap("Location")
    public String location;

    // The name of the bucket.
    @NameInMap("Name")
    public String name;

    // The physical location of the bucket.
    @NameInMap("Region")
    public String region;

    @NameInMap("StorageClass")
    public String storageClass;

    public static Bucket build(java.util.Map<String, ?> map) throws Exception {
        Bucket self = new Bucket();
        return TeaModel.build(map, self);
    }

    public Bucket setCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }
    public String getCreationDate() {
        return this.creationDate;
    }

    public Bucket setExtranetEndpoint(String extranetEndpoint) {
        this.extranetEndpoint = extranetEndpoint;
        return this;
    }
    public String getExtranetEndpoint() {
        return this.extranetEndpoint;
    }

    public Bucket setIntranetEndpoint(String intranetEndpoint) {
        this.intranetEndpoint = intranetEndpoint;
        return this;
    }
    public String getIntranetEndpoint() {
        return this.intranetEndpoint;
    }

    public Bucket setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public Bucket setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Bucket setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public Bucket setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

}
