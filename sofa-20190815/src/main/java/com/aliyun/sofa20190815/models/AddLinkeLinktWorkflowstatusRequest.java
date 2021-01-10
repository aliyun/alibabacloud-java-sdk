// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinktWorkflowstatusRequest extends TeaModel {
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

    public static AddLinkeLinktWorkflowstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinktWorkflowstatusRequest self = new AddLinkeLinktWorkflowstatusRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinktWorkflowstatusRequest setAsDefault(Boolean asDefault) {
        this.asDefault = asDefault;
        return this;
    }
    public Boolean getAsDefault() {
        return this.asDefault;
    }

    public AddLinkeLinktWorkflowstatusRequest setConvertStatusId(Long convertStatusId) {
        this.convertStatusId = convertStatusId;
        return this;
    }
    public Long getConvertStatusId() {
        return this.convertStatusId;
    }

    public AddLinkeLinktWorkflowstatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AddLinkeLinktWorkflowstatusRequest setStatusId(Long statusId) {
        this.statusId = statusId;
        return this;
    }
    public Long getStatusId() {
        return this.statusId;
    }

    public AddLinkeLinktWorkflowstatusRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

}
