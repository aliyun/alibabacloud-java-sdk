// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListRuleTargetAllRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static ListRuleTargetAllRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRuleTargetAllRequest self = new ListRuleTargetAllRequest();
        return TeaModel.build(map, self);
    }

    public ListRuleTargetAllRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
