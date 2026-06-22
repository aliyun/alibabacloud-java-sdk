// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHcExportInfoRequest extends TeaModel {
    /**
     * <p>The ID of the export task. Call the <a href="https://help.aliyun.com/document_detail/425092.html">ExportWarning</a> operation to obtain the task ID (<strong>Id</strong>).</p>
     * 
     * <strong>example:</strong>
     * <p>443285</p>
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
