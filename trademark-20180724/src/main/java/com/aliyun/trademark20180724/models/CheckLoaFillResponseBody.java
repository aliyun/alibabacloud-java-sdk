// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CheckLoaFillResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CheckLoaFillResponseBodyData data;

    public static CheckLoaFillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLoaFillResponseBody self = new CheckLoaFillResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLoaFillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLoaFillResponseBody setData(CheckLoaFillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckLoaFillResponseBodyData getData() {
        return this.data;
    }

    public static class CheckLoaFillResponseBodyDataErrorMsgs extends TeaModel {
        @NameInMap("ErrorMsg")
        public java.util.List<String> errorMsg;

        public static CheckLoaFillResponseBodyDataErrorMsgs build(java.util.Map<String, ?> map) throws Exception {
            CheckLoaFillResponseBodyDataErrorMsgs self = new CheckLoaFillResponseBodyDataErrorMsgs();
            return TeaModel.build(map, self);
        }

        public CheckLoaFillResponseBodyDataErrorMsgs setErrorMsg(java.util.List<String> errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public java.util.List<String> getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class CheckLoaFillResponseBodyData extends TeaModel {
        @NameInMap("AddressFill")
        public Boolean addressFill;

        @NameInMap("TemplateUrl")
        public String templateUrl;

        @NameInMap("CountryFill")
        public Boolean countryFill;

        @NameInMap("NationalityFill")
        public Boolean nationalityFill;

        @NameInMap("StampFill")
        public Boolean stampFill;

        @NameInMap("TradeMarkNameFill")
        public Boolean tradeMarkNameFill;

        @NameInMap("MaterialNameFill")
        public Boolean materialNameFill;

        @NameInMap("ErrorMsgs")
        public CheckLoaFillResponseBodyDataErrorMsgs errorMsgs;

        public static CheckLoaFillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckLoaFillResponseBodyData self = new CheckLoaFillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckLoaFillResponseBodyData setAddressFill(Boolean addressFill) {
            this.addressFill = addressFill;
            return this;
        }
        public Boolean getAddressFill() {
            return this.addressFill;
        }

        public CheckLoaFillResponseBodyData setTemplateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
            return this;
        }
        public String getTemplateUrl() {
            return this.templateUrl;
        }

        public CheckLoaFillResponseBodyData setCountryFill(Boolean countryFill) {
            this.countryFill = countryFill;
            return this;
        }
        public Boolean getCountryFill() {
            return this.countryFill;
        }

        public CheckLoaFillResponseBodyData setNationalityFill(Boolean nationalityFill) {
            this.nationalityFill = nationalityFill;
            return this;
        }
        public Boolean getNationalityFill() {
            return this.nationalityFill;
        }

        public CheckLoaFillResponseBodyData setStampFill(Boolean stampFill) {
            this.stampFill = stampFill;
            return this;
        }
        public Boolean getStampFill() {
            return this.stampFill;
        }

        public CheckLoaFillResponseBodyData setTradeMarkNameFill(Boolean tradeMarkNameFill) {
            this.tradeMarkNameFill = tradeMarkNameFill;
            return this;
        }
        public Boolean getTradeMarkNameFill() {
            return this.tradeMarkNameFill;
        }

        public CheckLoaFillResponseBodyData setMaterialNameFill(Boolean materialNameFill) {
            this.materialNameFill = materialNameFill;
            return this;
        }
        public Boolean getMaterialNameFill() {
            return this.materialNameFill;
        }

        public CheckLoaFillResponseBodyData setErrorMsgs(CheckLoaFillResponseBodyDataErrorMsgs errorMsgs) {
            this.errorMsgs = errorMsgs;
            return this;
        }
        public CheckLoaFillResponseBodyDataErrorMsgs getErrorMsgs() {
            return this.errorMsgs;
        }

    }

}
