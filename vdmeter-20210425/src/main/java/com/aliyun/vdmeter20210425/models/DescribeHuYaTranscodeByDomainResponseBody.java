// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeHuYaTranscodeByDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("ResultDesc")
    public java.util.List<DescribeHuYaTranscodeByDomainResponseBodyResultDesc> resultDesc;

    @NameInMap("Status")
    public Integer status;

    public static DescribeHuYaTranscodeByDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHuYaTranscodeByDomainResponseBody self = new DescribeHuYaTranscodeByDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHuYaTranscodeByDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHuYaTranscodeByDomainResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public DescribeHuYaTranscodeByDomainResponseBody setResultDesc(java.util.List<DescribeHuYaTranscodeByDomainResponseBodyResultDesc> resultDesc) {
        this.resultDesc = resultDesc;
        return this;
    }
    public java.util.List<DescribeHuYaTranscodeByDomainResponseBodyResultDesc> getResultDesc() {
        return this.resultDesc;
    }

    public DescribeHuYaTranscodeByDomainResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public static class DescribeHuYaTranscodeByDomainResponseBodyResultDesc extends TeaModel {
        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Time")
        public String time;

        @NameInMap("TranscodeDuration")
        public Long transcodeDuration;

        @NameInMap("TranscodeNum")
        public Long transcodeNum;

        @NameInMap("TranscodeType")
        public String transcodeType;

        public static DescribeHuYaTranscodeByDomainResponseBodyResultDesc build(java.util.Map<String, ?> map) throws Exception {
            DescribeHuYaTranscodeByDomainResponseBodyResultDesc self = new DescribeHuYaTranscodeByDomainResponseBodyResultDesc();
            return TeaModel.build(map, self);
        }

        public DescribeHuYaTranscodeByDomainResponseBodyResultDesc setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public DescribeHuYaTranscodeByDomainResponseBodyResultDesc setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeHuYaTranscodeByDomainResponseBodyResultDesc setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeHuYaTranscodeByDomainResponseBodyResultDesc setTranscodeDuration(Long transcodeDuration) {
            this.transcodeDuration = transcodeDuration;
            return this;
        }
        public Long getTranscodeDuration() {
            return this.transcodeDuration;
        }

        public DescribeHuYaTranscodeByDomainResponseBodyResultDesc setTranscodeNum(Long transcodeNum) {
            this.transcodeNum = transcodeNum;
            return this;
        }
        public Long getTranscodeNum() {
            return this.transcodeNum;
        }

        public DescribeHuYaTranscodeByDomainResponseBodyResultDesc setTranscodeType(String transcodeType) {
            this.transcodeType = transcodeType;
            return this;
        }
        public String getTranscodeType() {
            return this.transcodeType;
        }

    }

}
