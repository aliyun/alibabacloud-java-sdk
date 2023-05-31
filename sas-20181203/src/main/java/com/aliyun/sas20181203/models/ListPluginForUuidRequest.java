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
     * <br>
     * <p>>  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
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
