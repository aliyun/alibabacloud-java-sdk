// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateWatermarkRequest extends TeaModel {
    /**
     * <p>The name of the watermark template to which you want to change.</p>
     * <ul>
     * <li>Only letters and digits are supported.</li>
     * <li>The name cannot exceed 128 bytes.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configuration information of the watermark such as the display position and special effects. The value must be a JSON string. The configuration parameters for image and text watermarks are different. For more information about the parameter structure, see <a href="~~98618#section-h01-44s-2lr~~">WatermarkConfig</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Width&quot;:&quot;55&quot;,&quot;Height&quot;:&quot;55&quot;,&quot;Dx&quot;:&quot;9&quot;,&quot;Dy&quot;:&quot;9&quot;,&quot;ReferPos&quot;:&quot;BottonLeft&quot;,&quot;Type&quot;:&quot;Image&quot;}</p>
     */
    @NameInMap("WatermarkConfig")
    public String watermarkConfig;

    /**
     * <p>The ID of the watermark template. You can specify only one watermark template ID. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>Obtain the watermark template ID from the response to the <a href="~~AddWatermark~~">AddWatermark</a> operation that you call to create a watermark template.</li>
     * <li>Obtain the watermark template ID from the response to the <a href="~~ListWatermark~~">ListWatermark</a> operation that you call to query all watermark templates within your account.</li>
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
