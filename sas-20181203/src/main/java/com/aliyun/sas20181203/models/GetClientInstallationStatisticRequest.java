// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClientInstallationStatisticRequest extends TeaModel {
    @NameInMap("TimeEnd")
    public Long timeEnd;

    @NameInMap("TimeStart")
    public Long timeStart;

    public static GetClientInstallationStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClientInstallationStatisticRequest self = new GetClientInstallationStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetClientInstallationStatisticRequest setTimeEnd(Long timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }
    public Long getTimeEnd() {
        return this.timeEnd;
    }

    public GetClientInstallationStatisticRequest setTimeStart(Long timeStart) {
        this.timeStart = timeStart;
        return this;
    }
    public Long getTimeStart() {
        return this.timeStart;
    }

}
