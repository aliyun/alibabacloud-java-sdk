// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckDetailResponseBody extends TeaModel {
    /**
     * <p>The help information about the check item.</p>
     */
    @NameInMap("AssistInfo")
    public GetCheckDetailResponseBodyAssistInfo assistInfo;

    @NameInMap("CustomConfigs")
    public java.util.List<GetCheckDetailResponseBodyCustomConfigs> customConfigs;

    /**
     * <p>The description of the check item.</p>
     */
    @NameInMap("Description")
    public GetCheckDetailResponseBodyDescription description;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The solution to handle the risk item.</p>
     */
    @NameInMap("Solution")
    public GetCheckDetailResponseBodySolution solution;

    public static GetCheckDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckDetailResponseBody self = new GetCheckDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckDetailResponseBody setAssistInfo(GetCheckDetailResponseBodyAssistInfo assistInfo) {
        this.assistInfo = assistInfo;
        return this;
    }
    public GetCheckDetailResponseBodyAssistInfo getAssistInfo() {
        return this.assistInfo;
    }

    public GetCheckDetailResponseBody setCustomConfigs(java.util.List<GetCheckDetailResponseBodyCustomConfigs> customConfigs) {
        this.customConfigs = customConfigs;
        return this;
    }
    public java.util.List<GetCheckDetailResponseBodyCustomConfigs> getCustomConfigs() {
        return this.customConfigs;
    }

    public GetCheckDetailResponseBody setDescription(GetCheckDetailResponseBodyDescription description) {
        this.description = description;
        return this;
    }
    public GetCheckDetailResponseBodyDescription getDescription() {
        return this.description;
    }

    public GetCheckDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCheckDetailResponseBody setSolution(GetCheckDetailResponseBodySolution solution) {
        this.solution = solution;
        return this;
    }
    public GetCheckDetailResponseBodySolution getSolution() {
        return this.solution;
    }

    public static class GetCheckDetailResponseBodyAssistInfo extends TeaModel {
        /**
         * <p>The link to the help information about the risk item when the Type parameter is set to link.</p>
         */
        @NameInMap("Link")
        public String link;

        /**
         * <p>The type of the help information about the risk item. Valid values:</p>
         * <br>
         * <p>*   **text**</p>
         * <p>*   **link**</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The content in the help information about the risk item when the Type parameter is set to text.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetCheckDetailResponseBodyAssistInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCheckDetailResponseBodyAssistInfo self = new GetCheckDetailResponseBodyAssistInfo();
            return TeaModel.build(map, self);
        }

        public GetCheckDetailResponseBodyAssistInfo setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetCheckDetailResponseBodyAssistInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCheckDetailResponseBodyAssistInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetCheckDetailResponseBodyCustomConfigs extends TeaModel {
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("TypeDefine")
        public String typeDefine;

        @NameInMap("Value")
        public String value;

        public static GetCheckDetailResponseBodyCustomConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetCheckDetailResponseBodyCustomConfigs self = new GetCheckDetailResponseBodyCustomConfigs();
            return TeaModel.build(map, self);
        }

        public GetCheckDetailResponseBodyCustomConfigs setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetCheckDetailResponseBodyCustomConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCheckDetailResponseBodyCustomConfigs setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public GetCheckDetailResponseBodyCustomConfigs setTypeDefine(String typeDefine) {
            this.typeDefine = typeDefine;
            return this;
        }
        public String getTypeDefine() {
            return this.typeDefine;
        }

        public GetCheckDetailResponseBodyCustomConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetCheckDetailResponseBodyDescription extends TeaModel {
        /**
         * <p>The link to the description of the check item.</p>
         */
        @NameInMap("Link")
        public String link;

        /**
         * <p>The type of the description of the check item. The value is fixed as text.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The content in the description of the check item.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetCheckDetailResponseBodyDescription build(java.util.Map<String, ?> map) throws Exception {
            GetCheckDetailResponseBodyDescription self = new GetCheckDetailResponseBodyDescription();
            return TeaModel.build(map, self);
        }

        public GetCheckDetailResponseBodyDescription setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetCheckDetailResponseBodyDescription setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCheckDetailResponseBodyDescription setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetCheckDetailResponseBodySolution extends TeaModel {
        /**
         * <p>The link to the solution to handle the risk item when the Type parameter is set to link.</p>
         */
        @NameInMap("Link")
        public String link;

        /**
         * <p>The type of the solution to handle to the risk item. Valid values:</p>
         * <br>
         * <p>*   **text**</p>
         * <p>*   **link**</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The content of the solution to handle the risk item when the Type parameter is set to text.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetCheckDetailResponseBodySolution build(java.util.Map<String, ?> map) throws Exception {
            GetCheckDetailResponseBodySolution self = new GetCheckDetailResponseBodySolution();
            return TeaModel.build(map, self);
        }

        public GetCheckDetailResponseBodySolution setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetCheckDetailResponseBodySolution setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCheckDetailResponseBodySolution setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
