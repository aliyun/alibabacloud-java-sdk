// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddTranscodeTemplateGroupRequest extends TeaModel {
    /**
     * <p>The application ID. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Use the multi-application service</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the transcoding template group.</p>
     * <ul>
     * <li>The name can be up to 128 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * <blockquote>
     * <p>You must specify TranscodeTemplateGroupId or Name in the request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>transcodetemplate</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the transcoding template group. If a transcoding template group ID is specified, you can add transcoding templates to the template group.</p>
     * <blockquote>
     * <p>You must specify TranscodeTemplateGroupId or Name in the request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4c71a339fe52b4fa6f4527****</p>
     */
    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    /**
     * <p>The configurations of the transcoding template. The value is a string in JSON format. For more information about the data structure, see <a href="https://help.aliyun.com/document_detail/52839.html">TranscodeTemplate</a>.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not specify this parameter, the transcoding job cannot be automatically created after you upload a video.</li>
     * <li>If you do not need to set Width or Height, do not specify the corresponding parameter. You cannot set the value to an empty string, such as &quot;Height&quot;:&quot;&quot;.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Video&quot;:{&quot;Bitrate&quot;:&quot;400&quot;,&quot;Codec&quot;:&quot;H.264&quot;,&quot;Fps&quot;:&quot;30&quot;,&quot;Height&quot;:&quot;&quot;},&quot;Definition&quot;:&quot;SD&quot;,&quot;Container&quot;:{&quot;Format&quot;:&quot;mp4&quot;},&quot;TemplateName&quot;:&quot;testName&quot;,&quot;MuxConfig&quot;:{},&quot;Audio&quot;:{&quot;Codec&quot;:&quot;AAC&quot;,&quot;Bitrate&quot;:&quot;64&quot;,&quot;Samplerate&quot;:&quot;44100&quot;}}]</p>
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
