// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddTranscodeTemplateGroupRequest extends TeaModel {
    /**
     * <p>The application ID. Default value: **app-1000000**. For more information, see [Use the multi-application service](~~113600~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the transcoding template group.</p>
     * <br>
     * <p>*   The name can be up to 128 bytes in length.</p>
     * <p>*   The value must be encoded in UTF-8.</p>
     * <br>
     * <p>> You must specify TranscodeTemplateGroupId or Name in the request.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the transcoding template group. If a transcoding template group ID is specified, you can add transcoding templates to the template group.</p>
     * <br>
     * <p>> You must specify TranscodeTemplateGroupId or Name in the request.</p>
     */
    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    /**
     * <p>The configurations of the transcoding template. The value is a string in JSON format. For more information about the data structure, see [TranscodeTemplate](~~52839~~).</p>
     * <br>
     * <p>> *   If you do not specify this parameter, the transcoding job cannot be automatically created after you upload a video.</p>
     * <p>> *   If you do not need to set Width or Height, do not specify the corresponding parameter. You cannot set the value to an empty string, such as "Height":"".</p>
     */
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
