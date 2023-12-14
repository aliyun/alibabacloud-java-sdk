// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayBlockVolumesResponseBody extends TeaModel {
    @NameInMap("BlockVolumes")
    public DescribeGatewayBlockVolumesResponseBodyBlockVolumes blockVolumes;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewayBlockVolumesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayBlockVolumesResponseBody self = new DescribeGatewayBlockVolumesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayBlockVolumesResponseBody setBlockVolumes(DescribeGatewayBlockVolumesResponseBodyBlockVolumes blockVolumes) {
        this.blockVolumes = blockVolumes;
        return this;
    }
    public DescribeGatewayBlockVolumesResponseBodyBlockVolumes getBlockVolumes() {
        return this.blockVolumes;
    }

    public DescribeGatewayBlockVolumesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayBlockVolumesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayBlockVolumesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayBlockVolumesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("CacheMode")
        public String cacheMode;

        @NameInMap("ChapEnabled")
        public Boolean chapEnabled;

        @NameInMap("ChapInUser")
        public String chapInUser;

        @NameInMap("ChunkSize")
        public Integer chunkSize;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("IndexId")
        public String indexId;

        @NameInMap("LocalPath")
        public String localPath;

        /**
         * <p>LUN ID。</p>
         */
        @NameInMap("LunId")
        public Integer lunId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssBucketName")
        public String ossBucketName;

        @NameInMap("OssBucketSsl")
        public Boolean ossBucketSsl;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Size")
        public Long size;

        @NameInMap("State")
        public String state;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Target")
        public String target;

        @NameInMap("TotalDownload")
        public Long totalDownload;

        @NameInMap("TotalUpload")
        public Long totalUpload;

        @NameInMap("VolumeState")
        public Integer volumeState;

        public static DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume self = new DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setCacheMode(String cacheMode) {
            this.cacheMode = cacheMode;
            return this;
        }
        public String getCacheMode() {
            return this.cacheMode;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setChapEnabled(Boolean chapEnabled) {
            this.chapEnabled = chapEnabled;
            return this;
        }
        public Boolean getChapEnabled() {
            return this.chapEnabled;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setChapInUser(String chapInUser) {
            this.chapInUser = chapInUser;
            return this;
        }
        public String getChapInUser() {
            return this.chapInUser;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setChunkSize(Integer chunkSize) {
            this.chunkSize = chunkSize;
            return this;
        }
        public Integer getChunkSize() {
            return this.chunkSize;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setLocalPath(String localPath) {
            this.localPath = localPath;
            return this;
        }
        public String getLocalPath() {
            return this.localPath;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setLunId(Integer lunId) {
            this.lunId = lunId;
            return this;
        }
        public Integer getLunId() {
            return this.lunId;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setOssBucketSsl(Boolean ossBucketSsl) {
            this.ossBucketSsl = ossBucketSsl;
            return this;
        }
        public Boolean getOssBucketSsl() {
            return this.ossBucketSsl;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setTotalDownload(Long totalDownload) {
            this.totalDownload = totalDownload;
            return this;
        }
        public Long getTotalDownload() {
            return this.totalDownload;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setTotalUpload(Long totalUpload) {
            this.totalUpload = totalUpload;
            return this;
        }
        public Long getTotalUpload() {
            return this.totalUpload;
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume setVolumeState(Integer volumeState) {
            this.volumeState = volumeState;
            return this;
        }
        public Integer getVolumeState() {
            return this.volumeState;
        }

    }

    public static class DescribeGatewayBlockVolumesResponseBodyBlockVolumes extends TeaModel {
        @NameInMap("BlockVolume")
        public java.util.List<DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume> blockVolume;

        public static DescribeGatewayBlockVolumesResponseBodyBlockVolumes build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayBlockVolumesResponseBodyBlockVolumes self = new DescribeGatewayBlockVolumesResponseBodyBlockVolumes();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayBlockVolumesResponseBodyBlockVolumes setBlockVolume(java.util.List<DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume> blockVolume) {
            this.blockVolume = blockVolume;
            return this;
        }
        public java.util.List<DescribeGatewayBlockVolumesResponseBodyBlockVolumesBlockVolume> getBlockVolume() {
            return this.blockVolume;
        }

    }

}
