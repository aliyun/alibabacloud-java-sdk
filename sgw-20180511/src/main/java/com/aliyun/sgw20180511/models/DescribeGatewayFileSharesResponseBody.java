// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayFileSharesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("FileShares")
    public DescribeGatewayFileSharesResponseBodyFileShares fileShares;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewayFileSharesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayFileSharesResponseBody self = new DescribeGatewayFileSharesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayFileSharesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayFileSharesResponseBody setFileShares(DescribeGatewayFileSharesResponseBodyFileShares fileShares) {
        this.fileShares = fileShares;
        return this;
    }
    public DescribeGatewayFileSharesResponseBodyFileShares getFileShares() {
        return this.fileShares;
    }

    public DescribeGatewayFileSharesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayFileSharesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayFileSharesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeGatewayFileSharesResponseBodyFileSharesFileShare extends TeaModel {
        @NameInMap("AccessBasedEnumeration")
        public Boolean accessBasedEnumeration;

        @NameInMap("ActiveMessages")
        public Long activeMessages;

        @NameInMap("Address")
        public String address;

        @NameInMap("BeLimit")
        public Integer beLimit;

        @NameInMap("Browsable")
        public Boolean browsable;

        @NameInMap("BucketInfos")
        public String bucketInfos;

        @NameInMap("BucketsStub")
        public Boolean bucketsStub;

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

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("DownloadLimit")
        public Integer downloadLimit;

        @NameInMap("DownloadQueue")
        public Long downloadQueue;

        @NameInMap("DownloadRate")
        public Long downloadRate;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("ExpressSyncId")
        public String expressSyncId;

        @NameInMap("FastReclaim")
        public Boolean fastReclaim;

        @NameInMap("FeLimit")
        public Integer feLimit;

        @NameInMap("FileNumLimit")
        public Long fileNumLimit;

        @NameInMap("FsSizeLimit")
        public Long fsSizeLimit;

        @NameInMap("HighWatermark")
        public Integer highWatermark;

        @NameInMap("IgnoreDelete")
        public Boolean ignoreDelete;

        @NameInMap("InPlace")
        public Boolean inPlace;

        @NameInMap("InRate")
        public Long inRate;

        @NameInMap("IndexId")
        public String indexId;

        @NameInMap("KmsRotatePeriod")
        public String kmsRotatePeriod;

        @NameInMap("LagPeriod")
        public Long lagPeriod;

        @NameInMap("LocalPath")
        public String localPath;

        @NameInMap("LowWatermark")
        public Integer lowWatermark;

        @NameInMap("MnsHealth")
        public String mnsHealth;

        @NameInMap("Name")
        public String name;

        @NameInMap("NfsV4Optimization")
        public Boolean nfsV4Optimization;

        @NameInMap("NoPartition")
        public Boolean noPartition;

        @NameInMap("ObsoleteBuckets")
        public String obsoleteBuckets;

        @NameInMap("OssBucketName")
        public String ossBucketName;

        @NameInMap("OssBucketSsl")
        public Boolean ossBucketSsl;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("OssHealth")
        public String ossHealth;

        @NameInMap("OssUsed")
        public Long ossUsed;

        @NameInMap("OutRate")
        public Long outRate;

        @NameInMap("PartialSyncPaths")
        public String partialSyncPaths;

        /**
         * <p>OSS Prefix。</p>
         */
        @NameInMap("PathPrefix")
        public String pathPrefix;

        @NameInMap("PollingInterval")
        public Integer pollingInterval;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("RemainingMetaSpace")
        public Long remainingMetaSpace;

        @NameInMap("RemoteSync")
        public Boolean remoteSync;

        @NameInMap("RemoteSyncDownload")
        public Boolean remoteSyncDownload;

        @NameInMap("RoClientList")
        public String roClientList;

        @NameInMap("RoUserList")
        public String roUserList;

        @NameInMap("RwClientList")
        public String rwClientList;

        @NameInMap("RwUserList")
        public String rwUserList;

        @NameInMap("ServerSideAlgorithm")
        public String serverSideAlgorithm;

        @NameInMap("ServerSideCmk")
        public String serverSideCmk;

        @NameInMap("ServerSideEncryption")
        public Boolean serverSideEncryption;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Squash")
        public String squash;

        @NameInMap("State")
        public String state;

        @NameInMap("Status")
        public String status;

        @NameInMap("SupportArchive")
        public Boolean supportArchive;

        @NameInMap("SyncProgress")
        public Integer syncProgress;

        @NameInMap("Throttling")
        public Boolean throttling;

        @NameInMap("TotalDownload")
        public Long totalDownload;

        @NameInMap("TotalUpload")
        public Long totalUpload;

        @NameInMap("TransferAcceleration")
        public Boolean transferAcceleration;

        @NameInMap("UploadQueue")
        public Long uploadQueue;

        @NameInMap("Used")
        public Long used;

        @NameInMap("WindowsAcl")
        public Boolean windowsAcl;

        public static DescribeGatewayFileSharesResponseBodyFileSharesFileShare build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayFileSharesResponseBodyFileSharesFileShare self = new DescribeGatewayFileSharesResponseBodyFileSharesFileShare();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setAccessBasedEnumeration(Boolean accessBasedEnumeration) {
            this.accessBasedEnumeration = accessBasedEnumeration;
            return this;
        }
        public Boolean getAccessBasedEnumeration() {
            return this.accessBasedEnumeration;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setActiveMessages(Long activeMessages) {
            this.activeMessages = activeMessages;
            return this;
        }
        public Long getActiveMessages() {
            return this.activeMessages;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setBeLimit(Integer beLimit) {
            this.beLimit = beLimit;
            return this;
        }
        public Integer getBeLimit() {
            return this.beLimit;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setBrowsable(Boolean browsable) {
            this.browsable = browsable;
            return this;
        }
        public Boolean getBrowsable() {
            return this.browsable;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setBucketInfos(String bucketInfos) {
            this.bucketInfos = bucketInfos;
            return this;
        }
        public String getBucketInfos() {
            return this.bucketInfos;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setBucketsStub(Boolean bucketsStub) {
            this.bucketsStub = bucketsStub;
            return this;
        }
        public Boolean getBucketsStub() {
            return this.bucketsStub;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setBypassCacheRead(Boolean bypassCacheRead) {
            this.bypassCacheRead = bypassCacheRead;
            return this;
        }
        public Boolean getBypassCacheRead() {
            return this.bypassCacheRead;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setCacheMode(String cacheMode) {
            this.cacheMode = cacheMode;
            return this;
        }
        public String getCacheMode() {
            return this.cacheMode;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setClientSideCmk(String clientSideCmk) {
            this.clientSideCmk = clientSideCmk;
            return this;
        }
        public String getClientSideCmk() {
            return this.clientSideCmk;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setClientSideEncryption(Boolean clientSideEncryption) {
            this.clientSideEncryption = clientSideEncryption;
            return this;
        }
        public Boolean getClientSideEncryption() {
            return this.clientSideEncryption;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setDirectIO(Boolean directIO) {
            this.directIO = directIO;
            return this;
        }
        public Boolean getDirectIO() {
            return this.directIO;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setDownloadLimit(Integer downloadLimit) {
            this.downloadLimit = downloadLimit;
            return this;
        }
        public Integer getDownloadLimit() {
            return this.downloadLimit;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setDownloadQueue(Long downloadQueue) {
            this.downloadQueue = downloadQueue;
            return this;
        }
        public Long getDownloadQueue() {
            return this.downloadQueue;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setDownloadRate(Long downloadRate) {
            this.downloadRate = downloadRate;
            return this;
        }
        public Long getDownloadRate() {
            return this.downloadRate;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setExpressSyncId(String expressSyncId) {
            this.expressSyncId = expressSyncId;
            return this;
        }
        public String getExpressSyncId() {
            return this.expressSyncId;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setFastReclaim(Boolean fastReclaim) {
            this.fastReclaim = fastReclaim;
            return this;
        }
        public Boolean getFastReclaim() {
            return this.fastReclaim;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setFeLimit(Integer feLimit) {
            this.feLimit = feLimit;
            return this;
        }
        public Integer getFeLimit() {
            return this.feLimit;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setFileNumLimit(Long fileNumLimit) {
            this.fileNumLimit = fileNumLimit;
            return this;
        }
        public Long getFileNumLimit() {
            return this.fileNumLimit;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setFsSizeLimit(Long fsSizeLimit) {
            this.fsSizeLimit = fsSizeLimit;
            return this;
        }
        public Long getFsSizeLimit() {
            return this.fsSizeLimit;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setHighWatermark(Integer highWatermark) {
            this.highWatermark = highWatermark;
            return this;
        }
        public Integer getHighWatermark() {
            return this.highWatermark;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setIgnoreDelete(Boolean ignoreDelete) {
            this.ignoreDelete = ignoreDelete;
            return this;
        }
        public Boolean getIgnoreDelete() {
            return this.ignoreDelete;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setInPlace(Boolean inPlace) {
            this.inPlace = inPlace;
            return this;
        }
        public Boolean getInPlace() {
            return this.inPlace;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setInRate(Long inRate) {
            this.inRate = inRate;
            return this;
        }
        public Long getInRate() {
            return this.inRate;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setKmsRotatePeriod(String kmsRotatePeriod) {
            this.kmsRotatePeriod = kmsRotatePeriod;
            return this;
        }
        public String getKmsRotatePeriod() {
            return this.kmsRotatePeriod;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setLagPeriod(Long lagPeriod) {
            this.lagPeriod = lagPeriod;
            return this;
        }
        public Long getLagPeriod() {
            return this.lagPeriod;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setLocalPath(String localPath) {
            this.localPath = localPath;
            return this;
        }
        public String getLocalPath() {
            return this.localPath;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setLowWatermark(Integer lowWatermark) {
            this.lowWatermark = lowWatermark;
            return this;
        }
        public Integer getLowWatermark() {
            return this.lowWatermark;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setMnsHealth(String mnsHealth) {
            this.mnsHealth = mnsHealth;
            return this;
        }
        public String getMnsHealth() {
            return this.mnsHealth;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setNfsV4Optimization(Boolean nfsV4Optimization) {
            this.nfsV4Optimization = nfsV4Optimization;
            return this;
        }
        public Boolean getNfsV4Optimization() {
            return this.nfsV4Optimization;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setNoPartition(Boolean noPartition) {
            this.noPartition = noPartition;
            return this;
        }
        public Boolean getNoPartition() {
            return this.noPartition;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setObsoleteBuckets(String obsoleteBuckets) {
            this.obsoleteBuckets = obsoleteBuckets;
            return this;
        }
        public String getObsoleteBuckets() {
            return this.obsoleteBuckets;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setOssBucketSsl(Boolean ossBucketSsl) {
            this.ossBucketSsl = ossBucketSsl;
            return this;
        }
        public Boolean getOssBucketSsl() {
            return this.ossBucketSsl;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setOssHealth(String ossHealth) {
            this.ossHealth = ossHealth;
            return this;
        }
        public String getOssHealth() {
            return this.ossHealth;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setOssUsed(Long ossUsed) {
            this.ossUsed = ossUsed;
            return this;
        }
        public Long getOssUsed() {
            return this.ossUsed;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setOutRate(Long outRate) {
            this.outRate = outRate;
            return this;
        }
        public Long getOutRate() {
            return this.outRate;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setPartialSyncPaths(String partialSyncPaths) {
            this.partialSyncPaths = partialSyncPaths;
            return this;
        }
        public String getPartialSyncPaths() {
            return this.partialSyncPaths;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setPathPrefix(String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }
        public String getPathPrefix() {
            return this.pathPrefix;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setPollingInterval(Integer pollingInterval) {
            this.pollingInterval = pollingInterval;
            return this;
        }
        public Integer getPollingInterval() {
            return this.pollingInterval;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setRemainingMetaSpace(Long remainingMetaSpace) {
            this.remainingMetaSpace = remainingMetaSpace;
            return this;
        }
        public Long getRemainingMetaSpace() {
            return this.remainingMetaSpace;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setRemoteSync(Boolean remoteSync) {
            this.remoteSync = remoteSync;
            return this;
        }
        public Boolean getRemoteSync() {
            return this.remoteSync;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setRemoteSyncDownload(Boolean remoteSyncDownload) {
            this.remoteSyncDownload = remoteSyncDownload;
            return this;
        }
        public Boolean getRemoteSyncDownload() {
            return this.remoteSyncDownload;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setRoClientList(String roClientList) {
            this.roClientList = roClientList;
            return this;
        }
        public String getRoClientList() {
            return this.roClientList;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setRoUserList(String roUserList) {
            this.roUserList = roUserList;
            return this;
        }
        public String getRoUserList() {
            return this.roUserList;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setRwClientList(String rwClientList) {
            this.rwClientList = rwClientList;
            return this;
        }
        public String getRwClientList() {
            return this.rwClientList;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setRwUserList(String rwUserList) {
            this.rwUserList = rwUserList;
            return this;
        }
        public String getRwUserList() {
            return this.rwUserList;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setServerSideAlgorithm(String serverSideAlgorithm) {
            this.serverSideAlgorithm = serverSideAlgorithm;
            return this;
        }
        public String getServerSideAlgorithm() {
            return this.serverSideAlgorithm;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setServerSideCmk(String serverSideCmk) {
            this.serverSideCmk = serverSideCmk;
            return this;
        }
        public String getServerSideCmk() {
            return this.serverSideCmk;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setServerSideEncryption(Boolean serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }
        public Boolean getServerSideEncryption() {
            return this.serverSideEncryption;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setSquash(String squash) {
            this.squash = squash;
            return this;
        }
        public String getSquash() {
            return this.squash;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setSupportArchive(Boolean supportArchive) {
            this.supportArchive = supportArchive;
            return this;
        }
        public Boolean getSupportArchive() {
            return this.supportArchive;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setSyncProgress(Integer syncProgress) {
            this.syncProgress = syncProgress;
            return this;
        }
        public Integer getSyncProgress() {
            return this.syncProgress;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setThrottling(Boolean throttling) {
            this.throttling = throttling;
            return this;
        }
        public Boolean getThrottling() {
            return this.throttling;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setTotalDownload(Long totalDownload) {
            this.totalDownload = totalDownload;
            return this;
        }
        public Long getTotalDownload() {
            return this.totalDownload;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setTotalUpload(Long totalUpload) {
            this.totalUpload = totalUpload;
            return this;
        }
        public Long getTotalUpload() {
            return this.totalUpload;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setTransferAcceleration(Boolean transferAcceleration) {
            this.transferAcceleration = transferAcceleration;
            return this;
        }
        public Boolean getTransferAcceleration() {
            return this.transferAcceleration;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setUploadQueue(Long uploadQueue) {
            this.uploadQueue = uploadQueue;
            return this;
        }
        public Long getUploadQueue() {
            return this.uploadQueue;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeGatewayFileSharesResponseBodyFileSharesFileShare setWindowsAcl(Boolean windowsAcl) {
            this.windowsAcl = windowsAcl;
            return this;
        }
        public Boolean getWindowsAcl() {
            return this.windowsAcl;
        }

    }

    public static class DescribeGatewayFileSharesResponseBodyFileShares extends TeaModel {
        @NameInMap("FileShare")
        public java.util.List<DescribeGatewayFileSharesResponseBodyFileSharesFileShare> fileShare;

        public static DescribeGatewayFileSharesResponseBodyFileShares build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayFileSharesResponseBodyFileShares self = new DescribeGatewayFileSharesResponseBodyFileShares();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayFileSharesResponseBodyFileShares setFileShare(java.util.List<DescribeGatewayFileSharesResponseBodyFileSharesFileShare> fileShare) {
            this.fileShare = fileShare;
            return this;
        }
        public java.util.List<DescribeGatewayFileSharesResponseBodyFileSharesFileShare> getFileShare() {
            return this.fileShare;
        }

    }

}
