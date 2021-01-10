// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktIterationmeetingRequest extends TeaModel {
    @NameInMap("IterationMeetingId")
    public String iterationMeetingId;

    public static QueryLinkeLinktIterationmeetingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktIterationmeetingRequest self = new QueryLinkeLinktIterationmeetingRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktIterationmeetingRequest setIterationMeetingId(String iterationMeetingId) {
        this.iterationMeetingId = iterationMeetingId;
        return this;
    }
    public String getIterationMeetingId() {
        return this.iterationMeetingId;
    }

}
