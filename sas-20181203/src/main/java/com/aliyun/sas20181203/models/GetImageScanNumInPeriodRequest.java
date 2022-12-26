// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetImageScanNumInPeriodRequest extends TeaModel {
    @NameInMap("PastDay")
    public String pastDay;

    public static GetImageScanNumInPeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageScanNumInPeriodRequest self = new GetImageScanNumInPeriodRequest();
        return TeaModel.build(map, self);
    }

    public GetImageScanNumInPeriodRequest setPastDay(String pastDay) {
        this.pastDay = pastDay;
        return this;
    }
    public String getPastDay() {
        return this.pastDay;
    }

}
