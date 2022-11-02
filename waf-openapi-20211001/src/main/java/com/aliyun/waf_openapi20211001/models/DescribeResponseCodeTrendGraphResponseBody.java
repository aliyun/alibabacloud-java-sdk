// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResponseCodeTrendGraphResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseCodes")
    public java.util.List<DescribeResponseCodeTrendGraphResponseBodyResponseCodes> responseCodes;

    public static DescribeResponseCodeTrendGraphResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResponseCodeTrendGraphResponseBody self = new DescribeResponseCodeTrendGraphResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResponseCodeTrendGraphResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResponseCodeTrendGraphResponseBody setResponseCodes(java.util.List<DescribeResponseCodeTrendGraphResponseBodyResponseCodes> responseCodes) {
        this.responseCodes = responseCodes;
        return this;
    }
    public java.util.List<DescribeResponseCodeTrendGraphResponseBodyResponseCodes> getResponseCodes() {
        return this.responseCodes;
    }

    public static class DescribeResponseCodeTrendGraphResponseBodyResponseCodes extends TeaModel {
        @NameInMap("302Pv")
        public Long code302Pv;

        @NameInMap("405Pv")
        public Long code405Pv;

        @NameInMap("499Pv")
        public Long code499Pv;

        @NameInMap("5xxPv")
        public Long code5xxPv;

        @NameInMap("Index")
        public Long index;

        public static DescribeResponseCodeTrendGraphResponseBodyResponseCodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeResponseCodeTrendGraphResponseBodyResponseCodes self = new DescribeResponseCodeTrendGraphResponseBodyResponseCodes();
            return TeaModel.build(map, self);
        }

        public DescribeResponseCodeTrendGraphResponseBodyResponseCodes setCode302Pv(Long code302Pv) {
            this.code302Pv = code302Pv;
            return this;
        }
        public Long getCode302Pv() {
            return this.code302Pv;
        }

        public DescribeResponseCodeTrendGraphResponseBodyResponseCodes setCode405Pv(Long code405Pv) {
            this.code405Pv = code405Pv;
            return this;
        }
        public Long getCode405Pv() {
            return this.code405Pv;
        }

        public DescribeResponseCodeTrendGraphResponseBodyResponseCodes setCode499Pv(Long code499Pv) {
            this.code499Pv = code499Pv;
            return this;
        }
        public Long getCode499Pv() {
            return this.code499Pv;
        }

        public DescribeResponseCodeTrendGraphResponseBodyResponseCodes setCode5xxPv(Long code5xxPv) {
            this.code5xxPv = code5xxPv;
            return this;
        }
        public Long getCode5xxPv() {
            return this.code5xxPv;
        }

        public DescribeResponseCodeTrendGraphResponseBodyResponseCodes setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

    }

}
