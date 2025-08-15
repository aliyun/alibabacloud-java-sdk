// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class DescribeExportInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>121****</p>
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
