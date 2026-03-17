// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagDropTopNResponseBody extends TeaModel {
    /**
     * <p>The information about packets dropped by the SAG instance.</p>
     */
    @NameInMap("DropTopN")
    public java.util.List<DescribeSagDropTopNResponseBodyDropTopN> dropTopN;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AFF7E5A6-6897-4FDC-A5A8-1978B5B3E545</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSagDropTopNResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagDropTopNResponseBody self = new DescribeSagDropTopNResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagDropTopNResponseBody setDropTopN(java.util.List<DescribeSagDropTopNResponseBodyDropTopN> dropTopN) {
        this.dropTopN = dropTopN;
        return this;
    }
    public java.util.List<DescribeSagDropTopNResponseBodyDropTopN> getDropTopN() {
        return this.dropTopN;
    }

    public DescribeSagDropTopNResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSagDropTopNResponseBodyDropTopN extends TeaModel {
        /**
         * <p>The packet loss rate of the SAG instance. Unit: packets per second (PPS).</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("DropRate")
        public String dropRate;

        /**
         * <p>The ID of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-whfn****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the region where the SAG instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeSagDropTopNResponseBodyDropTopN build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagDropTopNResponseBodyDropTopN self = new DescribeSagDropTopNResponseBodyDropTopN();
            return TeaModel.build(map, self);
        }

        public DescribeSagDropTopNResponseBodyDropTopN setDropRate(String dropRate) {
            this.dropRate = dropRate;
            return this;
        }
        public String getDropRate() {
            return this.dropRate;
        }

        public DescribeSagDropTopNResponseBodyDropTopN setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSagDropTopNResponseBodyDropTopN setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSagDropTopNResponseBodyDropTopN setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
