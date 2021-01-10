// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CallbackLinkefabricFabricConfigtaskRequest extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("TaskId")
    public Long taskId;

    public static CallbackLinkefabricFabricConfigtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackLinkefabricFabricConfigtaskRequest self = new CallbackLinkefabricFabricConfigtaskRequest();
        return TeaModel.build(map, self);
    }

    public CallbackLinkefabricFabricConfigtaskRequest setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public CallbackLinkefabricFabricConfigtaskRequest setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CallbackLinkefabricFabricConfigtaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
