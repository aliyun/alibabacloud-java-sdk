// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListWorkflowActivityInstancesShrinkRequest extends TeaModel {
    // 查询工作流实例下面所有活动实例列表
    @NameInMap("listWorkflowActivityInstancesParam")
    public String listWorkflowActivityInstancesParamShrink;

    public static ListWorkflowActivityInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowActivityInstancesShrinkRequest self = new ListWorkflowActivityInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkflowActivityInstancesShrinkRequest setListWorkflowActivityInstancesParamShrink(String listWorkflowActivityInstancesParamShrink) {
        this.listWorkflowActivityInstancesParamShrink = listWorkflowActivityInstancesParamShrink;
        return this;
    }
    public String getListWorkflowActivityInstancesParamShrink() {
        return this.listWorkflowActivityInstancesParamShrink;
    }

}
