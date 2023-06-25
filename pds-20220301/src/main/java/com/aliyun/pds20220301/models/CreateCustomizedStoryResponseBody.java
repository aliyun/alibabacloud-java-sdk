// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateCustomizedStoryResponseBody extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("story_id")
    public String storyId;

    public static CreateCustomizedStoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedStoryResponseBody self = new CreateCustomizedStoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedStoryResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CreateCustomizedStoryResponseBody setStoryId(String storyId) {
        this.storyId = storyId;
        return this;
    }
    public String getStoryId() {
        return this.storyId;
    }

}
