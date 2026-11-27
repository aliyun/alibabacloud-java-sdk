// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLJobDatasetConfig extends TeaModel {
    /**
     * <p>数据集名称，在 Datasets 列表内唯一</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gsm8k</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>工作容器内的数据集绝对路径；可指向目录或文件，可位于 DataSources 挂载目录内，也可由镜像预置</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/input/gsm8k</p>
     */
    @NameInMap("Path")
    public String path;

    public static RLJobDatasetConfig build(java.util.Map<String, ?> map) throws Exception {
        RLJobDatasetConfig self = new RLJobDatasetConfig();
        return TeaModel.build(map, self);
    }

    public RLJobDatasetConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RLJobDatasetConfig setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
