// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSasAssetStatisticsColumnRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeSasAssetStatisticsColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSasAssetStatisticsColumnRequest self = new DescribeSasAssetStatisticsColumnRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSasAssetStatisticsColumnRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
