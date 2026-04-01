// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AttachRCInstancesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>847BA085-B377-4BFA-8267-F82345ECE1D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Responses")
    public java.util.List<AttachRCInstancesResponseBodyResponses> responses;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>178968983</p>
     */
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
        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-e2g521l55k038cr8****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The message returned.</p>
         * <blockquote>
         * <p> If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message that contains information such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
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
