// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationParameterShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("ParameterName")
    public String parameterName;

    /**
     * <strong>example:</strong>
     * <p>value</p>
     */
    @NameInMap("ParameterValue")
    public String parameterValue;

    @NameInMap("Parameters")
    public String parametersShrink;

    public static ModifyApplicationParameterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationParameterShrinkRequest self = new ModifyApplicationParameterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationParameterShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyApplicationParameterShrinkRequest setParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }
    public String getParameterName() {
        return this.parameterName;
    }

    public ModifyApplicationParameterShrinkRequest setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
        return this;
    }
    public String getParameterValue() {
        return this.parameterValue;
    }

    public ModifyApplicationParameterShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

}
