// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyPolarFsMappingAuthRequest extends TeaModel {
    /**
     * <p>The bucket name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-xxx.oss-[regionId]-internal.aliyuncs.com</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>The AccessKey ID for the storage bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("BucketAccessKeyId")
    public String bucketAccessKeyId;

    /**
     * <p>The AccessKey secret for the storage bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("BucketAccessKeySecret")
    public String bucketAccessKeySecret;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query information about all clusters in a specified region, including the cluster ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pc-******************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The destination path.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The PolarFS instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    public static ModifyPolarFsMappingAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolarFsMappingAuthRequest self = new ModifyPolarFsMappingAuthRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolarFsMappingAuthRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public ModifyPolarFsMappingAuthRequest setBucketAccessKeyId(String bucketAccessKeyId) {
        this.bucketAccessKeyId = bucketAccessKeyId;
        return this;
    }
    public String getBucketAccessKeyId() {
        return this.bucketAccessKeyId;
    }

    public ModifyPolarFsMappingAuthRequest setBucketAccessKeySecret(String bucketAccessKeySecret) {
        this.bucketAccessKeySecret = bucketAccessKeySecret;
        return this;
    }
    public String getBucketAccessKeySecret() {
        return this.bucketAccessKeySecret;
    }

    public ModifyPolarFsMappingAuthRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyPolarFsMappingAuthRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ModifyPolarFsMappingAuthRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

}
