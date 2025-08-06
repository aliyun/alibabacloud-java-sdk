// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddLicenseResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<AddLicenseResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLicenseResponseBody self = new AddLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLicenseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddLicenseResponseBody setData(java.util.List<AddLicenseResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AddLicenseResponseBodyData> getData() {
        return this.data;
    }

    public AddLicenseResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddLicenseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLicenseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddLicenseResponseBodyData extends TeaModel {
        @NameInMap("AppItemId")
        public String appItemId;

        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("LicenseId")
        public Long licenseId;

        @NameInMap("SdkType")
        public String sdkType;

        public static AddLicenseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddLicenseResponseBodyData self = new AddLicenseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddLicenseResponseBodyData setAppItemId(String appItemId) {
            this.appItemId = appItemId;
            return this;
        }
        public String getAppItemId() {
            return this.appItemId;
        }

        public AddLicenseResponseBodyData setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public AddLicenseResponseBodyData setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public AddLicenseResponseBodyData setLicenseId(Long licenseId) {
            this.licenseId = licenseId;
            return this;
        }
        public Long getLicenseId() {
            return this.licenseId;
        }

        public AddLicenseResponseBodyData setSdkType(String sdkType) {
            this.sdkType = sdkType;
            return this;
        }
        public String getSdkType() {
            return this.sdkType;
        }

    }

}
