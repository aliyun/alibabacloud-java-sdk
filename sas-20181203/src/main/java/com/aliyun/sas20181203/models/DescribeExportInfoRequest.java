// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExportInfoRequest extends TeaModel {
    /**
     * <p>The ID of the export task.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ExportRecord~~">ExportRecord</a> operation to query the IDs of export tasks.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
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
