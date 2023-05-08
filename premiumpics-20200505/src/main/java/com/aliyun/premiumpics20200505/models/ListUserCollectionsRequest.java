// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListUserCollectionsRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListUserCollectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserCollectionsRequest self = new ListUserCollectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserCollectionsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ListUserCollectionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListUserCollectionsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
