// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddPolarFsPathMappingRequest extends TeaModel {
    /**
     * <p>The bucket and corresponding path information.</p>
     */
    @NameInMap("CustomBucketPathList")
    public java.util.List<AddPolarFsPathMappingRequestCustomBucketPathList> customBucketPathList;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The PolarFS instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    public static AddPolarFsPathMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPolarFsPathMappingRequest self = new AddPolarFsPathMappingRequest();
        return TeaModel.build(map, self);
    }

    public AddPolarFsPathMappingRequest setCustomBucketPathList(java.util.List<AddPolarFsPathMappingRequestCustomBucketPathList> customBucketPathList) {
        this.customBucketPathList = customBucketPathList;
        return this;
    }
    public java.util.List<AddPolarFsPathMappingRequestCustomBucketPathList> getCustomBucketPathList() {
        return this.customBucketPathList;
    }

    public AddPolarFsPathMappingRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public AddPolarFsPathMappingRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public static class AddPolarFsPathMappingRequestCustomBucketPathList extends TeaModel {
        /**
         * <p>The bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>Bucket1</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("BucketAccessKeyId")
        public String bucketAccessKeyId;

        @NameInMap("BucketAccessKeySecret")
        public String bucketAccessKeySecret;

        /**
         * <p>The custom storage path.</p>
         * 
         * <strong>example:</strong>
         * <p>/data1</p>
         */
        @NameInMap("Path")
        public String path;

        public static AddPolarFsPathMappingRequestCustomBucketPathList build(java.util.Map<String, ?> map) throws Exception {
            AddPolarFsPathMappingRequestCustomBucketPathList self = new AddPolarFsPathMappingRequestCustomBucketPathList();
            return TeaModel.build(map, self);
        }

        public AddPolarFsPathMappingRequestCustomBucketPathList setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public AddPolarFsPathMappingRequestCustomBucketPathList setBucketAccessKeyId(String bucketAccessKeyId) {
            this.bucketAccessKeyId = bucketAccessKeyId;
            return this;
        }
        public String getBucketAccessKeyId() {
            return this.bucketAccessKeyId;
        }

        public AddPolarFsPathMappingRequestCustomBucketPathList setBucketAccessKeySecret(String bucketAccessKeySecret) {
            this.bucketAccessKeySecret = bucketAccessKeySecret;
            return this;
        }
        public String getBucketAccessKeySecret() {
            return this.bucketAccessKeySecret;
        }

        public AddPolarFsPathMappingRequestCustomBucketPathList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
