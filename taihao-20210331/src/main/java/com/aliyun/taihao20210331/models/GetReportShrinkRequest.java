// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetReportShrinkRequest extends TeaModel {
    @NameInMap("getReportParam")
    public String getReportParamShrink;

    public static GetReportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReportShrinkRequest self = new GetReportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetReportShrinkRequest setGetReportParamShrink(String getReportParamShrink) {
        this.getReportParamShrink = getReportParamShrink;
        return this;
    }
    public String getGetReportParamShrink() {
        return this.getReportParamShrink;
    }

}
