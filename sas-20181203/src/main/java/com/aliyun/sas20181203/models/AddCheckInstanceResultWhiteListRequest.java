// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCheckInstanceResultWhiteListRequest extends TeaModel {
    /**
     * <p>The ID of the group to which the check item belongs.</p>
     */
    @NameInMap("CheckGroupId")
    public String checkGroupId;

    /**
     * <p>The ID of the check item.</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The instance IDs of assets.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static AddCheckInstanceResultWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCheckInstanceResultWhiteListRequest self = new AddCheckInstanceResultWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public AddCheckInstanceResultWhiteListRequest setCheckGroupId(String checkGroupId) {
        this.checkGroupId = checkGroupId;
        return this;
    }
    public String getCheckGroupId() {
        return this.checkGroupId;
    }

    public AddCheckInstanceResultWhiteListRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public AddCheckInstanceResultWhiteListRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
