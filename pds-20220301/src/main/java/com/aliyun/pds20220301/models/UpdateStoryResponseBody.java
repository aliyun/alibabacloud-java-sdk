// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateStoryResponseBody extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("story_id")
    public String storyId;

    public static UpdateStoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoryResponseBody self = new UpdateStoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStoryResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public UpdateStoryResponseBody setStoryId(String storyId) {
        this.storyId = storyId;
        return this;
    }
    public String getStoryId() {
        return this.storyId;
    }

}
