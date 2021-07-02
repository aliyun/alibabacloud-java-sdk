// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeQuotaInvoiceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeQuotaInvoiceResponseBodyData data;

    public static RecognizeQuotaInvoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeQuotaInvoiceResponseBody self = new RecognizeQuotaInvoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeQuotaInvoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeQuotaInvoiceResponseBody setData(RecognizeQuotaInvoiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeQuotaInvoiceResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeQuotaInvoiceResponseBodyDataContent extends TeaModel {
        @NameInMap("SumAmount")
        public String sumAmount;

        @NameInMap("InvoiceCode")
        public String invoiceCode;

        @NameInMap("InvoiceNo")
        public String invoiceNo;

        @NameInMap("InvoiceAmount")
        public String invoiceAmount;

        @NameInMap("InvoiceDetails")
        public String invoiceDetails;

        public static RecognizeQuotaInvoiceResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQuotaInvoiceResponseBodyDataContent self = new RecognizeQuotaInvoiceResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public RecognizeQuotaInvoiceResponseBodyDataContent setSumAmount(String sumAmount) {
            this.sumAmount = sumAmount;
            return this;
        }
        public String getSumAmount() {
            return this.sumAmount;
        }

        public RecognizeQuotaInvoiceResponseBodyDataContent setInvoiceCode(String invoiceCode) {
            this.invoiceCode = invoiceCode;
            return this;
        }
        public String getInvoiceCode() {
            return this.invoiceCode;
        }

        public RecognizeQuotaInvoiceResponseBodyDataContent setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
            return this;
        }
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        public RecognizeQuotaInvoiceResponseBodyDataContent setInvoiceAmount(String invoiceAmount) {
            this.invoiceAmount = invoiceAmount;
            return this;
        }
        public String getInvoiceAmount() {
            return this.invoiceAmount;
        }

        public RecognizeQuotaInvoiceResponseBodyDataContent setInvoiceDetails(String invoiceDetails) {
            this.invoiceDetails = invoiceDetails;
            return this;
        }
        public String getInvoiceDetails() {
            return this.invoiceDetails;
        }

    }

    public static class RecognizeQuotaInvoiceResponseBodyDataKeyValueInfosValuePositions extends TeaModel {
        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static RecognizeQuotaInvoiceResponseBodyDataKeyValueInfosValuePositions build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQuotaInvoiceResponseBodyDataKeyValueInfosValuePositions self = new RecognizeQuotaInvoiceResponseBodyDataKeyValueInfosValuePositions();
            return TeaModel.build(map, self);
        }

        public RecognizeQuotaInvoiceResponseBodyDataKeyValueInfosValuePositions setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public RecognizeQuotaInvoiceResponseBodyDataKeyValueInfosValuePositions setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class RecognizeQuotaInvoiceResponseBodyDataKeyValueInfos extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValuePositions")
        public java.util.List<RecognizeQuotaInvoiceResponseBodyDataKeyValueInfosValuePositions> valuePositions;

        @NameInMap("ValueScore")
        public Float valueScore;

        public static RecognizeQuotaInvoiceResponseBodyDataKeyValueInfos build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQuotaInvoiceResponseBodyDataKeyValueInfos self = new RecognizeQuotaInvoiceResponseBodyDataKeyValueInfos();
            return TeaModel.build(map, self);
        }

        public RecognizeQuotaInvoiceResponseBodyDataKeyValueInfos setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RecognizeQuotaInvoiceResponseBodyDataKeyValueInfos setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public RecognizeQuotaInvoiceResponseBodyDataKeyValueInfos setValuePositions(java.util.List<RecognizeQuotaInvoiceResponseBodyDataKeyValueInfosValuePositions> valuePositions) {
            this.valuePositions = valuePositions;
            return this;
        }
        public java.util.List<RecognizeQuotaInvoiceResponseBodyDataKeyValueInfosValuePositions> getValuePositions() {
            return this.valuePositions;
        }

        public RecognizeQuotaInvoiceResponseBodyDataKeyValueInfos setValueScore(Float valueScore) {
            this.valueScore = valueScore;
            return this;
        }
        public Float getValueScore() {
            return this.valueScore;
        }

    }

    public static class RecognizeQuotaInvoiceResponseBodyData extends TeaModel {
        @NameInMap("Angle")
        public Long angle;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Width")
        public Long width;

        @NameInMap("OrgHeight")
        public Long orgHeight;

        @NameInMap("OrgWidth")
        public Long orgWidth;

        @NameInMap("Content")
        public RecognizeQuotaInvoiceResponseBodyDataContent content;

        @NameInMap("KeyValueInfos")
        public java.util.List<RecognizeQuotaInvoiceResponseBodyDataKeyValueInfos> keyValueInfos;

        public static RecognizeQuotaInvoiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQuotaInvoiceResponseBodyData self = new RecognizeQuotaInvoiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeQuotaInvoiceResponseBodyData setAngle(Long angle) {
            this.angle = angle;
            return this;
        }
        public Long getAngle() {
            return this.angle;
        }

        public RecognizeQuotaInvoiceResponseBodyData setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public RecognizeQuotaInvoiceResponseBodyData setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public RecognizeQuotaInvoiceResponseBodyData setOrgHeight(Long orgHeight) {
            this.orgHeight = orgHeight;
            return this;
        }
        public Long getOrgHeight() {
            return this.orgHeight;
        }

        public RecognizeQuotaInvoiceResponseBodyData setOrgWidth(Long orgWidth) {
            this.orgWidth = orgWidth;
            return this;
        }
        public Long getOrgWidth() {
            return this.orgWidth;
        }

        public RecognizeQuotaInvoiceResponseBodyData setContent(RecognizeQuotaInvoiceResponseBodyDataContent content) {
            this.content = content;
            return this;
        }
        public RecognizeQuotaInvoiceResponseBodyDataContent getContent() {
            return this.content;
        }

        public RecognizeQuotaInvoiceResponseBodyData setKeyValueInfos(java.util.List<RecognizeQuotaInvoiceResponseBodyDataKeyValueInfos> keyValueInfos) {
            this.keyValueInfos = keyValueInfos;
            return this;
        }
        public java.util.List<RecognizeQuotaInvoiceResponseBodyDataKeyValueInfos> getKeyValueInfos() {
            return this.keyValueInfos;
        }

    }

}
