// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class SmartCache extends TeaModel {
    // cache worker的数量单位是个
    @NameInMap("CacheWorkerNum")
    public Long cacheWorkerNum;

    // 每个cache worker的cache大小单位是GB
    @NameInMap("CacheWorkerSize")
    public Long cacheWorkerSize;

    // SmartCache 描述
    @NameInMap("Description")
    public String description;

    // SmartCache 名称
    @NameInMap("DisplayName")
    public String displayName;

    // 已运行时长
    @NameInMap("Duration")
    public String duration;

    // OSS Endpoint
    @NameInMap("Endpoint")
    public String endpoint;

    // 阿里云的NAS文件系统ID
    @NameInMap("FileSystemId")
    public String fileSystemId;

    // 创建时间（UTC）
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 修改时间（UTC）
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    // 数据源本地挂载目录
    @NameInMap("MountPath")
    public String mountPath;

    // 可选的超参数
    @NameInMap("Options")
    public String options;

    // OSS数据源路径
    @NameInMap("Path")
    public String path;

    // SmartCacheId
    @NameInMap("SmartCacheId")
    public String smartCacheId;

    // 运行状态
    @NameInMap("Status")
    public String status;

    // 挂载的数据类型
    @NameInMap("Type")
    public String type;

    // 创建者Id
    @NameInMap("UserId")
    public String userId;

    public static SmartCache build(java.util.Map<String, ?> map) throws Exception {
        SmartCache self = new SmartCache();
        return TeaModel.build(map, self);
    }

    public SmartCache setCacheWorkerNum(Long cacheWorkerNum) {
        this.cacheWorkerNum = cacheWorkerNum;
        return this;
    }
    public Long getCacheWorkerNum() {
        return this.cacheWorkerNum;
    }

    public SmartCache setCacheWorkerSize(Long cacheWorkerSize) {
        this.cacheWorkerSize = cacheWorkerSize;
        return this;
    }
    public Long getCacheWorkerSize() {
        return this.cacheWorkerSize;
    }

    public SmartCache setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SmartCache setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public SmartCache setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public SmartCache setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public SmartCache setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public SmartCache setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public SmartCache setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public SmartCache setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public SmartCache setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public SmartCache setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public SmartCache setSmartCacheId(String smartCacheId) {
        this.smartCacheId = smartCacheId;
        return this;
    }
    public String getSmartCacheId() {
        return this.smartCacheId;
    }

    public SmartCache setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SmartCache setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SmartCache setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
