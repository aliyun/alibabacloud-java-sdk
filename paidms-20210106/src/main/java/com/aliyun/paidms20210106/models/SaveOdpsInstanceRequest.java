// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class SaveOdpsInstanceRequest extends TeaModel {
    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("NodeInstanceId")
    public Long nodeInstanceId;

    @NameInMap("OdpsInstanceId")
    public String odpsInstanceId;

    @NameInMap("OdpsInstanceStatus")
    public Integer odpsInstanceStatus;

    @NameInMap("TaskId")
    public String taskId;

    public static SaveOdpsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveOdpsInstanceRequest self = new SaveOdpsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SaveOdpsInstanceRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public SaveOdpsInstanceRequest setNodeInstanceId(Long nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }
    public Long getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    public SaveOdpsInstanceRequest setOdpsInstanceId(String odpsInstanceId) {
        this.odpsInstanceId = odpsInstanceId;
        return this;
    }
    public String getOdpsInstanceId() {
        return this.odpsInstanceId;
    }

    public SaveOdpsInstanceRequest setOdpsInstanceStatus(Integer odpsInstanceStatus) {
        this.odpsInstanceStatus = odpsInstanceStatus;
        return this;
    }
    public Integer getOdpsInstanceStatus() {
        return this.odpsInstanceStatus;
    }

    public SaveOdpsInstanceRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
