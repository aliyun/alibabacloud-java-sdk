// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QuerySampleConsistencyJobDifferenceRequest extends TeaModel {
    @NameInMap("FeatureName")
    public String featureName;

    @NameInMap("FeatureType")
    public String featureType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static QuerySampleConsistencyJobDifferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySampleConsistencyJobDifferenceRequest self = new QuerySampleConsistencyJobDifferenceRequest();
        return TeaModel.build(map, self);
    }

    public QuerySampleConsistencyJobDifferenceRequest setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

    public QuerySampleConsistencyJobDifferenceRequest setFeatureType(String featureType) {
        this.featureType = featureType;
        return this;
    }
    public String getFeatureType() {
        return this.featureType;
    }

    public QuerySampleConsistencyJobDifferenceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
