// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateGatewayFileShareRequest extends TeaModel {
    @NameInMap("AccessBasedEnumeration")
    public Boolean accessBasedEnumeration;

    @NameInMap("BackendLimit")
    public Integer backendLimit;

    @NameInMap("Browsable")
    public Boolean browsable;

    @NameInMap("BypassCacheRead")
    public Boolean bypassCacheRead;

    @NameInMap("CacheMode")
    public String cacheMode;

    @NameInMap("ClientSideCmk")
    public String clientSideCmk;

    @NameInMap("ClientSideEncryption")
    public Boolean clientSideEncryption;

    @NameInMap("DirectIO")
    public Boolean directIO;

    @NameInMap("DownloadLimit")
    public Integer downloadLimit;

    @NameInMap("FastReclaim")
    public Boolean fastReclaim;

    @NameInMap("FrontendLimit")
    public Integer frontendLimit;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IgnoreDelete")
    public Boolean ignoreDelete;

    @NameInMap("InPlace")
    public Boolean inPlace;

    @NameInMap("KmsRotatePeriod")
    public Long kmsRotatePeriod;

    @NameInMap("LagPeriod")
    public Long lagPeriod;

    @NameInMap("LocalFilePath")
    public String localFilePath;

    @NameInMap("Name")
    public String name;

    @NameInMap("NfsV4Optimization")
    public Boolean nfsV4Optimization;

    @NameInMap("OssBucketName")
    public String ossBucketName;

    @NameInMap("OssBucketSsl")
    public Boolean ossBucketSsl;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("PartialSyncPaths")
    public String partialSyncPaths;

    @NameInMap("PathPrefix")
    public String pathPrefix;

    @NameInMap("PollingInterval")
    public Integer pollingInterval;

    @NameInMap("ReadOnlyClientList")
    public String readOnlyClientList;

    @NameInMap("ReadOnlyUserList")
    public String readOnlyUserList;

    @NameInMap("ReadWriteClientList")
    public String readWriteClientList;

    @NameInMap("ReadWriteUserList")
    public String readWriteUserList;

    @NameInMap("RemoteSync")
    public Boolean remoteSync;

    @NameInMap("RemoteSyncDownload")
    public Boolean remoteSyncDownload;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerSideAlgorithm")
    public String serverSideAlgorithm;

    @NameInMap("ServerSideCmk")
    public String serverSideCmk;

    @NameInMap("ServerSideEncryption")
    public Boolean serverSideEncryption;

    @NameInMap("ShareProtocol")
    public String shareProtocol;

    @NameInMap("Squash")
    public String squash;

    @NameInMap("SupportArchive")
    public Boolean supportArchive;

    @NameInMap("TransferAcceleration")
    public Boolean transferAcceleration;

    @NameInMap("WindowsAcl")
    public Boolean windowsAcl;

    public static CreateGatewayFileShareRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayFileShareRequest self = new CreateGatewayFileShareRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayFileShareRequest setAccessBasedEnumeration(Boolean accessBasedEnumeration) {
        this.accessBasedEnumeration = accessBasedEnumeration;
        return this;
    }
    public Boolean getAccessBasedEnumeration() {
        return this.accessBasedEnumeration;
    }

    public CreateGatewayFileShareRequest setBackendLimit(Integer backendLimit) {
        this.backendLimit = backendLimit;
        return this;
    }
    public Integer getBackendLimit() {
        return this.backendLimit;
    }

    public CreateGatewayFileShareRequest setBrowsable(Boolean browsable) {
        this.browsable = browsable;
        return this;
    }
    public Boolean getBrowsable() {
        return this.browsable;
    }

    public CreateGatewayFileShareRequest setBypassCacheRead(Boolean bypassCacheRead) {
        this.bypassCacheRead = bypassCacheRead;
        return this;
    }
    public Boolean getBypassCacheRead() {
        return this.bypassCacheRead;
    }

    public CreateGatewayFileShareRequest setCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
        return this;
    }
    public String getCacheMode() {
        return this.cacheMode;
    }

    public CreateGatewayFileShareRequest setClientSideCmk(String clientSideCmk) {
        this.clientSideCmk = clientSideCmk;
        return this;
    }
    public String getClientSideCmk() {
        return this.clientSideCmk;
    }

    public CreateGatewayFileShareRequest setClientSideEncryption(Boolean clientSideEncryption) {
        this.clientSideEncryption = clientSideEncryption;
        return this;
    }
    public Boolean getClientSideEncryption() {
        return this.clientSideEncryption;
    }

    public CreateGatewayFileShareRequest setDirectIO(Boolean directIO) {
        this.directIO = directIO;
        return this;
    }
    public Boolean getDirectIO() {
        return this.directIO;
    }

    public CreateGatewayFileShareRequest setDownloadLimit(Integer downloadLimit) {
        this.downloadLimit = downloadLimit;
        return this;
    }
    public Integer getDownloadLimit() {
        return this.downloadLimit;
    }

    public CreateGatewayFileShareRequest setFastReclaim(Boolean fastReclaim) {
        this.fastReclaim = fastReclaim;
        return this;
    }
    public Boolean getFastReclaim() {
        return this.fastReclaim;
    }

    public CreateGatewayFileShareRequest setFrontendLimit(Integer frontendLimit) {
        this.frontendLimit = frontendLimit;
        return this;
    }
    public Integer getFrontendLimit() {
        return this.frontendLimit;
    }

    public CreateGatewayFileShareRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateGatewayFileShareRequest setIgnoreDelete(Boolean ignoreDelete) {
        this.ignoreDelete = ignoreDelete;
        return this;
    }
    public Boolean getIgnoreDelete() {
        return this.ignoreDelete;
    }

    public CreateGatewayFileShareRequest setInPlace(Boolean inPlace) {
        this.inPlace = inPlace;
        return this;
    }
    public Boolean getInPlace() {
        return this.inPlace;
    }

    public CreateGatewayFileShareRequest setKmsRotatePeriod(Long kmsRotatePeriod) {
        this.kmsRotatePeriod = kmsRotatePeriod;
        return this;
    }
    public Long getKmsRotatePeriod() {
        return this.kmsRotatePeriod;
    }

    public CreateGatewayFileShareRequest setLagPeriod(Long lagPeriod) {
        this.lagPeriod = lagPeriod;
        return this;
    }
    public Long getLagPeriod() {
        return this.lagPeriod;
    }

    public CreateGatewayFileShareRequest setLocalFilePath(String localFilePath) {
        this.localFilePath = localFilePath;
        return this;
    }
    public String getLocalFilePath() {
        return this.localFilePath;
    }

    public CreateGatewayFileShareRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGatewayFileShareRequest setNfsV4Optimization(Boolean nfsV4Optimization) {
        this.nfsV4Optimization = nfsV4Optimization;
        return this;
    }
    public Boolean getNfsV4Optimization() {
        return this.nfsV4Optimization;
    }

    public CreateGatewayFileShareRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CreateGatewayFileShareRequest setOssBucketSsl(Boolean ossBucketSsl) {
        this.ossBucketSsl = ossBucketSsl;
        return this;
    }
    public Boolean getOssBucketSsl() {
        return this.ossBucketSsl;
    }

    public CreateGatewayFileShareRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public CreateGatewayFileShareRequest setPartialSyncPaths(String partialSyncPaths) {
        this.partialSyncPaths = partialSyncPaths;
        return this;
    }
    public String getPartialSyncPaths() {
        return this.partialSyncPaths;
    }

    public CreateGatewayFileShareRequest setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    public CreateGatewayFileShareRequest setPollingInterval(Integer pollingInterval) {
        this.pollingInterval = pollingInterval;
        return this;
    }
    public Integer getPollingInterval() {
        return this.pollingInterval;
    }

    public CreateGatewayFileShareRequest setReadOnlyClientList(String readOnlyClientList) {
        this.readOnlyClientList = readOnlyClientList;
        return this;
    }
    public String getReadOnlyClientList() {
        return this.readOnlyClientList;
    }

    public CreateGatewayFileShareRequest setReadOnlyUserList(String readOnlyUserList) {
        this.readOnlyUserList = readOnlyUserList;
        return this;
    }
    public String getReadOnlyUserList() {
        return this.readOnlyUserList;
    }

    public CreateGatewayFileShareRequest setReadWriteClientList(String readWriteClientList) {
        this.readWriteClientList = readWriteClientList;
        return this;
    }
    public String getReadWriteClientList() {
        return this.readWriteClientList;
    }

    public CreateGatewayFileShareRequest setReadWriteUserList(String readWriteUserList) {
        this.readWriteUserList = readWriteUserList;
        return this;
    }
    public String getReadWriteUserList() {
        return this.readWriteUserList;
    }

    public CreateGatewayFileShareRequest setRemoteSync(Boolean remoteSync) {
        this.remoteSync = remoteSync;
        return this;
    }
    public Boolean getRemoteSync() {
        return this.remoteSync;
    }

    public CreateGatewayFileShareRequest setRemoteSyncDownload(Boolean remoteSyncDownload) {
        this.remoteSyncDownload = remoteSyncDownload;
        return this;
    }
    public Boolean getRemoteSyncDownload() {
        return this.remoteSyncDownload;
    }

    public CreateGatewayFileShareRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateGatewayFileShareRequest setServerSideAlgorithm(String serverSideAlgorithm) {
        this.serverSideAlgorithm = serverSideAlgorithm;
        return this;
    }
    public String getServerSideAlgorithm() {
        return this.serverSideAlgorithm;
    }

    public CreateGatewayFileShareRequest setServerSideCmk(String serverSideCmk) {
        this.serverSideCmk = serverSideCmk;
        return this;
    }
    public String getServerSideCmk() {
        return this.serverSideCmk;
    }

    public CreateGatewayFileShareRequest setServerSideEncryption(Boolean serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
        return this;
    }
    public Boolean getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    public CreateGatewayFileShareRequest setShareProtocol(String shareProtocol) {
        this.shareProtocol = shareProtocol;
        return this;
    }
    public String getShareProtocol() {
        return this.shareProtocol;
    }

    public CreateGatewayFileShareRequest setSquash(String squash) {
        this.squash = squash;
        return this;
    }
    public String getSquash() {
        return this.squash;
    }

    public CreateGatewayFileShareRequest setSupportArchive(Boolean supportArchive) {
        this.supportArchive = supportArchive;
        return this;
    }
    public Boolean getSupportArchive() {
        return this.supportArchive;
    }

    public CreateGatewayFileShareRequest setTransferAcceleration(Boolean transferAcceleration) {
        this.transferAcceleration = transferAcceleration;
        return this;
    }
    public Boolean getTransferAcceleration() {
        return this.transferAcceleration;
    }

    public CreateGatewayFileShareRequest setWindowsAcl(Boolean windowsAcl) {
        this.windowsAcl = windowsAcl;
        return this;
    }
    public Boolean getWindowsAcl() {
        return this.windowsAcl;
    }

}
