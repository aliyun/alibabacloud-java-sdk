// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class AbortChangeRequest extends TeaModel {
    @NameInMap("ChangeId")
    public String changeId;

    @NameInMap("RegionId")
    public String regionId;

    public static AbortChangeRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortChangeRequest self = new AbortChangeRequest();
        return TeaModel.build(map, self);
    }

    public AbortChangeRequest setChangeId(String changeId) {
        this.changeId = changeId;
        return this;
    }
    public String getChangeId() {
        return this.changeId;
    }

    public AbortChangeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
