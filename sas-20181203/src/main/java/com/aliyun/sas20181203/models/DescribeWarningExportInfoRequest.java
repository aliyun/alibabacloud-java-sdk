// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWarningExportInfoRequest extends TeaModel {
    // The ID of the export task.
    // 
    // >  You can can call the [ExportWarning](~~ExportWarning~~) operation to query the IDs of export tasks.
    @NameInMap("ExportId")
    public Long exportId;

    public static DescribeWarningExportInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWarningExportInfoRequest self = new DescribeWarningExportInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWarningExportInfoRequest setExportId(Long exportId) {
        this.exportId = exportId;
        return this;
    }
    public Long getExportId() {
        return this.exportId;
    }

}
