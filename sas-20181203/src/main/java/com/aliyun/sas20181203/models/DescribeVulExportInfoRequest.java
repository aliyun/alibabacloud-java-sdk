// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulExportInfoRequest extends TeaModel {
    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("ExportId")
    public Long exportId;

    public static DescribeVulExportInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulExportInfoRequest self = new DescribeVulExportInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulExportInfoRequest setExportId(Long exportId) {
        this.exportId = exportId;
        return this;
    }
    public Long getExportId() {
        return this.exportId;
    }

}
