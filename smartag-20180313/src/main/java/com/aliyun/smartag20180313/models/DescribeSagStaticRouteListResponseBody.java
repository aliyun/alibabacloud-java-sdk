// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagStaticRouteListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of static routes.</p>
     */
    @NameInMap("StaticRoutes")
    public java.util.List<DescribeSagStaticRouteListResponseBodyStaticRoutes> staticRoutes;

    /**
     * <p>The status of the query tasks.</p>
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
         * <p>The port name.</p>
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
         * <p>The error code. A value of 200 indicates that the query task is successful.</p>
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
         * <p>The status of the asynchronous task. Valid values:</p>
         * <ul>
         * <li><strong>Initialized</strong>: The query task is initialized.</li>
         * <li><strong>Offline</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will be delivered after the device goes online.</li>
         * <li><strong>Succeed</strong>: The query task is delivered successfully.</li>
         * <li><strong>Processing</strong>: The query task is being delivered.</li>
         * <li><strong>VersionNotSupport</strong>: The current version of the Smart Access Gateway device does not support this feature.</li>
         * <li><strong>BuildRequestError</strong>: The management and control system does not support the request.</li>
         * <li><strong>HardwareError</strong>: The query task failed to be delivered due to a device error.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will not be delivered even after the device goes online.</li>
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
