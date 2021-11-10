// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class MarketTaskInfoQueryRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("MarketType")
    public String marketType;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static MarketTaskInfoQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        MarketTaskInfoQueryRequest self = new MarketTaskInfoQueryRequest();
        return TeaModel.build(map, self);
    }

    public MarketTaskInfoQueryRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public MarketTaskInfoQueryRequest setMarketType(String marketType) {
        this.marketType = marketType;
        return this;
    }
    public String getMarketType() {
        return this.marketType;
    }

    public MarketTaskInfoQueryRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public MarketTaskInfoQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public MarketTaskInfoQueryRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public MarketTaskInfoQueryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
