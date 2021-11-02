// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryUnionTaskListRequest extends TeaModel {
    @NameInMap("BrandUserId")
    public Long brandUserId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProxyUserId")
    public Long proxyUserId;

    public static QueryUnionTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionTaskListRequest self = new QueryUnionTaskListRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnionTaskListRequest setBrandUserId(Long brandUserId) {
        this.brandUserId = brandUserId;
        return this;
    }
    public Long getBrandUserId() {
        return this.brandUserId;
    }

    public QueryUnionTaskListRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryUnionTaskListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public QueryUnionTaskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryUnionTaskListRequest setProxyUserId(Long proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

}
