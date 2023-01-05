// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetSummaryInfoRequest extends TeaModel {
    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    public static GetSummaryInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryInfoRequest self = new GetSummaryInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetSummaryInfoRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

}
