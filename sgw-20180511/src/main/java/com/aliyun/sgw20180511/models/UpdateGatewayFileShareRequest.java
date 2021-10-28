// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class UpdateGatewayFileShareRequest extends TeaModel {
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

    @NameInMap("IndexId")
    public String indexId;

    @NameInMap("KmsRotatePeriod")
    public Long kmsRotatePeriod;

    @NameInMap("LagPeriod")
    public Long lagPeriod;

    @NameInMap("Name")
    public String name;

    @NameInMap("NfsV4Optimization")
    public Boolean nfsV4Optimization;

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

    @NameInMap("ServerSideCmk")
    public String serverSideCmk;

    @NameInMap("ServerSideEncryption")
    public Boolean serverSideEncryption;

    @NameInMap("Squash")
    public String squash;

    @NameInMap("TransferAcceleration")
    public Boolean transferAcceleration;

    @NameInMap("WindowsAcl")
    public Boolean windowsAcl;

    public static UpdateGatewayFileShareRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayFileShareRequest self = new UpdateGatewayFileShareRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayFileShareRequest setAccessBasedEnumeration(Boolean accessBasedEnumeration) {
        this.accessBasedEnumeration = accessBasedEnumeration;
        return this;
    }
    public Boolean getAccessBasedEnumeration() {
        return this.accessBasedEnumeration;
    }

    public UpdateGatewayFileShareRequest setBackendLimit(Integer backendLimit) {
        this.backendLimit = backendLimit;
        return this;
    }
    public Integer getBackendLimit() {
        return this.backendLimit;
    }

    public UpdateGatewayFileShareRequest setBrowsable(Boolean browsable) {
        this.browsable = browsable;
        return this;
    }
    public Boolean getBrowsable() {
        return this.browsable;
    }

    public UpdateGatewayFileShareRequest setBypassCacheRead(Boolean bypassCacheRead) {
        this.bypassCacheRead = bypassCacheRead;
        return this;
    }
    public Boolean getBypassCacheRead() {
        return this.bypassCacheRead;
    }

    public UpdateGatewayFileShareRequest setCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
        return this;
    }
    public String getCacheMode() {
        return this.cacheMode;
    }

    public UpdateGatewayFileShareRequest setClientSideCmk(String clientSideCmk) {
        this.clientSideCmk = clientSideCmk;
        return this;
    }
    public String getClientSideCmk() {
        return this.clientSideCmk;
    }

    public UpdateGatewayFileShareRequest setClientSideEncryption(Boolean clientSideEncryption) {
        this.clientSideEncryption = clientSideEncryption;
        return this;
    }
    public Boolean getClientSideEncryption() {
        return this.clientSideEncryption;
    }

    public UpdateGatewayFileShareRequest setDirectIO(Boolean directIO) {
        this.directIO = directIO;
        return this;
    }
    public Boolean getDirectIO() {
        return this.directIO;
    }

    public UpdateGatewayFileShareRequest setDownloadLimit(Integer downloadLimit) {
        this.downloadLimit = downloadLimit;
        return this;
    }
    public Integer getDownloadLimit() {
        return this.downloadLimit;
    }

    public UpdateGatewayFileShareRequest setFastReclaim(Boolean fastReclaim) {
        this.fastReclaim = fastReclaim;
        return this;
    }
    public Boolean getFastReclaim() {
        return this.fastReclaim;
    }

    public UpdateGatewayFileShareRequest setFrontendLimit(Integer frontendLimit) {
        this.frontendLimit = frontendLimit;
        return this;
    }
    public Integer getFrontendLimit() {
        return this.frontendLimit;
    }

    public UpdateGatewayFileShareRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayFileShareRequest setIgnoreDelete(Boolean ignoreDelete) {
        this.ignoreDelete = ignoreDelete;
        return this;
    }
    public Boolean getIgnoreDelete() {
        return this.ignoreDelete;
    }

    public UpdateGatewayFileShareRequest setInPlace(Boolean inPlace) {
        this.inPlace = inPlace;
        return this;
    }
    public Boolean getInPlace() {
        return this.inPlace;
    }

    public UpdateGatewayFileShareRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public UpdateGatewayFileShareRequest setKmsRotatePeriod(Long kmsRotatePeriod) {
        this.kmsRotatePeriod = kmsRotatePeriod;
        return this;
    }
    public Long getKmsRotatePeriod() {
        return this.kmsRotatePeriod;
    }

    public UpdateGatewayFileShareRequest setLagPeriod(Long lagPeriod) {
        this.lagPeriod = lagPeriod;
        return this;
    }
    public Long getLagPeriod() {
        return this.lagPeriod;
    }

    public UpdateGatewayFileShareRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGatewayFileShareRequest setNfsV4Optimization(Boolean nfsV4Optimization) {
        this.nfsV4Optimization = nfsV4Optimization;
        return this;
    }
    public Boolean getNfsV4Optimization() {
        return this.nfsV4Optimization;
    }

    public UpdateGatewayFileShareRequest setPollingInterval(Integer pollingInterval) {
        this.pollingInterval = pollingInterval;
        return this;
    }
    public Integer getPollingInterval() {
        return this.pollingInterval;
    }

    public UpdateGatewayFileShareRequest setReadOnlyClientList(String readOnlyClientList) {
        this.readOnlyClientList = readOnlyClientList;
        return this;
    }
    public String getReadOnlyClientList() {
        return this.readOnlyClientList;
    }

    public UpdateGatewayFileShareRequest setReadOnlyUserList(String readOnlyUserList) {
        this.readOnlyUserList = readOnlyUserList;
        return this;
    }
    public String getReadOnlyUserList() {
        return this.readOnlyUserList;
    }

    public UpdateGatewayFileShareRequest setReadWriteClientList(String readWriteClientList) {
        this.readWriteClientList = readWriteClientList;
        return this;
    }
    public String getReadWriteClientList() {
        return this.readWriteClientList;
    }

    public UpdateGatewayFileShareRequest setReadWriteUserList(String readWriteUserList) {
        this.readWriteUserList = readWriteUserList;
        return this;
    }
    public String getReadWriteUserList() {
        return this.readWriteUserList;
    }

    public UpdateGatewayFileShareRequest setRemoteSync(Boolean remoteSync) {
        this.remoteSync = remoteSync;
        return this;
    }
    public Boolean getRemoteSync() {
        return this.remoteSync;
    }

    public UpdateGatewayFileShareRequest setRemoteSyncDownload(Boolean remoteSyncDownload) {
        this.remoteSyncDownload = remoteSyncDownload;
        return this;
    }
    public Boolean getRemoteSyncDownload() {
        return this.remoteSyncDownload;
    }

    public UpdateGatewayFileShareRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdateGatewayFileShareRequest setServerSideCmk(String serverSideCmk) {
        this.serverSideCmk = serverSideCmk;
        return this;
    }
    public String getServerSideCmk() {
        return this.serverSideCmk;
    }

    public UpdateGatewayFileShareRequest setServerSideEncryption(Boolean serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
        return this;
    }
    public Boolean getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    public UpdateGatewayFileShareRequest setSquash(String squash) {
        this.squash = squash;
        return this;
    }
    public String getSquash() {
        return this.squash;
    }

    public UpdateGatewayFileShareRequest setTransferAcceleration(Boolean transferAcceleration) {
        this.transferAcceleration = transferAcceleration;
        return this;
    }
    public Boolean getTransferAcceleration() {
        return this.transferAcceleration;
    }

    public UpdateGatewayFileShareRequest setWindowsAcl(Boolean windowsAcl) {
        this.windowsAcl = windowsAcl;
        return this;
    }
    public Boolean getWindowsAcl() {
        return this.windowsAcl;
    }

}
