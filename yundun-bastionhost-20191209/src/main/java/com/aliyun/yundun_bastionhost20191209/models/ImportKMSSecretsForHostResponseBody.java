// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ImportKMSSecretsForHostResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<ImportKMSSecretsForHostResponseBodyResults> results;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SuccessCount")
    public Long successCount;

    public static ImportKMSSecretsForHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportKMSSecretsForHostResponseBody self = new ImportKMSSecretsForHostResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportKMSSecretsForHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportKMSSecretsForHostResponseBody setResults(java.util.List<ImportKMSSecretsForHostResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ImportKMSSecretsForHostResponseBodyResults> getResults() {
        return this.results;
    }

    public ImportKMSSecretsForHostResponseBody setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public static class ImportKMSSecretsForHostResponseBodyResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        public static ImportKMSSecretsForHostResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ImportKMSSecretsForHostResponseBodyResults self = new ImportKMSSecretsForHostResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ImportKMSSecretsForHostResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ImportKMSSecretsForHostResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ImportKMSSecretsForHostResponseBodyResults setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

    }

}
