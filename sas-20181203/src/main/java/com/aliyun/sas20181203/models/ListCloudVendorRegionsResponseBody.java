// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudVendorRegionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<ListCloudVendorRegionsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCloudVendorRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudVendorRegionsResponseBody self = new ListCloudVendorRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudVendorRegionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCloudVendorRegionsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListCloudVendorRegionsResponseBody setData(java.util.List<ListCloudVendorRegionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCloudVendorRegionsResponseBodyData> getData() {
        return this.data;
    }

    public ListCloudVendorRegionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCloudVendorRegionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCloudVendorRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudVendorRegionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCloudVendorRegionsResponseBodyData extends TeaModel {
        @NameInMap("Area")
        public String area;

        @NameInMap("Disable")
        public Integer disable;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Selected")
        public Integer selected;

        public static ListCloudVendorRegionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCloudVendorRegionsResponseBodyData self = new ListCloudVendorRegionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCloudVendorRegionsResponseBodyData setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public ListCloudVendorRegionsResponseBodyData setDisable(Integer disable) {
            this.disable = disable;
            return this;
        }
        public Integer getDisable() {
            return this.disable;
        }

        public ListCloudVendorRegionsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListCloudVendorRegionsResponseBodyData setSelected(Integer selected) {
            this.selected = selected;
            return this;
        }
        public Integer getSelected() {
            return this.selected;
        }

    }

}
