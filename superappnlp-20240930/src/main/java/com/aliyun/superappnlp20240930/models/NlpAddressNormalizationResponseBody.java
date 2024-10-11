// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.superappnlp20240930.models;

import com.aliyun.tea.*;

public class NlpAddressNormalizationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public NlpAddressNormalizationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>99540D1A-9112-56E5-8DCC-1A2603F4C500</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1701051540592</p>
     */
    @NameInMap("Timestamp")
    public String timestamp;

    public static NlpAddressNormalizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NlpAddressNormalizationResponseBody self = new NlpAddressNormalizationResponseBody();
        return TeaModel.build(map, self);
    }

    public NlpAddressNormalizationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public NlpAddressNormalizationResponseBody setData(NlpAddressNormalizationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public NlpAddressNormalizationResponseBodyData getData() {
        return this.data;
    }

    public NlpAddressNormalizationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public NlpAddressNormalizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NlpAddressNormalizationResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public NlpAddressNormalizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public NlpAddressNormalizationResponseBody setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public static class NlpAddressNormalizationResponseBodyData extends TeaModel {
        @NameInMap("CityStd")
        public String cityStd;

        @NameInMap("DistrictStd")
        public String districtStd;

        @NameInMap("ProvinceStd")
        public String provinceStd;

        @NameInMap("Results")
        public java.util.List<String> results;

        @NameInMap("StatusEs")
        public String statusEs;

        public static NlpAddressNormalizationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            NlpAddressNormalizationResponseBodyData self = new NlpAddressNormalizationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public NlpAddressNormalizationResponseBodyData setCityStd(String cityStd) {
            this.cityStd = cityStd;
            return this;
        }
        public String getCityStd() {
            return this.cityStd;
        }

        public NlpAddressNormalizationResponseBodyData setDistrictStd(String districtStd) {
            this.districtStd = districtStd;
            return this;
        }
        public String getDistrictStd() {
            return this.districtStd;
        }

        public NlpAddressNormalizationResponseBodyData setProvinceStd(String provinceStd) {
            this.provinceStd = provinceStd;
            return this;
        }
        public String getProvinceStd() {
            return this.provinceStd;
        }

        public NlpAddressNormalizationResponseBodyData setResults(java.util.List<String> results) {
            this.results = results;
            return this;
        }
        public java.util.List<String> getResults() {
            return this.results;
        }

        public NlpAddressNormalizationResponseBodyData setStatusEs(String statusEs) {
            this.statusEs = statusEs;
            return this;
        }
        public String getStatusEs() {
            return this.statusEs;
        }

    }

}
