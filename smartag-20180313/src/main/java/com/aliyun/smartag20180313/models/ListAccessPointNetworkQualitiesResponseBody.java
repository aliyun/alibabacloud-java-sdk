// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListAccessPointNetworkQualitiesResponseBody extends TeaModel {
    @NameInMap("AccessPointNetworkQualities")
    public java.util.List<ListAccessPointNetworkQualitiesResponseBodyAccessPointNetworkQualities> accessPointNetworkQualities;

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
        @NameInMap("Id")
        public Integer id;

        @NameInMap("Loss")
        public String loss;

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
