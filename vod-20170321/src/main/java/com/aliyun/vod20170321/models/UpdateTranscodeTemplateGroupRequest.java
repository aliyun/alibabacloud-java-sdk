// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateTranscodeTemplateGroupRequest extends TeaModel {
    /**
     * <p>The lock status of the template group. Valid values:</p>
     * <br>
     * <p>*   **Enabled**: The template group is locked.</p>
     * <p>*   **Disabled**: The template group is not locked.</p>
     */
    @NameInMap("Locked")
    public String locked;

    /**
     * <p>The name of the transcoding template group.</p>
     * <br>
     * <p>*   The name can be up to 128 bytes in length.</p>
     * <p>*   The value must be encoded in UTF-8.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the transcoding template group.</p>
     */
    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    /**
     * <p>The configurations of the transcoding template. The value is a JSON-formatted string. For more information about the data structure, see the "TranscodeTemplate" section of the [Basic data types](~~52839~~) topic.</p>
     */
    @NameInMap("TranscodeTemplateList")
    public String transcodeTemplateList;

    public static UpdateTranscodeTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTranscodeTemplateGroupRequest self = new UpdateTranscodeTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTranscodeTemplateGroupRequest setLocked(String locked) {
        this.locked = locked;
        return this;
    }
    public String getLocked() {
        return this.locked;
    }

    public UpdateTranscodeTemplateGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTranscodeTemplateGroupRequest setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
        this.transcodeTemplateGroupId = transcodeTemplateGroupId;
        return this;
    }
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

    public UpdateTranscodeTemplateGroupRequest setTranscodeTemplateList(String transcodeTemplateList) {
        this.transcodeTemplateList = transcodeTemplateList;
        return this;
    }
    public String getTranscodeTemplateList() {
        return this.transcodeTemplateList;
    }

}
