// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetWatermarkRequest extends TeaModel {
    /**
     * <p>The ID of the watermark template to query. Only a single watermark template ID is supported. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>Call the <a href="~~AddWatermark~~">AddWatermark</a> operation to add a watermark template. The ID is returned.</li>
     * <li>Call the <a href="~~ListWatermark~~">ListWatermark</a> operation to query the list of watermark templates. The ID is returned.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9bcc8bfadb843f*****09a2671d0df97</p>
     */
    @NameInMap("WatermarkId")
    public String watermarkId;

    public static GetWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkRequest self = new GetWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public GetWatermarkRequest setWatermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
        return this;
    }
    public String getWatermarkId() {
        return this.watermarkId;
    }

}
