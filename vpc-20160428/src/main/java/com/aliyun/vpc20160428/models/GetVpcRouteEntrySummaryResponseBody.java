// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpcRouteEntrySummaryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DC668356-BCB4-42FD-9BC3-FA2B2E04B634</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the routes in the route tables.</p>
     */
    @NameInMap("RouteEntrySummarys")
    public java.util.List<GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarys> routeEntrySummarys;

    public static GetVpcRouteEntrySummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpcRouteEntrySummaryResponseBody self = new GetVpcRouteEntrySummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpcRouteEntrySummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVpcRouteEntrySummaryResponseBody setRouteEntrySummarys(java.util.List<GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarys> routeEntrySummarys) {
        this.routeEntrySummarys = routeEntrySummarys;
        return this;
    }
    public java.util.List<GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarys> getRouteEntrySummarys() {
        return this.routeEntrySummarys;
    }

    public static class GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarysEntrySummarys extends TeaModel {
        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The type of the route. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: all route types</li>
         * <li><strong>Custom</strong>: a custom route</li>
         * <li><strong>System</strong>: a system route</li>
         * <li><strong>BGP</strong>: a BGP route</li>
         * <li><strong>CEN</strong>: a CEN route</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("RouteEntryType")
        public String routeEntryType;

        public static GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarysEntrySummarys build(java.util.Map<String, ?> map) throws Exception {
            GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarysEntrySummarys self = new GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarysEntrySummarys();
            return TeaModel.build(map, self);
        }

        public GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarysEntrySummarys setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarysEntrySummarys setRouteEntryType(String routeEntryType) {
            this.routeEntryType = routeEntryType;
            return this;
        }
        public String getRouteEntryType() {
            return this.routeEntryType;
        }

    }

    public static class GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarys extends TeaModel {
        /**
         * <p>The information about the routes of different types in one route table.</p>
         */
        @NameInMap("EntrySummarys")
        public java.util.List<GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarysEntrySummarys> entrySummarys;

        /**
         * <p>The ID of the route table.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp145q7glnuzdvzu2****</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarys build(java.util.Map<String, ?> map) throws Exception {
            GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarys self = new GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarys();
            return TeaModel.build(map, self);
        }

        public GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarys setEntrySummarys(java.util.List<GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarysEntrySummarys> entrySummarys) {
            this.entrySummarys = entrySummarys;
            return this;
        }
        public java.util.List<GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarysEntrySummarys> getEntrySummarys() {
            return this.entrySummarys;
        }

        public GetVpcRouteEntrySummaryResponseBodyRouteEntrySummarys setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

}
