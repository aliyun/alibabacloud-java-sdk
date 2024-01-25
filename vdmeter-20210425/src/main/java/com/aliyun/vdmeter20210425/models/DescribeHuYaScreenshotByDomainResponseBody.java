// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeHuYaScreenshotByDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("ResultDesc")
    public java.util.List<DescribeHuYaScreenshotByDomainResponseBodyResultDesc> resultDesc;

    @NameInMap("Status")
    public Integer status;

    public static DescribeHuYaScreenshotByDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHuYaScreenshotByDomainResponseBody self = new DescribeHuYaScreenshotByDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHuYaScreenshotByDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHuYaScreenshotByDomainResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public DescribeHuYaScreenshotByDomainResponseBody setResultDesc(java.util.List<DescribeHuYaScreenshotByDomainResponseBodyResultDesc> resultDesc) {
        this.resultDesc = resultDesc;
        return this;
    }
    public java.util.List<DescribeHuYaScreenshotByDomainResponseBodyResultDesc> getResultDesc() {
        return this.resultDesc;
    }

    public DescribeHuYaScreenshotByDomainResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public static class DescribeHuYaScreenshotByDomainResponseBodyResultDesc extends TeaModel {
        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("ScreenshotNum")
        public Long screenshotNum;

        @NameInMap("Time")
        public String time;

        public static DescribeHuYaScreenshotByDomainResponseBodyResultDesc build(java.util.Map<String, ?> map) throws Exception {
            DescribeHuYaScreenshotByDomainResponseBodyResultDesc self = new DescribeHuYaScreenshotByDomainResponseBodyResultDesc();
            return TeaModel.build(map, self);
        }

        public DescribeHuYaScreenshotByDomainResponseBodyResultDesc setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public DescribeHuYaScreenshotByDomainResponseBodyResultDesc setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeHuYaScreenshotByDomainResponseBodyResultDesc setScreenshotNum(Long screenshotNum) {
            this.screenshotNum = screenshotNum;
            return this;
        }
        public Long getScreenshotNum() {
            return this.screenshotNum;
        }

        public DescribeHuYaScreenshotByDomainResponseBodyResultDesc setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
