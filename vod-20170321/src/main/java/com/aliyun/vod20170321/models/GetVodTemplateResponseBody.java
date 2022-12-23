// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVodTemplateResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The information about the snapshot template.
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
        // The time when the template was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // Indicates whether the template is the default one. Valid values:
        // 
        // *   **Default**: The template is the default one.
        // *   **NotDefault**: The template is not the default one.
        @NameInMap("IsDefault")
        public String isDefault;

        // The time when the template was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("ModifyTime")
        public String modifyTime;

        // The name of the template.
        @NameInMap("Name")
        public String name;

        // The detailed configurations of the template. The value is a JSON-formatted string. For more information about the data structure, see the "SnapshotTemplateConfig" section of the [Media processing parameters](~~98618~~) topic.
        @NameInMap("TemplateConfig")
        public String templateConfig;

        // The type of the template. Valid values:
        // 
        // *   **Snapshot**
        // *   **DynamicImage**
        @NameInMap("TemplateType")
        public String templateType;

        // The ID of the template.
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
