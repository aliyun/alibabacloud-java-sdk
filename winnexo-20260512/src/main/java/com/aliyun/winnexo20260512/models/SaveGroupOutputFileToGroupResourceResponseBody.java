// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveGroupOutputFileToGroupResourceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
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
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of results.</p>
     */
    @NameInMap("results")
    public java.util.List<SaveGroupOutputFileToGroupResourceResponseBodyResults> results;

    public static SaveGroupOutputFileToGroupResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveGroupOutputFileToGroupResourceResponseBody self = new SaveGroupOutputFileToGroupResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveGroupOutputFileToGroupResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveGroupOutputFileToGroupResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveGroupOutputFileToGroupResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveGroupOutputFileToGroupResourceResponseBody setResults(java.util.List<SaveGroupOutputFileToGroupResourceResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<SaveGroupOutputFileToGroupResourceResponseBodyResults> getResults() {
        return this.results;
    }

    public static class SaveGroupOutputFileToGroupResourceResponseBodyResults extends TeaModel {
        /**
         * <p>The business error code (i18n key), returned when the operation fails.</p>
         * 
         * <strong>example:</strong>
         * <p>ERR.Robject.UserOutput.ItemNotFound</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The error description (internationalized based on the request locale), returned when the operation fails.</p>
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
         * <p>The sourceId of the newly created resource, returned when the operation is successful.</p>
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

        public static SaveGroupOutputFileToGroupResourceResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            SaveGroupOutputFileToGroupResourceResponseBodyResults self = new SaveGroupOutputFileToGroupResourceResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public SaveGroupOutputFileToGroupResourceResponseBodyResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public SaveGroupOutputFileToGroupResourceResponseBodyResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SaveGroupOutputFileToGroupResourceResponseBodyResults setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public SaveGroupOutputFileToGroupResourceResponseBodyResults setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public SaveGroupOutputFileToGroupResourceResponseBodyResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
