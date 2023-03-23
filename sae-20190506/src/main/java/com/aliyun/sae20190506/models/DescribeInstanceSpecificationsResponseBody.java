// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecificationsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Information of instance types.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeInstanceSpecificationsResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   If the request is successful, this parameter is not returned.****</p>
     * <p>*   This parameter is returned only if the request failed.**** For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message. Valid values:</p>
     * <br>
     * <p>*   **success** is returned when the request succeeds.</p>
     * <p>*   An error code is returned when the request fails.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether information of the instance types is successfully obtained. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It is used to query the details of a request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeInstanceSpecificationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecificationsResponseBody self = new DescribeInstanceSpecificationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecificationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInstanceSpecificationsResponseBody setData(java.util.List<DescribeInstanceSpecificationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeInstanceSpecificationsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeInstanceSpecificationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeInstanceSpecificationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceSpecificationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSpecificationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstanceSpecificationsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeInstanceSpecificationsResponseBodyData extends TeaModel {
        /**
         * <p>The CPU specification of the instance type. Unit: millicore.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>Indicates whether the instance type is available. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The ID of the instance type.</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The memory size of the instance type. Unit: MB.</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The name of the instance type.</p>
         */
        @NameInMap("SpecInfo")
        public String specInfo;

        /**
         * <p>The version number of the instance type.</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static DescribeInstanceSpecificationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecificationsResponseBodyData self = new DescribeInstanceSpecificationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSpecificationsResponseBodyData setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeInstanceSpecificationsResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeInstanceSpecificationsResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeInstanceSpecificationsResponseBodyData setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeInstanceSpecificationsResponseBodyData setSpecInfo(String specInfo) {
            this.specInfo = specInfo;
            return this;
        }
        public String getSpecInfo() {
            return this.specInfo;
        }

        public DescribeInstanceSpecificationsResponseBodyData setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
