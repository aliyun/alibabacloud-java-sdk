// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AddStoryFilesResponseBody extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("story_id")
    public String storyId;

    public static AddStoryFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddStoryFilesResponseBody self = new AddStoryFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddStoryFilesResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public AddStoryFilesResponseBody setStoryId(String storyId) {
        this.storyId = storyId;
        return this;
    }
    public String getStoryId() {
        return this.storyId;
    }

}
