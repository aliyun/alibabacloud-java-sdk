// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class HotUpdateJobParams extends TeaModel {
    @NameInMap("rescaleJobParam")
    public RescaleJobParam rescaleJobParam;

    @NameInMap("updateJobConfigParam")
    public UpdateJobConfigParam updateJobConfigParam;

    public static HotUpdateJobParams build(java.util.Map<String, ?> map) throws Exception {
        HotUpdateJobParams self = new HotUpdateJobParams();
        return TeaModel.build(map, self);
    }

    public HotUpdateJobParams setRescaleJobParam(RescaleJobParam rescaleJobParam) {
        this.rescaleJobParam = rescaleJobParam;
        return this;
    }
    public RescaleJobParam getRescaleJobParam() {
        return this.rescaleJobParam;
    }

    public HotUpdateJobParams setUpdateJobConfigParam(UpdateJobConfigParam updateJobConfigParam) {
        this.updateJobConfigParam = updateJobConfigParam;
        return this;
    }
    public UpdateJobConfigParam getUpdateJobConfigParam() {
        return this.updateJobConfigParam;
    }

}
