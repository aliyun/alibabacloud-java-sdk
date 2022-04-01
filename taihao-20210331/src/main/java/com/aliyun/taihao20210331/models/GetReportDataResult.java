// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetReportDataResult extends TeaModel {
    // data
    @NameInMap("reportDatas")
    public java.util.List<ReportData> reportDatas;

    // time
    @NameInMap("time")
    public Long time;

    public static GetReportDataResult build(java.util.Map<String, ?> map) throws Exception {
        GetReportDataResult self = new GetReportDataResult();
        return TeaModel.build(map, self);
    }

    public GetReportDataResult setReportDatas(java.util.List<ReportData> reportDatas) {
        this.reportDatas = reportDatas;
        return this;
    }
    public java.util.List<ReportData> getReportDatas() {
        return this.reportDatas;
    }

    public GetReportDataResult setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

}
