// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendIndexRequest extends TeaModel {
    @NameInMap("CateIds")
    public String cateIds;

    @NameInMap("MonthNum")
    public Integer monthNum;

    public static GetTrendIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrendIndexRequest self = new GetTrendIndexRequest();
        return TeaModel.build(map, self);
    }

    public GetTrendIndexRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

    public GetTrendIndexRequest setMonthNum(Integer monthNum) {
        this.monthNum = monthNum;
        return this;
    }
    public Integer getMonthNum() {
        return this.monthNum;
    }

}
