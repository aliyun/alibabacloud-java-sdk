// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTicketInvoiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeTicketInvoiceResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeTicketInvoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTicketInvoiceResponseBody self = new RecognizeTicketInvoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeTicketInvoiceResponseBody setData(RecognizeTicketInvoiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeTicketInvoiceResponseBodyData getData() {
        return this.data;
    }

    public RecognizeTicketInvoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeTicketInvoiceResponseBodyDataResultsContent extends TeaModel {
        @NameInMap("AntiFakeCode")
        public String antiFakeCode;

        @NameInMap("InvoiceCode")
        public String invoiceCode;

        @NameInMap("InvoiceDate")
        public String invoiceDate;

        @NameInMap("InvoiceNumber")
        public String invoiceNumber;

        @NameInMap("PayeeName")
        public String payeeName;

        @NameInMap("PayeeRegisterNo")
        public String payeeRegisterNo;

        @NameInMap("PayerName")
        public String payerName;

        @NameInMap("PayerRegisterNo")
        public String payerRegisterNo;

        @NameInMap("SumAmount")
        public String sumAmount;

        public static RecognizeTicketInvoiceResponseBodyDataResultsContent build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTicketInvoiceResponseBodyDataResultsContent self = new RecognizeTicketInvoiceResponseBodyDataResultsContent();
            return TeaModel.build(map, self);
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsContent setAntiFakeCode(String antiFakeCode) {
            this.antiFakeCode = antiFakeCode;
            return this;
        }
        public String getAntiFakeCode() {
            return this.antiFakeCode;
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsContent setInvoiceCode(String invoiceCode) {
            this.invoiceCode = invoiceCode;
            return this;
        }
        public String getInvoiceCode() {
            return this.invoiceCode;
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsContent setInvoiceDate(String invoiceDate) {
            this.invoiceDate = invoiceDate;
            return this;
        }
        public String getInvoiceDate() {
            return this.invoiceDate;
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsContent setInvoiceNumber(String invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
            return this;
        }
        public String getInvoiceNumber() {
            return this.invoiceNumber;
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsContent setPayeeName(String payeeName) {
            this.payeeName = payeeName;
            return this;
        }
        public String getPayeeName() {
            return this.payeeName;
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsContent setPayeeRegisterNo(String payeeRegisterNo) {
            this.payeeRegisterNo = payeeRegisterNo;
            return this;
        }
        public String getPayeeRegisterNo() {
            return this.payeeRegisterNo;
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsContent setPayerName(String payerName) {
            this.payerName = payerName;
            return this;
        }
        public String getPayerName() {
            return this.payerName;
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsContent setPayerRegisterNo(String payerRegisterNo) {
            this.payerRegisterNo = payerRegisterNo;
            return this;
        }
        public String getPayerRegisterNo() {
            return this.payerRegisterNo;
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsContent setSumAmount(String sumAmount) {
            this.sumAmount = sumAmount;
            return this;
        }
        public String getSumAmount() {
            return this.sumAmount;
        }

    }

    public static class RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfosValuePositions extends TeaModel {
        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfosValuePositions build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfosValuePositions self = new RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfosValuePositions();
            return TeaModel.build(map, self);
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfosValuePositions setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfosValuePositions setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfos extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValuePositions")
        public java.util.List<RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfosValuePositions> valuePositions;

        @NameInMap("ValueScore")
        public Float valueScore;

        public static RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfos build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfos self = new RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfos();
            return TeaModel.build(map, self);
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfos setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfos setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfos setValuePositions(java.util.List<RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfosValuePositions> valuePositions) {
            this.valuePositions = valuePositions;
            return this;
        }
        public java.util.List<RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfosValuePositions> getValuePositions() {
            return this.valuePositions;
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfos setValueScore(Float valueScore) {
            this.valueScore = valueScore;
            return this;
        }
        public Float getValueScore() {
            return this.valueScore;
        }

    }

    public static class RecognizeTicketInvoiceResponseBodyDataResultsSliceRectangle extends TeaModel {
        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static RecognizeTicketInvoiceResponseBodyDataResultsSliceRectangle build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTicketInvoiceResponseBodyDataResultsSliceRectangle self = new RecognizeTicketInvoiceResponseBodyDataResultsSliceRectangle();
            return TeaModel.build(map, self);
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsSliceRectangle setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public RecognizeTicketInvoiceResponseBodyDataResultsSliceRectangle setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class RecognizeTicketInvoiceResponseBodyDataResults extends TeaModel {
        @NameInMap("Content")
        public RecognizeTicketInvoiceResponseBodyDataResultsContent content;

        @NameInMap("Index")
        public Long index;

        @NameInMap("KeyValueInfos")
        public java.util.List<RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfos> keyValueInfos;

        @NameInMap("SliceRectangle")
        public java.util.List<RecognizeTicketInvoiceResponseBodyDataResultsSliceRectangle> sliceRectangle;

        @NameInMap("Type")
        public String type;

        public static RecognizeTicketInvoiceResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTicketInvoiceResponseBodyDataResults self = new RecognizeTicketInvoiceResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public RecognizeTicketInvoiceResponseBodyDataResults setContent(RecognizeTicketInvoiceResponseBodyDataResultsContent content) {
            this.content = content;
            return this;
        }
        public RecognizeTicketInvoiceResponseBodyDataResultsContent getContent() {
            return this.content;
        }

        public RecognizeTicketInvoiceResponseBodyDataResults setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public RecognizeTicketInvoiceResponseBodyDataResults setKeyValueInfos(java.util.List<RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfos> keyValueInfos) {
            this.keyValueInfos = keyValueInfos;
            return this;
        }
        public java.util.List<RecognizeTicketInvoiceResponseBodyDataResultsKeyValueInfos> getKeyValueInfos() {
            return this.keyValueInfos;
        }

        public RecognizeTicketInvoiceResponseBodyDataResults setSliceRectangle(java.util.List<RecognizeTicketInvoiceResponseBodyDataResultsSliceRectangle> sliceRectangle) {
            this.sliceRectangle = sliceRectangle;
            return this;
        }
        public java.util.List<RecognizeTicketInvoiceResponseBodyDataResultsSliceRectangle> getSliceRectangle() {
            return this.sliceRectangle;
        }

        public RecognizeTicketInvoiceResponseBodyDataResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RecognizeTicketInvoiceResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Height")
        public Long height;

        @NameInMap("OrgHeight")
        public Long orgHeight;

        @NameInMap("OrgWidth")
        public Long orgWidth;

        @NameInMap("Results")
        public java.util.List<RecognizeTicketInvoiceResponseBodyDataResults> results;

        @NameInMap("Width")
        public Long width;

        public static RecognizeTicketInvoiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTicketInvoiceResponseBodyData self = new RecognizeTicketInvoiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeTicketInvoiceResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public RecognizeTicketInvoiceResponseBodyData setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public RecognizeTicketInvoiceResponseBodyData setOrgHeight(Long orgHeight) {
            this.orgHeight = orgHeight;
            return this;
        }
        public Long getOrgHeight() {
            return this.orgHeight;
        }

        public RecognizeTicketInvoiceResponseBodyData setOrgWidth(Long orgWidth) {
            this.orgWidth = orgWidth;
            return this;
        }
        public Long getOrgWidth() {
            return this.orgWidth;
        }

        public RecognizeTicketInvoiceResponseBodyData setResults(java.util.List<RecognizeTicketInvoiceResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RecognizeTicketInvoiceResponseBodyDataResults> getResults() {
            return this.results;
        }

        public RecognizeTicketInvoiceResponseBodyData setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

}
