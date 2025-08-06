// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddFreeLicenseResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("LicenseList")
    public java.util.List<AddFreeLicenseResponseBodyLicenseList> licenseList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddFreeLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFreeLicenseResponseBody self = new AddFreeLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFreeLicenseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddFreeLicenseResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddFreeLicenseResponseBody setLicenseList(java.util.List<AddFreeLicenseResponseBodyLicenseList> licenseList) {
        this.licenseList = licenseList;
        return this;
    }
    public java.util.List<AddFreeLicenseResponseBodyLicenseList> getLicenseList() {
        return this.licenseList;
    }

    public AddFreeLicenseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddFreeLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFreeLicenseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddFreeLicenseResponseBodyLicenseList extends TeaModel {
        @NameInMap("AppItemId")
        public String appItemId;

        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("LicenseId")
        public Long licenseId;

        @NameInMap("LicenseItemId")
        public String licenseItemId;

        @NameInMap("SdkType")
        public String sdkType;

        public static AddFreeLicenseResponseBodyLicenseList build(java.util.Map<String, ?> map) throws Exception {
            AddFreeLicenseResponseBodyLicenseList self = new AddFreeLicenseResponseBodyLicenseList();
            return TeaModel.build(map, self);
        }

        public AddFreeLicenseResponseBodyLicenseList setAppItemId(String appItemId) {
            this.appItemId = appItemId;
            return this;
        }
        public String getAppItemId() {
            return this.appItemId;
        }

        public AddFreeLicenseResponseBodyLicenseList setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public AddFreeLicenseResponseBodyLicenseList setLicenseId(Long licenseId) {
            this.licenseId = licenseId;
            return this;
        }
        public Long getLicenseId() {
            return this.licenseId;
        }

        public AddFreeLicenseResponseBodyLicenseList setLicenseItemId(String licenseItemId) {
            this.licenseItemId = licenseItemId;
            return this;
        }
        public String getLicenseItemId() {
            return this.licenseItemId;
        }

        public AddFreeLicenseResponseBodyLicenseList setSdkType(String sdkType) {
            this.sdkType = sdkType;
            return this;
        }
        public String getSdkType() {
            return this.sdkType;
        }

    }

}
