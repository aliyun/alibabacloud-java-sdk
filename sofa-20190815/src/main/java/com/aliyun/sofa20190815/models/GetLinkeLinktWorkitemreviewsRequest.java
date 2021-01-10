// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktWorkitemreviewsRequest extends TeaModel {
    @NameInMap("WorkItemSign")
    public String workItemSign;

    public static GetLinkeLinktWorkitemreviewsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktWorkitemreviewsRequest self = new GetLinkeLinktWorkitemreviewsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktWorkitemreviewsRequest setWorkItemSign(String workItemSign) {
        this.workItemSign = workItemSign;
        return this;
    }
    public String getWorkItemSign() {
        return this.workItemSign;
    }

}
