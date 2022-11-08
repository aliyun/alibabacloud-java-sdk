// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class StartTrainTaskRequest extends TeaModel {
    @NameInMap("ForceStartFlag")
    public Boolean forceStartFlag;

    @NameInMap("Id")
    public Long id;

    @NameInMap("RelyOnTaskId")
    public Long relyOnTaskId;

    public static StartTrainTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTrainTaskRequest self = new StartTrainTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartTrainTaskRequest setForceStartFlag(Boolean forceStartFlag) {
        this.forceStartFlag = forceStartFlag;
        return this;
    }
    public Boolean getForceStartFlag() {
        return this.forceStartFlag;
    }

    public StartTrainTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public StartTrainTaskRequest setRelyOnTaskId(Long relyOnTaskId) {
        this.relyOnTaskId = relyOnTaskId;
        return this;
    }
    public Long getRelyOnTaskId() {
        return this.relyOnTaskId;
    }

}
