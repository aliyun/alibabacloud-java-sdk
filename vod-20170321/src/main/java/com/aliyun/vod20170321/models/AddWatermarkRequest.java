// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddWatermarkRequest extends TeaModel {
    /**
     * <p>The application ID. Default value: <strong>app-1000000</strong>. If you have activated the multi-application service, specify the application ID to add the watermark template to the specified application. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application service</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The Object Storage Service (OSS) URL of the watermark image file (without authentication).</p>
     * <blockquote>
     * <ul>
     * <li>Request parameter is required when you set an image watermark template (<code>Type</code> is <code>Image</code>).</li>
     * <li>You can call <a href="~~CreateUploadAttachedMedia~~">CreateUploadAttachedMedia</a> to upload the watermark image to ApsaraVideo VOD. The value of the <code>FileURL</code> parameter returned after the upload can be used as the value of request parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://outin-326268*****63e1403e7.oss-cn-shanghai.aliyuncs.com/image/cover/C99345*****E7FDEC-6-2.png">http://outin-326268*****63e1403e7.oss-cn-shanghai.aliyuncs.com/image/cover/C99345*****E7FDEC-6-2.png</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The name of the watermark template.</p>
     * <ul>
     * <li>Only Chinese characters, letters, and digits are supported.</li>
     * <li>The name can be up to 128 bytes in length.</li>
     * <li>UTF-8 encoding.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Image watermark template</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The templatetype of the watermark. Valid values:</p>
     * <ul>
     * <li><strong>Image</strong> (default): image watermark template.</li>
     * <li><strong>Text</strong>: text watermark template.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Image</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The configuration information of the watermark (JSON string), including the display position and effect of the watermark. The configuration parameters differ between image watermarks and text watermarks. For more information about the parameter structure, see <a href="~~98618#section-h01-44s-2lr~~">WatermarkConfig</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;Width&quot;: &quot;55&quot;,
     *       &quot;Height&quot;: &quot;55&quot;,
     *       &quot;Dx&quot;: &quot;9&quot;,
     *       &quot;Dy&quot;: &quot;9&quot;,
     *       &quot;ReferPos&quot;: &quot;BottomLeft&quot;
     * }</p>
     */
    @NameInMap("WatermarkConfig")
    public String watermarkConfig;

    public static AddWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWatermarkRequest self = new AddWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public AddWatermarkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddWatermarkRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public AddWatermarkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddWatermarkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddWatermarkRequest setWatermarkConfig(String watermarkConfig) {
        this.watermarkConfig = watermarkConfig;
        return this;
    }
    public String getWatermarkConfig() {
        return this.watermarkConfig;
    }

}
