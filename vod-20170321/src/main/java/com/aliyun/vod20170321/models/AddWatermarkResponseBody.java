// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddWatermarkResponseBody extends TeaModel {
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
    public AddWatermarkResponseBodyWatermarkInfo watermarkInfo;

    public static AddWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddWatermarkResponseBody self = new AddWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public AddWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddWatermarkResponseBody setWatermarkInfo(AddWatermarkResponseBodyWatermarkInfo watermarkInfo) {
        this.watermarkInfo = watermarkInfo;
        return this;
    }
    public AddWatermarkResponseBodyWatermarkInfo getWatermarkInfo() {
        return this.watermarkInfo;
    }

    public static class AddWatermarkResponseBodyWatermarkInfo extends TeaModel {
        /**
         * <p>The time when the watermark template was created. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-07T09:05:52Z</p>
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
         * <p><a href="https://outin-3262*****9f4b3e7.oss-cn-shanghai.aliyuncs.com/image/cover/E6C3448CC8B715E6F8A72EC6B-6-2.png?Expires=1541600583&OSSAccessKeyId=****&Signature=gmf1eYMoDVg%2BHQCb4UGozBW">https://outin-3262*****9f4b3e7.oss-cn-shanghai.aliyuncs.com/image/cover/E6C3448CC8B715E6F8A72EC6B-6-2.png?Expires=1541600583&amp;OSSAccessKeyId=****&amp;Signature=gmf1eYMoDVg%2BHQCb4UGozBW</a>****</p>
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
         * <p>Image watermark template</p>
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

        /**
         * <p>The ID of the watermark template. You can use this watermark template ID to associate the template with a transcoding template group, or to query, modify, delete, or set the template as the default watermark template.</p>
         * 
         * <strong>example:</strong>
         * <p>9bcc8bfadb84*****109a2671d0df97</p>
         */
        @NameInMap("WatermarkId")
        public String watermarkId;

        public static AddWatermarkResponseBodyWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            AddWatermarkResponseBodyWatermarkInfo self = new AddWatermarkResponseBodyWatermarkInfo();
            return TeaModel.build(map, self);
        }

        public AddWatermarkResponseBodyWatermarkInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public AddWatermarkResponseBodyWatermarkInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public AddWatermarkResponseBodyWatermarkInfo setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public AddWatermarkResponseBodyWatermarkInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddWatermarkResponseBodyWatermarkInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddWatermarkResponseBodyWatermarkInfo setWatermarkConfig(String watermarkConfig) {
            this.watermarkConfig = watermarkConfig;
            return this;
        }
        public String getWatermarkConfig() {
            return this.watermarkConfig;
        }

        public AddWatermarkResponseBodyWatermarkInfo setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

    }

}
