// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateTranscodeTemplateGroupRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("TranscodeTemplateList")
    public String transcodeTemplateList;

    @NameInMap("Locked")
    public String locked;

    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    public static UpdateTranscodeTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTranscodeTemplateGroupRequest self = new UpdateTranscodeTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTranscodeTemplateGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTranscodeTemplateGroupRequest setTranscodeTemplateList(String transcodeTemplateList) {
        this.transcodeTemplateList = transcodeTemplateList;
        return this;
    }
    public String getTranscodeTemplateList() {
        return this.transcodeTemplateList;
    }

    public UpdateTranscodeTemplateGroupRequest setLocked(String locked) {
        this.locked = locked;
        return this;
    }
    public String getLocked() {
        return this.locked;
    }

    public UpdateTranscodeTemplateGroupRequest setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
        this.transcodeTemplateGroupId = transcodeTemplateGroupId;
        return this;
    }
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

}
