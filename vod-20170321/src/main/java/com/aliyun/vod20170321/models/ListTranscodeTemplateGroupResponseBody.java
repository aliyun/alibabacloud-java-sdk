// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTranscodeTemplateGroupResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The transcoding template groups.
    @NameInMap("TranscodeTemplateGroupList")
    public java.util.List<ListTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupList> transcodeTemplateGroupList;

    public static ListTranscodeTemplateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTranscodeTemplateGroupResponseBody self = new ListTranscodeTemplateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTranscodeTemplateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTranscodeTemplateGroupResponseBody setTranscodeTemplateGroupList(java.util.List<ListTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupList> transcodeTemplateGroupList) {
        this.transcodeTemplateGroupList = transcodeTemplateGroupList;
        return this;
    }
    public java.util.List<ListTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupList> getTranscodeTemplateGroupList() {
        return this.transcodeTemplateGroupList;
    }

    public static class ListTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupList extends TeaModel {
        // The ID of the application.
        @NameInMap("AppId")
        public String appId;

        // The time when the template group was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // Indicates whether the template group is the default one. Valid values:
        // 
        // *   **Default**: The template group is the default one.
        // *   **NotDefault**: The template group is not the default one.
        @NameInMap("IsDefault")
        public String isDefault;

        // The lock status of the transcoding template group. Valid values:
        // 
        // *   **Disabled**: The template group is not locked.
        // *   **Enabled**: The template group is locked.
        @NameInMap("Locked")
        public String locked;

        // The time when the template group was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("ModifyTime")
        public String modifyTime;

        // The name of the template group.
        @NameInMap("Name")
        public String name;

        // The ID of the transcoding template group.
        @NameInMap("TranscodeTemplateGroupId")
        public String transcodeTemplateGroupId;

        public static ListTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupList self = new ListTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupList();
            return TeaModel.build(map, self);
        }

        public ListTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupList setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public ListTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupList setLocked(String locked) {
            this.locked = locked;
            return this;
        }
        public String getLocked() {
            return this.locked;
        }

        public ListTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupList setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }
        public String getTranscodeTemplateGroupId() {
            return this.transcodeTemplateGroupId;
        }

    }

}
