// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetCrowdLabelRequest extends TeaModel {
    @NameInMap("CateIds")
    public String cateIds;

    @NameInMap("EndingDate")
    public String endingDate;

    @NameInMap("StartDate")
    public String startDate;

    public static GetCrowdLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCrowdLabelRequest self = new GetCrowdLabelRequest();
        return TeaModel.build(map, self);
    }

    public GetCrowdLabelRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

    public GetCrowdLabelRequest setEndingDate(String endingDate) {
        this.endingDate = endingDate;
        return this;
    }
    public String getEndingDate() {
        return this.endingDate;
    }

    public GetCrowdLabelRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
