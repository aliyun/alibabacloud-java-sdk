// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AttachRCInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Responses")
    public java.util.List<AttachRCInstancesResponseBodyResponses> responses;

    @NameInMap("TaskId")
    public String taskId;

    public static AttachRCInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachRCInstancesResponseBody self = new AttachRCInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachRCInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachRCInstancesResponseBody setResponses(java.util.List<AttachRCInstancesResponseBodyResponses> responses) {
        this.responses = responses;
        return this;
    }
    public java.util.List<AttachRCInstancesResponseBodyResponses> getResponses() {
        return this.responses;
    }

    public AttachRCInstancesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class AttachRCInstancesResponseBodyResponses extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Message")
        public String message;

        public static AttachRCInstancesResponseBodyResponses build(java.util.Map<String, ?> map) throws Exception {
            AttachRCInstancesResponseBodyResponses self = new AttachRCInstancesResponseBodyResponses();
            return TeaModel.build(map, self);
        }

        public AttachRCInstancesResponseBodyResponses setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachRCInstancesResponseBodyResponses setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AttachRCInstancesResponseBodyResponses setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
