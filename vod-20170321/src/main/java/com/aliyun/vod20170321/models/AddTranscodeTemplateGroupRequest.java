// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddTranscodeTemplateGroupRequest extends TeaModel {
    // The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).
    @NameInMap("AppId")
    public String appId;

    // The name of the transcoding template group.
    // 
    // - The name can be up to 128 bytes in length.
    // - The value must be encoded in UTF-8.
    // 
    // > You must set TranscodeTemplateGroupId or Name in the request.
    @NameInMap("Name")
    public String name;

    // The ID of the transcoding template group. If a transcoding template group ID is specified, you can add new transcoding templates to the template group.
    // 
    // > You must set TranscodeTemplateGroupId or Name in the request.
    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    // The configurations of the transcoding template. The value is a string in JSON format. For more information about the data structure, see [Basic structures](~~52839~~).
    // 
    // > If you do not specify this parameter, the transcoding job cannot be automatically created after you upload a video.
    @NameInMap("TranscodeTemplateList")
    public String transcodeTemplateList;

    public static AddTranscodeTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTranscodeTemplateGroupRequest self = new AddTranscodeTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddTranscodeTemplateGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddTranscodeTemplateGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddTranscodeTemplateGroupRequest setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
        this.transcodeTemplateGroupId = transcodeTemplateGroupId;
        return this;
    }
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

    public AddTranscodeTemplateGroupRequest setTranscodeTemplateList(String transcodeTemplateList) {
        this.transcodeTemplateList = transcodeTemplateList;
        return this;
    }
    public String getTranscodeTemplateList() {
        return this.transcodeTemplateList;
    }

}
