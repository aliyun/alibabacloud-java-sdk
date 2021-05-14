// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSasAssetStatisticsColumnResponseBody extends TeaModel {
    @NameInMap("StatisticsColumn")
    public String statisticsColumn;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSasAssetStatisticsColumnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSasAssetStatisticsColumnResponseBody self = new DescribeSasAssetStatisticsColumnResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSasAssetStatisticsColumnResponseBody setStatisticsColumn(String statisticsColumn) {
        this.statisticsColumn = statisticsColumn;
        return this;
    }
    public String getStatisticsColumn() {
        return this.statisticsColumn;
    }

    public DescribeSasAssetStatisticsColumnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
