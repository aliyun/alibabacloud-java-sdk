// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHcExportInfoRequest extends TeaModel {
    /**
     * <p>The ID of the export task.</p>
     * <br>
     * <p>>  You can call the [ExportWarning](~~ExportWarning~~) operation to query the IDs of export tasks.</p>
     */
    @NameInMap("ExportId")
    public Long exportId;

    public static DescribeHcExportInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHcExportInfoRequest self = new DescribeHcExportInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHcExportInfoRequest setExportId(Long exportId) {
        this.exportId = exportId;
        return this;
    }
    public Long getExportId() {
        return this.exportId;
    }

}
