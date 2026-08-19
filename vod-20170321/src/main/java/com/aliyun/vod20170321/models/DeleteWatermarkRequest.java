// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteWatermarkRequest extends TeaModel {
    /**
     * <p>The ID of the watermark template to delete. Only a single watermark template ID can be specified. You can obtain the ID by using the following methods:</p>
     * <ul>
     * <li>The ID is returned after you call the <a href="~~AddWatermark~~">AddWatermark</a> operation to add a watermark template.</li>
     * <li>The ID is returned after you call the <a href="~~ListWatermark~~">ListWatermark</a> operation to query the list of watermark templates.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9bcc8bfadb843f*****09a2671d0df97</p>
     */
    @NameInMap("WatermarkId")
    public String watermarkId;

    public static DeleteWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatermarkRequest self = new DeleteWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWatermarkRequest setWatermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
        return this;
    }
    public String getWatermarkId() {
        return this.watermarkId;
    }

}
