// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulExportInfoRequest extends TeaModel {
    /**
     * <p>The ID of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>14356</p>
     */
    @NameInMap("ExportId")
    public Long exportId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

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

    public DescribeVulExportInfoRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
