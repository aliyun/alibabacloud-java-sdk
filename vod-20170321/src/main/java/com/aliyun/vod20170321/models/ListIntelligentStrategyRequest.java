// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListIntelligentStrategyRequest extends TeaModel {
    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("State")
    public String state;

    @NameInMap("StrategyIds")
    public String strategyIds;

    @NameInMap("Type")
    public String type;

    public static ListIntelligentStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntelligentStrategyRequest self = new ListIntelligentStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ListIntelligentStrategyRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListIntelligentStrategyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIntelligentStrategyRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListIntelligentStrategyRequest setStrategyIds(String strategyIds) {
        this.strategyIds = strategyIds;
        return this;
    }
    public String getStrategyIds() {
        return this.strategyIds;
    }

    public ListIntelligentStrategyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
