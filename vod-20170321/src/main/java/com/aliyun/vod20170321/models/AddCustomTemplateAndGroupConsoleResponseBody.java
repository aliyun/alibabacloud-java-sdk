// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddCustomTemplateAndGroupConsoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    @NameInMap("TemplateGroup")
    public AddCustomTemplateAndGroupConsoleResponseBodyTemplateGroup templateGroup;

    public static AddCustomTemplateAndGroupConsoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCustomTemplateAndGroupConsoleResponseBody self = new AddCustomTemplateAndGroupConsoleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCustomTemplateAndGroupConsoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCustomTemplateAndGroupConsoleResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public AddCustomTemplateAndGroupConsoleResponseBody setTemplateGroup(AddCustomTemplateAndGroupConsoleResponseBodyTemplateGroup templateGroup) {
        this.templateGroup = templateGroup;
        return this;
    }
    public AddCustomTemplateAndGroupConsoleResponseBodyTemplateGroup getTemplateGroup() {
        return this.templateGroup;
    }

    public static class AddCustomTemplateAndGroupConsoleResponseBodyTemplateGroup extends TeaModel {
        @NameInMap("TemplateGroupId")
        public String templateGroupId;

        public static AddCustomTemplateAndGroupConsoleResponseBodyTemplateGroup build(java.util.Map<String, ?> map) throws Exception {
            AddCustomTemplateAndGroupConsoleResponseBodyTemplateGroup self = new AddCustomTemplateAndGroupConsoleResponseBodyTemplateGroup();
            return TeaModel.build(map, self);
        }

        public AddCustomTemplateAndGroupConsoleResponseBodyTemplateGroup setTemplateGroupId(String templateGroupId) {
            this.templateGroupId = templateGroupId;
            return this;
        }
        public String getTemplateGroupId() {
            return this.templateGroupId;
        }

    }

}
