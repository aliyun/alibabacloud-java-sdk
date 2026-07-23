// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobScoreReportsRequest extends TeaModel {
    /**
     * <p>A list of request IDs to exclude from the feature comparison.</p>
     */
    @NameInMap("ExcludeRequestIds")
    public java.util.List<String> excludeRequestIds;

    /**
     * <p>The ID of the instance. To obtain the instance ID, see <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListFeatureConsistencyCheckJobScoreReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureConsistencyCheckJobScoreReportsRequest self = new ListFeatureConsistencyCheckJobScoreReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureConsistencyCheckJobScoreReportsRequest setExcludeRequestIds(java.util.List<String> excludeRequestIds) {
        this.excludeRequestIds = excludeRequestIds;
        return this;
    }
    public java.util.List<String> getExcludeRequestIds() {
        return this.excludeRequestIds;
    }

    public ListFeatureConsistencyCheckJobScoreReportsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
