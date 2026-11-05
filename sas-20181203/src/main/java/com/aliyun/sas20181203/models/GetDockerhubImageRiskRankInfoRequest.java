// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetDockerhubImageRiskRankInfoRequest extends TeaModel {
    /**
     * <p>The image dimension types to be aggregated.</p>
     * <blockquote>
     * <p>This parameter is required. You must specify at least one valid value. If no value is specified or all specified values are invalid, the API returns HTTP 400 with the error code -101.</p>
     * </blockquote>
     */
    @NameInMap("Types")
    public java.util.List<String> types;

    public static GetDockerhubImageRiskRankInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDockerhubImageRiskRankInfoRequest self = new GetDockerhubImageRiskRankInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDockerhubImageRiskRankInfoRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
