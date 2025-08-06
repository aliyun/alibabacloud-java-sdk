// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTemplateGroupConsoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateGroups")
    public ListTemplateGroupConsoleResponseBodyTemplateGroups templateGroups;

    public static ListTemplateGroupConsoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateGroupConsoleResponseBody self = new ListTemplateGroupConsoleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplateGroupConsoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplateGroupConsoleResponseBody setTemplateGroups(ListTemplateGroupConsoleResponseBodyTemplateGroups templateGroups) {
        this.templateGroups = templateGroups;
        return this;
    }
    public ListTemplateGroupConsoleResponseBodyTemplateGroups getTemplateGroups() {
        return this.templateGroups;
    }

    public static class ListTemplateGroupConsoleResponseBodyTemplateGroupsTemplateGroup extends TeaModel {
        @NameInMap("DefaultGroup")
        public String defaultGroup;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupSymbol")
        public String groupSymbol;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("IsLocked")
        public String isLocked;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("TranscodeMode")
        public String transcodeMode;

        public static ListTemplateGroupConsoleResponseBodyTemplateGroupsTemplateGroup build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateGroupConsoleResponseBodyTemplateGroupsTemplateGroup self = new ListTemplateGroupConsoleResponseBodyTemplateGroupsTemplateGroup();
            return TeaModel.build(map, self);
        }

        public ListTemplateGroupConsoleResponseBodyTemplateGroupsTemplateGroup setDefaultGroup(String defaultGroup) {
            this.defaultGroup = defaultGroup;
            return this;
        }
        public String getDefaultGroup() {
            return this.defaultGroup;
        }

        public ListTemplateGroupConsoleResponseBodyTemplateGroupsTemplateGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListTemplateGroupConsoleResponseBodyTemplateGroupsTemplateGroup setGroupSymbol(String groupSymbol) {
            this.groupSymbol = groupSymbol;
            return this;
        }
        public String getGroupSymbol() {
            return this.groupSymbol;
        }

        public ListTemplateGroupConsoleResponseBodyTemplateGroupsTemplateGroup setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public ListTemplateGroupConsoleResponseBodyTemplateGroupsTemplateGroup setIsLocked(String isLocked) {
            this.isLocked = isLocked;
            return this;
        }
        public String getIsLocked() {
            return this.isLocked;
        }

        public ListTemplateGroupConsoleResponseBodyTemplateGroupsTemplateGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTemplateGroupConsoleResponseBodyTemplateGroupsTemplateGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTemplateGroupConsoleResponseBodyTemplateGroupsTemplateGroup setTranscodeMode(String transcodeMode) {
            this.transcodeMode = transcodeMode;
            return this;
        }
        public String getTranscodeMode() {
            return this.transcodeMode;
        }

    }

    public static class ListTemplateGroupConsoleResponseBodyTemplateGroups extends TeaModel {
        @NameInMap("TemplateGroup")
        public java.util.List<ListTemplateGroupConsoleResponseBodyTemplateGroupsTemplateGroup> templateGroup;

        public static ListTemplateGroupConsoleResponseBodyTemplateGroups build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateGroupConsoleResponseBodyTemplateGroups self = new ListTemplateGroupConsoleResponseBodyTemplateGroups();
            return TeaModel.build(map, self);
        }

        public ListTemplateGroupConsoleResponseBodyTemplateGroups setTemplateGroup(java.util.List<ListTemplateGroupConsoleResponseBodyTemplateGroupsTemplateGroup> templateGroup) {
            this.templateGroup = templateGroup;
            return this;
        }
        public java.util.List<ListTemplateGroupConsoleResponseBodyTemplateGroupsTemplateGroup> getTemplateGroup() {
            return this.templateGroup;
        }

    }

}
