// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendWordAndIndexRequest extends TeaModel {
    @NameInMap("CateIds")
    public String cateIds;

    @NameInMap("EndingDate")
    public String endingDate;

    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("StartDate")
    public String startDate;

    public static GetTrendWordAndIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrendWordAndIndexRequest self = new GetTrendWordAndIndexRequest();
        return TeaModel.build(map, self);
    }

    public GetTrendWordAndIndexRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

    public GetTrendWordAndIndexRequest setEndingDate(String endingDate) {
        this.endingDate = endingDate;
        return this;
    }
    public String getEndingDate() {
        return this.endingDate;
    }

    public GetTrendWordAndIndexRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public GetTrendWordAndIndexRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
