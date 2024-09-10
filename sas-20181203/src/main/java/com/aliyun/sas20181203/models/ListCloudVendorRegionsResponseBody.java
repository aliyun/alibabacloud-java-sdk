// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudVendorRegionsResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C87EC6AD-4590-5546-9DF6-B8956579D***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <ul>
         * <li>Valid values if <strong>Vendor</strong> is set to Tencent:</li>
         * <li><strong>cn</strong>: China</li>
         * <li><strong>southeast_asia</strong>: Southeast Asia Pacific</li>
         * <li><strong>northeast_asia</strong>: Northeast Asia Pacific</li>
         * <li><strong>southern_asia</strong>: South Asia Pacific</li>
         * <li><strong>north_America</strong>: North America</li>
         * <li><strong>south_America</strong>: South America</li>
         * <li><strong>western_America</strong>: Western United States</li>
         * <li><strong>eastern_America</strong>: Eastern United States</li>
         * <li><strong>european</strong>: Europe</li>
         * <li>Valid values if <strong>Vendor</strong> is set to HUAWEICLOUD:</li>
         * <li><strong>cn</strong>: China</li>
         * <li><strong>africa</strong>: Africa</li>
         * <li><strong>latin_america</strong>: Latin America</li>
         * <li><strong>asia</strong>: Asia Pacific</li>
         * <li>Valid values if <strong>Vendor</strong> is set to Azure:</li>
         * <li><strong>middle_east</strong>: Middle East</li>
         * <li><strong>south_america</strong>: South America</li>
         * <li><strong>canada</strong>: Canada</li>
         * <li><strong>asia-pacific</strong>: Asia Pacific</li>
         * <li><strong>europe</strong>: Europe</li>
         * <li><strong>africa</strong>: Africa</li>
         * <li><strong>us</strong>: United States</li>
         * <li><strong>other</strong>: other regions</li>
         * <li>Valid values if <strong>Vendor</strong> is set to AWS:</li>
         * <li><strong>cn</strong>: China</li>
         * <li><strong>us</strong>: United States</li>
         * <li><strong>eu</strong>: Europe</li>
         * <li><strong>asia</strong>: Asia Pacific</li>
         * <li><strong>south_america</strong>: South America</li>
         * <li><strong>me</strong>: Middle East</li>
         * <li><strong>ca</strong>: Canada</li>
         * <li><strong>af</strong>: Africa</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>Indicates whether the region is configured as a synchronization region on another site. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The region is not configured as a synchronization region on another site.</li>
         * <li><strong>1</strong>: The region is configured as a synchronization region on another site.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Disable")
        public Integer disable;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Indicates whether the region is configured as a synchronization region on this site. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The region is not configured as a synchronization region on this site.</li>
         * <li><strong>1</strong>: The region is configured as a synchronization region on this site.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
