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

    public static class RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiCenter extends TeaModel {
        @NameInMap("X")
        @Validation(required = true)
        public Double x;

        @NameInMap("Y")
        @Validation(required = true)
        public Double y;

        public static RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiCenter build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiCenter self = new RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiCenter();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiSize extends TeaModel {
        @NameInMap("H")
        @Validation(required = true)
        public Double h;

        @NameInMap("W")
        @Validation(required = true)
        public Double w;

        public static RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiSize build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiSize self = new RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoiSize();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeTaxiInvoiceResponseDataInvoicesItemsItemRoi extends TeaModel {
        @NameInMap("Angle")
        @Validation(required = true)
        public Double angle;

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

    }

    public static class RecognizeTaxiInvoiceResponseDataInvoicesInvoiceRoi extends TeaModel {
        @NameInMap("H")
        @Validation(required = true)
        public Double h;

        @NameInMap("W")
        @Validation(required = true)
        public Double w;

        @NameInMap("X")
        @Validation(required = true)
        public Double x;

        @NameInMap("Y")
        @Validation(required = true)
        public Double y;

        public static RecognizeTaxiInvoiceResponseDataInvoicesInvoiceRoi build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseDataInvoicesInvoiceRoi self = new RecognizeTaxiInvoiceResponseDataInvoicesInvoiceRoi();
            return TeaModel.build(map, self);
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

    }

    public static class RecognizeTaxiInvoiceResponseData extends TeaModel {
        @NameInMap("Invoices")
        @Validation(required = true)
        public java.util.List<RecognizeTaxiInvoiceResponseDataInvoices> invoices;

        public static RecognizeTaxiInvoiceResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTaxiInvoiceResponseData self = new RecognizeTaxiInvoiceResponseData();
            return TeaModel.build(map, self);
        }

    }

}
