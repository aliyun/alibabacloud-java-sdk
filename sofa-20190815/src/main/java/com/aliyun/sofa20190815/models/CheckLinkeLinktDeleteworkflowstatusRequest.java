// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeLinktDeleteworkflowstatusRequest extends TeaModel {
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

    public static CheckLinkeLinktDeleteworkflowstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeLinktDeleteworkflowstatusRequest self = new CheckLinkeLinktDeleteworkflowstatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeLinktDeleteworkflowstatusRequest setAsDefault(Boolean asDefault) {
        this.asDefault = asDefault;
        return this;
    }
    public Boolean getAsDefault() {
        return this.asDefault;
    }

    public CheckLinkeLinktDeleteworkflowstatusRequest setConvertStatusId(Long convertStatusId) {
        this.convertStatusId = convertStatusId;
        return this;
    }
    public Long getConvertStatusId() {
        return this.convertStatusId;
    }

    public CheckLinkeLinktDeleteworkflowstatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CheckLinkeLinktDeleteworkflowstatusRequest setStatusId(Long statusId) {
        this.statusId = statusId;
        return this;
    }
    public Long getStatusId() {
        return this.statusId;
    }

    public CheckLinkeLinktDeleteworkflowstatusRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

}
