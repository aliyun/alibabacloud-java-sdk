// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodTemplateResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The snapshot templates.
    @NameInMap("VodTemplateInfoList")
    public java.util.List<ListVodTemplateResponseBodyVodTemplateInfoList> vodTemplateInfoList;

    public static ListVodTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVodTemplateResponseBody self = new ListVodTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVodTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVodTemplateResponseBody setVodTemplateInfoList(java.util.List<ListVodTemplateResponseBodyVodTemplateInfoList> vodTemplateInfoList) {
        this.vodTemplateInfoList = vodTemplateInfoList;
        return this;
    }
    public java.util.List<ListVodTemplateResponseBodyVodTemplateInfoList> getVodTemplateInfoList() {
        return this.vodTemplateInfoList;
    }

    public static class ListVodTemplateResponseBodyVodTemplateInfoList extends TeaModel {
        // The ID of the application.
        @NameInMap("AppId")
        public String appId;

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

        public static ListVodTemplateResponseBodyVodTemplateInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListVodTemplateResponseBodyVodTemplateInfoList self = new ListVodTemplateResponseBodyVodTemplateInfoList();
            return TeaModel.build(map, self);
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setVodTemplateId(String vodTemplateId) {
            this.vodTemplateId = vodTemplateId;
            return this;
        }
        public String getVodTemplateId() {
            return this.vodTemplateId;
        }

    }

}
