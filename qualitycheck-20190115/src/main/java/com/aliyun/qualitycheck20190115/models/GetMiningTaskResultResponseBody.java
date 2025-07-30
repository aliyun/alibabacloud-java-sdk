// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetMiningTaskResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetMiningTaskResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetMiningTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMiningTaskResultResponseBody self = new GetMiningTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMiningTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMiningTaskResultResponseBody setData(GetMiningTaskResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMiningTaskResultResponseBodyData getData() {
        return this.data;
    }

    public GetMiningTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMiningTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMiningTaskResultResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetMiningTaskResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123.22.com/manger/static/login-back.jpg</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <strong>example:</strong>
         * <p>123.22.com/manger/static/login-back.md</p>
         */
        @NameInMap("FilePathMd")
        public String filePathMd;

        /**
         * <strong>example:</strong>
         * <p>20201231de3d34ec-40fa-4a55-8d27-76ea*****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static GetMiningTaskResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMiningTaskResultResponseBodyData self = new GetMiningTaskResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMiningTaskResultResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetMiningTaskResultResponseBodyData setFilePathMd(String filePathMd) {
            this.filePathMd = filePathMd;
            return this;
        }
        public String getFilePathMd() {
            return this.filePathMd;
        }

        public GetMiningTaskResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetMiningTaskResultResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
