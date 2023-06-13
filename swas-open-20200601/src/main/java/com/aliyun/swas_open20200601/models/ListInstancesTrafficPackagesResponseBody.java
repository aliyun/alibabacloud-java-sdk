// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListInstancesTrafficPackagesResponseBody extends TeaModel {
    /**
     * <p>The details of the data transfer plans of the simple application servers.</p>
     */
    @NameInMap("InstanceTrafficPackageUsages")
    public java.util.List<ListInstancesTrafficPackagesResponseBodyInstanceTrafficPackageUsages> instanceTrafficPackageUsages;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstancesTrafficPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesTrafficPackagesResponseBody self = new ListInstancesTrafficPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesTrafficPackagesResponseBody setInstanceTrafficPackageUsages(java.util.List<ListInstancesTrafficPackagesResponseBodyInstanceTrafficPackageUsages> instanceTrafficPackageUsages) {
        this.instanceTrafficPackageUsages = instanceTrafficPackageUsages;
        return this;
    }
    public java.util.List<ListInstancesTrafficPackagesResponseBodyInstanceTrafficPackageUsages> getInstanceTrafficPackageUsages() {
        return this.instanceTrafficPackageUsages;
    }

    public ListInstancesTrafficPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstancesTrafficPackagesResponseBodyInstanceTrafficPackageUsages extends TeaModel {
        /**
         * <p>The ID of the simple application server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The data transfers that exceeds the quota of the data transfer plan in the current month. Unit: Byte.</p>
         */
        @NameInMap("TrafficOverflow")
        public Long trafficOverflow;

        /**
         * <p>The unused quota of the data transfer plan in the current month. Unit: Byte.</p>
         */
        @NameInMap("TrafficPackageRemaining")
        public Long trafficPackageRemaining;

        /**
         * <p>The quota of the data transfer plan in the current month. Unit: Byte.</p>
         * <br>
         * <p>>  TrafficPackageTotal = TrafficUsed + TrafficPackageRemaining</p>
         */
        @NameInMap("TrafficPackageTotal")
        public Long trafficPackageTotal;

        /**
         * <p>The used quota of the data transfer plan in the current month. Unit: Byte.</p>
         */
        @NameInMap("TrafficUsed")
        public Long trafficUsed;

        public static ListInstancesTrafficPackagesResponseBodyInstanceTrafficPackageUsages build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesTrafficPackagesResponseBodyInstanceTrafficPackageUsages self = new ListInstancesTrafficPackagesResponseBodyInstanceTrafficPackageUsages();
            return TeaModel.build(map, self);
        }

        public ListInstancesTrafficPackagesResponseBodyInstanceTrafficPackageUsages setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesTrafficPackagesResponseBodyInstanceTrafficPackageUsages setTrafficOverflow(Long trafficOverflow) {
            this.trafficOverflow = trafficOverflow;
            return this;
        }
        public Long getTrafficOverflow() {
            return this.trafficOverflow;
        }

        public ListInstancesTrafficPackagesResponseBodyInstanceTrafficPackageUsages setTrafficPackageRemaining(Long trafficPackageRemaining) {
            this.trafficPackageRemaining = trafficPackageRemaining;
            return this;
        }
        public Long getTrafficPackageRemaining() {
            return this.trafficPackageRemaining;
        }

        public ListInstancesTrafficPackagesResponseBodyInstanceTrafficPackageUsages setTrafficPackageTotal(Long trafficPackageTotal) {
            this.trafficPackageTotal = trafficPackageTotal;
            return this;
        }
        public Long getTrafficPackageTotal() {
            return this.trafficPackageTotal;
        }

        public ListInstancesTrafficPackagesResponseBodyInstanceTrafficPackageUsages setTrafficUsed(Long trafficUsed) {
            this.trafficUsed = trafficUsed;
            return this;
        }
        public Long getTrafficUsed() {
            return this.trafficUsed;
        }

    }

}
