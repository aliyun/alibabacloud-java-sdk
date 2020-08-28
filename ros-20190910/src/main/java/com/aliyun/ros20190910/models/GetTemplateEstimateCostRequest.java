// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateEstimateCostRequest extends TeaModel {
    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Parameters")
    public java.util.List<GetTemplateEstimateCostRequestParameters> parameters;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("ClientToken")
    public String clientToken;

    public static GetTemplateEstimateCostRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateEstimateCostRequest self = new GetTemplateEstimateCostRequest();
        return TeaModel.build(map, self);
    }

    public static class GetTemplateEstimateCostRequestParameters extends TeaModel {
        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        public static GetTemplateEstimateCostRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateEstimateCostRequestParameters self = new GetTemplateEstimateCostRequestParameters();
            return TeaModel.build(map, self);
        }

    }

}
