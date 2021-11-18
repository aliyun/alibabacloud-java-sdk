// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class Dataset extends TeaModel {
    // 数据集id
    @NameInMap("DatasetId")
    public String datasetId;

    // 默认挂载路径
    @NameInMap("DefaultMountPath")
    public String defaultMountPath;

    // 文件系统Id
    @NameInMap("FileSystemId")
    public String fileSystemId;

    // 挂载路径
    @NameInMap("MountPath")
    public String mountPath;

    // 数据集名称
    @NameInMap("Name")
    public String name;

    // 文件系统被挂载路径
    @NameInMap("NasPath")
    public String nasPath;

    public static Dataset build(java.util.Map<String, ?> map) throws Exception {
        Dataset self = new Dataset();
        return TeaModel.build(map, self);
    }

    public Dataset setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public Dataset setDefaultMountPath(String defaultMountPath) {
        this.defaultMountPath = defaultMountPath;
        return this;
    }
    public String getDefaultMountPath() {
        return this.defaultMountPath;
    }

    public Dataset setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public Dataset setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public Dataset setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Dataset setNasPath(String nasPath) {
        this.nasPath = nasPath;
        return this;
    }
    public String getNasPath() {
        return this.nasPath;
    }

}
