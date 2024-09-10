// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPluginForUuidShrinkRequest extends TeaModel {
    /**
     * <p>The plug-in types.</p>
     */
    @NameInMap("Types")
    public String typesShrink;

    /**
     * <p>The UUID of the server.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bdb7071f-129d-4ceb-af80-4cf70c4571c6</p>
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
