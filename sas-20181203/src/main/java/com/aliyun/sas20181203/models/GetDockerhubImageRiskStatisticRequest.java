// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetDockerhubImageRiskStatisticRequest extends TeaModel {
    /**
     * <p>The types of image risks to be queried.</p>
     */
    @NameInMap("Types")
    public java.util.List<String> types;

    public static GetDockerhubImageRiskStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDockerhubImageRiskStatisticRequest self = new GetDockerhubImageRiskStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetDockerhubImageRiskStatisticRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
