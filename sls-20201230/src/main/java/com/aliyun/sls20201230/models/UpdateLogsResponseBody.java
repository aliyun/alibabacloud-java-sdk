// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateLogsResponseBody extends TeaModel {
    /**
     * <p>The number of updated log rows.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("affectedRows")
    public Integer affectedRows;

    public static UpdateLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogsResponseBody self = new UpdateLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLogsResponseBody setAffectedRows(Integer affectedRows) {
        this.affectedRows = affectedRows;
        return this;
    }
    public Integer getAffectedRows() {
        return this.affectedRows;
    }

}
