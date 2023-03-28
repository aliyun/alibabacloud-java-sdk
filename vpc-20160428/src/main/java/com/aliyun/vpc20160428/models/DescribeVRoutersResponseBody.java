// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVRoutersResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The details about the vRouters.</p>
     */
    @NameInMap("VRouters")
    public DescribeVRoutersResponseBodyVRouters VRouters;

    public static DescribeVRoutersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVRoutersResponseBody self = new DescribeVRoutersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVRoutersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVRoutersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVRoutersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVRoutersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVRoutersResponseBody setVRouters(DescribeVRoutersResponseBodyVRouters VRouters) {
        this.VRouters = VRouters;
        return this;
    }
    public DescribeVRoutersResponseBodyVRouters getVRouters() {
        return this.VRouters;
    }

    public static class DescribeVRoutersResponseBodyVRoutersVRouterRouteTableIds extends TeaModel {
        @NameInMap("RouteTableId")
        public java.util.List<String> routeTableId;

        public static DescribeVRoutersResponseBodyVRoutersVRouterRouteTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVRoutersResponseBodyVRoutersVRouterRouteTableIds self = new DescribeVRoutersResponseBodyVRoutersVRouterRouteTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeVRoutersResponseBodyVRoutersVRouterRouteTableIds setRouteTableId(java.util.List<String> routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public java.util.List<String> getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeVRoutersResponseBodyVRoutersVRouter extends TeaModel {
        /**
         * <p>The time when the vRouter was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the vRouter.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The region to which the vRouter belongs.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the route table in the vRouter.</p>
         */
        @NameInMap("RouteTableIds")
        public DescribeVRoutersResponseBodyVRoutersVRouterRouteTableIds routeTableIds;

        /**
         * <p>The ID of the vRouter.</p>
         */
        @NameInMap("VRouterId")
        public String VRouterId;

        /**
         * <p>The name of the vRouter.</p>
         */
        @NameInMap("VRouterName")
        public String VRouterName;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the vRouter belongs.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeVRoutersResponseBodyVRoutersVRouter build(java.util.Map<String, ?> map) throws Exception {
            DescribeVRoutersResponseBodyVRoutersVRouter self = new DescribeVRoutersResponseBodyVRoutersVRouter();
            return TeaModel.build(map, self);
        }

        public DescribeVRoutersResponseBodyVRoutersVRouter setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVRoutersResponseBodyVRoutersVRouter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVRoutersResponseBodyVRoutersVRouter setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeVRoutersResponseBodyVRoutersVRouter setRouteTableIds(DescribeVRoutersResponseBodyVRoutersVRouterRouteTableIds routeTableIds) {
            this.routeTableIds = routeTableIds;
            return this;
        }
        public DescribeVRoutersResponseBodyVRoutersVRouterRouteTableIds getRouteTableIds() {
            return this.routeTableIds;
        }

        public DescribeVRoutersResponseBodyVRoutersVRouter setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public DescribeVRoutersResponseBodyVRoutersVRouter setVRouterName(String VRouterName) {
            this.VRouterName = VRouterName;
            return this;
        }
        public String getVRouterName() {
            return this.VRouterName;
        }

        public DescribeVRoutersResponseBodyVRoutersVRouter setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeVRoutersResponseBodyVRouters extends TeaModel {
        @NameInMap("VRouter")
        public java.util.List<DescribeVRoutersResponseBodyVRoutersVRouter> VRouter;

        public static DescribeVRoutersResponseBodyVRouters build(java.util.Map<String, ?> map) throws Exception {
            DescribeVRoutersResponseBodyVRouters self = new DescribeVRoutersResponseBodyVRouters();
            return TeaModel.build(map, self);
        }

        public DescribeVRoutersResponseBodyVRouters setVRouter(java.util.List<DescribeVRoutersResponseBodyVRoutersVRouter> VRouter) {
            this.VRouter = VRouter;
            return this;
        }
        public java.util.List<DescribeVRoutersResponseBodyVRoutersVRouter> getVRouter() {
            return this.VRouter;
        }

    }

}
