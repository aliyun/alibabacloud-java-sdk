// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostsProjectResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81500666-d7f5-4143-8329-0223cc738105</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The call results of the operation.</p>
     */
    @NameInMap("Results")
    public java.util.List<ModifyHostsProjectResponseBodyResults> results;

    /**
     * <p>The number of hosts that were successfully moved.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SuccessCount")
    public Long successCount;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ModifyHostsProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostsProjectResponseBody self = new ModifyHostsProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHostsProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyHostsProjectResponseBody setResults(java.util.List<ModifyHostsProjectResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ModifyHostsProjectResponseBodyResults> getResults() {
        return this.results;
    }

    public ModifyHostsProjectResponseBody setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public ModifyHostsProjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ModifyHostsProjectResponseBodyResults extends TeaModel {
        /**
         * <p>The host ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("AssetId")
        public String assetId;

        /**
         * <p>The error code. A value of <strong>200</strong> indicates that the operation was successful. Other values indicate that the operation failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The result message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        public static ModifyHostsProjectResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ModifyHostsProjectResponseBodyResults self = new ModifyHostsProjectResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ModifyHostsProjectResponseBodyResults setAssetId(String assetId) {
            this.assetId = assetId;
            return this;
        }
        public String getAssetId() {
            return this.assetId;
        }

        public ModifyHostsProjectResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModifyHostsProjectResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
