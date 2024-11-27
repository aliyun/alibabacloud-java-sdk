// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateExecuteJobResponseBody extends TeaModel {
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
    public OperateExecuteJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6305893D-517D-5131-A767-644EDA81CEC3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static OperateExecuteJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateExecuteJobResponseBody self = new OperateExecuteJobResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateExecuteJobResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public OperateExecuteJobResponseBody setData(OperateExecuteJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OperateExecuteJobResponseBodyData getData() {
        return this.data;
    }

    public OperateExecuteJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OperateExecuteJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OperateExecuteJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OperateExecuteJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1310630367761285120</p>
         */
        @NameInMap("JobExecutionId")
        public String jobExecutionId;

        public static OperateExecuteJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OperateExecuteJobResponseBodyData self = new OperateExecuteJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OperateExecuteJobResponseBodyData setJobExecutionId(String jobExecutionId) {
            this.jobExecutionId = jobExecutionId;
            return this;
        }
        public String getJobExecutionId() {
            return this.jobExecutionId;
        }

    }

}
