// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RemoveCheckResultWhiteListRequest extends TeaModel {
    @NameInMap("CheckGroupId")
    public String checkGroupId;

    @NameInMap("CheckIds")
    public java.util.List<Long> checkIds;

    @NameInMap("Type")
    public String type;

    public static RemoveCheckResultWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveCheckResultWhiteListRequest self = new RemoveCheckResultWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public RemoveCheckResultWhiteListRequest setCheckGroupId(String checkGroupId) {
        this.checkGroupId = checkGroupId;
        return this;
    }
    public String getCheckGroupId() {
        return this.checkGroupId;
    }

    public RemoveCheckResultWhiteListRequest setCheckIds(java.util.List<Long> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

    public RemoveCheckResultWhiteListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
