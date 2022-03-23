// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeSubscribeRequest extends TeaModel {
    @NameInMap("PageNum")
    public String pageNum;

    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeSubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscribeRequest self = new DescribeSubscribeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSubscribeRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public DescribeSubscribeRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
