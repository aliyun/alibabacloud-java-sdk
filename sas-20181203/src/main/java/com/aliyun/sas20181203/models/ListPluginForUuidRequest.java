// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPluginForUuidRequest extends TeaModel {
    /**
     * <p>The plug-in types.</p>
     */
    @NameInMap("Types")
    public java.util.List<String> types;

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

    public static ListPluginForUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPluginForUuidRequest self = new ListPluginForUuidRequest();
        return TeaModel.build(map, self);
    }

    public ListPluginForUuidRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public ListPluginForUuidRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
