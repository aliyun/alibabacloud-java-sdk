// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeReportChainSummaryResponse extends TeaModel {
    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ChainSummary")
    @Validation(required = true)
    public java.util.List<DescribeReportChainSummaryResponseChainSummary> chainSummary;

    public static DescribeReportChainSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportChainSummaryResponse self = new DescribeReportChainSummaryResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeReportChainSummaryResponseChainSummary extends TeaModel {
        @NameInMap("ChainId")
        @Validation(required = true)
        public Long chainId;

        @NameInMap("AverageTps")
        @Validation(required = true)
        public Double averageTps;

        @NameInMap("SucceedRequestRate")
        @Validation(required = true)
        public Double succeedRequestRate;

        @NameInMap("HasCheckPoint")
        @Validation(required = true)
        public Boolean hasCheckPoint;

        @NameInMap("ChainName")
        @Validation(required = true)
        public String chainName;

        @NameInMap("TotalRequest")
        @Validation(required = true)
        public Long totalRequest;

        @NameInMap("Count5XX")
        @Validation(required = true)
        public Long count5XX;

        @NameInMap("RelationName")
        @Validation(required = true)
        public String relationName;

        @NameInMap("Count4XX")
        @Validation(required = true)
        public Long count4XX;

        @NameInMap("CountTimeout")
        @Validation(required = true)
        public Long countTimeout;

        @NameInMap("Seg75Rt")
        @Validation(required = true)
        public Long seg75Rt;

        @NameInMap("FailedBusinessCount")
        @Validation(required = true)
        public Long failedBusinessCount;

        @NameInMap("FailedRequestCount")
        @Validation(required = true)
        public Long failedRequestCount;

        @NameInMap("Seg90Rt")
        @Validation(required = true)
        public Long seg90Rt;

        @NameInMap("MaxRt")
        @Validation(required = true)
        public Integer maxRt;

        @NameInMap("MinRt")
        @Validation(required = true)
        public Integer minRt;

        @NameInMap("Count3XX")
        @Validation(required = true)
        public Long count3XX;

        @NameInMap("AverageRt")
        @Validation(required = true)
        public Double averageRt;

        @NameInMap("RelationId")
        @Validation(required = true)
        public Long relationId;

        @NameInMap("SucceedBusinessRate")
        @Validation(required = true)
        public Double succeedBusinessRate;

        @NameInMap("Seg50Rt")
        @Validation(required = true)
        public Integer seg50Rt;

        @NameInMap("Seg99Rt")
        @Validation(required = true)
        public Integer seg99Rt;

        @NameInMap("AverageConcurrency")
        @Validation(required = true)
        public Double averageConcurrency;

        @NameInMap("Exceptions")
        @Validation(required = true)
        public String exceptions;

        public static DescribeReportChainSummaryResponseChainSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeReportChainSummaryResponseChainSummary self = new DescribeReportChainSummaryResponseChainSummary();
            return TeaModel.build(map, self);
        }

    }

}
