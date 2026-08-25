// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListVersionDistributionResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 is returned if the call is successful. An error code is returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>PARAMETER_MISSING</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of version distribution information.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListVersionDistributionResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message. This parameter is empty if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>parameter missing</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C5DCE54A-B266-522E-A6ED-468AF45F5AAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListVersionDistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVersionDistributionResponseBody self = new ListVersionDistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVersionDistributionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVersionDistributionResponseBody setData(java.util.List<ListVersionDistributionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVersionDistributionResponseBodyData> getData() {
        return this.data;
    }

    public ListVersionDistributionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVersionDistributionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVersionDistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVersionDistributionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListVersionDistributionResponseBodyData extends TeaModel {
        /**
         * <p>The number of terminals corresponding to this version.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("DeviceCount")
        public Long deviceCount;

        /**
         * <p>The version percentage. Valid values: 0 to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("Percentage")
        public Double percentage;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>2.3.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListVersionDistributionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVersionDistributionResponseBodyData self = new ListVersionDistributionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVersionDistributionResponseBodyData setDeviceCount(Long deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Long getDeviceCount() {
            return this.deviceCount;
        }

        public ListVersionDistributionResponseBodyData setPercentage(Double percentage) {
            this.percentage = percentage;
            return this;
        }
        public Double getPercentage() {
            return this.percentage;
        }

        public ListVersionDistributionResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
