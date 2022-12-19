// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckDetailResponseBody extends TeaModel {
    // The help information about the check item.
    @NameInMap("AssistInfo")
    public GetCheckDetailResponseBodyAssistInfo assistInfo;

    // The description of the check item.
    @NameInMap("Description")
    public GetCheckDetailResponseBodyDescription description;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The solution to handle the risk item.
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
        // The link to the help information about the risk item when the Type parameter is set to link.
        @NameInMap("Link")
        public String link;

        // The type of the help information about the risk item. Valid values:
        // 
        // *   **text**
        // *   **link**
        @NameInMap("Type")
        public String type;

        // The content in the help information about the risk item when the Type parameter is set to text.
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

    public static class GetCheckDetailResponseBodyDescription extends TeaModel {
        // The link to the description of the check item.
        @NameInMap("Link")
        public String link;

        // The type of the description of the check item. The value is fixed as text.
        @NameInMap("Type")
        public String type;

        // The content in the description of the check item.
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
        // The link to the solution to handle the risk item when the Type parameter is set to link.
        @NameInMap("Link")
        public String link;

        // The type of the solution to handle to the risk item. Valid values:
        // 
        // *   **text**
        // *   **link**
        @NameInMap("Type")
        public String type;

        // The content of the solution to handle the risk item when the Type parameter is set to text.
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
