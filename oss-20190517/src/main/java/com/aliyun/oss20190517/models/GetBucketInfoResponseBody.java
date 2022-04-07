// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketInfoResponseBody extends TeaModel {
    @NameInMap("Bucket")
    public BucketInfo bucketInfo;

    public static GetBucketInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketInfoResponseBody self = new GetBucketInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketInfoResponseBody setBucketInfo(BucketInfo bucketInfo) {
        this.bucketInfo = bucketInfo;
        return this;
    }
    public BucketInfo getBucketInfo() {
        return this.bucketInfo;
    }

    public static class AccessControlList extends TeaModel {
        @NameInMap("Grant")
        public String grant;

        public static AccessControlList build(java.util.Map<String, ?> map) throws Exception {
            AccessControlList self = new AccessControlList();
            return TeaModel.build(map, self);
        }

        public AccessControlList setGrant(String grant) {
            this.grant = grant;
            return this;
        }
        public String getGrant() {
            return this.grant;
        }

    }

    public static class BucketInfo extends TeaModel {
        @NameInMap("AccessControlList")
        public AccessControlList accessControlList;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("CreationDate")
        public String creationDate;

        @NameInMap("CrossRegionReplication")
        public String crossRegionReplication;

        @NameInMap("ExtranetEndpoint")
        public String extranetEndpoint;

        @NameInMap("IntranetEndpoint")
        public String intranetEndpoint;

        @NameInMap("Location")
        public String location;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public Owner owner;

        @NameInMap("StorageClass")
        public String storageClass;

        @NameInMap("TransferAcceleration")
        public String transferAcceleration;

        public static BucketInfo build(java.util.Map<String, ?> map) throws Exception {
            BucketInfo self = new BucketInfo();
            return TeaModel.build(map, self);
        }

        public BucketInfo setAccessControlList(AccessControlList accessControlList) {
            this.accessControlList = accessControlList;
            return this;
        }
        public AccessControlList getAccessControlList() {
            return this.accessControlList;
        }

        public BucketInfo setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public BucketInfo setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public String getCreationDate() {
            return this.creationDate;
        }

        public BucketInfo setCrossRegionReplication(String crossRegionReplication) {
            this.crossRegionReplication = crossRegionReplication;
            return this;
        }
        public String getCrossRegionReplication() {
            return this.crossRegionReplication;
        }

        public BucketInfo setExtranetEndpoint(String extranetEndpoint) {
            this.extranetEndpoint = extranetEndpoint;
            return this;
        }
        public String getExtranetEndpoint() {
            return this.extranetEndpoint;
        }

        public BucketInfo setIntranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        public BucketInfo setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public BucketInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BucketInfo setOwner(Owner owner) {
            this.owner = owner;
            return this;
        }
        public Owner getOwner() {
            return this.owner;
        }

        public BucketInfo setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public BucketInfo setTransferAcceleration(String transferAcceleration) {
            this.transferAcceleration = transferAcceleration;
            return this;
        }
        public String getTransferAcceleration() {
            return this.transferAcceleration;
        }

    }

}
