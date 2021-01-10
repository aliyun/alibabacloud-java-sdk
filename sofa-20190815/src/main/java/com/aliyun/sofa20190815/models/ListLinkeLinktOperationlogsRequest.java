// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktOperationlogsRequest extends TeaModel {
    @NameInMap("WorkItemSign")
    public String workItemSign;

    public static ListLinkeLinktOperationlogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktOperationlogsRequest self = new ListLinkeLinktOperationlogsRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktOperationlogsRequest setWorkItemSign(String workItemSign) {
        this.workItemSign = workItemSign;
        return this;
    }
    public String getWorkItemSign() {
        return this.workItemSign;
    }

}
