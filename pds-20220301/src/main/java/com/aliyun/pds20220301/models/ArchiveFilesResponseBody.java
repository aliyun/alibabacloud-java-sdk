// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ArchiveFilesResponseBody extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>000e89fb-cf8f-11e9-8ab4-b6e980803a3b</p>
     */
    @NameInMap("async_task_id")
    public String asyncTaskId;

    public static ArchiveFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ArchiveFilesResponseBody self = new ArchiveFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ArchiveFilesResponseBody setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

}
