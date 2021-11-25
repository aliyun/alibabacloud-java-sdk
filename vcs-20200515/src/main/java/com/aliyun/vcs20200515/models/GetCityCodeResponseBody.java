// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetCityCodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetCityCodeResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCityCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCityCodeResponseBody self = new GetCityCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCityCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCityCodeResponseBody setData(java.util.List<GetCityCodeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCityCodeResponseBodyData> getData() {
        return this.data;
    }

    public GetCityCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCityCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCityCodeResponseBodyData extends TeaModel {
        @NameInMap("CityAddress")
        public String cityAddress;

        @NameInMap("CityCode")
        public String cityCode;

        public static GetCityCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCityCodeResponseBodyData self = new GetCityCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCityCodeResponseBodyData setCityAddress(String cityAddress) {
            this.cityAddress = cityAddress;
            return this;
        }
        public String getCityAddress() {
            return this.cityAddress;
        }

        public GetCityCodeResponseBodyData setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

    }

}
