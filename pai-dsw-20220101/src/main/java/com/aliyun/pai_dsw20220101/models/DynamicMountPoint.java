// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DynamicMountPoint extends TeaModel {
    @NameInMap("Options")
    public String options;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RootPath")
    public String rootPath;

    public static DynamicMountPoint build(java.util.Map<String, ?> map) throws Exception {
        DynamicMountPoint self = new DynamicMountPoint();
        return TeaModel.build(map, self);
    }

    public DynamicMountPoint setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public DynamicMountPoint setRootPath(String rootPath) {
        this.rootPath = rootPath;
        return this;
    }
    public String getRootPath() {
        return this.rootPath;
    }

}
