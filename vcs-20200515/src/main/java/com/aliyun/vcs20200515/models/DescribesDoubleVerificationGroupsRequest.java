// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribesDoubleVerificationGroupsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("DoubleVerificationGroupIds")
    public String doubleVerificationGroupIds;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribesDoubleVerificationGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribesDoubleVerificationGroupsRequest self = new DescribesDoubleVerificationGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribesDoubleVerificationGroupsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribesDoubleVerificationGroupsRequest setDoubleVerificationGroupIds(String doubleVerificationGroupIds) {
        this.doubleVerificationGroupIds = doubleVerificationGroupIds;
        return this;
    }
    public String getDoubleVerificationGroupIds() {
        return this.doubleVerificationGroupIds;
    }

    public DescribesDoubleVerificationGroupsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribesDoubleVerificationGroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
