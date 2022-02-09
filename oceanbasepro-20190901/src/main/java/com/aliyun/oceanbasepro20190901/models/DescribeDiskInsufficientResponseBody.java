// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeDiskInsufficientResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeDiskInsufficientResponseBodyData> data;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiskInsufficientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskInsufficientResponseBody self = new DescribeDiskInsufficientResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiskInsufficientResponseBody setData(java.util.List<DescribeDiskInsufficientResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDiskInsufficientResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDiskInsufficientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDiskInsufficientResponseBodyDataDiskUsageTendencyList extends TeaModel {
        @NameInMap("CollectTimeStamp")
        public Double collectTimeStamp;

        @NameInMap("DiskUsage")
        public Double diskUsage;

        public static DescribeDiskInsufficientResponseBodyDataDiskUsageTendencyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskInsufficientResponseBodyDataDiskUsageTendencyList self = new DescribeDiskInsufficientResponseBodyDataDiskUsageTendencyList();
            return TeaModel.build(map, self);
        }

        public DescribeDiskInsufficientResponseBodyDataDiskUsageTendencyList setCollectTimeStamp(Double collectTimeStamp) {
            this.collectTimeStamp = collectTimeStamp;
            return this;
        }
        public Double getCollectTimeStamp() {
            return this.collectTimeStamp;
        }

        public DescribeDiskInsufficientResponseBodyDataDiskUsageTendencyList setDiskUsage(Double diskUsage) {
            this.diskUsage = diskUsage;
            return this;
        }
        public Double getDiskUsage() {
            return this.diskUsage;
        }

    }

    public static class DescribeDiskInsufficientResponseBodyData extends TeaModel {
        @NameInMap("DiskUsage")
        public Double diskUsage;

        @NameInMap("DiskUsageTendencyList")
        public java.util.List<DescribeDiskInsufficientResponseBodyDataDiskUsageTendencyList> diskUsageTendencyList;

        @NameInMap("DiskUsageVolume")
        public Double diskUsageVolume;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("TotalDiskVolume")
        public Double totalDiskVolume;

        @NameInMap("Type")
        public String type;

        public static DescribeDiskInsufficientResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskInsufficientResponseBodyData self = new DescribeDiskInsufficientResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDiskInsufficientResponseBodyData setDiskUsage(Double diskUsage) {
            this.diskUsage = diskUsage;
            return this;
        }
        public Double getDiskUsage() {
            return this.diskUsage;
        }

        public DescribeDiskInsufficientResponseBodyData setDiskUsageTendencyList(java.util.List<DescribeDiskInsufficientResponseBodyDataDiskUsageTendencyList> diskUsageTendencyList) {
            this.diskUsageTendencyList = diskUsageTendencyList;
            return this;
        }
        public java.util.List<DescribeDiskInsufficientResponseBodyDataDiskUsageTendencyList> getDiskUsageTendencyList() {
            return this.diskUsageTendencyList;
        }

        public DescribeDiskInsufficientResponseBodyData setDiskUsageVolume(Double diskUsageVolume) {
            this.diskUsageVolume = diskUsageVolume;
            return this;
        }
        public Double getDiskUsageVolume() {
            return this.diskUsageVolume;
        }

        public DescribeDiskInsufficientResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDiskInsufficientResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDiskInsufficientResponseBodyData setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeDiskInsufficientResponseBodyData setTotalDiskVolume(Double totalDiskVolume) {
            this.totalDiskVolume = totalDiskVolume;
            return this;
        }
        public Double getTotalDiskVolume() {
            return this.totalDiskVolume;
        }

        public DescribeDiskInsufficientResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
