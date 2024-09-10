// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotStatisticsResponseBody extends TeaModel {
    /**
     * <p>The status code that is returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The honeypot usage statistics.</p>
     */
    @NameInMap("Data")
    public GetHoneypotStatisticsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
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
     * <p>EB7181CB-32F3-5189-A935-4E24DD1A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetHoneypotStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotStatisticsResponseBody self = new GetHoneypotStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHoneypotStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHoneypotStatisticsResponseBody setData(GetHoneypotStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHoneypotStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetHoneypotStatisticsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHoneypotStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHoneypotStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHoneypotStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHoneypotStatisticsResponseBodyData extends TeaModel {
        /**
         * <p>The total number of honeypots.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalHoneypotCount")
        public Integer totalHoneypotCount;

        /**
         * <p>The health status of the management node. Valid values:</p>
         * <ul>
         * <li>1: normal</li>
         * <li>2: abnormal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNodeStatus")
        public Integer totalNodeStatus;

        /**
         * <p>The total number of authorized probes.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("TotalProbeCount")
        public Integer totalProbeCount;

        /**
         * <p>The number of deployed honeypots.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("UsedHoneypotCount")
        public Integer usedHoneypotCount;

        /**
         * <p>The number of deployed host probes.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("UsedHostProbeCount")
        public Integer usedHostProbeCount;

        /**
         * <p>The number of deployed probes.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("UsedProbeCount")
        public Integer usedProbeCount;

        /**
         * <p>The number of deployed VPC probes.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("UsedVpcProbeCount")
        public Integer usedVpcProbeCount;

        public static GetHoneypotStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHoneypotStatisticsResponseBodyData self = new GetHoneypotStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHoneypotStatisticsResponseBodyData setTotalHoneypotCount(Integer totalHoneypotCount) {
            this.totalHoneypotCount = totalHoneypotCount;
            return this;
        }
        public Integer getTotalHoneypotCount() {
            return this.totalHoneypotCount;
        }

        public GetHoneypotStatisticsResponseBodyData setTotalNodeStatus(Integer totalNodeStatus) {
            this.totalNodeStatus = totalNodeStatus;
            return this;
        }
        public Integer getTotalNodeStatus() {
            return this.totalNodeStatus;
        }

        public GetHoneypotStatisticsResponseBodyData setTotalProbeCount(Integer totalProbeCount) {
            this.totalProbeCount = totalProbeCount;
            return this;
        }
        public Integer getTotalProbeCount() {
            return this.totalProbeCount;
        }

        public GetHoneypotStatisticsResponseBodyData setUsedHoneypotCount(Integer usedHoneypotCount) {
            this.usedHoneypotCount = usedHoneypotCount;
            return this;
        }
        public Integer getUsedHoneypotCount() {
            return this.usedHoneypotCount;
        }

        public GetHoneypotStatisticsResponseBodyData setUsedHostProbeCount(Integer usedHostProbeCount) {
            this.usedHostProbeCount = usedHostProbeCount;
            return this;
        }
        public Integer getUsedHostProbeCount() {
            return this.usedHostProbeCount;
        }

        public GetHoneypotStatisticsResponseBodyData setUsedProbeCount(Integer usedProbeCount) {
            this.usedProbeCount = usedProbeCount;
            return this;
        }
        public Integer getUsedProbeCount() {
            return this.usedProbeCount;
        }

        public GetHoneypotStatisticsResponseBodyData setUsedVpcProbeCount(Integer usedVpcProbeCount) {
            this.usedVpcProbeCount = usedVpcProbeCount;
            return this;
        }
        public Integer getUsedVpcProbeCount() {
            return this.usedVpcProbeCount;
        }

    }

}
