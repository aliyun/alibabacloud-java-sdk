// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteIdcProbeRequest extends TeaModel {
    /**
     * <p>The UUID of the server.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inet-1234567****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DeleteIdcProbeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIdcProbeRequest self = new DeleteIdcProbeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIdcProbeRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
