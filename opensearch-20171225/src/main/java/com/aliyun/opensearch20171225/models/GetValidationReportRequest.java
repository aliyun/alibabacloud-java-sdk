// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetValidationReportRequest extends TeaModel {
    @NameInMap("type")
    public String type;

    public static GetValidationReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetValidationReportRequest self = new GetValidationReportRequest();
        return TeaModel.build(map, self);
    }

    public GetValidationReportRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
