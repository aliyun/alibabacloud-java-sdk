// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetJobExecutionThreadDumpResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public GetJobExecutionThreadDumpResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter error: appId is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3835AA29-2298-5434-BC53-9CC377CDFD2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetJobExecutionThreadDumpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobExecutionThreadDumpResponseBody self = new GetJobExecutionThreadDumpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobExecutionThreadDumpResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetJobExecutionThreadDumpResponseBody setData(GetJobExecutionThreadDumpResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobExecutionThreadDumpResponseBodyData getData() {
        return this.data;
    }

    public GetJobExecutionThreadDumpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobExecutionThreadDumpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobExecutionThreadDumpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobExecutionThreadDumpResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>\&quot;Thread-7\&quot; Id=67 TIMED_WAITING\n\tat <a href="mailto:java.base@17.0.5">java.base@17.0.5</a>/java.lang.Thread.sleep(Native Method)\n\tat app//com.xxl.job.executor.service.jobhandler.SampleXxlJob.shardingJobHandler(SampleXxlJob.java:73)\n\tat <a href="mailto:java.base@17.0.5">java.base@17.0.5</a>/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat <a href="mailto:java.base@17.0.5">java.base@17.0.5</a>/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\n\tat <a href="mailto:java.base@17.0.5">java.base@17.0.5</a>/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat <a href="mailto:java.base@17.0.5">java.base@17.0.5</a>/java.lang.reflect.Method.invoke(Method.java:568)\n\tat app//com.xxl.job.core.handler.impl.MethodJobHandler.execute(MethodJobHandler.java:29)\n\tat app//com.xxl.job.core.thread.JobThread.run(JobThread.java:152)\n</p>
         */
        @NameInMap("Dump")
        public String dump;

        public static GetJobExecutionThreadDumpResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobExecutionThreadDumpResponseBodyData self = new GetJobExecutionThreadDumpResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobExecutionThreadDumpResponseBodyData setDump(String dump) {
            this.dump = dump;
            return this;
        }
        public String getDump() {
            return this.dump;
        }

    }

}
