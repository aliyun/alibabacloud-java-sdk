// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetAgentMJobInfoResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of <strong>200</strong> indicates success. Any other value indicates failure. You can use this field to determine the cause of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetAgentMJobInfoResponseBodyData data;

    /**
     * <p>The error message returned when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F190ADE9-619A-447D-84E3-7E241A5C428E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false/null: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAgentMJobInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentMJobInfoResponseBody self = new GetAgentMJobInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentMJobInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentMJobInfoResponseBody setData(GetAgentMJobInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentMJobInfoResponseBodyData getData() {
        return this.data;
    }

    public GetAgentMJobInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentMJobInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentMJobInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentMJobInfoResponseBodyDataAgentMDetailResponseSummaryUrls extends TeaModel {
        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>SatisfactionAnalysis.xlsx</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file type.</p>
         * 
         * <strong>example:</strong>
         * <p>xlsx</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The file URL.</p>
         * 
         * <strong>example:</strong>
         * <p>http://******.oss-cn-hangzhou.aliyuncs.com/uploadTransfer/17****dline-express.zip</p>
         */
        @NameInMap("OssUrl")
        public String ossUrl;

        public static GetAgentMJobInfoResponseBodyDataAgentMDetailResponseSummaryUrls build(java.util.Map<String, ?> map) throws Exception {
            GetAgentMJobInfoResponseBodyDataAgentMDetailResponseSummaryUrls self = new GetAgentMJobInfoResponseBodyDataAgentMDetailResponseSummaryUrls();
            return TeaModel.build(map, self);
        }

        public GetAgentMJobInfoResponseBodyDataAgentMDetailResponseSummaryUrls setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetAgentMJobInfoResponseBodyDataAgentMDetailResponseSummaryUrls setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetAgentMJobInfoResponseBodyDataAgentMDetailResponseSummaryUrls setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

    }

    public static class GetAgentMJobInfoResponseBodyDataAgentMDetailResponse extends TeaModel {
        /**
         * <p>The execution summary.</p>
         * 
         * <strong>example:</strong>
         * <p>This quality inspection analyzed a total of 120 conversations..</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The list of result files. Each item contains complete file fields.</p>
         */
        @NameInMap("SummaryUrls")
        public java.util.List<GetAgentMJobInfoResponseBodyDataAgentMDetailResponseSummaryUrls> summaryUrls;

        public static GetAgentMJobInfoResponseBodyDataAgentMDetailResponse build(java.util.Map<String, ?> map) throws Exception {
            GetAgentMJobInfoResponseBodyDataAgentMDetailResponse self = new GetAgentMJobInfoResponseBodyDataAgentMDetailResponse();
            return TeaModel.build(map, self);
        }

        public GetAgentMJobInfoResponseBodyDataAgentMDetailResponse setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetAgentMJobInfoResponseBodyDataAgentMDetailResponse setSummaryUrls(java.util.List<GetAgentMJobInfoResponseBodyDataAgentMDetailResponseSummaryUrls> summaryUrls) {
            this.summaryUrls = summaryUrls;
            return this;
        }
        public java.util.List<GetAgentMJobInfoResponseBodyDataAgentMDetailResponseSummaryUrls> getSummaryUrls() {
            return this.summaryUrls;
        }

    }

    public static class GetAgentMJobInfoResponseBodyData extends TeaModel {
        /**
         * <p>The details of the task processing result.</p>
         */
        @NameInMap("AgentMDetailResponse")
        public GetAgentMJobInfoResponseBodyDataAgentMDetailResponse agentMDetailResponse;

        /**
         * <p>The end time of the scan range.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-26 20:00:00</p>
         */
        @NameInMap("DataEndTime")
        public String dataEndTime;

        /**
         * <p>The start time of the scan range.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-26 19:00:00</p>
         */
        @NameInMap("DataStartTime")
        public String dataStartTime;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The error message returned when an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>queing: queuing.</li>
         * <li>readyAnalysis: pending analysis.</li>
         * <li>running: running.</li>
         * <li>error: failed.</li>
         * <li>finish: completed.</li>
         * <li>fileUploadUser: user-specified file upload completed.</li>
         * <li>fileUploadSystem: system-generated file upload completed.</li>
         * <li>expired: expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The actual end time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-26 20:00:00</p>
         */
        @NameInMap("TaskEndTime")
        public String taskEndTime;

        /**
         * <p>The scheduled task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A6BEC8D-9A5B-4BE5-8432-4F635E***</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The actual start time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-26 19:00:00</p>
         */
        @NameInMap("TaskStartTime")
        public String taskStartTime;

        public static GetAgentMJobInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentMJobInfoResponseBodyData self = new GetAgentMJobInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentMJobInfoResponseBodyData setAgentMDetailResponse(GetAgentMJobInfoResponseBodyDataAgentMDetailResponse agentMDetailResponse) {
            this.agentMDetailResponse = agentMDetailResponse;
            return this;
        }
        public GetAgentMJobInfoResponseBodyDataAgentMDetailResponse getAgentMDetailResponse() {
            return this.agentMDetailResponse;
        }

        public GetAgentMJobInfoResponseBodyData setDataEndTime(String dataEndTime) {
            this.dataEndTime = dataEndTime;
            return this;
        }
        public String getDataEndTime() {
            return this.dataEndTime;
        }

        public GetAgentMJobInfoResponseBodyData setDataStartTime(String dataStartTime) {
            this.dataStartTime = dataStartTime;
            return this;
        }
        public String getDataStartTime() {
            return this.dataStartTime;
        }

        public GetAgentMJobInfoResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAgentMJobInfoResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAgentMJobInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAgentMJobInfoResponseBodyData setTaskEndTime(String taskEndTime) {
            this.taskEndTime = taskEndTime;
            return this;
        }
        public String getTaskEndTime() {
            return this.taskEndTime;
        }

        public GetAgentMJobInfoResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetAgentMJobInfoResponseBodyData setTaskStartTime(String taskStartTime) {
            this.taskStartTime = taskStartTime;
            return this;
        }
        public String getTaskStartTime() {
            return this.taskStartTime;
        }

    }

}
