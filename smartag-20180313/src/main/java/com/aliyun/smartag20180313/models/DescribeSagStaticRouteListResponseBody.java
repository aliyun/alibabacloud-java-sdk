// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagStaticRouteListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the static route.</p>
     */
    @NameInMap("StaticRoutes")
    public java.util.List<DescribeSagStaticRouteListResponseBodyStaticRoutes> staticRoutes;

    /**
     * <p>The state of the query task.</p>
     */
    @NameInMap("TaskStates")
    public java.util.List<DescribeSagStaticRouteListResponseBodyTaskStates> taskStates;

    public static DescribeSagStaticRouteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagStaticRouteListResponseBody self = new DescribeSagStaticRouteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagStaticRouteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagStaticRouteListResponseBody setStaticRoutes(java.util.List<DescribeSagStaticRouteListResponseBodyStaticRoutes> staticRoutes) {
        this.staticRoutes = staticRoutes;
        return this;
    }
    public java.util.List<DescribeSagStaticRouteListResponseBodyStaticRoutes> getStaticRoutes() {
        return this.staticRoutes;
    }

    public DescribeSagStaticRouteListResponseBody setTaskStates(java.util.List<DescribeSagStaticRouteListResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagStaticRouteListResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagStaticRouteListResponseBodyStaticRoutes extends TeaModel {
        /**
         * <p>The destination CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.0/24</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <p>The next hop.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <p>The name of the port.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PortName")
        public String portName;

        /**
         * <p>The VLAN ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Vlan")
        public String vlan;

        public static DescribeSagStaticRouteListResponseBodyStaticRoutes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagStaticRouteListResponseBodyStaticRoutes self = new DescribeSagStaticRouteListResponseBodyStaticRoutes();
            return TeaModel.build(map, self);
        }

        public DescribeSagStaticRouteListResponseBodyStaticRoutes setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public DescribeSagStaticRouteListResponseBodyStaticRoutes setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

        public DescribeSagStaticRouteListResponseBodyStaticRoutes setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public DescribeSagStaticRouteListResponseBodyStaticRoutes setVlan(String vlan) {
            this.vlan = vlan;
            return this;
        }
        public String getVlan() {
            return this.vlan;
        }

    }

    public static class DescribeSagStaticRouteListResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The time when the query task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1586857309000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code returned. A value of 200 indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. A value of Successful indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The state of the query task. Valid values:</p>
         * <ul>
         * <li><strong>Initialized</strong>: The query task is initialized.</li>
         * <li><strong>Offline</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. After the SAG device is connected to Alibaba Cloud, Alibaba Cloud assigns the query task to the SAG device.</li>
         * <li><strong>Succeed</strong>: Alibaba Cloud has assigned the query task to the SAG device.</li>
         * <li><strong>Processing</strong>: Alibaba Cloud is assigning the query task to the SAG device.</li>
         * <li><strong>VersionNotSupport</strong>: The query task is not supported by the current version of the SAG device.</li>
         * <li><strong>BuildRequestError</strong>: The query task is not supported by the controller of the SAG device.</li>
         * <li><strong>HardwareError</strong>: Alibaba Cloud failed to assign the query task to the SAG device because the SAG device is faulty.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. Alibaba Cloud does not assign the query task to the SAG device even after the SAG device is connected to Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeSagStaticRouteListResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagStaticRouteListResponseBodyTaskStates self = new DescribeSagStaticRouteListResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagStaticRouteListResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagStaticRouteListResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagStaticRouteListResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagStaticRouteListResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
