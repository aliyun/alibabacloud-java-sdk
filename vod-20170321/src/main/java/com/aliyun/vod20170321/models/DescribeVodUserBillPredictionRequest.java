// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserBillPredictionRequest extends TeaModel {
    @NameInMap("Area")
    public String area;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeVodUserBillPredictionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserBillPredictionRequest self = new DescribeVodUserBillPredictionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodUserBillPredictionRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public DescribeVodUserBillPredictionRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public DescribeVodUserBillPredictionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
