// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTranscodeTemplateGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The transcoding template groups.</p>
     */
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
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the template group was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-05T10:20:09Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether the template group is the default one. Valid values:</p>
         * <ul>
         * <li><strong>Default</strong>: The template group is the default one.</li>
         * <li><strong>NotDefault</strong>: The template group is not the default one.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>The lock status of the transcoding template group. Valid values:</p>
         * <ul>
         * <li><strong>Disabled</strong>: The template group is not locked.</li>
         * <li><strong>Enabled</strong>: The template group is locked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("Locked")
        public String locked;

        /**
         * <p>The time when the template group was modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-05T10:22:09Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The name of the template group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the transcoding template group.</p>
         * 
         * <strong>example:</strong>
         * <p>17a9889fc66852*****d791c886700932</p>
         */
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
