// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class AddStreamGroupRequest extends TeaModel {
    @NameInMap("AlgoTypeEnum")
    public String algoTypeEnum;

    @NameInMap("AlinkJobUser")
    public String alinkJobUser;

    @NameInMap("StreamId")
    public Long streamId;

    @NameInMap("StreamTaskId")
    public Integer streamTaskId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("UserNumber")
    public String userNumber;

    public static AddStreamGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddStreamGroupRequest self = new AddStreamGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddStreamGroupRequest setAlgoTypeEnum(String algoTypeEnum) {
        this.algoTypeEnum = algoTypeEnum;
        return this;
    }
    public String getAlgoTypeEnum() {
        return this.algoTypeEnum;
    }

    public AddStreamGroupRequest setAlinkJobUser(String alinkJobUser) {
        this.alinkJobUser = alinkJobUser;
        return this;
    }
    public String getAlinkJobUser() {
        return this.alinkJobUser;
    }

    public AddStreamGroupRequest setStreamId(Long streamId) {
        this.streamId = streamId;
        return this;
    }
    public Long getStreamId() {
        return this.streamId;
    }

    public AddStreamGroupRequest setStreamTaskId(Integer streamTaskId) {
        this.streamTaskId = streamTaskId;
        return this;
    }
    public Integer getStreamTaskId() {
        return this.streamTaskId;
    }

    public AddStreamGroupRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AddStreamGroupRequest setUserNumber(String userNumber) {
        this.userNumber = userNumber;
        return this;
    }
    public String getUserNumber() {
        return this.userNumber;
    }

}
