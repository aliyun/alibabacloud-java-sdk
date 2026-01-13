// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class CreateCustomerModuleMetaInfoRequest extends TeaModel {
    /**
     * <p>Customer model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CustomerModuleId")
    public Integer customerModuleId;

    /**
     * <p>A string representation of List<Object>, where Object has the following structure:
     * {
     * &quot;mappingName&quot;: &quot;xxx&quot;
     * }</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;mappingName\&quot;:\&quot;f1\&quot;,\&quot;fieldName\&quot;:\&quot;saf_shanghai_new.f1\&quot;,\&quot;valueType\&quot;:\&quot;DOUBLE\&quot;,\&quot;defaultValue\&quot;:\&quot;\&quot;}</p>
     */
    @NameInMap("FeatureString")
    public String featureString;

    /**
     * <p>Version of the feature adopted.</p>
     * 
     * <strong>example:</strong>
     * <p>FINANCE_51</p>
     */
    @NameInMap("FeatureTemplate")
    public String featureTemplate;

    public static CreateCustomerModuleMetaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomerModuleMetaInfoRequest self = new CreateCustomerModuleMetaInfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomerModuleMetaInfoRequest setCustomerModuleId(Integer customerModuleId) {
        this.customerModuleId = customerModuleId;
        return this;
    }
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

    public CreateCustomerModuleMetaInfoRequest setFeatureString(String featureString) {
        this.featureString = featureString;
        return this;
    }
    public String getFeatureString() {
        return this.featureString;
    }

    public CreateCustomerModuleMetaInfoRequest setFeatureTemplate(String featureTemplate) {
        this.featureTemplate = featureTemplate;
        return this;
    }
    public String getFeatureTemplate() {
        return this.featureTemplate;
    }

}
