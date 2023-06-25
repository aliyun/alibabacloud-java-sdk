// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateStoryResponseBody extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    public static CreateStoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStoryResponseBody self = new CreateStoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStoryResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

}
