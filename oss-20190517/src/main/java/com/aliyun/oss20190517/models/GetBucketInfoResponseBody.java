// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketInfoResponseBody extends TeaModel {
    @NameInMap("Bucket")
    public GetBucketInfoResponseBodyBucketInfo bucketInfo;

    public static GetBucketInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketInfoResponseBody self = new GetBucketInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketInfoResponseBody setBucketInfo(GetBucketInfoResponseBodyBucketInfo bucketInfo) {
        this.bucketInfo = bucketInfo;
        return this;
    }
    public GetBucketInfoResponseBodyBucketInfo getBucketInfo() {
        return this.bucketInfo;
    }

    public static class GetBucketInfoResponseBodyBucketInfoAccessControlList extends TeaModel {
        @NameInMap("Grant")
        public String grant;

        public static GetBucketInfoResponseBodyBucketInfoAccessControlList build(java.util.Map<String, ?> map) throws Exception {
            GetBucketInfoResponseBodyBucketInfoAccessControlList self = new GetBucketInfoResponseBodyBucketInfoAccessControlList();
            return TeaModel.build(map, self);
        }

        public GetBucketInfoResponseBodyBucketInfoAccessControlList setGrant(String grant) {
            this.grant = grant;
            return this;
        }
        public String getGrant() {
            return this.grant;
        }

    }

    public static class GetBucketInfoResponseBodyBucketInfo extends TeaModel {
        @NameInMap("AccessControlList")
        public GetBucketInfoResponseBodyBucketInfoAccessControlList accessControlList;

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

        public static GetBucketInfoResponseBodyBucketInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBucketInfoResponseBodyBucketInfo self = new GetBucketInfoResponseBodyBucketInfo();
            return TeaModel.build(map, self);
        }

        public GetBucketInfoResponseBodyBucketInfo setAccessControlList(GetBucketInfoResponseBodyBucketInfoAccessControlList accessControlList) {
            this.accessControlList = accessControlList;
            return this;
        }
        public GetBucketInfoResponseBodyBucketInfoAccessControlList getAccessControlList() {
            return this.accessControlList;
        }

        public GetBucketInfoResponseBodyBucketInfo setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetBucketInfoResponseBodyBucketInfo setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public String getCreationDate() {
            return this.creationDate;
        }

        public GetBucketInfoResponseBodyBucketInfo setCrossRegionReplication(String crossRegionReplication) {
            this.crossRegionReplication = crossRegionReplication;
            return this;
        }
        public String getCrossRegionReplication() {
            return this.crossRegionReplication;
        }

        public GetBucketInfoResponseBodyBucketInfo setExtranetEndpoint(String extranetEndpoint) {
            this.extranetEndpoint = extranetEndpoint;
            return this;
        }
        public String getExtranetEndpoint() {
            return this.extranetEndpoint;
        }

        public GetBucketInfoResponseBodyBucketInfo setIntranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        public GetBucketInfoResponseBodyBucketInfo setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetBucketInfoResponseBodyBucketInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBucketInfoResponseBodyBucketInfo setOwner(Owner owner) {
            this.owner = owner;
            return this;
        }
        public Owner getOwner() {
            return this.owner;
        }

        public GetBucketInfoResponseBodyBucketInfo setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public GetBucketInfoResponseBodyBucketInfo setTransferAcceleration(String transferAcceleration) {
            this.transferAcceleration = transferAcceleration;
            return this;
        }
        public String getTransferAcceleration() {
            return this.transferAcceleration;
        }

    }

}
