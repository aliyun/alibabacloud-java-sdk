// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendIndexResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetTrendIndexResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static GetTrendIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrendIndexResponseBody self = new GetTrendIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrendIndexResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTrendIndexResponseBody setData(java.util.List<GetTrendIndexResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetTrendIndexResponseBodyData> getData() {
        return this.data;
    }

    public GetTrendIndexResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTrendIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrendIndexResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetTrendIndexResponseBodyData extends TeaModel {
        @NameInMap("BrandIndex")
        public Float brandIndex;

        @NameInMap("ECommerceIndex")
        public Float ECommerceIndex;

        @NameInMap("InstitutionalIndex")
        public Float institutionalIndex;

        @NameInMap("MediaIndex")
        public Float mediaIndex;

        @NameInMap("SocialIndex")
        public Float socialIndex;

        @NameInMap("YearMonth")
        public String yearMonth;

        public static GetTrendIndexResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrendIndexResponseBodyData self = new GetTrendIndexResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrendIndexResponseBodyData setBrandIndex(Float brandIndex) {
            this.brandIndex = brandIndex;
            return this;
        }
        public Float getBrandIndex() {
            return this.brandIndex;
        }

        public GetTrendIndexResponseBodyData setECommerceIndex(Float ECommerceIndex) {
            this.ECommerceIndex = ECommerceIndex;
            return this;
        }
        public Float getECommerceIndex() {
            return this.ECommerceIndex;
        }

        public GetTrendIndexResponseBodyData setInstitutionalIndex(Float institutionalIndex) {
            this.institutionalIndex = institutionalIndex;
            return this;
        }
        public Float getInstitutionalIndex() {
            return this.institutionalIndex;
        }

        public GetTrendIndexResponseBodyData setMediaIndex(Float mediaIndex) {
            this.mediaIndex = mediaIndex;
            return this;
        }
        public Float getMediaIndex() {
            return this.mediaIndex;
        }

        public GetTrendIndexResponseBodyData setSocialIndex(Float socialIndex) {
            this.socialIndex = socialIndex;
            return this;
        }
        public Float getSocialIndex() {
            return this.socialIndex;
        }

        public GetTrendIndexResponseBodyData setYearMonth(String yearMonth) {
            this.yearMonth = yearMonth;
            return this;
        }
        public String getYearMonth() {
            return this.yearMonth;
        }

    }

}
