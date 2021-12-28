// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeAlertActionPoliciesRequest extends TeaModel {
    @NameInMap("Page")
    public Integer page;

    public static DescribeAlertActionPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertActionPoliciesRequest self = new DescribeAlertActionPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertActionPoliciesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

}
