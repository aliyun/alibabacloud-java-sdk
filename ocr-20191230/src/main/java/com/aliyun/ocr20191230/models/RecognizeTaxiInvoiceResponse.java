// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTaxiInvoiceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeTaxiInvoiceResponseData data;

    public static RecognizeTaxiInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTaxiInvoiceResponse self = new RecognizeTaxiInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeTaxiInvoiceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeTaxiInvoiceResponse setData(RecognizeTaxiInvoiceResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeTaxiInvoiceResponseData getData() {
        return this.data;
    }

    public static class RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiCenter extends TeaModel {
        @NameInMap("X")
        @Validation(required = true)
        public Float x;

        @NameInMap("Y")
        @Validation(required = true)
        public Float y;

        public static RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiCenter build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiCenter self = new RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiCenter();
            return TeaModel.build(map, self);
        }

        public RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiCenter setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiCenter setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiSize extends TeaModel {
        @NameInMap("H")
        @Validation(required = true)
        public Float h;

        @NameInMap("W")
        @Validation(required = true)
        public Float w;

        public static RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiSize build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiSize self = new RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiSize();
            return TeaModel.build(map, self);
        }

        public RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiSize setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiSize setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

    }

    public static class RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoi extends TeaModel {
        @NameInMap("Angle")
        @Validation(required = true)
        public Float angle;

        @NameInMap("Center")
        @Validation(required = true)
        public RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiCenter center;

        @NameInMap("Size")
        @Validation(required = true)
        public RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiSize size;

        public static RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoi build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoi self = new RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoi();
            return TeaModel.build(map, self);
        }

        public RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoi setAngle(Float angle) {
            this.angle = angle;
            return this;
        }
        public Float getAngle() {
            return this.angle;
        }

        public RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoi setCenter(RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiCenter center) {
            this.center = center;
            return this;
        }
        public RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiCenter getCenter() {
            return this.center;
        }

        public RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoi setSize(RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiSize size) {
            this.size = size;
            return this;
        }
        public RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiSize getSize() {
            return this.size;
        }

    }

    public static class RecognizeTaxiInvoiceResponseDataInvoicesItems extends TeaModel {
        @NameInMap("Text")
        @Validation(required = true)
        public String text;

        @NameInMap("ItemRoi")
        @Validation(required = true)
        public RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoi itemRoi;

        public static RecognizeTaxiInvoiceResponseDataInvoicesItems build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseDataInvoicesItems self = new RecognizeTaxiInvoiceResponseDataInvoicesItems();
            return TeaModel.build(map, self);
        }

        public RecognizeTaxiInvoiceResponseDataInvoicesItems setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RecognizeTaxiInvoiceResponseDataInvoicesItems setItemRoi(RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoi itemRoi) {
            this.itemRoi = itemRoi;
            return this;
        }
        public RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoi getItemRoi() {
            return this.itemRoi;
        }

    }

    public static class RecognizeTaxiInvoiceResponseDataInvoicesInvoiceRoi extends TeaModel {
        @NameInMap("H")
        @Validation(required = true)
        public Float h;

        @NameInMap("W")
        @Validation(required = true)
        public Float w;

        @NameInMap("X")
        @Validation(required = true)
        public Float x;

        @NameInMap("Y")
        @Validation(required = true)
        public Float y;

        public static RecognizeTaxiInvoiceResponseDataInvoicesInvoiceRoi build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseDataInvoicesInvoiceRoi self = new RecognizeTaxiInvoiceResponseDataInvoicesInvoiceRoi();
            return TeaModel.build(map, self);
        }

        public RecognizeTaxiInvoiceResponseDataInvoicesInvoiceRoi setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public RecognizeTaxiInvoiceResponseDataInvoicesInvoiceRoi setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public RecognizeTaxiInvoiceResponseDataInvoicesInvoiceRoi setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTaxiInvoiceResponseDataInvoicesInvoiceRoi setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTaxiInvoiceResponseDataInvoices extends TeaModel {
        @NameInMap("RotateType")
        @Validation(required = true)
        public Integer rotateType;

        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<RecognizeTaxiInvoiceResponseDataInvoicesItems> items;

        @NameInMap("InvoiceRoi")
        @Validation(required = true)
        public RecognizeTaxiInvoiceResponseDataInvoicesInvoiceRoi invoiceRoi;

        public static RecognizeTaxiInvoiceResponseDataInvoices build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseDataInvoices self = new RecognizeTaxiInvoiceResponseDataInvoices();
            return TeaModel.build(map, self);
        }

        public RecognizeTaxiInvoiceResponseDataInvoices setRotateType(Integer rotateType) {
            this.rotateType = rotateType;
            return this;
        }
        public Integer getRotateType() {
            return this.rotateType;
        }

        public RecognizeTaxiInvoiceResponseDataInvoices setItems(java.util.List<RecognizeTaxiInvoiceResponseDataInvoicesItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<RecognizeTaxiInvoiceResponseDataInvoicesItems> getItems() {
            return this.items;
        }

        public RecognizeTaxiInvoiceResponseDataInvoices setInvoiceRoi(RecognizeTaxiInvoiceResponseDataInvoicesInvoiceRoi invoiceRoi) {
            this.invoiceRoi = invoiceRoi;
            return this;
        }
        public RecognizeTaxiInvoiceResponseDataInvoicesInvoiceRoi getInvoiceRoi() {
            return this.invoiceRoi;
        }

    }

    public static class RecognizeTaxiInvoiceResponseData extends TeaModel {
        @NameInMap("Invoices")
        @Validation(required = true)
        public java.util.List<RecognizeTaxiInvoiceResponseDataInvoices> invoices;

        public static RecognizeTaxiInvoiceResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseData self = new RecognizeTaxiInvoiceResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeTaxiInvoiceResponseData setInvoices(java.util.List<RecognizeTaxiInvoiceResponseDataInvoices> invoices) {
            this.invoices = invoices;
            return this;
        }
        public java.util.List<RecognizeTaxiInvoiceResponseDataInvoices> getInvoices() {
            return this.invoices;
        }

    }

}
