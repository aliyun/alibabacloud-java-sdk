// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppPluginFilesRequest extends TeaModel {
    /**
     * <p>The gateway plug-in ID.</p>
     * 
     * <strong>example:</strong>
     * <p>aliplayer-react</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <p>The version number. If not specified, the currently active version is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.3</p>
     */
    @NameInMap("PluginVersion")
    public String pluginVersion;

    public static ListAppPluginFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppPluginFilesRequest self = new ListAppPluginFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListAppPluginFilesRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public ListAppPluginFilesRequest setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }
    public String getPluginVersion() {
        return this.pluginVersion;
    }

}
