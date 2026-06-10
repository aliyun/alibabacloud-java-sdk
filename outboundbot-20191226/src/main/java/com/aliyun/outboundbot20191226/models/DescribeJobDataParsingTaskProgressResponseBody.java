// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeJobDataParsingTaskProgressResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Parsing progress.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Progress")
    public DescribeJobDataParsingTaskProgressResponseBodyProgress progress;

    /**
     * <p>ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeJobDataParsingTaskProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobDataParsingTaskProgressResponseBody self = new DescribeJobDataParsingTaskProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobDataParsingTaskProgressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeJobDataParsingTaskProgressResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeJobDataParsingTaskProgressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeJobDataParsingTaskProgressResponseBody setProgress(DescribeJobDataParsingTaskProgressResponseBodyProgress progress) {
        this.progress = progress;
        return this;
    }
    public DescribeJobDataParsingTaskProgressResponseBodyProgress getProgress() {
        return this.progress;
    }

    public DescribeJobDataParsingTaskProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJobDataParsingTaskProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeJobDataParsingTaskProgressResponseBodyProgress extends TeaModel {
        /**
         * <p>Error code for a failed parsing task.</p>
         * 
         * <strong>example:</strong>
         * <p>Permission.JobStatus</p>
         */
        @NameInMap("FailErrorCode")
        public String failErrorCode;

        /**
         * <p>Reason for failure.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateCorpus</p>
         */
        @NameInMap("FailReason")
        public String failReason;

        /**
         * <p>Download URL for the file that lists parsing failures. This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("FeedbackUrl")
        public String feedbackUrl;

        /**
         * <p>Number of jobs processed so far.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HandledJobCount")
        public Integer handledJobCount;

        /**
         * <p>Status of the job.</p>
         * <ul>
         * <li><p>Pending: The job is waiting to start.</p>
         * </li>
         * <li><p>InProgress: The job is running.</p>
         * </li>
         * <li><p>Finished: The job completed successfully.</p>
         * </li>
         * <li><p>PartialFinished: The job completed partially.</p>
         * </li>
         * <li><p>Failed: The job failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Total number of jobs in the task.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalJobCount")
        public Integer totalJobCount;

        public static DescribeJobDataParsingTaskProgressResponseBodyProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobDataParsingTaskProgressResponseBodyProgress self = new DescribeJobDataParsingTaskProgressResponseBodyProgress();
            return TeaModel.build(map, self);
        }

        public DescribeJobDataParsingTaskProgressResponseBodyProgress setFailErrorCode(String failErrorCode) {
            this.failErrorCode = failErrorCode;
            return this;
        }
        public String getFailErrorCode() {
            return this.failErrorCode;
        }

        public DescribeJobDataParsingTaskProgressResponseBodyProgress setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public DescribeJobDataParsingTaskProgressResponseBodyProgress setFeedbackUrl(String feedbackUrl) {
            this.feedbackUrl = feedbackUrl;
            return this;
        }
        public String getFeedbackUrl() {
            return this.feedbackUrl;
        }

        public DescribeJobDataParsingTaskProgressResponseBodyProgress setHandledJobCount(Integer handledJobCount) {
            this.handledJobCount = handledJobCount;
            return this;
        }
        public Integer getHandledJobCount() {
            return this.handledJobCount;
        }

        public DescribeJobDataParsingTaskProgressResponseBodyProgress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeJobDataParsingTaskProgressResponseBodyProgress setTotalJobCount(Integer totalJobCount) {
            this.totalJobCount = totalJobCount;
            return this;
        }
        public Integer getTotalJobCount() {
            return this.totalJobCount;
        }

    }

}
