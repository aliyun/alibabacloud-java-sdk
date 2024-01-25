// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeHuYaRecordByDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("ResultDesc")
    public java.util.List<DescribeHuYaRecordByDomainResponseBodyResultDesc> resultDesc;

    @NameInMap("Status")
    public Integer status;

    public static DescribeHuYaRecordByDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHuYaRecordByDomainResponseBody self = new DescribeHuYaRecordByDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHuYaRecordByDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHuYaRecordByDomainResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public DescribeHuYaRecordByDomainResponseBody setResultDesc(java.util.List<DescribeHuYaRecordByDomainResponseBodyResultDesc> resultDesc) {
        this.resultDesc = resultDesc;
        return this;
    }
    public java.util.List<DescribeHuYaRecordByDomainResponseBodyResultDesc> getResultDesc() {
        return this.resultDesc;
    }

    public DescribeHuYaRecordByDomainResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public static class DescribeHuYaRecordByDomainResponseBodyResultDesc extends TeaModel {
        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("RecordDuration")
        public Long recordDuration;

        @NameInMap("RecordNum")
        public Long recordNum;

        @NameInMap("RecordType")
        public String recordType;

        @NameInMap("Time")
        public String time;

        public static DescribeHuYaRecordByDomainResponseBodyResultDesc build(java.util.Map<String, ?> map) throws Exception {
            DescribeHuYaRecordByDomainResponseBodyResultDesc self = new DescribeHuYaRecordByDomainResponseBodyResultDesc();
            return TeaModel.build(map, self);
        }

        public DescribeHuYaRecordByDomainResponseBodyResultDesc setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public DescribeHuYaRecordByDomainResponseBodyResultDesc setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeHuYaRecordByDomainResponseBodyResultDesc setRecordDuration(Long recordDuration) {
            this.recordDuration = recordDuration;
            return this;
        }
        public Long getRecordDuration() {
            return this.recordDuration;
        }

        public DescribeHuYaRecordByDomainResponseBodyResultDesc setRecordNum(Long recordNum) {
            this.recordNum = recordNum;
            return this;
        }
        public Long getRecordNum() {
            return this.recordNum;
        }

        public DescribeHuYaRecordByDomainResponseBodyResultDesc setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public DescribeHuYaRecordByDomainResponseBodyResultDesc setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
