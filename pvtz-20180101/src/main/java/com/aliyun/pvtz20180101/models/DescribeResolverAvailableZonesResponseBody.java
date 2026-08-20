// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverAvailableZonesResponseBody extends TeaModel {
    /**
     * <p>A list of zones and their resource statuses.</p>
     */
    @NameInMap("AvailableZones")
    public java.util.List<DescribeResolverAvailableZonesResponseBodyAvailableZones> availableZones;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23268E49-0C3E-4A2C-AB70-B4C7D092470B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeResolverAvailableZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverAvailableZonesResponseBody self = new DescribeResolverAvailableZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResolverAvailableZonesResponseBody setAvailableZones(java.util.List<DescribeResolverAvailableZonesResponseBodyAvailableZones> availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public java.util.List<DescribeResolverAvailableZonesResponseBodyAvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    public DescribeResolverAvailableZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeResolverAvailableZonesResponseBodyAvailableZones extends TeaModel {
        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou-a</p>
         */
        @NameInMap("AzId")
        public String azId;

        /**
         * <p>The status of resources in the zone. Valid values:</p>
         * <ul>
         * <li><p>NORMAL: Normal</p>
         * </li>
         * <li><p>SOLD_OUT: Sold out</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeResolverAvailableZonesResponseBodyAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverAvailableZonesResponseBodyAvailableZones self = new DescribeResolverAvailableZonesResponseBodyAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeResolverAvailableZonesResponseBodyAvailableZones setAzId(String azId) {
            this.azId = azId;
            return this;
        }
        public String getAzId() {
            return this.azId;
        }

        public DescribeResolverAvailableZonesResponseBodyAvailableZones setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
