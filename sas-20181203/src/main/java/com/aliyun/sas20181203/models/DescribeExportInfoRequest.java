// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExportInfoRequest extends TeaModel {
    /**
     * <p>The ID of the export task.</p>
     * <br>
     * <p>> You can call the [ExportRecord](~~ExportRecord~~) operation to query the IDs of export tasks.</p>
     */
    @NameInMap("ExportId")
    public Long exportId;

    public static DescribeExportInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportInfoRequest self = new DescribeExportInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExportInfoRequest setExportId(Long exportId) {
        this.exportId = exportId;
        return this;
    }
    public Long getExportId() {
        return this.exportId;
    }

}
