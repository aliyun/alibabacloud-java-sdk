// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktCreatestatusandupdatetoworkflowRequest extends TeaModel {
    @NameInMap("FormJsonStr")
    public String formJsonStr;

    @NameInMap("WorkflowId")
    public String workflowId;

    @NameInMap("WorkflowStatusId")
    public String workflowStatusId;

    public static ExecLinkeLinktCreatestatusandupdatetoworkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktCreatestatusandupdatetoworkflowRequest self = new ExecLinkeLinktCreatestatusandupdatetoworkflowRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktCreatestatusandupdatetoworkflowRequest setFormJsonStr(String formJsonStr) {
        this.formJsonStr = formJsonStr;
        return this;
    }
    public String getFormJsonStr() {
        return this.formJsonStr;
    }

    public ExecLinkeLinktCreatestatusandupdatetoworkflowRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

    public ExecLinkeLinktCreatestatusandupdatetoworkflowRequest setWorkflowStatusId(String workflowStatusId) {
        this.workflowStatusId = workflowStatusId;
        return this;
    }
    public String getWorkflowStatusId() {
        return this.workflowStatusId;
    }

}
