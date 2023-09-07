// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHoneypotStatisticsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("TotalHoneypotCount")
        public Integer totalHoneypotCount;

        @NameInMap("TotalNodeStatus")
        public Integer totalNodeStatus;

        @NameInMap("TotalProbeCount")
        public Integer totalProbeCount;

        @NameInMap("UsedHoneypotCount")
        public Integer usedHoneypotCount;

        @NameInMap("UsedHostProbeCount")
        public Integer usedHostProbeCount;

        @NameInMap("UsedProbeCount")
        public Integer usedProbeCount;

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
