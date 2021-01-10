// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktCreatestatusandaddtoworkflowRequest extends TeaModel {
    @NameInMap("FormJsonStr")
    public String formJsonStr;

    @NameInMap("WorkflowId")
    public String workflowId;

    public static ExecLinkeLinktCreatestatusandaddtoworkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktCreatestatusandaddtoworkflowRequest self = new ExecLinkeLinktCreatestatusandaddtoworkflowRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktCreatestatusandaddtoworkflowRequest setFormJsonStr(String formJsonStr) {
        this.formJsonStr = formJsonStr;
        return this;
    }
    public String getFormJsonStr() {
        return this.formJsonStr;
    }

    public ExecLinkeLinktCreatestatusandaddtoworkflowRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
