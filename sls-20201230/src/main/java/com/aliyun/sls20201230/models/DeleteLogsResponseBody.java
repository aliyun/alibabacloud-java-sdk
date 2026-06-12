// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DeleteLogsResponseBody extends TeaModel {
    /**
     * <p>The number of log rows that were deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("affectedRows")
    public Integer affectedRows;

    public static DeleteLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogsResponseBody self = new DeleteLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLogsResponseBody setAffectedRows(Integer affectedRows) {
        this.affectedRows = affectedRows;
        return this;
    }
    public Integer getAffectedRows() {
        return this.affectedRows;
    }

}
