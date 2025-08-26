// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeQuotaInvoiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeQuotaInvoiceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>BC4C12D0-7FD3-419A-B997-A91212DF6D82</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeQuotaInvoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeQuotaInvoiceResponseBody self = new RecognizeQuotaInvoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeQuotaInvoiceResponseBody setData(RecognizeQuotaInvoiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeQuotaInvoiceResponseBodyData getData() {
        return this.data;
    }

    public RecognizeQuotaInvoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeQuotaInvoiceResponseBodyDataContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InvoiceAmount")
        public String invoiceAmount;

        /**
         * <strong>example:</strong>
         * <p>144031800103</p>
         */
        @NameInMap("InvoiceCode")
        public String invoiceCode;

        @NameInMap("InvoiceDetails")
        public String invoiceDetails;

        /**
         * <strong>example:</strong>
         * <p>40637706</p>
         */
        @NameInMap("InvoiceNo")
        public String invoiceNo;

        @NameInMap("SumAmount")
        public String sumAmount;

        public static RecognizeQuotaInvoiceResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQuotaInvoiceResponseBodyDataContent self = new RecognizeQuotaInvoiceResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public RecognizeQuotaInvoiceResponseBodyDataContent setInvoiceAmount(String invoiceAmount) {
            this.invoiceAmount = invoiceAmount;
            return this;
        }
        public String getInvoiceAmount() {
            return this.invoiceAmount;
        }

        public RecognizeQuotaInvoiceResponseBodyDataContent setInvoiceCode(String invoiceCode) {
            this.invoiceCode = invoiceCode;
            return this;
        }
        public String getInvoiceCode() {
            return this.invoiceCode;
        }

        public RecognizeQuotaInvoiceResponseBodyDataContent setInvoiceDetails(String invoiceDetails) {
            this.invoiceDetails = invoiceDetails;
            return this;
        }
        public String getInvoiceDetails() {
            return this.invoiceDetails;
        }

        public RecognizeQuotaInvoiceResponseBodyDataContent setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
            return this;
        }
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        public RecognizeQuotaInvoiceResponseBodyDataContent setSumAmount(String sumAmount) {
            this.sumAmount = sumAmount;
            return this;
        }
        public String getSumAmount() {
            return this.sumAmount;
        }

    }

    public static class RecognizeQuotaInvoiceResponseBodyDataKeyValueInfosValuePositions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>544</p>
         */
        @NameInMap("X")
        public Long x;

        /**
         * <strong>example:</strong>
         * <p>387</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Angle")
        public Long angle;

        @NameInMap("Content")
        public RecognizeQuotaInvoiceResponseBodyDataContent content;

        /**
         * <strong>example:</strong>
         * <p>624</p>
         */
        @NameInMap("Height")
        public Long height;

        @NameInMap("KeyValueInfos")
        public java.util.List<RecognizeQuotaInvoiceResponseBodyDataKeyValueInfos> keyValueInfos;

        /**
         * <strong>example:</strong>
         * <p>610</p>
         */
        @NameInMap("OrgHeight")
        public Long orgHeight;

        /**
         * <strong>example:</strong>
         * <p>855</p>
         */
        @NameInMap("OrgWidth")
        public Long orgWidth;

        /**
         * <strong>example:</strong>
         * <p>865</p>
         */
        @NameInMap("Width")
        public Long width;

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

        public RecognizeQuotaInvoiceResponseBodyData setContent(RecognizeQuotaInvoiceResponseBodyDataContent content) {
            this.content = content;
            return this;
        }
        public RecognizeQuotaInvoiceResponseBodyDataContent getContent() {
            return this.content;
        }

        public RecognizeQuotaInvoiceResponseBodyData setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public RecognizeQuotaInvoiceResponseBodyData setKeyValueInfos(java.util.List<RecognizeQuotaInvoiceResponseBodyDataKeyValueInfos> keyValueInfos) {
            this.keyValueInfos = keyValueInfos;
            return this;
        }
        public java.util.List<RecognizeQuotaInvoiceResponseBodyDataKeyValueInfos> getKeyValueInfos() {
            return this.keyValueInfos;
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

        public RecognizeQuotaInvoiceResponseBodyData setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

}
