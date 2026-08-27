// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveGroupOutputFileToPersonalResourceResponseBody extends TeaModel {
    /**
     * <p>SUCCESS indicates success. In case of failure, the corresponding error type is returned, such as ERR_BAD_REQUEST, ERR_VALIDATION_FAILED, or ERR_INTERNAL_SERVER_ERROR.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
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
     * <p>The result list.</p>
     */
    @NameInMap("results")
    public java.util.List<SaveGroupOutputFileToPersonalResourceResponseBodyResults> results;

    public static SaveGroupOutputFileToPersonalResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveGroupOutputFileToPersonalResourceResponseBody self = new SaveGroupOutputFileToPersonalResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveGroupOutputFileToPersonalResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveGroupOutputFileToPersonalResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveGroupOutputFileToPersonalResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveGroupOutputFileToPersonalResourceResponseBody setResults(java.util.List<SaveGroupOutputFileToPersonalResourceResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<SaveGroupOutputFileToPersonalResourceResponseBodyResults> getResults() {
        return this.results;
    }

    public static class SaveGroupOutputFileToPersonalResourceResponseBodyResults extends TeaModel {
        /**
         * <p>The business error code (i18n key), returned on failure.</p>
         * 
         * <strong>example:</strong>
         * <p>ERR.Robject.UserOutput.ItemNotFound</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The error description (internationalized based on the request locale), returned on failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Group output does not exist</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The output item ID.</p>
         * 
         * <strong>example:</strong>
         * <p>item-1</p>
         */
        @NameInMap("itemId")
        public String itemId;

        /**
         * <p>The sourceId of the newly created resource, returned on success.</p>
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

        public static SaveGroupOutputFileToPersonalResourceResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            SaveGroupOutputFileToPersonalResourceResponseBodyResults self = new SaveGroupOutputFileToPersonalResourceResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public SaveGroupOutputFileToPersonalResourceResponseBodyResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public SaveGroupOutputFileToPersonalResourceResponseBodyResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SaveGroupOutputFileToPersonalResourceResponseBodyResults setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public SaveGroupOutputFileToPersonalResourceResponseBodyResults setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public SaveGroupOutputFileToPersonalResourceResponseBodyResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
