// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateDataSourceRequest extends TeaModel {
    // 数据源类型
    @NameInMap("DataSourceType")
    public String dataSourceType;

    // 数据源显示名称
    @NameInMap("DisplayName")
    public String displayName;

    // 数据源描述
    @NameInMap("Description")
    public String description;

    // 阿里云NAS文件系统Id
    @NameInMap("FileSystemId")
    public String fileSystemId;

    // 阿里云OSS文件系统路径
    @NameInMap("Path")
    public String path;

    // 阿里云OSS文件系统服务端点
    @NameInMap("Endpoint")
    public String endpoint;

    // 阿里云OSS文件系统配置选项
    @NameInMap("Options")
    public String options;

    // 本地挂载目录
    @NameInMap("MountPath")
    public String mountPath;

    public static CreateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceRequest self = new CreateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateDataSourceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateDataSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataSourceRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateDataSourceRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateDataSourceRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public CreateDataSourceRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreateDataSourceRequest setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

}
