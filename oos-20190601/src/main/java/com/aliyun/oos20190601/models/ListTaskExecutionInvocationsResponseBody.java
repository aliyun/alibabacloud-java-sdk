// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTaskExecutionInvocationsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9E011F98-4EE5-5E3A-8FA3-D38F2C531C1F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskExecutionInvocations")
    public java.util.List<ListTaskExecutionInvocationsResponseBodyTaskExecutionInvocations> taskExecutionInvocations;

    public static ListTaskExecutionInvocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskExecutionInvocationsResponseBody self = new ListTaskExecutionInvocationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskExecutionInvocationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskExecutionInvocationsResponseBody setTaskExecutionInvocations(java.util.List<ListTaskExecutionInvocationsResponseBodyTaskExecutionInvocations> taskExecutionInvocations) {
        this.taskExecutionInvocations = taskExecutionInvocations;
        return this;
    }
    public java.util.List<ListTaskExecutionInvocationsResponseBodyTaskExecutionInvocations> getTaskExecutionInvocations() {
        return this.taskExecutionInvocations;
    }

    public static class ListTaskExecutionInvocationsResponseBodyTaskExecutionInvocations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>t-hz0jdfwd9f****</p>
         */
        @NameInMap("InvocationId")
        public String invocationId;

        /**
         * <strong>example:</strong>
         * <p>exec-xxxx.t0001</p>
         */
        @NameInMap("InvocationTaskExecutionId")
        public String invocationTaskExecutionId;

        /**
         * <strong>example:</strong>
         * <p>TaskName</p>
         */
        @NameInMap("InvocationTaskName")
        public String invocationTaskName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListTaskExecutionInvocationsResponseBodyTaskExecutionInvocations build(java.util.Map<String, ?> map) throws Exception {
            ListTaskExecutionInvocationsResponseBodyTaskExecutionInvocations self = new ListTaskExecutionInvocationsResponseBodyTaskExecutionInvocations();
            return TeaModel.build(map, self);
        }

        public ListTaskExecutionInvocationsResponseBodyTaskExecutionInvocations setInvocationId(String invocationId) {
            this.invocationId = invocationId;
            return this;
        }
        public String getInvocationId() {
            return this.invocationId;
        }

        public ListTaskExecutionInvocationsResponseBodyTaskExecutionInvocations setInvocationTaskExecutionId(String invocationTaskExecutionId) {
            this.invocationTaskExecutionId = invocationTaskExecutionId;
            return this;
        }
        public String getInvocationTaskExecutionId() {
            return this.invocationTaskExecutionId;
        }

        public ListTaskExecutionInvocationsResponseBodyTaskExecutionInvocations setInvocationTaskName(String invocationTaskName) {
            this.invocationTaskName = invocationTaskName;
            return this;
        }
        public String getInvocationTaskName() {
            return this.invocationTaskName;
        }

        public ListTaskExecutionInvocationsResponseBodyTaskExecutionInvocations setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListTaskExecutionInvocationsResponseBodyTaskExecutionInvocations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
