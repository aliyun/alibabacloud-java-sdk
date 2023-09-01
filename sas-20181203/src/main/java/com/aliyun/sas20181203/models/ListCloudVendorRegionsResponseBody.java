// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudVendorRegionsResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The regions that the service provider supports.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListCloudVendorRegionsResponseBodyData> data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
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
        /**
         * <p>The area to which the region belongs. The valid values vary based on the value of the Vendor parameter.</p>
         * <br>
         * <p>*   Valid values if **Vendor** is set to Tencent:</p>
         * <p>*   **cn**: China</p>
         * <p>*   **southeast_asia**: Southeast Asia Pacific</p>
         * <p>*   **northeast_asia**: Northeast Asia Pacific</p>
         * <p>*   **southern_asia**: South Asia Pacific</p>
         * <p>*   **north_America**: North America</p>
         * <p>*   **south_America**: South America</p>
         * <p>*   **western_America**: Western United States</p>
         * <p>*   **eastern_America**: Eastern United States</p>
         * <p>*   **european**: Europe</p>
         * <p>*   Valid values if **Vendor** is set to HUAWEICLOUD:</p>
         * <p>*   **cn**: China</p>
         * <p>*   **africa**: Africa</p>
         * <p>*   **latin_america**: Latin America</p>
         * <p>*   **asia**: Asia Pacific</p>
         * <p>*   Valid values if **Vendor** is set to Azure:</p>
         * <p>*   **middle_east**: Middle East</p>
         * <p>*   **south_america**: South America</p>
         * <p>*   **canada**: Canada</p>
         * <p>*   **asia-pacific**: Asia Pacific</p>
         * <p>*   **europe**: Europe</p>
         * <p>*   **africa**: Africa</p>
         * <p>*   **us**: United States</p>
         * <p>*   **other**: other regions</p>
         * <p>*   Valid values if **Vendor** is set to AWS:</p>
         * <p>*   **cn**: China</p>
         * <p>*   **us**: United States</p>
         * <p>*   **eu**: Europe</p>
         * <p>*   **asia**: Asia Pacific</p>
         * <p>*   **south_america**: South America</p>
         * <p>*   **me**: Middle East</p>
         * <p>*   **ca**: Canada</p>
         * <p>*   **af**: Africa</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>Indicates whether the region is configured as a synchronization region on another site. Valid values:</p>
         * <br>
         * <p>*   **0**: The region is not configured as a synchronization region on another site.</p>
         * <p>*   **1**: The region is configured as a synchronization region on another site.</p>
         */
        @NameInMap("Disable")
        public Integer disable;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Indicates whether the region is configured as a synchronization region on this site. Valid values:</p>
         * <br>
         * <p>*   **0**: The region is configured as a synchronization region on this site.</p>
         * <p>*   **1**: The region is configured as a synchronization region on this site.</p>
         */
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
