// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVodTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("IsDefault")
        public String isDefault;

        @NameInMap("TemplateType")
        public String templateType;

        @NameInMap("VodTemplateId")
        public String vodTemplateId;

        @NameInMap("TemplateConfig")
        public String templateConfig;

        @NameInMap("Name")
        public String name;

        @NameInMap("ModifyTime")
        public String modifyTime;

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

        public GetVodTemplateResponseBodyVodTemplateInfo setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public GetVodTemplateResponseBodyVodTemplateInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetVodTemplateResponseBodyVodTemplateInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
