// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetWatermarkResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The watermark template information.</p>
     */
    @NameInMap("WatermarkInfo")
    public GetWatermarkResponseBodyWatermarkInfo watermarkInfo;

    public static GetWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkResponseBody self = new GetWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWatermarkResponseBody setWatermarkInfo(GetWatermarkResponseBodyWatermarkInfo watermarkInfo) {
        this.watermarkInfo = watermarkInfo;
        return this;
    }
    public GetWatermarkResponseBodyWatermarkInfo getWatermarkInfo() {
        return this.watermarkInfo;
    }

    public static class GetWatermarkResponseBodyWatermarkInfo extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the watermark template was created. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-06T08:03:17Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The URL of the watermark file (OSS URL or CDN URL).</p>
         * <blockquote>
         * <p>This parameter is returned only for image watermark templates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://outin-32*****f4b3e7.oss-cn-shanghai.aliyuncs.com/image/cover/F85529C8B715E6F8A72EC6B-6-2.png?Expires=1541600583&OSSAccessKeyId=****&Signature=gmf1eYMoDVg%2BHQCb4UGozBW">https://outin-32*****f4b3e7.oss-cn-shanghai.aliyuncs.com/image/cover/F85529C8B715E6F8A72EC6B-6-2.png?Expires=1541600583&amp;OSSAccessKeyId=****&amp;Signature=gmf1eYMoDVg%2BHQCb4UGozBW</a>****</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>Indicates whether the watermark template is the default template. Valid values:</p>
         * <ul>
         * <li><strong>Default</strong>: the default watermark template.</li>
         * <li><strong>NotDefault</strong>: not the default watermark template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NotDefault</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>The name of the watermark template.</p>
         * 
         * <strong>example:</strong>
         * <p>Image watermark test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the watermark template. Valid values:</p>
         * <ul>
         * <li><strong>Image</strong>: image watermark template.</li>
         * <li><strong>Text</strong>: text watermark template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Image</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The configuration information of the watermark (JSON string), including the display position and effect of the watermark. The configuration parameters differ between image watermarks and text watermarks. For more information about the parameter structure, see <a href="~~98618#section-h01-44s-2lr~~">WatermarkConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ReferPos&quot;: &quot;BottomRight&quot;,&quot;Height&quot;: &quot;55&quot;,&quot;Width&quot;: &quot;55&quot;,&quot;Dx&quot;: &quot;8&quot;,&quot;Dy&quot;: &quot;8&quot; }</p>
         */
        @NameInMap("WatermarkConfig")
        public String watermarkConfig;

        /**
         * <p>The watermark template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>505e2e287ea*****ecfddd386d384</p>
         */
        @NameInMap("WatermarkId")
        public String watermarkId;

        public static GetWatermarkResponseBodyWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarkResponseBodyWatermarkInfo self = new GetWatermarkResponseBodyWatermarkInfo();
            return TeaModel.build(map, self);
        }

        public GetWatermarkResponseBodyWatermarkInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetWatermarkResponseBodyWatermarkInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetWatermarkResponseBodyWatermarkInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetWatermarkResponseBodyWatermarkInfo setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public GetWatermarkResponseBodyWatermarkInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWatermarkResponseBodyWatermarkInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWatermarkResponseBodyWatermarkInfo setWatermarkConfig(String watermarkConfig) {
            this.watermarkConfig = watermarkConfig;
            return this;
        }
        public String getWatermarkConfig() {
            return this.watermarkConfig;
        }

        public GetWatermarkResponseBodyWatermarkInfo setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

    }

}
