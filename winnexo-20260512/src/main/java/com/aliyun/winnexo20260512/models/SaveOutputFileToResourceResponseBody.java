// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveOutputFileToResourceResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success. A failure returns a backend error code (ERR.* / InvalidParameter.*).</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error description. This value is empty on success.</p>
     * 
     * <strong>example:</strong>
     * <p>The current zone list is illegal.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The per-record results in the same order as the input itemIds. A single record failure does not affect other records.</p>
     */
    @NameInMap("results")
    public java.util.List<SaveOutputFileToResourceResponseBodyResults> results;

    public static SaveOutputFileToResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveOutputFileToResourceResponseBody self = new SaveOutputFileToResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveOutputFileToResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveOutputFileToResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveOutputFileToResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveOutputFileToResourceResponseBody setResults(java.util.List<SaveOutputFileToResourceResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<SaveOutputFileToResourceResponseBodyResults> getResults() {
        return this.results;
    }

    public static class SaveOutputFileToResourceResponseBodyResults extends TeaModel {
        /**
         * <p>The business error code (i18n key). Returned on failure.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The error description, localized based on the request Accept-Language header. Returned on failure.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The output detail ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleItemId</p>
         */
        @NameInMap("itemId")
        public String itemId;

        /**
         * <p>The sourceId of the newly created resource. Returned on success.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceId</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        /**
         * <p>Indicates whether the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("success")
        public Boolean success;

        public static SaveOutputFileToResourceResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            SaveOutputFileToResourceResponseBodyResults self = new SaveOutputFileToResourceResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public SaveOutputFileToResourceResponseBodyResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public SaveOutputFileToResourceResponseBodyResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SaveOutputFileToResourceResponseBodyResults setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public SaveOutputFileToResourceResponseBodyResults setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public SaveOutputFileToResourceResponseBodyResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
