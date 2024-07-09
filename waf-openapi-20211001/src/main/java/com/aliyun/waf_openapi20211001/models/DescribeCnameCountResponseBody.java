// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCnameCountResponseBody extends TeaModel {
    @NameInMap("CnameCount")
    public DescribeCnameCountResponseBodyCnameCount cnameCount;

    /**
     * <strong>example:</strong>
     * <p>F35F45B0-5D6B-4238-BE02-A62D****E840</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCnameCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCnameCountResponseBody self = new DescribeCnameCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCnameCountResponseBody setCnameCount(DescribeCnameCountResponseBodyCnameCount cnameCount) {
        this.cnameCount = cnameCount;
        return this;
    }
    public DescribeCnameCountResponseBodyCnameCount getCnameCount() {
        return this.cnameCount;
    }

    public DescribeCnameCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCnameCountResponseBodyCnameCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cname")
        public Long cname;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HybridCloudCname")
        public Long hybridCloudCname;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeCnameCountResponseBodyCnameCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeCnameCountResponseBodyCnameCount self = new DescribeCnameCountResponseBodyCnameCount();
            return TeaModel.build(map, self);
        }

        public DescribeCnameCountResponseBodyCnameCount setCname(Long cname) {
            this.cname = cname;
            return this;
        }
        public Long getCname() {
            return this.cname;
        }

        public DescribeCnameCountResponseBodyCnameCount setHybridCloudCname(Long hybridCloudCname) {
            this.hybridCloudCname = hybridCloudCname;
            return this;
        }
        public Long getHybridCloudCname() {
            return this.hybridCloudCname;
        }

        public DescribeCnameCountResponseBodyCnameCount setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
