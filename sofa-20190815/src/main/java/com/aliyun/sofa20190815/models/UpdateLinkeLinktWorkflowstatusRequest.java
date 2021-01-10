// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktWorkflowstatusRequest extends TeaModel {
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

    public static UpdateLinkeLinktWorkflowstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktWorkflowstatusRequest self = new UpdateLinkeLinktWorkflowstatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktWorkflowstatusRequest setAsDefault(Boolean asDefault) {
        this.asDefault = asDefault;
        return this;
    }
    public Boolean getAsDefault() {
        return this.asDefault;
    }

    public UpdateLinkeLinktWorkflowstatusRequest setConvertStatusId(Long convertStatusId) {
        this.convertStatusId = convertStatusId;
        return this;
    }
    public Long getConvertStatusId() {
        return this.convertStatusId;
    }

    public UpdateLinkeLinktWorkflowstatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeLinktWorkflowstatusRequest setStatusId(Long statusId) {
        this.statusId = statusId;
        return this;
    }
    public Long getStatusId() {
        return this.statusId;
    }

    public UpdateLinkeLinktWorkflowstatusRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

}
