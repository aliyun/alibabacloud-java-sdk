// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListSmartAGByAccessPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmartAccessGateways")
    public java.util.List<ListSmartAGByAccessPointResponseBodySmartAccessGateways> smartAccessGateways;

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
        @NameInMap("AssociatedCcnId")
        public String associatedCcnId;

        @NameInMap("HardwareVersion")
        public String hardwareVersion;

        @NameInMap("RoutingStrategy")
        public String routingStrategy;

        @NameInMap("SmartAGDescription")
        public String smartAGDescription;

        @NameInMap("SmartAGId")
        public String smartAGId;

        @NameInMap("SmartAGName")
        public String smartAGName;

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
