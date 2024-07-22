// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ExportStatisticalDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6be5a9f1-406e-424e-a17b-b6fb86ee3cc9</p>
     */
    @NameInMap("ExportTaskId")
    public String exportTaskId;

    /**
     * <strong>example:</strong>
     * <p>c62e6789-28a8-41db-941e-171a01d3b3b9</p>
     */
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
