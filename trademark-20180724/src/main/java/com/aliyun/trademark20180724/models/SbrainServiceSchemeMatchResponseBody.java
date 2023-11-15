// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SbrainServiceSchemeMatchResponseBody extends TeaModel {
    @NameInMap("Data")
    public SbrainServiceSchemeMatchResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SbrainServiceSchemeMatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SbrainServiceSchemeMatchResponseBody self = new SbrainServiceSchemeMatchResponseBody();
        return TeaModel.build(map, self);
    }

    public SbrainServiceSchemeMatchResponseBody setData(SbrainServiceSchemeMatchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SbrainServiceSchemeMatchResponseBodyData getData() {
        return this.data;
    }

    public SbrainServiceSchemeMatchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SbrainServiceSchemeMatchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SbrainServiceSchemeMatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SbrainServiceSchemeMatchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SbrainServiceSchemeMatchResponseBodyDataSchemeContentContentModules extends TeaModel {
        @NameInMap("Tag")
        public String tag;

        @NameInMap("action")
        public String action;

        @NameInMap("moduleData")
        public String moduleData;

        @NameInMap("moduleDataSource")
        public String moduleDataSource;

        @NameInMap("moduleDataSourceType")
        public String moduleDataSourceType;

        @NameInMap("name")
        public String name;

        @NameInMap("target")
        public String target;

        public static SbrainServiceSchemeMatchResponseBodyDataSchemeContentContentModules build(java.util.Map<String, ?> map) throws Exception {
            SbrainServiceSchemeMatchResponseBodyDataSchemeContentContentModules self = new SbrainServiceSchemeMatchResponseBodyDataSchemeContentContentModules();
            return TeaModel.build(map, self);
        }

        public SbrainServiceSchemeMatchResponseBodyDataSchemeContentContentModules setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public SbrainServiceSchemeMatchResponseBodyDataSchemeContentContentModules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public SbrainServiceSchemeMatchResponseBodyDataSchemeContentContentModules setModuleData(String moduleData) {
            this.moduleData = moduleData;
            return this;
        }
        public String getModuleData() {
            return this.moduleData;
        }

        public SbrainServiceSchemeMatchResponseBodyDataSchemeContentContentModules setModuleDataSource(String moduleDataSource) {
            this.moduleDataSource = moduleDataSource;
            return this;
        }
        public String getModuleDataSource() {
            return this.moduleDataSource;
        }

        public SbrainServiceSchemeMatchResponseBodyDataSchemeContentContentModules setModuleDataSourceType(String moduleDataSourceType) {
            this.moduleDataSourceType = moduleDataSourceType;
            return this;
        }
        public String getModuleDataSourceType() {
            return this.moduleDataSourceType;
        }

        public SbrainServiceSchemeMatchResponseBodyDataSchemeContentContentModules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SbrainServiceSchemeMatchResponseBodyDataSchemeContentContentModules setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class SbrainServiceSchemeMatchResponseBodyDataSchemeContent extends TeaModel {
        @NameInMap("ContentIndex")
        public Integer contentIndex;

        @NameInMap("ContentModules")
        public java.util.List<SbrainServiceSchemeMatchResponseBodyDataSchemeContentContentModules> contentModules;

        @NameInMap("Display")
        public String display;

        public static SbrainServiceSchemeMatchResponseBodyDataSchemeContent build(java.util.Map<String, ?> map) throws Exception {
            SbrainServiceSchemeMatchResponseBodyDataSchemeContent self = new SbrainServiceSchemeMatchResponseBodyDataSchemeContent();
            return TeaModel.build(map, self);
        }

        public SbrainServiceSchemeMatchResponseBodyDataSchemeContent setContentIndex(Integer contentIndex) {
            this.contentIndex = contentIndex;
            return this;
        }
        public Integer getContentIndex() {
            return this.contentIndex;
        }

        public SbrainServiceSchemeMatchResponseBodyDataSchemeContent setContentModules(java.util.List<SbrainServiceSchemeMatchResponseBodyDataSchemeContentContentModules> contentModules) {
            this.contentModules = contentModules;
            return this;
        }
        public java.util.List<SbrainServiceSchemeMatchResponseBodyDataSchemeContentContentModules> getContentModules() {
            return this.contentModules;
        }

        public SbrainServiceSchemeMatchResponseBodyDataSchemeContent setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

    }

    public static class SbrainServiceSchemeMatchResponseBodyData extends TeaModel {
        @NameInMap("SceneCode")
        public String sceneCode;

        @NameInMap("SchemeContent")
        public SbrainServiceSchemeMatchResponseBodyDataSchemeContent schemeContent;

        @NameInMap("SchemeId")
        public Long schemeId;

        public static SbrainServiceSchemeMatchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SbrainServiceSchemeMatchResponseBodyData self = new SbrainServiceSchemeMatchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SbrainServiceSchemeMatchResponseBodyData setSceneCode(String sceneCode) {
            this.sceneCode = sceneCode;
            return this;
        }
        public String getSceneCode() {
            return this.sceneCode;
        }

        public SbrainServiceSchemeMatchResponseBodyData setSchemeContent(SbrainServiceSchemeMatchResponseBodyDataSchemeContent schemeContent) {
            this.schemeContent = schemeContent;
            return this;
        }
        public SbrainServiceSchemeMatchResponseBodyDataSchemeContent getSchemeContent() {
            return this.schemeContent;
        }

        public SbrainServiceSchemeMatchResponseBodyData setSchemeId(Long schemeId) {
            this.schemeId = schemeId;
            return this;
        }
        public Long getSchemeId() {
            return this.schemeId;
        }

    }

}
