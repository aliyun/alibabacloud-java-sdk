// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckDuplicateClassificationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CheckDuplicateClassificationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckDuplicateClassificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDuplicateClassificationResponseBody self = new CheckDuplicateClassificationResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDuplicateClassificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckDuplicateClassificationResponseBody setData(CheckDuplicateClassificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckDuplicateClassificationResponseBodyData getData() {
        return this.data;
    }

    public CheckDuplicateClassificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckDuplicateClassificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckDuplicateClassificationResponseBodyDataDuplicateSecondaryClassification extends TeaModel {
        @NameInMap("SecondaryClassification")
        public java.util.List<String> secondaryClassification;

        public static CheckDuplicateClassificationResponseBodyDataDuplicateSecondaryClassification build(java.util.Map<String, ?> map) throws Exception {
            CheckDuplicateClassificationResponseBodyDataDuplicateSecondaryClassification self = new CheckDuplicateClassificationResponseBodyDataDuplicateSecondaryClassification();
            return TeaModel.build(map, self);
        }

        public CheckDuplicateClassificationResponseBodyDataDuplicateSecondaryClassification setSecondaryClassification(java.util.List<String> secondaryClassification) {
            this.secondaryClassification = secondaryClassification;
            return this;
        }
        public java.util.List<String> getSecondaryClassification() {
            return this.secondaryClassification;
        }

    }

    public static class CheckDuplicateClassificationResponseBodyData extends TeaModel {
        @NameInMap("DuplicateSecondaryClassification")
        public CheckDuplicateClassificationResponseBodyDataDuplicateSecondaryClassification duplicateSecondaryClassification;

        @NameInMap("TrademarkName")
        public String trademarkName;

        public static CheckDuplicateClassificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckDuplicateClassificationResponseBodyData self = new CheckDuplicateClassificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckDuplicateClassificationResponseBodyData setDuplicateSecondaryClassification(CheckDuplicateClassificationResponseBodyDataDuplicateSecondaryClassification duplicateSecondaryClassification) {
            this.duplicateSecondaryClassification = duplicateSecondaryClassification;
            return this;
        }
        public CheckDuplicateClassificationResponseBodyDataDuplicateSecondaryClassification getDuplicateSecondaryClassification() {
            return this.duplicateSecondaryClassification;
        }

        public CheckDuplicateClassificationResponseBodyData setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

    }

}
