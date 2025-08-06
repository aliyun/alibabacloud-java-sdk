// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodPlayerDimensionDataDemoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Os</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    public static DescribeVodPlayerDimensionDataDemoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodPlayerDimensionDataDemoRequest self = new DescribeVodPlayerDimensionDataDemoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodPlayerDimensionDataDemoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeVodPlayerDimensionDataDemoRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

}
