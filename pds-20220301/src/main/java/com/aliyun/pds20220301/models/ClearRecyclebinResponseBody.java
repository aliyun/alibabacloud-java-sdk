// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ClearRecyclebinResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     * <p>You can call the GetAsyncTask operation to query the information about the asynchronous task based on the task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13ebd3a24dba4166b1527add676ef2866051b4d5dele16</p>
     */
    @NameInMap("async_task_id")
    public String asyncTaskId;

    /**
     * <p>The domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The drive ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    public static ClearRecyclebinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearRecyclebinResponseBody self = new ClearRecyclebinResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearRecyclebinResponseBody setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public ClearRecyclebinResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public ClearRecyclebinResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

}
