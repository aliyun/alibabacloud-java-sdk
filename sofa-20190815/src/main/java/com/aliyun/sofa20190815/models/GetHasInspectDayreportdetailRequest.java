// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectDayreportdetailRequest extends TeaModel {
    @NameInMap("UnixTime")
    public Long unixTime;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static GetHasInspectDayreportdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectDayreportdetailRequest self = new GetHasInspectDayreportdetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectDayreportdetailRequest setUnixTime(Long unixTime) {
        this.unixTime = unixTime;
        return this;
    }
    public Long getUnixTime() {
        return this.unixTime;
    }

    public GetHasInspectDayreportdetailRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
