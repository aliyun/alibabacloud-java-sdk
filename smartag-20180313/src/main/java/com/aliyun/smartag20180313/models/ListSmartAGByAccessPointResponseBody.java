// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListSmartAGByAccessPointResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AE203140-5D0C-4B4D-88D1-D008206B3A01</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the SAG instance.</p>
     */
    @NameInMap("SmartAccessGateways")
    public java.util.List<ListSmartAGByAccessPointResponseBodySmartAccessGateways> smartAccessGateways;

    /**
     * <p>The number of SAG instances within the access point.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSmartAGByAccessPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSmartAGByAccessPointResponseBody self = new ListSmartAGByAccessPointResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSmartAGByAccessPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSmartAGByAccessPointResponseBody setSmartAccessGateways(java.util.List<ListSmartAGByAccessPointResponseBodySmartAccessGateways> smartAccessGateways) {
        this.smartAccessGateways = smartAccessGateways;
        return this;
    }
    public java.util.List<ListSmartAGByAccessPointResponseBodySmartAccessGateways> getSmartAccessGateways() {
        return this.smartAccessGateways;
    }

    public ListSmartAGByAccessPointResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSmartAGByAccessPointResponseBodySmartAccessGateways extends TeaModel {
        /**
         * <p>The ID of the Cloud Connect Network (CCN) instance with which the SAG instance is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-l42qf3vpvb****</p>
         */
        @NameInMap("AssociatedCcnId")
        public String associatedCcnId;

        /**
         * <p>The model of the SAG device with which the SAG instance is associated. Valid values:</p>
         * <ul>
         * <li><strong>sag-1000</strong>.</li>
         * <li><strong>sag-100WM</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sag-1000</p>
         */
        @NameInMap("HardwareVersion")
        public String hardwareVersion;

        /**
         * <p>The method that the SAG instance uses to synchronize Alibaba Cloud-facing routes. Valid values:</p>
         * <ul>
         * <li><strong>static</strong>: static routing.</li>
         * <li><strong>dynamic</strong>: dynamic routing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("RoutingStrategy")
        public String routingStrategy;

        /**
         * <p>The description of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SmartAGDescription")
        public String smartAGDescription;

        /**
         * <p>The ID of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-p86e06z4geaji1****</p>
         */
        @NameInMap("SmartAGId")
        public String smartAGId;

        /**
         * <p>The name of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SmartAGName")
        public String smartAGName;

        /**
         * <p>The status of the SAG instance. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong>: The SAG device is connected to Alibaba Cloud.</li>
         * <li><strong>offline</strong>: The SAG device is disconnected from Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("SmartAGStatus")
        public String smartAGStatus;

        public static ListSmartAGByAccessPointResponseBodySmartAccessGateways build(java.util.Map<String, ?> map) throws Exception {
            ListSmartAGByAccessPointResponseBodySmartAccessGateways self = new ListSmartAGByAccessPointResponseBodySmartAccessGateways();
            return TeaModel.build(map, self);
        }

        public ListSmartAGByAccessPointResponseBodySmartAccessGateways setAssociatedCcnId(String associatedCcnId) {
            this.associatedCcnId = associatedCcnId;
            return this;
        }
        public String getAssociatedCcnId() {
            return this.associatedCcnId;
        }

        public ListSmartAGByAccessPointResponseBodySmartAccessGateways setHardwareVersion(String hardwareVersion) {
            this.hardwareVersion = hardwareVersion;
            return this;
        }
        public String getHardwareVersion() {
            return this.hardwareVersion;
        }

        public ListSmartAGByAccessPointResponseBodySmartAccessGateways setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public ListSmartAGByAccessPointResponseBodySmartAccessGateways setSmartAGDescription(String smartAGDescription) {
            this.smartAGDescription = smartAGDescription;
            return this;
        }
        public String getSmartAGDescription() {
            return this.smartAGDescription;
        }

        public ListSmartAGByAccessPointResponseBodySmartAccessGateways setSmartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }
        public String getSmartAGId() {
            return this.smartAGId;
        }

        public ListSmartAGByAccessPointResponseBodySmartAccessGateways setSmartAGName(String smartAGName) {
            this.smartAGName = smartAGName;
            return this;
        }
        public String getSmartAGName() {
            return this.smartAGName;
        }

        public ListSmartAGByAccessPointResponseBodySmartAccessGateways setSmartAGStatus(String smartAGStatus) {
            this.smartAGStatus = smartAGStatus;
            return this;
        }
        public String getSmartAGStatus() {
            return this.smartAGStatus;
        }

    }

}
