// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendWordAndIndexResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetTrendWordAndIndexResponseBodyData> data;

    @NameInMap("Massage")
    public String massage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public String successResponse;

    public static GetTrendWordAndIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrendWordAndIndexResponseBody self = new GetTrendWordAndIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrendWordAndIndexResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTrendWordAndIndexResponseBody setData(java.util.List<GetTrendWordAndIndexResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetTrendWordAndIndexResponseBodyData> getData() {
        return this.data;
    }

    public GetTrendWordAndIndexResponseBody setMassage(String massage) {
        this.massage = massage;
        return this;
    }
    public String getMassage() {
        return this.massage;
    }

    public GetTrendWordAndIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrendWordAndIndexResponseBody setSuccessResponse(String successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public String getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetTrendWordAndIndexResponseBodyData extends TeaModel {
        @NameInMap("BrandIndex")
        public Float brandIndex;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("EcommerceIndex")
        public Float ecommerceIndex;

        @NameInMap("InstitutionalIndex")
        public Float institutionalIndex;

        @NameInMap("MediaIndex")
        public Float mediaIndex;

        @NameInMap("SocialIndex")
        public Float socialIndex;

        @NameInMap("TrendIndex")
        public Float trendIndex;

        @NameInMap("TrendWord")
        public String trendWord;

        @NameInMap("YearMonth")
        public String yearMonth;

        public static GetTrendWordAndIndexResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrendWordAndIndexResponseBodyData self = new GetTrendWordAndIndexResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrendWordAndIndexResponseBodyData setBrandIndex(Float brandIndex) {
            this.brandIndex = brandIndex;
            return this;
        }
        public Float getBrandIndex() {
            return this.brandIndex;
        }

        public GetTrendWordAndIndexResponseBodyData setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetTrendWordAndIndexResponseBodyData setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetTrendWordAndIndexResponseBodyData setEcommerceIndex(Float ecommerceIndex) {
            this.ecommerceIndex = ecommerceIndex;
            return this;
        }
        public Float getEcommerceIndex() {
            return this.ecommerceIndex;
        }

        public GetTrendWordAndIndexResponseBodyData setInstitutionalIndex(Float institutionalIndex) {
            this.institutionalIndex = institutionalIndex;
            return this;
        }
        public Float getInstitutionalIndex() {
            return this.institutionalIndex;
        }

        public GetTrendWordAndIndexResponseBodyData setMediaIndex(Float mediaIndex) {
            this.mediaIndex = mediaIndex;
            return this;
        }
        public Float getMediaIndex() {
            return this.mediaIndex;
        }

        public GetTrendWordAndIndexResponseBodyData setSocialIndex(Float socialIndex) {
            this.socialIndex = socialIndex;
            return this;
        }
        public Float getSocialIndex() {
            return this.socialIndex;
        }

        public GetTrendWordAndIndexResponseBodyData setTrendIndex(Float trendIndex) {
            this.trendIndex = trendIndex;
            return this;
        }
        public Float getTrendIndex() {
            return this.trendIndex;
        }

        public GetTrendWordAndIndexResponseBodyData setTrendWord(String trendWord) {
            this.trendWord = trendWord;
            return this;
        }
        public String getTrendWord() {
            return this.trendWord;
        }

        public GetTrendWordAndIndexResponseBodyData setYearMonth(String yearMonth) {
            this.yearMonth = yearMonth;
            return this;
        }
        public String getYearMonth() {
            return this.yearMonth;
        }

    }

}
