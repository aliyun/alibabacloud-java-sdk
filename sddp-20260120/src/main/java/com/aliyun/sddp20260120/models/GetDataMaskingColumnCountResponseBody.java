// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class GetDataMaskingColumnCountResponseBody extends TeaModel {
    /**
     * <p>The column encryption statistics.</p>
     */
    @NameInMap("ColumnCount")
    public GetDataMaskingColumnCountResponseBodyColumnCount columnCount;

    /**
     * <p>The request ID, which can be used to locate this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataMaskingColumnCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataMaskingColumnCountResponseBody self = new GetDataMaskingColumnCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataMaskingColumnCountResponseBody setColumnCount(GetDataMaskingColumnCountResponseBodyColumnCount columnCount) {
        this.columnCount = columnCount;
        return this;
    }
    public GetDataMaskingColumnCountResponseBodyColumnCount getColumnCount() {
        return this.columnCount;
    }

    public GetDataMaskingColumnCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataMaskingColumnCountResponseBodyColumnCount extends TeaModel {
        /**
         * <p>The number of encrypted columns within the current scope.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaskedCount")
        public Long maskedCount;

        /**
         * <p>The number of columns that failed to be encrypted within the current scope.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaskingFailedCount")
        public Long maskingFailedCount;

        /**
         * <p>The number of sensitive columns within the current scope.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SensitiveCount")
        public Long sensitiveCount;

        /**
         * <p>The total number of columns within the current scope.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetDataMaskingColumnCountResponseBodyColumnCount build(java.util.Map<String, ?> map) throws Exception {
            GetDataMaskingColumnCountResponseBodyColumnCount self = new GetDataMaskingColumnCountResponseBodyColumnCount();
            return TeaModel.build(map, self);
        }

        public GetDataMaskingColumnCountResponseBodyColumnCount setMaskedCount(Long maskedCount) {
            this.maskedCount = maskedCount;
            return this;
        }
        public Long getMaskedCount() {
            return this.maskedCount;
        }

        public GetDataMaskingColumnCountResponseBodyColumnCount setMaskingFailedCount(Long maskingFailedCount) {
            this.maskingFailedCount = maskingFailedCount;
            return this;
        }
        public Long getMaskingFailedCount() {
            return this.maskingFailedCount;
        }

        public GetDataMaskingColumnCountResponseBodyColumnCount setSensitiveCount(Long sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Long getSensitiveCount() {
            return this.sensitiveCount;
        }

        public GetDataMaskingColumnCountResponseBodyColumnCount setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
