// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobGroupNamesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryTSJobGroupNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobGroupNamesRequest self = new QueryTSJobGroupNamesRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSJobGroupNamesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
