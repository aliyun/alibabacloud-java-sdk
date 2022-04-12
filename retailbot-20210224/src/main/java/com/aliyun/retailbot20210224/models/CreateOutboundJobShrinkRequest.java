// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateOutboundJobShrinkRequest extends TeaModel {
    @NameInMap("OutboundJobDTO")
    public String outboundJobDTOShrink;

    @NameInMap("UserProfile")
    public String userProfileShrink;

    public static CreateOutboundJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOutboundJobShrinkRequest self = new CreateOutboundJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOutboundJobShrinkRequest setOutboundJobDTOShrink(String outboundJobDTOShrink) {
        this.outboundJobDTOShrink = outboundJobDTOShrink;
        return this;
    }
    public String getOutboundJobDTOShrink() {
        return this.outboundJobDTOShrink;
    }

    public CreateOutboundJobShrinkRequest setUserProfileShrink(String userProfileShrink) {
        this.userProfileShrink = userProfileShrink;
        return this;
    }
    public String getUserProfileShrink() {
        return this.userProfileShrink;
    }

}
