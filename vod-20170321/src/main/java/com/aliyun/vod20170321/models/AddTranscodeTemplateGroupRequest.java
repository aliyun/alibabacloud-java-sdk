// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddTranscodeTemplateGroupRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("TranscodeTemplateList")
    public String transcodeTemplateList;

    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    @NameInMap("AppId")
    public String appId;

    public static AddTranscodeTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTranscodeTemplateGroupRequest self = new AddTranscodeTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddTranscodeTemplateGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddTranscodeTemplateGroupRequest setTranscodeTemplateList(String transcodeTemplateList) {
        this.transcodeTemplateList = transcodeTemplateList;
        return this;
    }
    public String getTranscodeTemplateList() {
        return this.transcodeTemplateList;
    }

    public AddTranscodeTemplateGroupRequest setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
        this.transcodeTemplateGroupId = transcodeTemplateGroupId;
        return this;
    }
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

    public AddTranscodeTemplateGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
