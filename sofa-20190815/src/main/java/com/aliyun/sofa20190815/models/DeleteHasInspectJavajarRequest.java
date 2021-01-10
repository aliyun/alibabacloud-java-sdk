// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasInspectJavajarRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    @NameInMap("JarFileName")
    public String jarFileName;

    public static DeleteHasInspectJavajarRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasInspectJavajarRequest self = new DeleteHasInspectJavajarRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasInspectJavajarRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public DeleteHasInspectJavajarRequest setJarFileName(String jarFileName) {
        this.jarFileName = jarFileName;
        return this;
    }
    public String getJarFileName() {
        return this.jarFileName;
    }

}
