// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ExportStatisticalDataResponseBody extends TeaModel {
    @NameInMap("ExportTaskId")
    public String exportTaskId;

    @NameInMap("RequestId")
    public String requestId;

    public static ExportStatisticalDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportStatisticalDataResponseBody self = new ExportStatisticalDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportStatisticalDataResponseBody setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    public ExportStatisticalDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
