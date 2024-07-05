// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVodTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DE7A1F49-41C1-47*****DF-4CD0C02087DB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the snapshot template.</p>
     */
    @NameInMap("VodTemplateInfo")
    public GetVodTemplateResponseBodyVodTemplateInfo vodTemplateInfo;

    public static GetVodTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVodTemplateResponseBody self = new GetVodTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVodTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVodTemplateResponseBody setVodTemplateInfo(GetVodTemplateResponseBodyVodTemplateInfo vodTemplateInfo) {
        this.vodTemplateInfo = vodTemplateInfo;
        return this;
    }
    public GetVodTemplateResponseBodyVodTemplateInfo getVodTemplateInfo() {
        return this.vodTemplateInfo;
    }

    public static class GetVodTemplateResponseBodyVodTemplateInfo extends TeaModel {
        /**
         * <p>The time when the template was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-30T08:05:59:57Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether the template is the default one. Valid values:</p>
         * <ul>
         * <li><strong>Default</strong>: The template is the default one.</li>
         * <li><strong>NotDefault</strong>: The template is not the default one.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NotDefault</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>The time when the template was modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-30T09:05:59:57Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The detailed configurations of the template. The value is a JSON-formatted string. For more information about the data structure, see the &quot;SnapshotTemplateConfig&quot; section of the <a href="https://help.aliyun.com/document_detail/98618.html">Media processing parameters</a> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;SnapshotConfig\&quot;:{\&quot;Count\&quot;:10,\&quot;SpecifiedOffsetTime\&quot;:0,\&quot;Interval\&quot;:1},\&quot;SnapshotType\&quot;:\&quot;NormalSnapshot\&quot;}</p>
         */
        @NameInMap("TemplateConfig")
        public String templateConfig;

        /**
         * <p>The type of the template. Valid values:</p>
         * <ul>
         * <li><strong>Snapshot</strong></li>
         * <li><strong>DynamicImage</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Snapshot</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>7c49f2f4c09*****69fcd446690</p>
         */
        @NameInMap("VodTemplateId")
        public String vodTemplateId;

        public static GetVodTemplateResponseBodyVodTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVodTemplateResponseBodyVodTemplateInfo self = new GetVodTemplateResponseBodyVodTemplateInfo();
            return TeaModel.build(map, self);
        }

        public GetVodTemplateResponseBodyVodTemplateInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetVodTemplateResponseBodyVodTemplateInfo setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public GetVodTemplateResponseBodyVodTemplateInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetVodTemplateResponseBodyVodTemplateInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetVodTemplateResponseBodyVodTemplateInfo setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public GetVodTemplateResponseBodyVodTemplateInfo setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public GetVodTemplateResponseBodyVodTemplateInfo setVodTemplateId(String vodTemplateId) {
            this.vodTemplateId = vodTemplateId;
            return this;
        }
        public String getVodTemplateId() {
            return this.vodTemplateId;
        }

    }

}
