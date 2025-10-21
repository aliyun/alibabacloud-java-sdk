// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class UpdateWordGroupResponseBody extends TeaModel {
    /**
     * <p>Status code, 00000 indicates success; others indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>If there is an error, return the error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether it was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>List of error information.</p>
     */
    @NameInMap("WordErrorInfoList")
    public java.util.List<UpdateWordGroupResponseBodyWordErrorInfoList> wordErrorInfoList;

    public static UpdateWordGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWordGroupResponseBody self = new UpdateWordGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWordGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateWordGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateWordGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateWordGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWordGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateWordGroupResponseBody setWordErrorInfoList(java.util.List<UpdateWordGroupResponseBodyWordErrorInfoList> wordErrorInfoList) {
        this.wordErrorInfoList = wordErrorInfoList;
        return this;
    }
    public java.util.List<UpdateWordGroupResponseBodyWordErrorInfoList> getWordErrorInfoList() {
        return this.wordErrorInfoList;
    }

    public static class UpdateWordGroupResponseBodyWordErrorInfoList extends TeaModel {
        /**
         * <p>Error message description.</p>
         * 
         * <strong>example:</strong>
         * <p>Keyword can not be empty</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Error status information.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ErrorStatus")
        public Integer errorStatus;

        /**
         * <p>Position of the error information in the array.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>Label.</p>
         * 
         * <strong>example:</strong>
         * <p>Buss.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>Keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>Inv.</p>
         */
        @NameInMap("Word")
        public String word;

        public static UpdateWordGroupResponseBodyWordErrorInfoList build(java.util.Map<String, ?> map) throws Exception {
            UpdateWordGroupResponseBodyWordErrorInfoList self = new UpdateWordGroupResponseBodyWordErrorInfoList();
            return TeaModel.build(map, self);
        }

        public UpdateWordGroupResponseBodyWordErrorInfoList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public UpdateWordGroupResponseBodyWordErrorInfoList setErrorStatus(Integer errorStatus) {
            this.errorStatus = errorStatus;
            return this;
        }
        public Integer getErrorStatus() {
            return this.errorStatus;
        }

        public UpdateWordGroupResponseBodyWordErrorInfoList setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public UpdateWordGroupResponseBodyWordErrorInfoList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public UpdateWordGroupResponseBodyWordErrorInfoList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

}
