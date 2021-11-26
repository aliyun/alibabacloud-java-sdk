// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetThesaurusBySynonymForApiResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetThesaurusBySynonymForApiResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetThesaurusBySynonymForApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetThesaurusBySynonymForApiResponseBody self = new GetThesaurusBySynonymForApiResponseBody();
        return TeaModel.build(map, self);
    }

    public GetThesaurusBySynonymForApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetThesaurusBySynonymForApiResponseBody setData(GetThesaurusBySynonymForApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetThesaurusBySynonymForApiResponseBodyData getData() {
        return this.data;
    }

    public GetThesaurusBySynonymForApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetThesaurusBySynonymForApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThesaurusBySynonymForApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetThesaurusBySynonymForApiResponseBodyDataThesaurusPoSynonymList extends TeaModel {
        @NameInMap("SynonymList")
        public java.util.List<String> synonymList;

        public static GetThesaurusBySynonymForApiResponseBodyDataThesaurusPoSynonymList build(java.util.Map<String, ?> map) throws Exception {
            GetThesaurusBySynonymForApiResponseBodyDataThesaurusPoSynonymList self = new GetThesaurusBySynonymForApiResponseBodyDataThesaurusPoSynonymList();
            return TeaModel.build(map, self);
        }

        public GetThesaurusBySynonymForApiResponseBodyDataThesaurusPoSynonymList setSynonymList(java.util.List<String> synonymList) {
            this.synonymList = synonymList;
            return this;
        }
        public java.util.List<String> getSynonymList() {
            return this.synonymList;
        }

    }

    public static class GetThesaurusBySynonymForApiResponseBodyDataThesaurusPo extends TeaModel {
        @NameInMap("Business")
        public String business;

        @NameInMap("Id")
        public Long id;

        @NameInMap("SynonymList")
        public GetThesaurusBySynonymForApiResponseBodyDataThesaurusPoSynonymList synonymList;

        public static GetThesaurusBySynonymForApiResponseBodyDataThesaurusPo build(java.util.Map<String, ?> map) throws Exception {
            GetThesaurusBySynonymForApiResponseBodyDataThesaurusPo self = new GetThesaurusBySynonymForApiResponseBodyDataThesaurusPo();
            return TeaModel.build(map, self);
        }

        public GetThesaurusBySynonymForApiResponseBodyDataThesaurusPo setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public GetThesaurusBySynonymForApiResponseBodyDataThesaurusPo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetThesaurusBySynonymForApiResponseBodyDataThesaurusPo setSynonymList(GetThesaurusBySynonymForApiResponseBodyDataThesaurusPoSynonymList synonymList) {
            this.synonymList = synonymList;
            return this;
        }
        public GetThesaurusBySynonymForApiResponseBodyDataThesaurusPoSynonymList getSynonymList() {
            return this.synonymList;
        }

    }

    public static class GetThesaurusBySynonymForApiResponseBodyData extends TeaModel {
        @NameInMap("ThesaurusPo")
        public java.util.List<GetThesaurusBySynonymForApiResponseBodyDataThesaurusPo> thesaurusPo;

        public static GetThesaurusBySynonymForApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetThesaurusBySynonymForApiResponseBodyData self = new GetThesaurusBySynonymForApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetThesaurusBySynonymForApiResponseBodyData setThesaurusPo(java.util.List<GetThesaurusBySynonymForApiResponseBodyDataThesaurusPo> thesaurusPo) {
            this.thesaurusPo = thesaurusPo;
            return this;
        }
        public java.util.List<GetThesaurusBySynonymForApiResponseBodyDataThesaurusPo> getThesaurusPo() {
            return this.thesaurusPo;
        }

    }

}
