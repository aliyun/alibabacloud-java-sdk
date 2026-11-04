// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeEdgeCloudRegionResponseBody extends TeaModel {
    /**
     * <p>The list of available edge cloud regions. When a whitelist is configured, only the regions available to the current account are returned.</p>
     */
    @NameInMap("EdgeCloudRegions")
    public java.util.List<DescribeEdgeCloudRegionResponseBodyEdgeCloudRegions> edgeCloudRegions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEdgeCloudRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeCloudRegionResponseBody self = new DescribeEdgeCloudRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeCloudRegionResponseBody setEdgeCloudRegions(java.util.List<DescribeEdgeCloudRegionResponseBodyEdgeCloudRegions> edgeCloudRegions) {
        this.edgeCloudRegions = edgeCloudRegions;
        return this;
    }
    public java.util.List<DescribeEdgeCloudRegionResponseBodyEdgeCloudRegions> getEdgeCloudRegions() {
        return this.edgeCloudRegions;
    }

    public DescribeEdgeCloudRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEdgeCloudRegionResponseBodyEdgeCloudRegionsStandbyEdgeCloudRegionList extends TeaModel {
        /**
         * <p>The ID of the standby edge cloud region.</p>
         * 
         * <strong>example:</strong>
         * <p>standbyEdgeCloudRegionId</p>
         */
        @NameInMap("StandbyEdgeCloudRegionId")
        public String standbyEdgeCloudRegionId;

        /**
         * <p>The name of the standby edge cloud region.</p>
         * 
         * <strong>example:</strong>
         * <p>standbyEdgeCloudRegionName</p>
         */
        @NameInMap("StandbyEdgeCloudRegionName")
        public String standbyEdgeCloudRegionName;

        public static DescribeEdgeCloudRegionResponseBodyEdgeCloudRegionsStandbyEdgeCloudRegionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEdgeCloudRegionResponseBodyEdgeCloudRegionsStandbyEdgeCloudRegionList self = new DescribeEdgeCloudRegionResponseBodyEdgeCloudRegionsStandbyEdgeCloudRegionList();
            return TeaModel.build(map, self);
        }

        public DescribeEdgeCloudRegionResponseBodyEdgeCloudRegionsStandbyEdgeCloudRegionList setStandbyEdgeCloudRegionId(String standbyEdgeCloudRegionId) {
            this.standbyEdgeCloudRegionId = standbyEdgeCloudRegionId;
            return this;
        }
        public String getStandbyEdgeCloudRegionId() {
            return this.standbyEdgeCloudRegionId;
        }

        public DescribeEdgeCloudRegionResponseBodyEdgeCloudRegionsStandbyEdgeCloudRegionList setStandbyEdgeCloudRegionName(String standbyEdgeCloudRegionName) {
            this.standbyEdgeCloudRegionName = standbyEdgeCloudRegionName;
            return this;
        }
        public String getStandbyEdgeCloudRegionName() {
            return this.standbyEdgeCloudRegionName;
        }

    }

    public static class DescribeEdgeCloudRegionResponseBodyEdgeCloudRegions extends TeaModel {
        /**
         * <p>The ID of the central control region corresponding to the edge cloud region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("CentralControlRegionId")
        public String centralControlRegionId;

        /**
         * <p>The ID of the edge cloud region.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-singapore</p>
         */
        @NameInMap("EdgeCloudRegionId")
        public String edgeCloudRegionId;

        /**
         * <p>The name of the edge cloud region.</p>
         * 
         * <strong>example:</strong>
         * <p>edgeCloudRegionName</p>
         */
        @NameInMap("EdgeCloudRegionName")
        public String edgeCloudRegionName;

        /**
         * <p>The list of standby edge cloud regions.</p>
         */
        @NameInMap("StandbyEdgeCloudRegionList")
        public java.util.List<DescribeEdgeCloudRegionResponseBodyEdgeCloudRegionsStandbyEdgeCloudRegionList> standbyEdgeCloudRegionList;

        public static DescribeEdgeCloudRegionResponseBodyEdgeCloudRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEdgeCloudRegionResponseBodyEdgeCloudRegions self = new DescribeEdgeCloudRegionResponseBodyEdgeCloudRegions();
            return TeaModel.build(map, self);
        }

        public DescribeEdgeCloudRegionResponseBodyEdgeCloudRegions setCentralControlRegionId(String centralControlRegionId) {
            this.centralControlRegionId = centralControlRegionId;
            return this;
        }
        public String getCentralControlRegionId() {
            return this.centralControlRegionId;
        }

        public DescribeEdgeCloudRegionResponseBodyEdgeCloudRegions setEdgeCloudRegionId(String edgeCloudRegionId) {
            this.edgeCloudRegionId = edgeCloudRegionId;
            return this;
        }
        public String getEdgeCloudRegionId() {
            return this.edgeCloudRegionId;
        }

        public DescribeEdgeCloudRegionResponseBodyEdgeCloudRegions setEdgeCloudRegionName(String edgeCloudRegionName) {
            this.edgeCloudRegionName = edgeCloudRegionName;
            return this;
        }
        public String getEdgeCloudRegionName() {
            return this.edgeCloudRegionName;
        }

        public DescribeEdgeCloudRegionResponseBodyEdgeCloudRegions setStandbyEdgeCloudRegionList(java.util.List<DescribeEdgeCloudRegionResponseBodyEdgeCloudRegionsStandbyEdgeCloudRegionList> standbyEdgeCloudRegionList) {
            this.standbyEdgeCloudRegionList = standbyEdgeCloudRegionList;
            return this;
        }
        public java.util.List<DescribeEdgeCloudRegionResponseBodyEdgeCloudRegionsStandbyEdgeCloudRegionList> getStandbyEdgeCloudRegionList() {
            return this.standbyEdgeCloudRegionList;
        }

    }

}
