// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetReportDataRequest extends TeaModel {
    @NameInMap("getReportDataParam")
    public GetReportDataParam getReportDataParam;

    public static GetReportDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReportDataRequest self = new GetReportDataRequest();
        return TeaModel.build(map, self);
    }

    public GetReportDataRequest setGetReportDataParam(GetReportDataParam getReportDataParam) {
        this.getReportDataParam = getReportDataParam;
        return this;
    }
    public GetReportDataParam getGetReportDataParam() {
        return this.getReportDataParam;
    }

}
