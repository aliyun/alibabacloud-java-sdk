// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class BucketInfo extends TeaModel {
    @NameInMap("Bucket")
    public Bucket bucket;

    public static BucketInfo build(java.util.Map<String, ?> map) throws Exception {
        BucketInfo self = new BucketInfo();
        return TeaModel.build(map, self);
    }

    public BucketInfo setBucket(Bucket bucket) {
        this.bucket = bucket;
        return this;
    }
    public Bucket getBucket() {
        return this.bucket;
    }

    public static class ServerSideEncryptionRule extends TeaModel {
        @NameInMap("KMSDataEncryption")
        public String KMSDataEncryption;

        @NameInMap("KMSMasterKeyID")
        public String KMSMasterKeyID;

        @NameInMap("SSEAlgorithm")
        public String SSEAlgorithm;

        public static ServerSideEncryptionRule build(java.util.Map<String, ?> map) throws Exception {
            ServerSideEncryptionRule self = new ServerSideEncryptionRule();
            return TeaModel.build(map, self);
        }

        public ServerSideEncryptionRule setKMSDataEncryption(String KMSDataEncryption) {
            this.KMSDataEncryption = KMSDataEncryption;
            return this;
        }
        public String getKMSDataEncryption() {
            return this.KMSDataEncryption;
        }

        public ServerSideEncryptionRule setKMSMasterKeyID(String KMSMasterKeyID) {
            this.KMSMasterKeyID = KMSMasterKeyID;
            return this;
        }
        public String getKMSMasterKeyID() {
            return this.KMSMasterKeyID;
        }

        public ServerSideEncryptionRule setSSEAlgorithm(String SSEAlgorithm) {
            this.SSEAlgorithm = SSEAlgorithm;
            return this;
        }
        public String getSSEAlgorithm() {
            return this.SSEAlgorithm;
        }

    }

    public static class Bucket extends TeaModel {
        @NameInMap("AccessControlList")
        public AccessControlList accessControlList;

        @NameInMap("AccessMonitor")
        public String accessMonitor;

        @NameInMap("BucketPolicy")
        public LoggingEnabled bucketPolicy;

        @NameInMap("CreationDate")
        public String creationDate;

        @NameInMap("CrossRegionReplication")
        public String crossRegionReplication;

        @NameInMap("DataRedundancyType")
        public String dataRedundancyType;

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

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ServerSideEncryptionRule")
        public ServerSideEncryptionRule serverSideEncryptionRule;

        @NameInMap("StorageClass")
        public String storageClass;

        @NameInMap("TransferAcceleration")
        public String transferAcceleration;

        @NameInMap("Versioning")
        public String versioning;

        public static Bucket build(java.util.Map<String, ?> map) throws Exception {
            Bucket self = new Bucket();
            return TeaModel.build(map, self);
        }

        public Bucket setAccessControlList(AccessControlList accessControlList) {
            this.accessControlList = accessControlList;
            return this;
        }
        public AccessControlList getAccessControlList() {
            return this.accessControlList;
        }

        public Bucket setAccessMonitor(String accessMonitor) {
            this.accessMonitor = accessMonitor;
            return this;
        }
        public String getAccessMonitor() {
            return this.accessMonitor;
        }

        public Bucket setBucketPolicy(LoggingEnabled bucketPolicy) {
            this.bucketPolicy = bucketPolicy;
            return this;
        }
        public LoggingEnabled getBucketPolicy() {
            return this.bucketPolicy;
        }

        public Bucket setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public String getCreationDate() {
            return this.creationDate;
        }

        public Bucket setCrossRegionReplication(String crossRegionReplication) {
            this.crossRegionReplication = crossRegionReplication;
            return this;
        }
        public String getCrossRegionReplication() {
            return this.crossRegionReplication;
        }

        public Bucket setDataRedundancyType(String dataRedundancyType) {
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }
        public String getDataRedundancyType() {
            return this.dataRedundancyType;
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

        public Bucket setOwner(Owner owner) {
            this.owner = owner;
            return this;
        }
        public Owner getOwner() {
            return this.owner;
        }

        public Bucket setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public Bucket setServerSideEncryptionRule(ServerSideEncryptionRule serverSideEncryptionRule) {
            this.serverSideEncryptionRule = serverSideEncryptionRule;
            return this;
        }
        public ServerSideEncryptionRule getServerSideEncryptionRule() {
            return this.serverSideEncryptionRule;
        }

        public Bucket setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public Bucket setTransferAcceleration(String transferAcceleration) {
            this.transferAcceleration = transferAcceleration;
            return this;
        }
        public String getTransferAcceleration() {
            return this.transferAcceleration;
        }

        public Bucket setVersioning(String versioning) {
            this.versioning = versioning;
            return this;
        }
        public String getVersioning() {
            return this.versioning;
        }

    }

}
