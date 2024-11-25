// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCSnapshotResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE93CC0D-B65D-5723-AAB1-08CB8BBABAB9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The snapshot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rcds-7mbefjzkqccvdev****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static CreateRCSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRCSnapshotResponseBody self = new CreateRCSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRCSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRCSnapshotResponseBody setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
