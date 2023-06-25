// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DeleteStoryResponseBody extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    public static DeleteStoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStoryResponseBody self = new DeleteStoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStoryResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

}
