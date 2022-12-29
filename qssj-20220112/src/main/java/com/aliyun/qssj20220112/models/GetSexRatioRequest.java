// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetSexRatioRequest extends TeaModel {
    @NameInMap("CateIds")
    public String cateIds;

    @NameInMap("EndingDate")
    public String endingDate;

    @NameInMap("StartDate")
    public String startDate;

    public static GetSexRatioRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSexRatioRequest self = new GetSexRatioRequest();
        return TeaModel.build(map, self);
    }

    public GetSexRatioRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

    public GetSexRatioRequest setEndingDate(String endingDate) {
        this.endingDate = endingDate;
        return this;
    }
    public String getEndingDate() {
        return this.endingDate;
    }

    public GetSexRatioRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
