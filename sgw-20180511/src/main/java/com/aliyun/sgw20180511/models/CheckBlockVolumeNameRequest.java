// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckBlockVolumeNameRequest extends TeaModel {
    /**
     * <p>Bucket Endpoint。</p>
     */
    @NameInMap("BucketEndpoint")
    public String bucketEndpoint;

    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("VolumeName")
    public String volumeName;

    public static CheckBlockVolumeNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckBlockVolumeNameRequest self = new CheckBlockVolumeNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckBlockVolumeNameRequest setBucketEndpoint(String bucketEndpoint) {
        this.bucketEndpoint = bucketEndpoint;
        return this;
    }
    public String getBucketEndpoint() {
        return this.bucketEndpoint;
    }

    public CheckBlockVolumeNameRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public CheckBlockVolumeNameRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CheckBlockVolumeNameRequest setVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }
    public String getVolumeName() {
        return this.volumeName;
    }

}
