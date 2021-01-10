// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasDiagnosisEmergencyoftaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("DgNodeId")
    public String dgNodeId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static ListHasDiagnosisEmergencyoftaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHasDiagnosisEmergencyoftaskRequest self = new ListHasDiagnosisEmergencyoftaskRequest();
        return TeaModel.build(map, self);
    }

    public ListHasDiagnosisEmergencyoftaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListHasDiagnosisEmergencyoftaskRequest setDgNodeId(String dgNodeId) {
        this.dgNodeId = dgNodeId;
        return this;
    }
    public String getDgNodeId() {
        return this.dgNodeId;
    }

    public ListHasDiagnosisEmergencyoftaskRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
