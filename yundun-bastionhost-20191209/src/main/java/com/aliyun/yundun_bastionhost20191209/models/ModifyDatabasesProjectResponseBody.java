// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyDatabasesProjectResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The call results.</p>
     */
    @NameInMap("Results")
    public java.util.List<ModifyDatabasesProjectResponseBodyResults> results;

    /**
     * <p>The number of database instances that are moved.</p>
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
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ModifyDatabasesProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabasesProjectResponseBody self = new ModifyDatabasesProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDatabasesProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDatabasesProjectResponseBody setResults(java.util.List<ModifyDatabasesProjectResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ModifyDatabasesProjectResponseBodyResults> getResults() {
        return this.results;
    }

    public ModifyDatabasesProjectResponseBody setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public ModifyDatabasesProjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ModifyDatabasesProjectResponseBodyResults extends TeaModel {
        /**
         * <p>The instance ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>53</p>
         */
        @NameInMap("AssetId")
        public String assetId;

        /**
         * <p>The error code. A value of <strong>200</strong> indicates that the operation is successful. Other values indicate that the operation failed.</p>
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

        public static ModifyDatabasesProjectResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ModifyDatabasesProjectResponseBodyResults self = new ModifyDatabasesProjectResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ModifyDatabasesProjectResponseBodyResults setAssetId(String assetId) {
            this.assetId = assetId;
            return this;
        }
        public String getAssetId() {
            return this.assetId;
        }

        public ModifyDatabasesProjectResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModifyDatabasesProjectResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
