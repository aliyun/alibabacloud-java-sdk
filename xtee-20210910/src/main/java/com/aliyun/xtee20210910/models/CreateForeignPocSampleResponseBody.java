// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateForeignPocSampleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public CreateForeignPocSampleResponseBodyResultObject resultObject;

    public static CreateForeignPocSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateForeignPocSampleResponseBody self = new CreateForeignPocSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateForeignPocSampleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateForeignPocSampleResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateForeignPocSampleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateForeignPocSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateForeignPocSampleResponseBody setResultObject(CreateForeignPocSampleResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CreateForeignPocSampleResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CreateForeignPocSampleResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasWarnings")
        public Boolean hasWarnings;

        /**
         * <strong>example:</strong>
         * <p>174</p>
         */
        @NameInMap("SampleId")
        public Integer sampleId;

        /**
         * <strong>example:</strong>
         * <p>SampleNameTest</p>
         */
        @NameInMap("SampleName")
        public String sampleName;

        /**
         * <strong>example:</strong>
         * <p>FINANCE</p>
         */
        @NameInMap("Tab")
        public String tab;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WarningMessage")
        public String warningMessage;

        public static CreateForeignPocSampleResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CreateForeignPocSampleResponseBodyResultObject self = new CreateForeignPocSampleResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CreateForeignPocSampleResponseBodyResultObject setHasWarnings(Boolean hasWarnings) {
            this.hasWarnings = hasWarnings;
            return this;
        }
        public Boolean getHasWarnings() {
            return this.hasWarnings;
        }

        public CreateForeignPocSampleResponseBodyResultObject setSampleId(Integer sampleId) {
            this.sampleId = sampleId;
            return this;
        }
        public Integer getSampleId() {
            return this.sampleId;
        }

        public CreateForeignPocSampleResponseBodyResultObject setSampleName(String sampleName) {
            this.sampleName = sampleName;
            return this;
        }
        public String getSampleName() {
            return this.sampleName;
        }

        public CreateForeignPocSampleResponseBodyResultObject setTab(String tab) {
            this.tab = tab;
            return this;
        }
        public String getTab() {
            return this.tab;
        }

        public CreateForeignPocSampleResponseBodyResultObject setWarningMessage(String warningMessage) {
            this.warningMessage = warningMessage;
            return this;
        }
        public String getWarningMessage() {
            return this.warningMessage;
        }

    }

}
