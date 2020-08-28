// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeReportChainDetailResponse extends TeaModel {
    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ChainDetails")
    @Validation(required = true)
    public java.util.List<DescribeReportChainDetailResponseChainDetails> chainDetails;

    public static DescribeReportChainDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportChainDetailResponse self = new DescribeReportChainDetailResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeReportChainDetailResponseChainDetails extends TeaModel {
        @NameInMap("TotalFail")
        @Validation(required = true)
        public Long totalFail;

        @NameInMap("QpsFail")
        @Validation(required = true)
        public Double qpsFail;

        @NameInMap("Total3XX")
        @Validation(required = true)
        public Long total3XX;

        @NameInMap("RealConcurrency")
        @Validation(required = true)
        public Double realConcurrency;

        @NameInMap("TimePoint")
        @Validation(required = true)
        public Long timePoint;

        @NameInMap("MaxRt")
        @Validation(required = true)
        public Integer maxRt;

        @NameInMap("MinRt")
        @Validation(required = true)
        public Integer minRt;

        @NameInMap("TotalRequest")
        @Validation(required = true)
        public Long totalRequest;

        @NameInMap("Qps2XX")
        @Validation(required = true)
        public Double qps2XX;

        @NameInMap("Total4XX")
        @Validation(required = true)
        public Long total4XX;

        @NameInMap("Total5XX")
        @Validation(required = true)
        public Long total5XX;

        @NameInMap("Qps4XX")
        @Validation(required = true)
        public Double qps4XX;

        @NameInMap("RealQps")
        @Validation(required = true)
        public Double realQps;

        @NameInMap("ConfigQps")
        @Validation(required = true)
        public Integer configQps;

        @NameInMap("AverageRt")
        @Validation(required = true)
        public Integer averageRt;

        @NameInMap("BpsRequest")
        @Validation(required = true)
        public Long bpsRequest;

        @NameInMap("ChainId")
        @Validation(required = true)
        public Long chainId;

        @NameInMap("BpsResponse")
        @Validation(required = true)
        public Long bpsResponse;

        @NameInMap("Total2XX")
        @Validation(required = true)
        public Long total2XX;

        @NameInMap("Qps5XX")
        @Validation(required = true)
        public Double qps5XX;

        @NameInMap("Qps3XX")
        @Validation(required = true)
        public Double qps3XX;

        @NameInMap("QpsHit")
        @Validation(required = true)
        public Double qpsHit;

        @NameInMap("QpsMiss")
        @Validation(required = true)
        public Double qpsMiss;

        @NameInMap("TotalHit")
        @Validation(required = true)
        public Long totalHit;

        @NameInMap("TotalMiss")
        @Validation(required = true)
        public Long totalMiss;

        public static DescribeReportChainDetailResponseChainDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeReportChainDetailResponseChainDetails self = new DescribeReportChainDetailResponseChainDetails();
            return TeaModel.build(map, self);
        }

    }

}
