// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MetadataInfoListResult extends TeaModel {
    @NameInMap("metadataInfos")
    public java.util.List<MetadataInfo> metadataInfos;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static MetadataInfoListResult build(java.util.Map<String, ?> map) throws Exception {
        MetadataInfoListResult self = new MetadataInfoListResult();
        return TeaModel.build(map, self);
    }

    public MetadataInfoListResult setMetadataInfos(java.util.List<MetadataInfo> metadataInfos) {
        this.metadataInfos = metadataInfos;
        return this;
    }
    public java.util.List<MetadataInfo> getMetadataInfos() {
        return this.metadataInfos;
    }

    public MetadataInfoListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MetadataInfoListResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
