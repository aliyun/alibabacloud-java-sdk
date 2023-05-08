// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPluginForUuidShrinkRequest extends TeaModel {
    /**
     * <p>An array that consists of the information about the plug-ins.</p>
     */
    @NameInMap("Types")
    public String typesShrink;

    /**
     * <p>The configurations of the plug-in.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ListPluginForUuidShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPluginForUuidShrinkRequest self = new ListPluginForUuidShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPluginForUuidShrinkRequest setTypesShrink(String typesShrink) {
        this.typesShrink = typesShrink;
        return this;
    }
    public String getTypesShrink() {
        return this.typesShrink;
    }

    public ListPluginForUuidShrinkRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
