// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackIdVersionPairsRequest extends TeaModel {
    @NameInMap("FullVersion")
    public String fullVersion;

    @NameInMap("TechstackId")
    public Long techstackId;

    @NameInMap("StatusesRepeatList")
    public java.util.List<String> statusesRepeatList;

    public static DescribeBuildpackIdVersionPairsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackIdVersionPairsRequest self = new DescribeBuildpackIdVersionPairsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackIdVersionPairsRequest setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public DescribeBuildpackIdVersionPairsRequest setTechstackId(Long techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public Long getTechstackId() {
        return this.techstackId;
    }

    public DescribeBuildpackIdVersionPairsRequest setStatusesRepeatList(java.util.List<String> statusesRepeatList) {
        this.statusesRepeatList = statusesRepeatList;
        return this;
    }
    public java.util.List<String> getStatusesRepeatList() {
        return this.statusesRepeatList;
    }

}
