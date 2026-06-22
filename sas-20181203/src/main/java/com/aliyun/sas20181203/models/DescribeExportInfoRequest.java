// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExportInfoRequest extends TeaModel {
    /**
     * <p>The ID of the export task.</p>
     * <blockquote>
     * <p>You can obtain this parameter by calling the <a href="~~ExportRecord~~">ExportRecord</a> operation to initiate an export.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("ExportId")
    public Long exportId;

    /**
     * <p>The ID of the member account in the resource directory.</p>
     * <blockquote>
     * <p>You can obtain this parameter by invoking the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16670360956*****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

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

    public DescribeExportInfoRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
