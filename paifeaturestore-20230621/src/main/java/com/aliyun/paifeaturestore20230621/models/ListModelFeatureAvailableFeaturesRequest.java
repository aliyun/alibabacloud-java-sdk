// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListModelFeatureAvailableFeaturesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f1</p>
     */
    @NameInMap("FeatureName")
    public String featureName;

    public static ListModelFeatureAvailableFeaturesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelFeatureAvailableFeaturesRequest self = new ListModelFeatureAvailableFeaturesRequest();
        return TeaModel.build(map, self);
    }

    public ListModelFeatureAvailableFeaturesRequest setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

}
