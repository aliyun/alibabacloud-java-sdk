// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddMonitorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public AddMonitorResponseData data;

    public static AddMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMonitorResponse self = new AddMonitorResponse();
        return TeaModel.build(map, self);
    }

    public static class AddMonitorResponseData extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        public static AddMonitorResponseData build(java.util.Map<String, ?> map) throws Exception {
            AddMonitorResponseData self = new AddMonitorResponseData();
            return TeaModel.build(map, self);
        }

    }

}
