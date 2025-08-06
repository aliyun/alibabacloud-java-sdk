// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTemplateGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateGroups")
    public ListTemplateGroupResponseBodyTemplateGroups templateGroups;

    public static ListTemplateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateGroupResponseBody self = new ListTemplateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplateGroupResponseBody setTemplateGroups(ListTemplateGroupResponseBodyTemplateGroups templateGroups) {
        this.templateGroups = templateGroups;
        return this;
    }
    public ListTemplateGroupResponseBodyTemplateGroups getTemplateGroups() {
        return this.templateGroups;
    }

    public static class ListTemplateGroupResponseBodyTemplateGroupsTemplateGroup extends TeaModel {
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

        public static ListTemplateGroupResponseBodyTemplateGroupsTemplateGroup build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateGroupResponseBodyTemplateGroupsTemplateGroup self = new ListTemplateGroupResponseBodyTemplateGroupsTemplateGroup();
            return TeaModel.build(map, self);
        }

        public ListTemplateGroupResponseBodyTemplateGroupsTemplateGroup setDefaultGroup(String defaultGroup) {
            this.defaultGroup = defaultGroup;
            return this;
        }
        public String getDefaultGroup() {
            return this.defaultGroup;
        }

        public ListTemplateGroupResponseBodyTemplateGroupsTemplateGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListTemplateGroupResponseBodyTemplateGroupsTemplateGroup setGroupSymbol(String groupSymbol) {
            this.groupSymbol = groupSymbol;
            return this;
        }
        public String getGroupSymbol() {
            return this.groupSymbol;
        }

        public ListTemplateGroupResponseBodyTemplateGroupsTemplateGroup setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public ListTemplateGroupResponseBodyTemplateGroupsTemplateGroup setIsLocked(String isLocked) {
            this.isLocked = isLocked;
            return this;
        }
        public String getIsLocked() {
            return this.isLocked;
        }

        public ListTemplateGroupResponseBodyTemplateGroupsTemplateGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTemplateGroupResponseBodyTemplateGroupsTemplateGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTemplateGroupResponseBodyTemplateGroupsTemplateGroup setTranscodeMode(String transcodeMode) {
            this.transcodeMode = transcodeMode;
            return this;
        }
        public String getTranscodeMode() {
            return this.transcodeMode;
        }

    }

    public static class ListTemplateGroupResponseBodyTemplateGroups extends TeaModel {
        @NameInMap("TemplateGroup")
        public java.util.List<ListTemplateGroupResponseBodyTemplateGroupsTemplateGroup> templateGroup;

        public static ListTemplateGroupResponseBodyTemplateGroups build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateGroupResponseBodyTemplateGroups self = new ListTemplateGroupResponseBodyTemplateGroups();
            return TeaModel.build(map, self);
        }

        public ListTemplateGroupResponseBodyTemplateGroups setTemplateGroup(java.util.List<ListTemplateGroupResponseBodyTemplateGroupsTemplateGroup> templateGroup) {
            this.templateGroup = templateGroup;
            return this;
        }
        public java.util.List<ListTemplateGroupResponseBodyTemplateGroupsTemplateGroup> getTemplateGroup() {
            return this.templateGroup;
        }

    }

}
