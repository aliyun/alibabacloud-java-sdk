// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    @NameInMap("RegionInfo")
    public java.util.List<RegionInfo> regionInfos;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRegionInfos(java.util.List<RegionInfo> regionInfos) {
        this.regionInfos = regionInfos;
        return this;
    }
    public java.util.List<RegionInfo> getRegionInfos() {
        return this.regionInfos;
    }

}
