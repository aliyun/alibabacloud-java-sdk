// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateWatermarkRequest extends TeaModel {
    /**
     * <p>The new name of the watermark template.</p>
     * <ul>
     * <li>Only Chinese characters, letters, and digits are supported.</li>
     * <li>The name can be up to 128 bytes in length.</li>
     * <li>UTF-8 encoding.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configuration information of the image and text watermark (JSON character string), including the watermark display position and watermark effect. The configuration parameters for image watermarks and text watermarks are different. For details about the parameter structure, see <a href="~~98618#section-h01-44s-2lr~~">WatermarkConfig</a>.</p>
     * <blockquote>
     * <p>Modifying across templatetypes is not supported. You can invoke the <a href="~~GetWatermark~~">GetWatermark</a> operation to query the type of the watermark template before modifying the configuration.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Width&quot;:&quot;55&quot;,&quot;Height&quot;:&quot;55&quot;,&quot;Dx&quot;:&quot;9&quot;,&quot;Dy&quot;:&quot;9&quot;,&quot;ReferPos&quot;:&quot;BottomLeft&quot;}</p>
     */
    @NameInMap("WatermarkConfig")
    public String watermarkConfig;

    /**
     * <p>The ID of the image and text watermark template to modify. Only a single watermark template ID is supported. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>The ID is returned after you call the <a href="~~AddWatermark~~">AddWatermark</a> operation to add an image and text watermark template.</li>
     * <li>The ID is returned after you call the <a href="~~ListWatermark~~">ListWatermark</a> operation to query the list of image and text watermark templates.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af2afe4761992c*****bd947dae97337</p>
     */
    @NameInMap("WatermarkId")
    public String watermarkId;

    public static UpdateWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatermarkRequest self = new UpdateWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWatermarkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWatermarkRequest setWatermarkConfig(String watermarkConfig) {
        this.watermarkConfig = watermarkConfig;
        return this;
    }
    public String getWatermarkConfig() {
        return this.watermarkConfig;
    }

    public UpdateWatermarkRequest setWatermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
        return this;
    }
    public String getWatermarkId() {
        return this.watermarkId;
    }

}
