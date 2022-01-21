// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagLanListResponseBody extends TeaModel {
    @NameInMap("Lans")
    public java.util.List<DescribeSagLanListResponseBodyLans> lans;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskStates")
    public java.util.List<DescribeSagLanListResponseBodyTaskStates> taskStates;

    public static DescribeSagLanListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagLanListResponseBody self = new DescribeSagLanListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagLanListResponseBody setLans(java.util.List<DescribeSagLanListResponseBodyLans> lans) {
        this.lans = lans;
        return this;
    }
    public java.util.List<DescribeSagLanListResponseBodyLans> getLans() {
        return this.lans;
    }

    public DescribeSagLanListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagLanListResponseBody setTaskStates(java.util.List<DescribeSagLanListResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagLanListResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagLanListResponseBodyLans extends TeaModel {
        @NameInMap("EndIp")
        public String endIp;

        @NameInMap("IP")
        public String IP;

        @NameInMap("IPType")
        public String IPType;

        @NameInMap("Lease")
        public String lease;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("PortName")
        public String portName;

        @NameInMap("StartIp")
        public String startIp;

        public static DescribeSagLanListResponseBodyLans build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagLanListResponseBodyLans self = new DescribeSagLanListResponseBodyLans();
            return TeaModel.build(map, self);
        }

        public DescribeSagLanListResponseBodyLans setEndIp(String endIp) {
            this.endIp = endIp;
            return this;
        }
        public String getEndIp() {
            return this.endIp;
        }

        public DescribeSagLanListResponseBodyLans setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeSagLanListResponseBodyLans setIPType(String IPType) {
            this.IPType = IPType;
            return this;
        }
        public String getIPType() {
            return this.IPType;
        }

        public DescribeSagLanListResponseBodyLans setLease(String lease) {
            this.lease = lease;
            return this;
        }
        public String getLease() {
            return this.lease;
        }

        public DescribeSagLanListResponseBodyLans setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DescribeSagLanListResponseBodyLans setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public DescribeSagLanListResponseBodyLans setStartIp(String startIp) {
            this.startIp = startIp;
            return this;
        }
        public String getStartIp() {
            return this.startIp;
        }

    }

    public static class DescribeSagLanListResponseBodyTaskStates extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        public static DescribeSagLanListResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagLanListResponseBodyTaskStates self = new DescribeSagLanListResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagLanListResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagLanListResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagLanListResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagLanListResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
