// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddWatermarkResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the watermark template.</p>
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
         * <p>The time when the watermark template was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-07T09:05:52Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The URL of the watermark file. The URL is an Object Storage Service (OSS) URL or an Alibaba Cloud CDN URL.</p>
         * <blockquote>
         * <p> This parameter is returned only for image watermark templates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://outin-3262*****9f4b3e7.oss-cn-shanghai.aliyuncs.com/image/cover/E6C3448CC8B715E6F8A72EC6B-6-2.png?Expires=1541600583&OSSAccessKeyId=****&Signature=gmf1eYMoDVg%2BHQCb4UGozBW">https://outin-3262*****9f4b3e7.oss-cn-shanghai.aliyuncs.com/image/cover/E6C3448CC8B715E6F8A72EC6B-6-2.png?Expires=1541600583&amp;OSSAccessKeyId=****&amp;Signature=gmf1eYMoDVg%2BHQCb4UGozBW</a>****</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>Indicates whether the watermark template is the default one. Valid values:</p>
         * <ul>
         * <li><strong>Default</strong></li>
         * <li><strong>NotDefault</strong></li>
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
         * <p>text watermark test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the watermark template.</p>
         * <ul>
         * <li><strong>Image</strong>: image watermark template</li>
         * <li><strong>Text</strong>: text watermark template</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The configuration information of the watermark such as the display position and special effects. The value is a JSON string. The configuration parameters for image and text watermarks are different. For more information about the parameter structure, see <a href="~~98618#section-h01-44s-2lr~~">WatermarkConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;FontColor&quot;: &quot;Blue&quot;,&quot;FontSize&quot;: 80, &quot;Content&quot;: &quot;watermark test&quot; }</p>
         */
        @NameInMap("WatermarkConfig")
        public String watermarkConfig;

        /**
         * <p>The ID of the watermark template.</p>
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
