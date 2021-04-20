// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotPersonTablesRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PersonTableIdList")
    public String personTableIdList;

    public static DescribeAiotPersonTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotPersonTablesRequest self = new DescribeAiotPersonTablesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAiotPersonTablesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeAiotPersonTablesRequest setPersonTableIdList(String personTableIdList) {
        this.personTableIdList = personTableIdList;
        return this;
    }
    public String getPersonTableIdList() {
        return this.personTableIdList;
    }

}
