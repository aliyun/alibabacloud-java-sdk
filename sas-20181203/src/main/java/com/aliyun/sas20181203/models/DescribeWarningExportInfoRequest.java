// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWarningExportInfoRequest extends TeaModel {
    /**
     * <p>The ID of the export task.</p>
     * <blockquote>
     * <p> You can can call the <a href="~~ExportWarning~~">ExportWarning</a> operation to query the IDs of export tasks.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>14356</p>
     */
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
