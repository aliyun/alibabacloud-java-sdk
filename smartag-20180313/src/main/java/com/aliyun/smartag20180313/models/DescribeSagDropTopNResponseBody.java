// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagDropTopNResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DropTopN")
    public java.util.List<DescribeSagDropTopNResponseBodyDropTopN> dropTopN;

    public static DescribeSagDropTopNResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagDropTopNResponseBody self = new DescribeSagDropTopNResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagDropTopNResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagDropTopNResponseBody setDropTopN(java.util.List<DescribeSagDropTopNResponseBodyDropTopN> dropTopN) {
        this.dropTopN = dropTopN;
        return this;
    }
    public java.util.List<DescribeSagDropTopNResponseBodyDropTopN> getDropTopN() {
        return this.dropTopN;
    }

    public static class DescribeSagDropTopNResponseBodyDropTopN extends TeaModel {
        @NameInMap("DropRate")
        public String dropRate;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

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
