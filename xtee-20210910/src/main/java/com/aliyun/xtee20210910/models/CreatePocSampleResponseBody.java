// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreatePocSampleResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
    public String httpStatusCode;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return Result.</p>
     */
    @NameInMap("ResultObject")
    public CreatePocSampleResponseBodyResultObject resultObject;

    public static CreatePocSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePocSampleResponseBody self = new CreatePocSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePocSampleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePocSampleResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreatePocSampleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePocSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePocSampleResponseBody setResultObject(CreatePocSampleResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CreatePocSampleResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CreatePocSampleResponseBodyResultObject extends TeaModel {
        /**
         * <p>Indicates whether validation warnings exist.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasWarnings")
        public Boolean hasWarnings;

        /**
         * <p>Sample ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SampleId")
        public Integer sampleId;

        /**
         * <p>Sample Name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleNameTest</p>
         */
        @NameInMap("SampleName")
        public String sampleName;

        /**
         * <p>Scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>FINANCE</p>
         */
        @NameInMap("Tab")
        public String tab;

        /**
         * <p>Warning summary.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WarningMessage")
        public String warningMessage;

        public static CreatePocSampleResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CreatePocSampleResponseBodyResultObject self = new CreatePocSampleResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CreatePocSampleResponseBodyResultObject setHasWarnings(Boolean hasWarnings) {
            this.hasWarnings = hasWarnings;
            return this;
        }
        public Boolean getHasWarnings() {
            return this.hasWarnings;
        }

        public CreatePocSampleResponseBodyResultObject setSampleId(Integer sampleId) {
            this.sampleId = sampleId;
            return this;
        }
        public Integer getSampleId() {
            return this.sampleId;
        }

        public CreatePocSampleResponseBodyResultObject setSampleName(String sampleName) {
            this.sampleName = sampleName;
            return this;
        }
        public String getSampleName() {
            return this.sampleName;
        }

        public CreatePocSampleResponseBodyResultObject setTab(String tab) {
            this.tab = tab;
            return this;
        }
        public String getTab() {
            return this.tab;
        }

        public CreatePocSampleResponseBodyResultObject setWarningMessage(String warningMessage) {
            this.warningMessage = warningMessage;
            return this;
        }
        public String getWarningMessage() {
            return this.warningMessage;
        }

    }

}
