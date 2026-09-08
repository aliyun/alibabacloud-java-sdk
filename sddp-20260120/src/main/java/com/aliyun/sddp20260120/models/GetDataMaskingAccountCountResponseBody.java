// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class GetDataMaskingAccountCountResponseBody extends TeaModel {
    @NameInMap("AccountCount")
    public GetDataMaskingAccountCountResponseBodyAccountCount accountCount;

    /**
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataMaskingAccountCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataMaskingAccountCountResponseBody self = new GetDataMaskingAccountCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataMaskingAccountCountResponseBody setAccountCount(GetDataMaskingAccountCountResponseBodyAccountCount accountCount) {
        this.accountCount = accountCount;
        return this;
    }
    public GetDataMaskingAccountCountResponseBodyAccountCount getAccountCount() {
        return this.accountCount;
    }

    public GetDataMaskingAccountCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataMaskingAccountCountResponseBodyAccountCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FullAccessCount")
        public Long fullAccessCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NoneAccessCount")
        public Long noneAccessCount;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RestrictedAccessCount")
        public Long restrictedAccessCount;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetDataMaskingAccountCountResponseBodyAccountCount build(java.util.Map<String, ?> map) throws Exception {
            GetDataMaskingAccountCountResponseBodyAccountCount self = new GetDataMaskingAccountCountResponseBodyAccountCount();
            return TeaModel.build(map, self);
        }

        public GetDataMaskingAccountCountResponseBodyAccountCount setFullAccessCount(Long fullAccessCount) {
            this.fullAccessCount = fullAccessCount;
            return this;
        }
        public Long getFullAccessCount() {
            return this.fullAccessCount;
        }

        public GetDataMaskingAccountCountResponseBodyAccountCount setNoneAccessCount(Long noneAccessCount) {
            this.noneAccessCount = noneAccessCount;
            return this;
        }
        public Long getNoneAccessCount() {
            return this.noneAccessCount;
        }

        public GetDataMaskingAccountCountResponseBodyAccountCount setRestrictedAccessCount(Long restrictedAccessCount) {
            this.restrictedAccessCount = restrictedAccessCount;
            return this;
        }
        public Long getRestrictedAccessCount() {
            return this.restrictedAccessCount;
        }

        public GetDataMaskingAccountCountResponseBodyAccountCount setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
