// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetStyleTopRequest extends TeaModel {
    // A short description of struct
    @NameInMap("CateIds")
    public String cateIds;

    @NameInMap("SortOrder")
    public Long sortOrder;

    @NameInMap("TimeDisplay")
    public Long timeDisplay;

    public static GetStyleTopRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStyleTopRequest self = new GetStyleTopRequest();
        return TeaModel.build(map, self);
    }

    public GetStyleTopRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

    public GetStyleTopRequest setSortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public Long getSortOrder() {
        return this.sortOrder;
    }

    public GetStyleTopRequest setTimeDisplay(Long timeDisplay) {
        this.timeDisplay = timeDisplay;
        return this;
    }
    public Long getTimeDisplay() {
        return this.timeDisplay;
    }

}
