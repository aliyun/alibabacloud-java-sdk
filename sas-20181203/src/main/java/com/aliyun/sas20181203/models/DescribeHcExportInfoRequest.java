// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHcExportInfoRequest extends TeaModel {
    /**
     * <p>The ID of the export task.</p>
     * <blockquote>
     * <p>To obtain the task ID (<strong>Id</strong>), call the <a href="https://help.aliyun.com/document_detail/425092.html">ExportWarning</a> operation.
     * This parameter is required. If you do not specify this parameter, the API returns HTTP 400 and the error code -101.</p>
     * </blockquote>
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
