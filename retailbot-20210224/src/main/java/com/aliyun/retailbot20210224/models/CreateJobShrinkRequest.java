// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateJobShrinkRequest extends TeaModel {
    @NameInMap("ActiveJobDTO")
    public String activeJobDTOShrink;

    @NameInMap("UserProfile")
    public String userProfileShrink;

    public static CreateJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobShrinkRequest self = new CreateJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobShrinkRequest setActiveJobDTOShrink(String activeJobDTOShrink) {
        this.activeJobDTOShrink = activeJobDTOShrink;
        return this;
    }
    public String getActiveJobDTOShrink() {
        return this.activeJobDTOShrink;
    }

    public CreateJobShrinkRequest setUserProfileShrink(String userProfileShrink) {
        this.userProfileShrink = userProfileShrink;
        return this;
    }
    public String getUserProfileShrink() {
        return this.userProfileShrink;
    }

}
