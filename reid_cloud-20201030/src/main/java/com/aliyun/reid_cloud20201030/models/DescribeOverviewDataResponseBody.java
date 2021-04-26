// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeOverviewDataResponseBody extends TeaModel {
    @NameInMap("OverviewDetail")
    public DescribeOverviewDataResponseBodyOverviewDetail overviewDetail;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("AccurateOverviewDetail")
    public DescribeOverviewDataResponseBodyAccurateOverviewDetail accurateOverviewDetail;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeOverviewDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOverviewDataResponseBody self = new DescribeOverviewDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOverviewDataResponseBody setOverviewDetail(DescribeOverviewDataResponseBodyOverviewDetail overviewDetail) {
        this.overviewDetail = overviewDetail;
        return this;
    }
    public DescribeOverviewDataResponseBodyOverviewDetail getOverviewDetail() {
        return this.overviewDetail;
    }

    public DescribeOverviewDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOverviewDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeOverviewDataResponseBody setAccurateOverviewDetail(DescribeOverviewDataResponseBodyAccurateOverviewDetail accurateOverviewDetail) {
        this.accurateOverviewDetail = accurateOverviewDetail;
        return this;
    }
    public DescribeOverviewDataResponseBodyAccurateOverviewDetail getAccurateOverviewDetail() {
        return this.accurateOverviewDetail;
    }

    public DescribeOverviewDataResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeOverviewDataResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeOverviewDataResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeOverviewDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeOverviewDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeOverviewDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOverviewDataResponseBodyOverviewDetail extends TeaModel {
        @NameInMap("UvEverySqmGrowthWOWPercent")
        public Float uvEverySqmGrowthWOWPercent;

        @NameInMap("UvEverySqm")
        public Float uvEverySqm;

        @NameInMap("StayAvgPeriod")
        public Float stayAvgPeriod;

        @NameInMap("UvWOWPercent")
        public Float uvWOWPercent;

        @NameInMap("UvAvgWOWPercent")
        public Float uvAvgWOWPercent;

        @NameInMap("UvAvg")
        public Float uvAvg;

        @NameInMap("StayDeepAvg")
        public Float stayDeepAvg;

        @NameInMap("StayAvgPeriodWOWPercent")
        public Float stayAvgPeriodWOWPercent;

        @NameInMap("Uv")
        public Long uv;

        @NameInMap("StayDeepAvgWOWPercent")
        public Float stayDeepAvgWOWPercent;

        public static DescribeOverviewDataResponseBodyOverviewDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOverviewDataResponseBodyOverviewDetail self = new DescribeOverviewDataResponseBodyOverviewDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOverviewDataResponseBodyOverviewDetail setUvEverySqmGrowthWOWPercent(Float uvEverySqmGrowthWOWPercent) {
            this.uvEverySqmGrowthWOWPercent = uvEverySqmGrowthWOWPercent;
            return this;
        }
        public Float getUvEverySqmGrowthWOWPercent() {
            return this.uvEverySqmGrowthWOWPercent;
        }

        public DescribeOverviewDataResponseBodyOverviewDetail setUvEverySqm(Float uvEverySqm) {
            this.uvEverySqm = uvEverySqm;
            return this;
        }
        public Float getUvEverySqm() {
            return this.uvEverySqm;
        }

        public DescribeOverviewDataResponseBodyOverviewDetail setStayAvgPeriod(Float stayAvgPeriod) {
            this.stayAvgPeriod = stayAvgPeriod;
            return this;
        }
        public Float getStayAvgPeriod() {
            return this.stayAvgPeriod;
        }

        public DescribeOverviewDataResponseBodyOverviewDetail setUvWOWPercent(Float uvWOWPercent) {
            this.uvWOWPercent = uvWOWPercent;
            return this;
        }
        public Float getUvWOWPercent() {
            return this.uvWOWPercent;
        }

        public DescribeOverviewDataResponseBodyOverviewDetail setUvAvgWOWPercent(Float uvAvgWOWPercent) {
            this.uvAvgWOWPercent = uvAvgWOWPercent;
            return this;
        }
        public Float getUvAvgWOWPercent() {
            return this.uvAvgWOWPercent;
        }

        public DescribeOverviewDataResponseBodyOverviewDetail setUvAvg(Float uvAvg) {
            this.uvAvg = uvAvg;
            return this;
        }
        public Float getUvAvg() {
            return this.uvAvg;
        }

        public DescribeOverviewDataResponseBodyOverviewDetail setStayDeepAvg(Float stayDeepAvg) {
            this.stayDeepAvg = stayDeepAvg;
            return this;
        }
        public Float getStayDeepAvg() {
            return this.stayDeepAvg;
        }

        public DescribeOverviewDataResponseBodyOverviewDetail setStayAvgPeriodWOWPercent(Float stayAvgPeriodWOWPercent) {
            this.stayAvgPeriodWOWPercent = stayAvgPeriodWOWPercent;
            return this;
        }
        public Float getStayAvgPeriodWOWPercent() {
            return this.stayAvgPeriodWOWPercent;
        }

        public DescribeOverviewDataResponseBodyOverviewDetail setUv(Long uv) {
            this.uv = uv;
            return this;
        }
        public Long getUv() {
            return this.uv;
        }

        public DescribeOverviewDataResponseBodyOverviewDetail setStayDeepAvgWOWPercent(Float stayDeepAvgWOWPercent) {
            this.stayDeepAvgWOWPercent = stayDeepAvgWOWPercent;
            return this;
        }
        public Float getStayDeepAvgWOWPercent() {
            return this.stayDeepAvgWOWPercent;
        }

    }

    public static class DescribeOverviewDataResponseBodyAccurateOverviewDetail extends TeaModel {
        @NameInMap("UvEverySqmGrowthWOWPercent")
        public String uvEverySqmGrowthWOWPercent;

        @NameInMap("UvEverySqm")
        public String uvEverySqm;

        @NameInMap("StayAvgPeriod")
        public String stayAvgPeriod;

        @NameInMap("UvWOWPercent")
        public String uvWOWPercent;

        @NameInMap("UvAvgWOWPercent")
        public String uvAvgWOWPercent;

        @NameInMap("UvAvg")
        public String uvAvg;

        @NameInMap("StayDeepAvg")
        public String stayDeepAvg;

        @NameInMap("StayAvgPeriodWOWPercent")
        public String stayAvgPeriodWOWPercent;

        @NameInMap("Uv")
        public Long uv;

        @NameInMap("StayDeepAvgWOWPercent")
        public String stayDeepAvgWOWPercent;

        public static DescribeOverviewDataResponseBodyAccurateOverviewDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOverviewDataResponseBodyAccurateOverviewDetail self = new DescribeOverviewDataResponseBodyAccurateOverviewDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOverviewDataResponseBodyAccurateOverviewDetail setUvEverySqmGrowthWOWPercent(String uvEverySqmGrowthWOWPercent) {
            this.uvEverySqmGrowthWOWPercent = uvEverySqmGrowthWOWPercent;
            return this;
        }
        public String getUvEverySqmGrowthWOWPercent() {
            return this.uvEverySqmGrowthWOWPercent;
        }

        public DescribeOverviewDataResponseBodyAccurateOverviewDetail setUvEverySqm(String uvEverySqm) {
            this.uvEverySqm = uvEverySqm;
            return this;
        }
        public String getUvEverySqm() {
            return this.uvEverySqm;
        }

        public DescribeOverviewDataResponseBodyAccurateOverviewDetail setStayAvgPeriod(String stayAvgPeriod) {
            this.stayAvgPeriod = stayAvgPeriod;
            return this;
        }
        public String getStayAvgPeriod() {
            return this.stayAvgPeriod;
        }

        public DescribeOverviewDataResponseBodyAccurateOverviewDetail setUvWOWPercent(String uvWOWPercent) {
            this.uvWOWPercent = uvWOWPercent;
            return this;
        }
        public String getUvWOWPercent() {
            return this.uvWOWPercent;
        }

        public DescribeOverviewDataResponseBodyAccurateOverviewDetail setUvAvgWOWPercent(String uvAvgWOWPercent) {
            this.uvAvgWOWPercent = uvAvgWOWPercent;
            return this;
        }
        public String getUvAvgWOWPercent() {
            return this.uvAvgWOWPercent;
        }

        public DescribeOverviewDataResponseBodyAccurateOverviewDetail setUvAvg(String uvAvg) {
            this.uvAvg = uvAvg;
            return this;
        }
        public String getUvAvg() {
            return this.uvAvg;
        }

        public DescribeOverviewDataResponseBodyAccurateOverviewDetail setStayDeepAvg(String stayDeepAvg) {
            this.stayDeepAvg = stayDeepAvg;
            return this;
        }
        public String getStayDeepAvg() {
            return this.stayDeepAvg;
        }

        public DescribeOverviewDataResponseBodyAccurateOverviewDetail setStayAvgPeriodWOWPercent(String stayAvgPeriodWOWPercent) {
            this.stayAvgPeriodWOWPercent = stayAvgPeriodWOWPercent;
            return this;
        }
        public String getStayAvgPeriodWOWPercent() {
            return this.stayAvgPeriodWOWPercent;
        }

        public DescribeOverviewDataResponseBodyAccurateOverviewDetail setUv(Long uv) {
            this.uv = uv;
            return this;
        }
        public Long getUv() {
            return this.uv;
        }

        public DescribeOverviewDataResponseBodyAccurateOverviewDetail setStayDeepAvgWOWPercent(String stayDeepAvgWOWPercent) {
            this.stayDeepAvgWOWPercent = stayDeepAvgWOWPercent;
            return this;
        }
        public String getStayDeepAvgWOWPercent() {
            return this.stayDeepAvgWOWPercent;
        }

    }

}
