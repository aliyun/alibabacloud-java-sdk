// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackTotalPackagesSizeRequest extends TeaModel {
    @NameInMap("RegionIdsRepeatList")
    public java.util.List<String> regionIdsRepeatList;

    public static DescribeBuildpackTotalPackagesSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackTotalPackagesSizeRequest self = new DescribeBuildpackTotalPackagesSizeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackTotalPackagesSizeRequest setRegionIdsRepeatList(java.util.List<String> regionIdsRepeatList) {
        this.regionIdsRepeatList = regionIdsRepeatList;
        return this;
    }
    public java.util.List<String> getRegionIdsRepeatList() {
        return this.regionIdsRepeatList;
    }

}
