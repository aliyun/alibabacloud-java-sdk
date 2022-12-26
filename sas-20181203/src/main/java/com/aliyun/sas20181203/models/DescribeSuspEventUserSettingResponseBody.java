// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventUserSettingResponseBody extends TeaModel {
    @NameInMap("LevelsOn")
    public java.util.List<String> levelsOn;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSuspEventUserSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventUserSettingResponseBody self = new DescribeSuspEventUserSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventUserSettingResponseBody setLevelsOn(java.util.List<String> levelsOn) {
        this.levelsOn = levelsOn;
        return this;
    }
    public java.util.List<String> getLevelsOn() {
        return this.levelsOn;
    }

    public DescribeSuspEventUserSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
