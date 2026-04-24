// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarFsPathMappingRequest extends TeaModel {
    @NameInMap("CustomBucketPathList")
    public java.util.List<DeletePolarFsPathMappingRequestCustomBucketPathList> customBucketPathList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    public static DeletePolarFsPathMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarFsPathMappingRequest self = new DeletePolarFsPathMappingRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolarFsPathMappingRequest setCustomBucketPathList(java.util.List<DeletePolarFsPathMappingRequestCustomBucketPathList> customBucketPathList) {
        this.customBucketPathList = customBucketPathList;
        return this;
    }
    public java.util.List<DeletePolarFsPathMappingRequestCustomBucketPathList> getCustomBucketPathList() {
        return this.customBucketPathList;
    }

    public DeletePolarFsPathMappingRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeletePolarFsPathMappingRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public static class DeletePolarFsPathMappingRequestCustomBucketPathList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <strong>example:</strong>
         * <p>/data</p>
         */
        @NameInMap("Path")
        public String path;

        public static DeletePolarFsPathMappingRequestCustomBucketPathList build(java.util.Map<String, ?> map) throws Exception {
            DeletePolarFsPathMappingRequestCustomBucketPathList self = new DeletePolarFsPathMappingRequestCustomBucketPathList();
            return TeaModel.build(map, self);
        }

        public DeletePolarFsPathMappingRequestCustomBucketPathList setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DeletePolarFsPathMappingRequestCustomBucketPathList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
