// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyRefreshProcessInfoRequest extends TeaModel {
    /**
     * <p>The UUID of the server.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/141932.html">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0f3b8f76-90e5-4455-a5aa-23ce30b5****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ModifyRefreshProcessInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRefreshProcessInfoRequest self = new ModifyRefreshProcessInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRefreshProcessInfoRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
