// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktWorkflowstatusRequest extends TeaModel {
    @NameInMap("AsDefault")
    public Boolean asDefault;

    @NameInMap("ConvertStatusId")
    public Long convertStatusId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("StatusId")
    public Long statusId;

    @NameInMap("WorkflowId")
    public Long workflowId;

    public static DeleteLinkeLinktWorkflowstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktWorkflowstatusRequest self = new DeleteLinkeLinktWorkflowstatusRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktWorkflowstatusRequest setAsDefault(Boolean asDefault) {
        this.asDefault = asDefault;
        return this;
    }
    public Boolean getAsDefault() {
        return this.asDefault;
    }

    public DeleteLinkeLinktWorkflowstatusRequest setConvertStatusId(Long convertStatusId) {
        this.convertStatusId = convertStatusId;
        return this;
    }
    public Long getConvertStatusId() {
        return this.convertStatusId;
    }

    public DeleteLinkeLinktWorkflowstatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteLinkeLinktWorkflowstatusRequest setStatusId(Long statusId) {
        this.statusId = statusId;
        return this;
    }
    public Long getStatusId() {
        return this.statusId;
    }

    public DeleteLinkeLinktWorkflowstatusRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

}
