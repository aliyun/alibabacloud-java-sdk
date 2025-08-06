// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetOSSFlowStatisResponseBody extends TeaModel {
    @NameInMap("OSSFlowStatisList")
    public java.util.List<GetOSSFlowStatisResponseBodyOSSFlowStatisList> OSSFlowStatisList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetOSSFlowStatisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOSSFlowStatisResponseBody self = new GetOSSFlowStatisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOSSFlowStatisResponseBody setOSSFlowStatisList(java.util.List<GetOSSFlowStatisResponseBodyOSSFlowStatisList> OSSFlowStatisList) {
        this.OSSFlowStatisList = OSSFlowStatisList;
        return this;
    }
    public java.util.List<GetOSSFlowStatisResponseBodyOSSFlowStatisList> getOSSFlowStatisList() {
        return this.OSSFlowStatisList;
    }

    public GetOSSFlowStatisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOSSFlowStatisResponseBodyOSSFlowStatisList extends TeaModel {
        @NameInMap("NetworkOut")
        public Long networkOut;

        @NameInMap("StatTime")
        public String statTime;

        @NameInMap("StatTimeUTC")
        public String statTimeUTC;

        public static GetOSSFlowStatisResponseBodyOSSFlowStatisList build(java.util.Map<String, ?> map) throws Exception {
            GetOSSFlowStatisResponseBodyOSSFlowStatisList self = new GetOSSFlowStatisResponseBodyOSSFlowStatisList();
            return TeaModel.build(map, self);
        }

        public GetOSSFlowStatisResponseBodyOSSFlowStatisList setNetworkOut(Long networkOut) {
            this.networkOut = networkOut;
            return this;
        }
        public Long getNetworkOut() {
            return this.networkOut;
        }

        public GetOSSFlowStatisResponseBodyOSSFlowStatisList setStatTime(String statTime) {
            this.statTime = statTime;
            return this;
        }
        public String getStatTime() {
            return this.statTime;
        }

        public GetOSSFlowStatisResponseBodyOSSFlowStatisList setStatTimeUTC(String statTimeUTC) {
            this.statTimeUTC = statTimeUTC;
            return this;
        }
        public String getStatTimeUTC() {
            return this.statTimeUTC;
        }

    }

}
