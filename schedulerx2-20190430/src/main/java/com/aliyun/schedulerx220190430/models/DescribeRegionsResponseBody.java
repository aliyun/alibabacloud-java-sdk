// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error message that was returned only if the corresponding error occurred.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The available regions.</p>
     */
    @NameInMap("Regions")
    public java.util.List<DescribeRegionsResponseBodyRegions> regions;

    /**
     * <p>The ID of the request.</p>
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

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeRegionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRegionsResponseBody setRegions(java.util.List<DescribeRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<DescribeRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRegionsResponseBodyRegions extends TeaModel {
        /**
         * <p>The display name of the region, which varies based on the current language.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The endpoint of the region.</p>
         */
        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegions self = new DescribeRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseBodyRegions setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
            return this;
        }
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        public DescribeRegionsResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
