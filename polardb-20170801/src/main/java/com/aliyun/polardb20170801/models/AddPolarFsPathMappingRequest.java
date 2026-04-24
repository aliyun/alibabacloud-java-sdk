// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddPolarFsPathMappingRequest extends TeaModel {
    @NameInMap("CustomBucketPathList")
    public java.util.List<AddPolarFsPathMappingRequestCustomBucketPathList> customBucketPathList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
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
         * <strong>example:</strong>
         * <p>Bucket1</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
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

        public AddPolarFsPathMappingRequestCustomBucketPathList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
