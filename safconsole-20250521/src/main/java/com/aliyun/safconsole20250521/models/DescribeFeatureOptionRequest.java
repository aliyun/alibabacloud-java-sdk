// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeFeatureOptionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FINANCE_51</p>
     */
    @NameInMap("FeatureTemplate")
    public String featureTemplate;

    public static DescribeFeatureOptionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFeatureOptionRequest self = new DescribeFeatureOptionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFeatureOptionRequest setFeatureTemplate(String featureTemplate) {
        this.featureTemplate = featureTemplate;
        return this;
    }
    public String getFeatureTemplate() {
        return this.featureTemplate;
    }

}
