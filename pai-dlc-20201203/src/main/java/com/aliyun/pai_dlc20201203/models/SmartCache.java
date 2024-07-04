// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class SmartCache extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CacheWorkerNum")
    public Long cacheWorkerNum;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CacheWorkerSize")
    public Long cacheWorkerSize;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <strong>example:</strong>
     * <p>oss-cn-beijing-internal.aliyuncs.com</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T23:36:01Z</p>
     */
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    /**
     * <strong>example:</strong>
     * <p>/root/data/</p>
     */
    @NameInMap("MountPath")
    public String mountPath;

    /**
     * <strong>example:</strong>
     * <p>{&quot;num_threads&quot;: 32}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <strong>example:</strong>
     * <p>oss://buc/path/to/dir</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>smartcache-20210114104214-vf9lowjt3pso</p>
     */
    @NameInMap("SmartCacheId")
    public String smartCacheId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>189xxx</p>
     */
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
