// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class FindUserReport4AlinlpResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<FindUserReport4AlinlpResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static FindUserReport4AlinlpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindUserReport4AlinlpResponseBody self = new FindUserReport4AlinlpResponseBody();
        return TeaModel.build(map, self);
    }

    public FindUserReport4AlinlpResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindUserReport4AlinlpResponseBody setData(java.util.List<FindUserReport4AlinlpResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<FindUserReport4AlinlpResponseBodyData> getData() {
        return this.data;
    }

    public FindUserReport4AlinlpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class FindUserReport4AlinlpResponseBodyData extends TeaModel {
        @NameInMap("FailCount")
        public Long failCount;

        @NameInMap("QpsMax")
        public Integer qpsMax;

        @NameInMap("RptTime")
        public String rptTime;

        @NameInMap("SuccessCount")
        public Long successCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static FindUserReport4AlinlpResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindUserReport4AlinlpResponseBodyData self = new FindUserReport4AlinlpResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindUserReport4AlinlpResponseBodyData setFailCount(Long failCount) {
            this.failCount = failCount;
            return this;
        }
        public Long getFailCount() {
            return this.failCount;
        }

        public FindUserReport4AlinlpResponseBodyData setQpsMax(Integer qpsMax) {
            this.qpsMax = qpsMax;
            return this;
        }
        public Integer getQpsMax() {
            return this.qpsMax;
        }

        public FindUserReport4AlinlpResponseBodyData setRptTime(String rptTime) {
            this.rptTime = rptTime;
            return this;
        }
        public String getRptTime() {
            return this.rptTime;
        }

        public FindUserReport4AlinlpResponseBodyData setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

        public FindUserReport4AlinlpResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
