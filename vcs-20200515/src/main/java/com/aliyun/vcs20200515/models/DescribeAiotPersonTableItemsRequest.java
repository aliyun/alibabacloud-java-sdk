// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotPersonTableItemsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PersonTableId")
    public String personTableId;

    @NameInMap("PersonTableItemId")
    public String personTableItemId;

    public static DescribeAiotPersonTableItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotPersonTableItemsRequest self = new DescribeAiotPersonTableItemsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAiotPersonTableItemsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeAiotPersonTableItemsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeAiotPersonTableItemsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAiotPersonTableItemsRequest setPersonTableId(String personTableId) {
        this.personTableId = personTableId;
        return this;
    }
    public String getPersonTableId() {
        return this.personTableId;
    }

    public DescribeAiotPersonTableItemsRequest setPersonTableItemId(String personTableItemId) {
        this.personTableItemId = personTableItemId;
        return this;
    }
    public String getPersonTableItemId() {
        return this.personTableItemId;
    }

}
