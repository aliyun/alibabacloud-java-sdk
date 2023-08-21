// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetUserConfigResponseBody extends TeaModel {
    @NameInMap("AccountSufficient")
    public Boolean accountSufficient;

    @NameInMap("Code")
    public String code;

    @NameInMap("EnableEciDisk")
    public Boolean enableEciDisk;

    @NameInMap("FreeTier")
    public GetUserConfigResponseBodyFreeTier freeTier;

    @NameInMap("FreeTierSpecAvailable")
    public Boolean freeTierSpecAvailable;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserConfigResponseBody self = new GetUserConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserConfigResponseBody setAccountSufficient(Boolean accountSufficient) {
        this.accountSufficient = accountSufficient;
        return this;
    }
    public Boolean getAccountSufficient() {
        return this.accountSufficient;
    }

    public GetUserConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserConfigResponseBody setEnableEciDisk(Boolean enableEciDisk) {
        this.enableEciDisk = enableEciDisk;
        return this;
    }
    public Boolean getEnableEciDisk() {
        return this.enableEciDisk;
    }

    public GetUserConfigResponseBody setFreeTier(GetUserConfigResponseBodyFreeTier freeTier) {
        this.freeTier = freeTier;
        return this;
    }
    public GetUserConfigResponseBodyFreeTier getFreeTier() {
        return this.freeTier;
    }

    public GetUserConfigResponseBody setFreeTierSpecAvailable(Boolean freeTierSpecAvailable) {
        this.freeTierSpecAvailable = freeTierSpecAvailable;
        return this;
    }
    public Boolean getFreeTierSpecAvailable() {
        return this.freeTierSpecAvailable;
    }

    public GetUserConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserConfigResponseBodyFreeTier extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InitBaseUnit")
        public String initBaseUnit;

        @NameInMap("InitBaseValue")
        public Double initBaseValue;

        @NameInMap("InitShowUnit")
        public String initShowUnit;

        @NameInMap("InitShowValue")
        public String initShowValue;

        @NameInMap("IsFreeTierUser")
        public Boolean isFreeTierUser;

        @NameInMap("PeriodBaseUnit")
        public String periodBaseUnit;

        @NameInMap("PeriodBaseValue")
        public Double periodBaseValue;

        @NameInMap("PeriodShowUnit")
        public String periodShowUnit;

        @NameInMap("PeriodShowValue")
        public String periodShowValue;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        public static GetUserConfigResponseBodyFreeTier build(java.util.Map<String, ?> map) throws Exception {
            GetUserConfigResponseBodyFreeTier self = new GetUserConfigResponseBodyFreeTier();
            return TeaModel.build(map, self);
        }

        public GetUserConfigResponseBodyFreeTier setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetUserConfigResponseBodyFreeTier setInitBaseUnit(String initBaseUnit) {
            this.initBaseUnit = initBaseUnit;
            return this;
        }
        public String getInitBaseUnit() {
            return this.initBaseUnit;
        }

        public GetUserConfigResponseBodyFreeTier setInitBaseValue(Double initBaseValue) {
            this.initBaseValue = initBaseValue;
            return this;
        }
        public Double getInitBaseValue() {
            return this.initBaseValue;
        }

        public GetUserConfigResponseBodyFreeTier setInitShowUnit(String initShowUnit) {
            this.initShowUnit = initShowUnit;
            return this;
        }
        public String getInitShowUnit() {
            return this.initShowUnit;
        }

        public GetUserConfigResponseBodyFreeTier setInitShowValue(String initShowValue) {
            this.initShowValue = initShowValue;
            return this;
        }
        public String getInitShowValue() {
            return this.initShowValue;
        }

        public GetUserConfigResponseBodyFreeTier setIsFreeTierUser(Boolean isFreeTierUser) {
            this.isFreeTierUser = isFreeTierUser;
            return this;
        }
        public Boolean getIsFreeTierUser() {
            return this.isFreeTierUser;
        }

        public GetUserConfigResponseBodyFreeTier setPeriodBaseUnit(String periodBaseUnit) {
            this.periodBaseUnit = periodBaseUnit;
            return this;
        }
        public String getPeriodBaseUnit() {
            return this.periodBaseUnit;
        }

        public GetUserConfigResponseBodyFreeTier setPeriodBaseValue(Double periodBaseValue) {
            this.periodBaseValue = periodBaseValue;
            return this;
        }
        public Double getPeriodBaseValue() {
            return this.periodBaseValue;
        }

        public GetUserConfigResponseBodyFreeTier setPeriodShowUnit(String periodShowUnit) {
            this.periodShowUnit = periodShowUnit;
            return this;
        }
        public String getPeriodShowUnit() {
            return this.periodShowUnit;
        }

        public GetUserConfigResponseBodyFreeTier setPeriodShowValue(String periodShowValue) {
            this.periodShowValue = periodShowValue;
            return this;
        }
        public String getPeriodShowValue() {
            return this.periodShowValue;
        }

        public GetUserConfigResponseBodyFreeTier setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetUserConfigResponseBodyFreeTier setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
