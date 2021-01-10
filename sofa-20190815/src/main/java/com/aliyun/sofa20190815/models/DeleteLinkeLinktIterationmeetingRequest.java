// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktIterationmeetingRequest extends TeaModel {
    @NameInMap("IterationMeetingId")
    public String iterationMeetingId;

    public static DeleteLinkeLinktIterationmeetingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktIterationmeetingRequest self = new DeleteLinkeLinktIterationmeetingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktIterationmeetingRequest setIterationMeetingId(String iterationMeetingId) {
        this.iterationMeetingId = iterationMeetingId;
        return this;
    }
    public String getIterationMeetingId() {
        return this.iterationMeetingId;
    }

}
