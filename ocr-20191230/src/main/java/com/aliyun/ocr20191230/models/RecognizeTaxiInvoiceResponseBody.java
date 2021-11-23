// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTaxiInvoiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeTaxiInvoiceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeTaxiInvoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTaxiInvoiceResponseBody self = new RecognizeTaxiInvoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeTaxiInvoiceResponseBody setData(RecognizeTaxiInvoiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeTaxiInvoiceResponseBodyData getData() {
        return this.data;
    }

    public RecognizeTaxiInvoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeTaxiInvoiceResponseBodyDataInvoicesInvoiceRoi extends TeaModel {
        @NameInMap("H")
        public Float h;

        @NameInMap("W")
        public Float w;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTaxiInvoiceResponseBodyDataInvoicesInvoiceRoi build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseBodyDataInvoicesInvoiceRoi self = new RecognizeTaxiInvoiceResponseBodyDataInvoicesInvoiceRoi();
            return TeaModel.build(map, self);
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoicesInvoiceRoi setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoicesInvoiceRoi setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoicesInvoiceRoi setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoicesInvoiceRoi setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiCenter extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiCenter build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiCenter self = new RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiCenter();
            return TeaModel.build(map, self);
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiCenter setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiCenter setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiSize extends TeaModel {
        @NameInMap("H")
        public Float h;

        @NameInMap("W")
        public Float w;

        public static RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiSize build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiSize self = new RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiSize();
            return TeaModel.build(map, self);
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiSize setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiSize setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

    }

    public static class RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoi extends TeaModel {
        @NameInMap("Angle")
        public Float angle;

        @NameInMap("Center")
        public RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiCenter center;

        @NameInMap("Size")
        public RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiSize size;

        public static RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoi build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoi self = new RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoi();
            return TeaModel.build(map, self);
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoi setAngle(Float angle) {
            this.angle = angle;
            return this;
        }
        public Float getAngle() {
            return this.angle;
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoi setCenter(RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiCenter center) {
            this.center = center;
            return this;
        }
        public RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiCenter getCenter() {
            return this.center;
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoi setSize(RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiSize size) {
            this.size = size;
            return this;
        }
        public RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoiSize getSize() {
            return this.size;
        }

    }

    public static class RecognizeTaxiInvoiceResponseBodyDataInvoicesItems extends TeaModel {
        @NameInMap("ItemRoi")
        public RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoi itemRoi;

        @NameInMap("Text")
        public String text;

        public static RecognizeTaxiInvoiceResponseBodyDataInvoicesItems build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseBodyDataInvoicesItems self = new RecognizeTaxiInvoiceResponseBodyDataInvoicesItems();
            return TeaModel.build(map, self);
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoicesItems setItemRoi(RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoi itemRoi) {
            this.itemRoi = itemRoi;
            return this;
        }
        public RecognizeTaxiInvoiceResponseBodyDataInvoicesItemsItemRoi getItemRoi() {
            return this.itemRoi;
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoicesItems setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTaxiInvoiceResponseBodyDataInvoices extends TeaModel {
        @NameInMap("InvoiceRoi")
        public RecognizeTaxiInvoiceResponseBodyDataInvoicesInvoiceRoi invoiceRoi;

        @NameInMap("Items")
        public java.util.List<RecognizeTaxiInvoiceResponseBodyDataInvoicesItems> items;

        @NameInMap("RotateType")
        public Integer rotateType;

        public static RecognizeTaxiInvoiceResponseBodyDataInvoices build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseBodyDataInvoices self = new RecognizeTaxiInvoiceResponseBodyDataInvoices();
            return TeaModel.build(map, self);
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoices setInvoiceRoi(RecognizeTaxiInvoiceResponseBodyDataInvoicesInvoiceRoi invoiceRoi) {
            this.invoiceRoi = invoiceRoi;
            return this;
        }
        public RecognizeTaxiInvoiceResponseBodyDataInvoicesInvoiceRoi getInvoiceRoi() {
            return this.invoiceRoi;
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoices setItems(java.util.List<RecognizeTaxiInvoiceResponseBodyDataInvoicesItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<RecognizeTaxiInvoiceResponseBodyDataInvoicesItems> getItems() {
            return this.items;
        }

        public RecognizeTaxiInvoiceResponseBodyDataInvoices setRotateType(Integer rotateType) {
            this.rotateType = rotateType;
            return this;
        }
        public Integer getRotateType() {
            return this.rotateType;
        }

    }

    public static class RecognizeTaxiInvoiceResponseBodyData extends TeaModel {
        @NameInMap("Invoices")
        public java.util.List<RecognizeTaxiInvoiceResponseBodyDataInvoices> invoices;

        public static RecognizeTaxiInvoiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseBodyData self = new RecognizeTaxiInvoiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeTaxiInvoiceResponseBodyData setInvoices(java.util.List<RecognizeTaxiInvoiceResponseBodyDataInvoices> invoices) {
            this.invoices = invoices;
            return this;
        }
        public java.util.List<RecognizeTaxiInvoiceResponseBodyDataInvoices> getInvoices() {
            return this.invoices;
        }

    }

}
