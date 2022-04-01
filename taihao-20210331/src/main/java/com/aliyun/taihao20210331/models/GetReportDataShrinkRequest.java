// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetReportDataShrinkRequest extends TeaModel {
    @NameInMap("getReportDataParam")
    public String getReportDataParamShrink;

    public static GetReportDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReportDataShrinkRequest self = new GetReportDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetReportDataShrinkRequest setGetReportDataParamShrink(String getReportDataParamShrink) {
        this.getReportDataParamShrink = getReportDataParamShrink;
        return this;
    }
    public String getGetReportDataParamShrink() {
        return this.getReportDataParamShrink;
    }

}
