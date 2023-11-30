// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetDriveRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    public static GetDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDriveRequest self = new GetDriveRequest();
        return TeaModel.build(map, self);
    }

    public GetDriveRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

}
