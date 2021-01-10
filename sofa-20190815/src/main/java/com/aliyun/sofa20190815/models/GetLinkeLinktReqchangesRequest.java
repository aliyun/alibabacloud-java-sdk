// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktReqchangesRequest extends TeaModel {
    @NameInMap("WorkItemSign")
    public String workItemSign;

    public static GetLinkeLinktReqchangesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktReqchangesRequest self = new GetLinkeLinktReqchangesRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktReqchangesRequest setWorkItemSign(String workItemSign) {
        this.workItemSign = workItemSign;
        return this;
    }
    public String getWorkItemSign() {
        return this.workItemSign;
    }

}
