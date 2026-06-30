// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetMiningTaskResultResponseBody extends TeaModel {
    /**
     * <p>Result code. <strong>200</strong> indicates success. Any other value indicates failure. Use this field to determine the cause of failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Quality inspection task ID.</p>
     */
    @NameInMap("Data")
    public GetMiningTaskResultResponseBodyData data;

    /**
     * <p>Details of the error if an error occurs. Otherwise, <strong>successful</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. true means success. false or null means failure.</p>
     * 
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

    public static class GetMiningTaskResultResponseBodyDataFilePathList extends TeaModel {
        /**
         * <p>Generated file type</p>
         * 
         * <strong>example:</strong>
         * <p>CSV</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>Generated file URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://vxxxcustomer-pop.oss-cn-shanghai.aliyuncs.com/100.csv">http://vxxxcustomer-pop.oss-cn-shanghai.aliyuncs.com/100.csv</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        public static GetMiningTaskResultResponseBodyDataFilePathList build(java.util.Map<String, ?> map) throws Exception {
            GetMiningTaskResultResponseBodyDataFilePathList self = new GetMiningTaskResultResponseBodyDataFilePathList();
            return TeaModel.build(map, self);
        }

        public GetMiningTaskResultResponseBodyDataFilePathList setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetMiningTaskResultResponseBodyDataFilePathList setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

    public static class GetMiningTaskResultResponseBodyData extends TeaModel {
        /**
         * <p>File path</p>
         * 
         * <strong>example:</strong>
         * <p>123.22.com/manager/static/login-back.jpg</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>List of returned file paths</p>
         */
        @NameInMap("FilePathList")
        public java.util.List<GetMiningTaskResultResponseBodyDataFilePathList> filePathList;

        /**
         * <p>Markdown file path</p>
         * 
         * <strong>example:</strong>
         * <p>123.22.com/manager/static/login-back.md</p>
         */
        @NameInMap("FilePathMd")
        public String filePathMd;

        /**
         * <p>Task ID</p>
         * 
         * <strong>example:</strong>
         * <p>20201231de3d34ec-40fa-4a55-8d27-76ea*****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Task status</p>
         * 
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

        public GetMiningTaskResultResponseBodyData setFilePathList(java.util.List<GetMiningTaskResultResponseBodyDataFilePathList> filePathList) {
            this.filePathList = filePathList;
            return this;
        }
        public java.util.List<GetMiningTaskResultResponseBodyDataFilePathList> getFilePathList() {
            return this.filePathList;
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
