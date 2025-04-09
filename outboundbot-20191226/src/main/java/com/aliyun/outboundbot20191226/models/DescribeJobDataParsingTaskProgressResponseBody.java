// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeJobDataParsingTaskProgressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Progress")
    public DescribeJobDataParsingTaskProgressResponseBodyProgress progress;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>Permission.JobStatus</p>
         */
        @NameInMap("FailErrorCode")
        public String failErrorCode;

        /**
         * <strong>example:</strong>
         * <p>CreateCorpus</p>
         */
        @NameInMap("FailReason")
        public String failReason;

        @NameInMap("FeedbackUrl")
        public String feedbackUrl;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HandledJobCount")
        public Integer handledJobCount;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("Status")
        public String status;

        /**
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
