// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLJobModelConfig extends TeaModel {
    /**
     * <p>The model name, which must be unique within the Models list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>actor</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The absolute path of the model in the working container. It can be located in a DataSources mount directory or preset in the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/input/models/qwen</p>
     */
    @NameInMap("Path")
    public String path;

    public static RLJobModelConfig build(java.util.Map<String, ?> map) throws Exception {
        RLJobModelConfig self = new RLJobModelConfig();
        return TeaModel.build(map, self);
    }

    public RLJobModelConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RLJobModelConfig setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
