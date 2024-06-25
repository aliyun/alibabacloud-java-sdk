// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobScoreReportsShrinkRequest extends TeaModel {
    @NameInMap("ExcludeRequestIds")
    public String excludeRequestIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>pairec-cn-********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListFeatureConsistencyCheckJobScoreReportsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureConsistencyCheckJobScoreReportsShrinkRequest self = new ListFeatureConsistencyCheckJobScoreReportsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureConsistencyCheckJobScoreReportsShrinkRequest setExcludeRequestIdsShrink(String excludeRequestIdsShrink) {
        this.excludeRequestIdsShrink = excludeRequestIdsShrink;
        return this;
    }
    public String getExcludeRequestIdsShrink() {
        return this.excludeRequestIdsShrink;
    }

    public ListFeatureConsistencyCheckJobScoreReportsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
