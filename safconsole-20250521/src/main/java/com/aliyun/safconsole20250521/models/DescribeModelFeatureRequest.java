// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeModelFeatureRequest extends TeaModel {
    /**
     * <p>Customer model ID</p>
     * 
     * <strong>example:</strong>
     * <p>456</p>
     */
    @NameInMap("CustomerModuleId")
    public Integer customerModuleId;

    /**
     * <p>Feature template.</p>
     * 
     * <strong>example:</strong>
     * <p>FINANCE_51</p>
     */
    @NameInMap("FeatureTemplate")
    public String featureTemplate;

    public static DescribeModelFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelFeatureRequest self = new DescribeModelFeatureRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModelFeatureRequest setCustomerModuleId(Integer customerModuleId) {
        this.customerModuleId = customerModuleId;
        return this;
    }
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

    public DescribeModelFeatureRequest setFeatureTemplate(String featureTemplate) {
        this.featureTemplate = featureTemplate;
        return this;
    }
    public String getFeatureTemplate() {
        return this.featureTemplate;
    }

}
