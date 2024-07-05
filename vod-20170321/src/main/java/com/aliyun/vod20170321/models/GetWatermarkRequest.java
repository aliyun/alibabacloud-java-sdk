// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetWatermarkRequest extends TeaModel {
    /**
     * <p>The ID of the watermark template. You can specify only one watermark template ID. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>Obtain the watermark template ID from the response to the <a href="~~AddWatermark~~">AddWatermark</a> operation that you call to create a watermark template.</li>
     * <li>Obtain the watermark template ID from the response to the <a href="~~ListWatermark~~">ListWatermark</a> operation that you call to query all watermarks within your account.</li>
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
