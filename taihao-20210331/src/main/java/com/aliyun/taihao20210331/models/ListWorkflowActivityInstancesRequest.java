// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListWorkflowActivityInstancesRequest extends TeaModel {
    // 查询工作流实例下面所有活动实例列表
    @NameInMap("listWorkflowActivityInstancesParam")
    public ListWorkflowActivityInstancesParam listWorkflowActivityInstancesParam;

    public static ListWorkflowActivityInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowActivityInstancesRequest self = new ListWorkflowActivityInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkflowActivityInstancesRequest setListWorkflowActivityInstancesParam(ListWorkflowActivityInstancesParam listWorkflowActivityInstancesParam) {
        this.listWorkflowActivityInstancesParam = listWorkflowActivityInstancesParam;
        return this;
    }
    public ListWorkflowActivityInstancesParam getListWorkflowActivityInstancesParam() {
        return this.listWorkflowActivityInstancesParam;
    }

}
