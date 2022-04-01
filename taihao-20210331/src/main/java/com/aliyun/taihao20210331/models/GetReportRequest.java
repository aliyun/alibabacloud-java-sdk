// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetReportRequest extends TeaModel {
    @NameInMap("getReportParam")
    public GetReportParam getReportParam;

    public static GetReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReportRequest self = new GetReportRequest();
        return TeaModel.build(map, self);
    }

    public GetReportRequest setGetReportParam(GetReportParam getReportParam) {
        this.getReportParam = getReportParam;
        return this;
    }
    public GetReportParam getGetReportParam() {
        return this.getReportParam;
    }

}
