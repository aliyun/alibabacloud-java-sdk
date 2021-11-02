// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("IsDefault")
        public String isDefault;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateConfig")
        public String templateConfig;

        @NameInMap("TemplateType")
        public String templateType;

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
