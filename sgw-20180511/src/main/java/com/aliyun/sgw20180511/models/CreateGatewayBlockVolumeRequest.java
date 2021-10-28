// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateGatewayBlockVolumeRequest extends TeaModel {
    @NameInMap("CacheMode")
    public String cacheMode;

    @NameInMap("ChapEnabled")
    public Boolean chapEnabled;

    @NameInMap("ChapInPassword")
    public String chapInPassword;

    @NameInMap("ChapInUser")
    public String chapInUser;

    @NameInMap("ChunkSize")
    public Integer chunkSize;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("LocalFilePath")
    public String localFilePath;

    @NameInMap("Name")
    public String name;

    @NameInMap("OssBucketName")
    public String ossBucketName;

    @NameInMap("OssBucketSsl")
    public Boolean ossBucketSsl;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("Recovery")
    public Boolean recovery;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Size")
    public Long size;

    @NameInMap("VolumeProtocol")
    public String volumeProtocol;

    public static CreateGatewayBlockVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayBlockVolumeRequest self = new CreateGatewayBlockVolumeRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayBlockVolumeRequest setCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
        return this;
    }
    public String getCacheMode() {
        return this.cacheMode;
    }

    public CreateGatewayBlockVolumeRequest setChapEnabled(Boolean chapEnabled) {
        this.chapEnabled = chapEnabled;
        return this;
    }
    public Boolean getChapEnabled() {
        return this.chapEnabled;
    }

    public CreateGatewayBlockVolumeRequest setChapInPassword(String chapInPassword) {
        this.chapInPassword = chapInPassword;
        return this;
    }
    public String getChapInPassword() {
        return this.chapInPassword;
    }

    public CreateGatewayBlockVolumeRequest setChapInUser(String chapInUser) {
        this.chapInUser = chapInUser;
        return this;
    }
    public String getChapInUser() {
        return this.chapInUser;
    }

    public CreateGatewayBlockVolumeRequest setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    public CreateGatewayBlockVolumeRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateGatewayBlockVolumeRequest setLocalFilePath(String localFilePath) {
        this.localFilePath = localFilePath;
        return this;
    }
    public String getLocalFilePath() {
        return this.localFilePath;
    }

    public CreateGatewayBlockVolumeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGatewayBlockVolumeRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CreateGatewayBlockVolumeRequest setOssBucketSsl(Boolean ossBucketSsl) {
        this.ossBucketSsl = ossBucketSsl;
        return this;
    }
    public Boolean getOssBucketSsl() {
        return this.ossBucketSsl;
    }

    public CreateGatewayBlockVolumeRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public CreateGatewayBlockVolumeRequest setRecovery(Boolean recovery) {
        this.recovery = recovery;
        return this;
    }
    public Boolean getRecovery() {
        return this.recovery;
    }

    public CreateGatewayBlockVolumeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateGatewayBlockVolumeRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public CreateGatewayBlockVolumeRequest setVolumeProtocol(String volumeProtocol) {
        this.volumeProtocol = volumeProtocol;
        return this;
    }
    public String getVolumeProtocol() {
        return this.volumeProtocol;
    }

}
