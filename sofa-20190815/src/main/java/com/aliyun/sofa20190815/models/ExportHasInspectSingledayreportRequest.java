// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportHasInspectSingledayreportRequest extends TeaModel {
    @NameInMap("UnixTime")
    public Long unixTime;

    public static ExportHasInspectSingledayreportRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportHasInspectSingledayreportRequest self = new ExportHasInspectSingledayreportRequest();
        return TeaModel.build(map, self);
    }

    public ExportHasInspectSingledayreportRequest setUnixTime(Long unixTime) {
        this.unixTime = unixTime;
        return this;
    }
    public Long getUnixTime() {
        return this.unixTime;
    }

}
