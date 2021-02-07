// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class ResumeChangeRequest extends TeaModel {
    @NameInMap("ChangeId")
    public String changeId;

    @NameInMap("RegionId")
    public String regionId;

    public static ResumeChangeRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeChangeRequest self = new ResumeChangeRequest();
        return TeaModel.build(map, self);
    }

    public ResumeChangeRequest setChangeId(String changeId) {
        this.changeId = changeId;
        return this;
    }
    public String getChangeId() {
        return this.changeId;
    }

    public ResumeChangeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
