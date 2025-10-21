// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class CreateWordGroupResponseBody extends TeaModel {
    /**
     * <p>Status code, 00000 indicates success; others indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>If there is an error, returns the error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. true: Call succeeded. false: Call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Error information list</p>
     */
    @NameInMap("WordErrorInfoList")
    public java.util.List<CreateWordGroupResponseBodyWordErrorInfoList> wordErrorInfoList;

    public static CreateWordGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWordGroupResponseBody self = new CreateWordGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWordGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateWordGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateWordGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateWordGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWordGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateWordGroupResponseBody setWordErrorInfoList(java.util.List<CreateWordGroupResponseBodyWordErrorInfoList> wordErrorInfoList) {
        this.wordErrorInfoList = wordErrorInfoList;
        return this;
    }
    public java.util.List<CreateWordGroupResponseBodyWordErrorInfoList> getWordErrorInfoList() {
        return this.wordErrorInfoList;
    }

    public static class CreateWordGroupResponseBodyWordErrorInfoList extends TeaModel {
        /**
         * <p>Error message description</p>
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
         * <p>Label</p>
         * 
         * <strong>example:</strong>
         * <p>Buss.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>Keyword</p>
         * 
         * <strong>example:</strong>
         * <p>Inv.</p>
         */
        @NameInMap("Word")
        public String word;

        public static CreateWordGroupResponseBodyWordErrorInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreateWordGroupResponseBodyWordErrorInfoList self = new CreateWordGroupResponseBodyWordErrorInfoList();
            return TeaModel.build(map, self);
        }

        public CreateWordGroupResponseBodyWordErrorInfoList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CreateWordGroupResponseBodyWordErrorInfoList setErrorStatus(Integer errorStatus) {
            this.errorStatus = errorStatus;
            return this;
        }
        public Integer getErrorStatus() {
            return this.errorStatus;
        }

        public CreateWordGroupResponseBodyWordErrorInfoList setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public CreateWordGroupResponseBodyWordErrorInfoList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public CreateWordGroupResponseBodyWordErrorInfoList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

}
