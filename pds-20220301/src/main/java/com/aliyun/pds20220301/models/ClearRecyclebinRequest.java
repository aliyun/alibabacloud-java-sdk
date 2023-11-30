// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ClearRecyclebinRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    public static ClearRecyclebinRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearRecyclebinRequest self = new ClearRecyclebinRequest();
        return TeaModel.build(map, self);
    }

    public ClearRecyclebinRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

}
