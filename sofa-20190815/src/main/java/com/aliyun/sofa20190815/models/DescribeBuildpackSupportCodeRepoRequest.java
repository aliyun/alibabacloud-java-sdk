// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackSupportCodeRepoRequest extends TeaModel {
    @NameInMap("TechstackId")
    public Long techstackId;

    public static DescribeBuildpackSupportCodeRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackSupportCodeRepoRequest self = new DescribeBuildpackSupportCodeRepoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackSupportCodeRepoRequest setTechstackId(Long techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public Long getTechstackId() {
        return this.techstackId;
    }

}
