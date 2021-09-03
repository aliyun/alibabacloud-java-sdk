// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210823_161417275.models;

import com.aliyun.tea.*;

public class HttpGroupTestRequest extends TeaModel {
    @NameInMap("devConfig")
    public HttpGroupTestRequestDevConfig devConfig;

    @NameInMap("groupId")
    public String groupId;

    @NameInMap("externalId")
    public String externalId;

    @NameInMap("id")
    public String id;

    @NameInMap("version")
    public String version;

    @NameInMap("extraInfo")
    public String extraInfo;

    @NameInMap("desc")
    public String desc;

    public static HttpGroupTestRequest build(java.util.Map<String, ?> map) throws Exception {
        HttpGroupTestRequest self = new HttpGroupTestRequest();
        return TeaModel.build(map, self);
    }

    public HttpGroupTestRequest setDevConfig(HttpGroupTestRequestDevConfig devConfig) {
        this.devConfig = devConfig;
        return this;
    }
    public HttpGroupTestRequestDevConfig getDevConfig() {
        return this.devConfig;
    }

    public HttpGroupTestRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public HttpGroupTestRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public HttpGroupTestRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public HttpGroupTestRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public HttpGroupTestRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public HttpGroupTestRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public static class HttpGroupTestRequestDevConfig extends TeaModel {
        @NameInMap("endPointType")
        public String endPointType;

        @NameInMap("languages")
        public java.util.List<String> languages;

        public static HttpGroupTestRequestDevConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpGroupTestRequestDevConfig self = new HttpGroupTestRequestDevConfig();
            return TeaModel.build(map, self);
        }

        public HttpGroupTestRequestDevConfig setEndPointType(String endPointType) {
            this.endPointType = endPointType;
            return this;
        }
        public String getEndPointType() {
            return this.endPointType;
        }

        public HttpGroupTestRequestDevConfig setLanguages(java.util.List<String> languages) {
            this.languages = languages;
            return this;
        }
        public java.util.List<String> getLanguages() {
            return this.languages;
        }

    }

}
