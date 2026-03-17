// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListAccessPointNetworkQualitiesResponseBody extends TeaModel {
    /**
     * <p>The network quality of the endpoint.</p>
     */
    @NameInMap("AccessPointNetworkQualities")
    public java.util.List<ListAccessPointNetworkQualitiesResponseBodyAccessPointNetworkQualities> accessPointNetworkQualities;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8E8E8C86-1404-122A-A1BB-84BBC2E9A4B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAccessPointNetworkQualitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessPointNetworkQualitiesResponseBody self = new ListAccessPointNetworkQualitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessPointNetworkQualitiesResponseBody setAccessPointNetworkQualities(java.util.List<ListAccessPointNetworkQualitiesResponseBodyAccessPointNetworkQualities> accessPointNetworkQualities) {
        this.accessPointNetworkQualities = accessPointNetworkQualities;
        return this;
    }
    public java.util.List<ListAccessPointNetworkQualitiesResponseBodyAccessPointNetworkQualities> getAccessPointNetworkQualities() {
        return this.accessPointNetworkQualities;
    }

    public ListAccessPointNetworkQualitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAccessPointNetworkQualitiesResponseBodyAccessPointNetworkQualities extends TeaModel {
        /**
         * <p>The ID of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>115</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The packet loss rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.00%</p>
         */
        @NameInMap("Loss")
        public String loss;

        /**
         * <p>The network latency. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>4.98</p>
         */
        @NameInMap("Rtt")
        public String rtt;

        public static ListAccessPointNetworkQualitiesResponseBodyAccessPointNetworkQualities build(java.util.Map<String, ?> map) throws Exception {
            ListAccessPointNetworkQualitiesResponseBodyAccessPointNetworkQualities self = new ListAccessPointNetworkQualitiesResponseBodyAccessPointNetworkQualities();
            return TeaModel.build(map, self);
        }

        public ListAccessPointNetworkQualitiesResponseBodyAccessPointNetworkQualities setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListAccessPointNetworkQualitiesResponseBodyAccessPointNetworkQualities setLoss(String loss) {
            this.loss = loss;
            return this;
        }
        public String getLoss() {
            return this.loss;
        }

        public ListAccessPointNetworkQualitiesResponseBodyAccessPointNetworkQualities setRtt(String rtt) {
            this.rtt = rtt;
            return this;
        }
        public String getRtt() {
            return this.rtt;
        }

    }

}
